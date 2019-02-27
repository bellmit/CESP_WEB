package com.yunyitg.cesp.core.imports.waybill.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.core.company.service.impl.CompanyManager;
import com.yunyitg.cesp.core.imports.message.dao.SendMessageMapper;
import com.yunyitg.cesp.core.imports.order.validation.OrderImportResult;
import com.yunyitg.cesp.core.imports.waybill.dao.WaybillDetailMapper;
import com.yunyitg.cesp.core.imports.waybill.dao.WaybillHeadMapper;
import com.yunyitg.cesp.core.imports.waybill.dto.WaybillDetailPoiEntity;
import com.yunyitg.cesp.core.imports.waybill.dto.WaybillDetailPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.waybill.dto.WaybillHeadPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.waybill.entity.WaybillDetail;
import com.yunyitg.cesp.core.imports.waybill.entity.WaybillHead;
import com.yunyitg.cesp.core.imports.waybill.validation.WaybillImportResult;
import com.yunyitg.cesp.system.base.service.impl.BaseInfoManager;
import com.yunyitg.cesp.system.shiro.token.manager.TokenManager;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;

@Service("waybillService")
public class WaybillServiceImpl implements WaybillService {
	
	@Autowired
	private WaybillHeadMapper waybillHeadMapper;
	
	@Autowired
	private WaybillDetailMapper waybillDetailMapper;
	
	@Autowired
	private CompanyManager companyManager;
	
	@Autowired
	private BaseInfoManager baseInfoManager;
	
	@Autowired
	private SendMessageMapper sendMessageMapper;

	@Autowired
	private ApplicationContext applicationContext;

	@Override
	@Transactional
	public BaseResult<Object> importWaybillByExcel(MultipartFile file) {
		
		WaybillImportResult result = null;
		try {
			result = importExcelVerify(file);
			
			if (result.isVerifyFail()) {
				if (result.getMsg().toString().length() > 255) {
					return new BaseResult<>(false, result.getMsg().toString().substring(0, 254)+ "...");
				}
				return new BaseResult<Object>(false, result.getMsg().toString());
			}
		}  catch (Exception e) {
			LoggerUtils.error(this.getClass(), "excel读取失败:", e);
			return new BaseResult<>(false, "excel读取失败：" + e.getMessage());
		}
		
		batchInsert(result.getWaybillHead());
		
		return new BaseResult<Object>(true, "导入完成");
	}
	
	private WaybillImportResult importExcelVerify(MultipartFile f) throws Exception {
		
		StringBuilder msgBuilder = new StringBuilder("");
		
		WaybillImportResult waybillImportResult = new WaybillImportResult();
		//sheet1 （电子运单头）导入
		ImportParams params1 = new ImportParams();
		params1.setNeedVerfiy(true);
		params1.setTitleRows(1);
		params1.setStartSheetIndex(0);
		
		WaybillHead waybillHead = new WaybillHead();
		ExcelImportResult<WaybillHeadPoiEntityOfMode> result = ExcelImportUtil.importExcelMore(f.getInputStream(), WaybillHeadPoiEntityOfMode.class, params1);
		if (result.isVerfiyFail()) {
			for (WaybillHeadPoiEntityOfMode o : result.getFailList()) {
				msgBuilder.append(o.getErrorMsg());
			}
			return new WaybillImportResult(true, "sheet1【电子运单头】导入数据校验失败：" + msgBuilder.toString());
		} else {
			if (result.getList().size() == 0 || result.getList().size() > 1) {
				return new WaybillImportResult(true, "sheet1【电子运单头】导入数据校验失败：" + "电子运单头有且只能有一条数据");
			} else {
				//电子运单头检验通过
				BeanUtils.copyProperties(result.getList().get(0), waybillHead);
				waybillHead.setCreateUserId(TokenManager.getUserId());
				waybillHead.setDeclEntId(TokenManager.getCompanyId());
				waybillHead.setDeclMode("HTTPS");
				waybillImportResult.setWaybillHead(waybillHead);
			}
		}
		
		//sheet2 (运单明细信息)导入
		ImportParams params2 = new ImportParams();
		params2.setNeedVerfiy(true);
		params2.setTitleRows(1);
		params2.setStartSheetIndex(1);
		ExcelImportResult<WaybillDetailPoiEntityOfMode> result2 = ExcelImportUtil.importExcelMore(f.getInputStream(), WaybillDetailPoiEntityOfMode.class, params2); 
		Map<String, WaybillDetail> waybillNoMapWaybillDetail = new HashMap<String, WaybillDetail>();
		if (result2.isVerfiyFail()) {
			for (WaybillDetailPoiEntityOfMode w : result2.getFailList()) {
				msgBuilder.append(w.getErrorMsg());
			}
			return new WaybillImportResult(true, "sheet2【电子运单明细】导入数据校验失败：" + msgBuilder.toString());
		} else {
			if (result2.getList().size() < 1) {
				return new WaybillImportResult(true, "sheet2【电子运单明细】导入数据校验失败：电子运单明细不能为空");
			} else {
				for (WaybillDetailPoiEntityOfMode w : result2.getList()) {
					WaybillDetail waybillDetail = new WaybillDetail();
					BeanUtils.copyProperties(w, waybillDetail);
					waybillDetail.setEhsEntId(waybillHead.getEhsEntId());
					waybillDetail.setCustomsCode(waybillHead.getCustomsCode());
					waybillDetail.setCiqOrgCode(waybillHead.getCiqOrgCode());
					waybillDetail.setDeclEntId(waybillHead.getDeclEntId());
					waybillDetail.setCreateUserId(waybillHead.getCreateUserId());
					waybillDetail.setIeFlag(waybillHead.getIeFlag());
					waybillNoMapWaybillDetail.put(w.getEntWaybillNo(), waybillDetail);
					
				}
				
				// 新增申报时校验是否重复申报
				if (waybillHead.getOpType().equals("A")) {
					Set<String> waybillNoSet = waybillNoMapWaybillDetail.keySet();
					List<WaybillDetail> l = waybillDetailMapper.findByEhsEntIdAndEntWaybillNoSet(waybillHead.getEhsEntId(), waybillNoSet);
					for (WaybillDetail waybillDetail : l) {
						if (waybillHead.getFunctionCode().equals("BOTH") && !waybillDetail.isBothWaybillEditable()) {
							msgBuilder.append("企业电子运单编号【" + waybillDetail.getEntWaybillNo() + "】重复申报,");
						} else if (waybillHead.getFunctionCode().equals("CUS") && !waybillDetail.isCusWaybillEditable()) {
							msgBuilder.append("企业电子运单编号【" + waybillDetail.getEntWaybillNo() + "】重复申报,");
						} else if (waybillHead.getFunctionCode().equals("CIQ") && !waybillDetail.isCiqWaybillEditable()) {
							msgBuilder.append("企业电子运单编号【" + waybillDetail.getEntWaybillNo() + "】重复申报,");
						}
 					}
				}
				
				if (msgBuilder.toString().length() > 5) {
					return new WaybillImportResult(true, "sheet2【电子运单明细】导入数据校验失败:" + msgBuilder.toString());
				}
				
				waybillImportResult.getWaybillHead().setWaybillList(new ArrayList<WaybillDetail>(waybillNoMapWaybillDetail.values()));
			}
			
		}
		waybillImportResult.setVerifyFail(false);
		return waybillImportResult;
	}
	
	private void batchInsert(WaybillHead waybillHead) {
		waybillHeadMapper.insert(waybillHead);
		Integer waybillHeadId = waybillHead.getId();
		for (WaybillDetail waybillDetail : waybillHead.getWaybillList()) {
			waybillDetail.setWaybillHeadId(waybillHeadId);
		}
		
		waybillDetailMapper.insertList(waybillHead.getWaybillList());
		
	}

}
