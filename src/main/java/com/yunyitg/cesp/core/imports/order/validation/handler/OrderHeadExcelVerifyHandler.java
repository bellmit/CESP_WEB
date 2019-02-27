package com.yunyitg.cesp.core.imports.order.validation.handler;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.core.company.entity.Company;
import com.yunyitg.cesp.core.company.service.impl.CompanyManager;
import com.yunyitg.cesp.core.imports.order.dto.OrderHeadPoiEntityOfMode;

import cn.afterturn.easypoi.excel.entity.result.ExcelVerifyHandlerResult;
import cn.afterturn.easypoi.handler.inter.IExcelVerifyHandler;


public class OrderHeadExcelVerifyHandler implements IExcelVerifyHandler<OrderHeadPoiEntityOfMode> {


	final static CompanyManager companyManager = SpringContextUtil.getBean("companyManager",CompanyManager.class);
	
	
	@Override
	public ExcelVerifyHandlerResult verifyHandler(OrderHeadPoiEntityOfMode entity) {
		ExcelVerifyHandlerResult result = new ExcelVerifyHandlerResult(true);
		StringBuilder msg = new StringBuilder();
		
		//电商企业编号与电商企业名称对应校验、电商企业id设定
		if (null != entity.getEbEntNo() && null != entity.getEbEntName()) {
			Company com1 = companyManager.getGzeportCodeMapCompany().get(entity.getEbEntNo());
			Company com2 = companyManager.getNameMapCompany().get(entity.getEbEntName());
			
			if (null != com1 && null != com2) {
				if (!com1.getId().equals(com2.getId())) { // 
					result.setSuccess(false);
					msg.append("电商企业编号【").append(entity.getEbEntNo()).
					append("】与电商企业名称【").append(entity.getEbEntName()).append("】不匹配,");
				} else {
					entity.setEbEntId(com1.getId());
				}
			}
		}
		//电商平台企业编号与电商平台名称对应检验、电商平台企业id设定
		if (null != entity.getEbpEntNo() && null != entity.getEbpEntName()) {
			Company com1 = companyManager.getGzeportCodeMapCompany().get(entity.getEbpEntNo());
			Company com2 = companyManager.getNameMapCompany().get(entity.getEbpEntName());
			
			if (null != com1 && null != com2) {
				if (!com1.getId().equals(com2.getId())) {
					result.setSuccess(false);
					msg.append("电商平台企业编号【").append(entity.getEbpEntNo()).
					append("】与电商平台企业名称【").append(entity.getEbpEntName()).append("】不匹配,");
				} else {
					entity.setEbpEntId(com2.getId());
				}
			}
		}
		
		if (!result.isSuccess()) {
			result.setMsg(msg.toString());
		}
		
		return result;
	}

}
