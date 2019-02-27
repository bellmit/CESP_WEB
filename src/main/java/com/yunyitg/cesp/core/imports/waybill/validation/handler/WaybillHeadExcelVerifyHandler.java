package com.yunyitg.cesp.core.imports.waybill.validation.handler;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.core.company.entity.Company;
import com.yunyitg.cesp.core.company.service.impl.CompanyManager;
import com.yunyitg.cesp.core.imports.waybill.dto.WaybillHeadPoiEntityOfMode;

import cn.afterturn.easypoi.excel.entity.result.ExcelVerifyHandlerResult;
import cn.afterturn.easypoi.handler.inter.IExcelVerifyHandler;

public class WaybillHeadExcelVerifyHandler implements IExcelVerifyHandler<WaybillHeadPoiEntityOfMode> {

	
	final static CompanyManager companyManager = SpringContextUtil.getBean("companyManager",CompanyManager.class);
	
	@Override
	public ExcelVerifyHandlerResult verifyHandler(WaybillHeadPoiEntityOfMode entity) {
		ExcelVerifyHandlerResult result = new ExcelVerifyHandlerResult(true);
		StringBuilder msg = new StringBuilder();
		
		// 物流企业编号与物流企业名称对应校验、运单所属物流企业id设定
		if (null != entity.getEhsEntNo() && null != entity.getEhsEntName()) {
			Company com1 = companyManager.getGzeportCodeMapCompany().get(entity.getEhsEntNo());
			Company com2 = companyManager.getNameMapCompany().get(entity.getEhsEntName());
			
			if (null != com1 && null != com2) {
				if (!com1.getId().equals(com2.getId())) {
					result.setSuccess(false);
					msg.append("物流企业编号【").append(entity.getEhsEntNo()).
					append("】与电商企业名称【");
					
				}
			}
			
		}
		
		
		return null;
	}

}
