package poi.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.FixedKeySet;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.common.utils.FastJsonUtils;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.core.imports.order.dao.OrderDetailMapper;
import com.yunyitg.cesp.core.imports.order.dao.OrderGoodsListMapper;
import com.yunyitg.cesp.core.imports.order.dao.OrderHeadMapper;
import com.yunyitg.cesp.core.imports.order.dto.OrderDetailPoiEntity;
import com.yunyitg.cesp.core.imports.order.dto.OrderDetailPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.order.dto.OrderGoodsListPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.order.dto.OrderHeadPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.order.entity.OrderDetail;
import com.yunyitg.cesp.core.imports.order.entity.OrderGoodsList;
import com.yunyitg.cesp.core.imports.order.entity.OrderHead;
import com.yunyitg.cesp.core.imports.order.validation.OrderImportResult;
import com.yunyitg.cesp.core.imports.order.validation.handler.OrderDetailExcelVerifyHandler;
import com.yunyitg.cesp.core.imports.order.validation.handler.OrderGoodsListExcelVerifyHandler;
import com.yunyitg.cesp.core.imports.order.validation.handler.OrderHeadExcelVerifyHandler;
import com.yunyitg.cesp.core.imports.waybill.dao.WaybillDetailMapper;
import com.yunyitg.cesp.core.imports.waybill.dto.WaybillDetailPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.waybill.dto.WaybillHeadPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.waybill.entity.WaybillDetail;
import com.yunyitg.cesp.core.imports.waybill.entity.WaybillHead;
import com.yunyitg.cesp.core.imports.waybill.validation.WaybillImportResult;
import com.yunyitg.cesp.system.shiro.token.manager.TokenManager;

import base.BaseTest;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import poi.test.obj.ExcelVerifyEntityOfMode;

public class PoiImportTests extends BaseTest {
	private static final Logger LOG = LoggerFactory.getLogger(PoiImportTests.class);
	
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
	@Autowired
	private OrderHeadMapper orderHeadMapper;
	
	@Autowired
	private OrderGoodsListMapper orderGoodsListMapper;
	
	@Autowired
	private WaybillDetailMapper waybillDetailMapper;
	
//	@Test
    public void baseModetest() {
        try {
            ImportParams params = new ImportParams();
            params.setNeedVerfiy(true);
            ExcelImportResult<ExcelVerifyEntityOfMode> result = ExcelImportUtil.importExcelMore(
                    new FileInputStream(new File(PoiPublicUtil.getWebRootPath("imports/verfiy.xlsx"))),
                ExcelVerifyEntityOfMode.class, params);
//            FileOutputStream fos = new FileOutputStream("D:/excel/baseModetest.xlsx");
//            result.getWorkbook().write(fos);
//            fos.close();
//            fos = new FileOutputStream("D:/excel/baseModetest_fail.xlsx");
//            result.getFailWorkbook().write(fos);
//            fos.close();
            for (int i = 0; i < result.getList().size(); i++) {
                System.out.println(ReflectionToStringBuilder.toString(result.getList().get(i)));
            }
            //失败的数据
            for (int i = 0; i < result.getFailList().size(); i++) {
                System.err.println(ReflectionToStringBuilder.toString(result.getFailList().get(i)));
            }
            Assert.assertTrue(result.getList().size() == 2);
        } catch (Exception e) {
        	LOG.error(e.getMessage(),e);
        }
    }
	
	
	@Test
	public void testOrderHeadPoiImport() throws FileNotFoundException, Exception {
		
//		File f = new File(PoiPublicUtil.getWebRootPath("imports/进口电子订单导入.xlsx"));
		
		File f = new File("C:\\Users\\CloudWing03\\Desktop\\跨境3.0excel导入试例\\进口订单导入\\进口电子订单导入0501-002.xlsx");
		
		OrderImportResult result = importExcelVerify(f, "BOTH");
		
		try {
			result = importExcelVerify(f, "BOTH");
			
			if (result.isVerfiyFail()) {
				if (result.getMsg().toString().length() > 255) {
//					new BaseResult<>(false, result.getMsg().toString().substring(0, 254)+ "...");
					LOG.info(result.getMsg().toString().substring(0, 254)+ "...");
				}
				LOG.info(result.getMsg().toString());
//				return new BaseResult<>(false, result.getMsg().toString());
			}
			
		} catch (Exception e) {
			LoggerUtils.error(this.getClass(), "excel读取失败:", e);
//			return new BaseResult<>(false, "excel读取失败：" + e.getMessage());
			LOG.info("excel读取失败：" + e.getMessage());
		}
		System.err.println(FastJsonUtils.toJSONString(result));
		
//		batchInsert(result.getOrderHead());
		
	}
	
	@Test
	public void testWaybillImport() throws Exception {
		
		File f = new File("C:\\Users\\CloudWing03\\Desktop\\跨境3.0excel导入试例\\进口运单导入\\进口运单导入-20180529002.xlsx");
	
		WaybillImportResult result = importWaybillHead(f);
		System.out.println(result.toString());
		
	}
	
	public void batchInsert(OrderHead orderHead) {

		orderHeadMapper.insert(orderHead);
		int orderHeadId = orderHead.getId();
		System.out.println("orderHeadId" + orderHeadId);
		for (OrderDetail orderDetail : orderHead.getOrderContent()) {
			orderDetail.setOrderHeadId(orderHeadId);
		}

		orderDetailMapper.insertList(orderHead.getOrderContent());

		List<OrderGoodsList> orderGoods = new ArrayList<OrderGoodsList>();
		for (OrderDetail orderDetail : orderHead.getOrderContent()) {
			for (OrderGoodsList goods : orderDetail.getGoodsList()) {
				goods.setOrderDetailId(orderDetail.getId());
				orderGoods.add(goods);
			}
		}
		orderGoodsListMapper.insertList(orderGoods);

	}
	
//	@Test
	public void test1() {
		
		Field[] fields = PoiPublicUtil.getClassFields(OrderHeadPoiEntityOfMode.class);
		System.out.println(fields.length);
		
	}
	
	private OrderImportResult importExcelVerify(File f, String functionCode) throws FileNotFoundException, Exception {

		StringBuilder msgBuilder = new StringBuilder("");


		OrderImportResult orderImportResult = new OrderImportResult();
		//sheet1(电子订单头)导入
		ImportParams params1 = new ImportParams();
		params1.setNeedVerfiy(true);
		params1.setTitleRows(1);
		params1.setStartSheetIndex(0);
		params1.setVerifyHandler(new OrderHeadExcelVerifyHandler());
		OrderHead orderHead = new OrderHead();
		ExcelImportResult<OrderHeadPoiEntityOfMode> result =  ExcelImportUtil.importExcelMore(new FileInputStream(f), OrderHeadPoiEntityOfMode.class, params1);
		if (result.isVerfiyFail()) {
			for (OrderHeadPoiEntityOfMode o : result.getFailList()) {
				msgBuilder.append(o.getErrorMsg());
			}
			return new OrderImportResult(false, "sheet1【电子订单头】导入数据校验失败：" + msgBuilder.toString());
		} else {
			if(result.getList().size() == 0 || result.getList().size() > 1) {
				return new OrderImportResult(false, "sheet1【电子订单头】导入数据校验失败：" + "电子订单头有且只能有一条数据");
			} else {

				//电子订单头检验通过
				BeanUtils.copyProperties(result.getList().get(0), orderHead);
				orderHead.setCreateUserId(1);
				orderHead.setDeclEntId(1);
				orderImportResult.setOrderHead(orderHead);
			}
		}

		//sheet2(电子订单明细)导入
		ImportParams params2 = new ImportParams();
		params2.setNeedVerfiy(true);
		params2.setTitleRows(1);
		params2.setStartSheetIndex(1);
		params2.setVerifyHandler(new OrderDetailExcelVerifyHandler());
		ExcelImportResult<OrderDetailPoiEntityOfMode> result2 =  ExcelImportUtil.importExcelMore(new FileInputStream(f), OrderDetailPoiEntityOfMode.class, params2);
		Map<String, OrderDetail> orderNoMapOrderDetail = new HashMap<String, OrderDetail>();
		if (result2.isVerfiyFail()) {
			for (OrderDetailPoiEntityOfMode o : result2.getFailList()) {
				msgBuilder.append(o.getErrorMsg());
			}
			return new OrderImportResult(false, "sheet2【电子订单明细】导入数据校验失败：" + msgBuilder.toString());
		} else {
			if (result2.getList().size() < 1) {
				new OrderImportResult(false, "sheet2【电子订单明细】导入数据校验失败：电子订单明细不能为空");
			} else {
				//订单重复校验 （excel内重复）
				for (OrderDetailPoiEntityOfMode o : result2.getList()) {
					OrderDetail orderDetail = new OrderDetail();
					BeanUtils.copyProperties(o, orderDetail);
					orderDetail.setEbEntId(orderHead.getEbEntId());
					orderDetail.setEbpEntId(orderHead.getEbpEntId());
					orderDetail.setCustomsCode(orderHead.getCustomsCode());
					orderDetail.setCiqOrgCode(orderHead.getCiqOrgCode());
					orderDetail.setDeclEntId(orderHead.getDeclEntId());
					orderDetail.setCreateUserId(orderHead.getCreateUserId());
					orderNoMapOrderDetail.put(o.getEntOrderNo(), orderDetail);

				}
				
				// 新增申报时检验
				if (orderHead.getOpType().equals("A")) {
					Set<String> orderNotSet = orderNoMapOrderDetail.keySet();
					List<OrderDetail> l = orderDetailMapper.findByEbEntIdAndEntOrderNoSet(orderHead.getEbEntId(), orderNotSet);
					for (OrderDetail orderDetail : l) {
						if(functionCode.equals("BOTH") && !orderDetail.isBothOrderEditable()) {
							msgBuilder.append("企业订单编号：" + orderDetail.getEntOrderNo() + "重复申报");
						} else if(functionCode.equals("CUS") && !orderDetail.isCusOrderEditable()) {
							msgBuilder.append("企业订单编号：" + orderDetail.getEntOrderNo() + "重复申报");
						} else if (functionCode.equals("CIQ") && !orderDetail.isCiqOrderEditable()) {
							msgBuilder.append("企业订单编号：" + orderDetail.getEntOrderNo() + "重复申报");
						}
					}
				}
				
				if (msgBuilder.toString().length() > 5) {
					return new OrderImportResult(false, "sheet2【电子订单明细】导入数据校验失败：" + msgBuilder.toString());
				}
				// 电子订单明细检验通过
			}
		}

		//sheet3(订单商品) 导入
		ImportParams params3 = new ImportParams();
		params3.setNeedVerfiy(true);
		params3.setTitleRows(1);
		params3.setStartSheetIndex(2);
		params3.setVerifyHandler(new OrderGoodsListExcelVerifyHandler());
		ExcelImportResult<OrderGoodsListPoiEntityOfMode> result3 = ExcelImportUtil.importExcelMore(new FileInputStream(f), OrderGoodsListPoiEntityOfMode.class, params3);

		if (result3.isVerfiyFail()) {
			for (OrderGoodsListPoiEntityOfMode o : result3.getFailList()) {
				msgBuilder.append(o.getErrorMsg());
			}
			return new OrderImportResult(false,"sheet3【订单商品】导入数据校验失败："+  msgBuilder.toString());
		} else {
			if (result3.getList().size() < 1) {
				return new OrderImportResult(false,"sheet3【订单商品】导入数据校验失败：订单商品不能为空");
			} else {
				for (OrderGoodsListPoiEntityOfMode o : result3.getList()) {
					System.out.println(FastJsonUtils.toJSONString(o));
					if (orderNoMapOrderDetail.get(o.getEntOrderNo()) != null) {
						OrderGoodsList orderGoodsList = new OrderGoodsList();
						BeanUtils.copyProperties(o, orderGoodsList);
						orderNoMapOrderDetail.get(o.getEntOrderNo()).addGoodsList(orderGoodsList);

					} else { //订单商品中 订单号 无对应订单明细关联
						msgBuilder.append("订单商品【" + o.getEntOrderNo()+ "】无对应电子订单信息,");
					}
				}

				//判断所有订单都有至少一条对应的商品信息
				for (Map.Entry<String, OrderDetail> entry : orderNoMapOrderDetail.entrySet()) {
					OrderDetail d = entry.getValue();
					if (d.getGoodsList() == null || d.getGoodsList().size() < 1) {
						msgBuilder.append("企业电子订单【" + d.getEntOrderNo()+ "】无对应商品信息,");
					}
				}
				// 
				if (msgBuilder.toString().length() > 5) {
					return new OrderImportResult(false, "sheet3【订单商品】导入数据校验失败：" + msgBuilder.toString());
				}
				
				orderImportResult.getOrderHead().setOrderContent((new ArrayList<OrderDetail>(orderNoMapOrderDetail.values())));
			}
		}
		orderImportResult.setVerfiyFail(false);
		return orderImportResult;

	}
	
	private  WaybillImportResult importWaybillHead(File f) throws Exception {
		
		
		StringBuilder msgBuilder = new StringBuilder("");
		
		WaybillImportResult waybillImportResult = new WaybillImportResult();
		//sheet1 （电子运单头）导入
		ImportParams params1 = new ImportParams();
		params1.setNeedVerfiy(true);
		params1.setTitleRows(1);
		params1.setStartSheetIndex(0);
		
		WaybillHead waybillHead = new WaybillHead();
		ExcelImportResult<WaybillHeadPoiEntityOfMode> result = ExcelImportUtil.importExcelMore(new FileInputStream(f), WaybillHeadPoiEntityOfMode.class, params1);
		System.out.println(result.getList().size());
		System.out.println(result.isVerfiyFail());
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
				waybillHead.setCreateUserId(2);
				waybillHead.setDeclEntId(2);
				waybillHead.setDeclMode("HTTPS");
				waybillImportResult.setWaybillHead(waybillHead);
				System.out.println(waybillImportResult.toString());
			}
		}
		
		//sheet2 (运单明细信息)导入
		ImportParams params2 = new ImportParams();
		params2.setNeedVerfiy(true);
		params2.setTitleRows(1);
		params2.setStartSheetIndex(1);
		ExcelImportResult<WaybillDetailPoiEntityOfMode> result2 = ExcelImportUtil.importExcelMore(new FileInputStream(f), WaybillDetailPoiEntityOfMode.class, params2); 
		Map<String, WaybillDetail> waybillNoMapWaybillDetail = new HashMap<String, WaybillDetail>();
		System.out.println(result2.getList().size());
		System.out.println(result2.getFailList().size());
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

	
}
