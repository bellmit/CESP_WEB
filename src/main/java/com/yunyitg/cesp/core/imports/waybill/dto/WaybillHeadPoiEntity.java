package com.yunyitg.cesp.core.imports.waybill.dto;

import com.yunyitg.cesp.common.validation.constraints.BaseCiqOrg;
import com.yunyitg.cesp.common.validation.constraints.BaseCustoms;
import com.yunyitg.cesp.common.validation.constraints.Company;
import com.yunyitg.cesp.common.validation.constraints.RangeOfString;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class WaybillHeadPoiEntity {

	@Excel(name = "物流企业平台编号")
	@Company(message = "该物流企业未在本系统注册")
	private String ehsEntNo;
	
	@Excel(name = "物流企业平台名称")
	@Company(property = "name", message = "该物流企业为在本系统注册")
	private String ehsEntName;
	
	private Integer ehsEntId;
	
	@Excel(name = "操作方式")
	@RangeOfString(between = {"A","M","D"}, message = "操作方式字段不在合理取值范围内")
	private String opType;

	@Excel(name = "进出口标示")
	private String ieFlag = "I";
	
	@Excel(name = "主管海关代码")
	@BaseCustoms(message = "系统暂不支持该主管海关代码")
	private String customsCode;
	
	@Excel(name = "检验检疫机构代码")
	@BaseCiqOrg(message = "系统暂不支持该检验检疫机构代码")
	private String ciqOrgCode;
	
	@Excel(name = "业务类型")
	@RangeOfString(between = {"CUS","CIQ","BOTH"},message = "业务类型可供选项有：CUS(海关)、CIQ(国检)、海关国检(BOTH)")
	private String functionCode;
	
	public WaybillHeadPoiEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getEhsEntNo() {
		return ehsEntNo;
	}

	public void setEhsEntNo(String ehsEntNo) {
		this.ehsEntNo = ehsEntNo;
	}

	public String getEhsEntName() {
		return ehsEntName;
	}

	public void setEhsEntName(String ehsEntName) {
		this.ehsEntName = ehsEntName;
	}

	public Integer getEhsEntId() {
		return ehsEntId;
	}

	public void setEhsEntId(Integer ehsEntId) {
		this.ehsEntId = ehsEntId;
	}

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getIeFlag() {
		return ieFlag;
	}

	public void setIeFlag(String ieFlag) {
		this.ieFlag = ieFlag;
	}

	public String getCustomsCode() {
		return customsCode;
	}

	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}

	public String getCiqOrgCode() {
		return ciqOrgCode;
	}

	public void setCiqOrgCode(String ciqOrgCode) {
		this.ciqOrgCode = ciqOrgCode;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}
}
