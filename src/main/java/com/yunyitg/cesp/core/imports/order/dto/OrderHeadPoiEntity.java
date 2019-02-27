package com.yunyitg.cesp.core.imports.order.dto;

import org.hibernate.validator.constraints.NotBlank;

import com.yunyitg.cesp.common.validation.constraints.BaseCiqOrg;
import com.yunyitg.cesp.common.validation.constraints.BaseCustoms;
import com.yunyitg.cesp.common.validation.constraints.Company;
import com.yunyitg.cesp.common.validation.constraints.RangeOfString;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class OrderHeadPoiEntity {

	@Excel(name = "电商企业编号")
	@Company(message = "该电商企业未在本系统注册")
	private String ebEntNo;
	
	@Excel(name = "电商企业名称")
	@Company(property = "name", message = "该电商企业未在本系统注册")
	private String ebEntName;
	
	private Integer ebEntId;
	
	@Excel(name = "电商平台企业编号")
	@Company(message = "该电商平台企业未在本系统注册")
	private String ebpEntNo;
	
	@Excel(name = "电商平台企业名称")
	@Company(property = "name", message = "该电商平台企业未在本系统注册")
	private String ebpEntName;
	
	private Integer ebpEntId;
	
	@Excel(name = "电商平台互联网域名")
	@NotBlank(message = "电商平台互联网域名不能为空")
	private String internetDomainName;
	
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
	
	
	public OrderHeadPoiEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getEbEntNo() {
		return ebEntNo;
	}

	public void setEbEntNo(String ebEntNo) {
		this.ebEntNo = ebEntNo;
	}

	public String getEbEntName() {
		return ebEntName;
	}

	public void setEbEntName(String ebEntName) {
		this.ebEntName = ebEntName;
	}

	public Integer getEbEntId() {
		return ebEntId;
	}

	public void setEbEntId(Integer ebEntId) {
		this.ebEntId = ebEntId;
	}

	public String getEbpEntNo() {
		return ebpEntNo;
	}

	public void setEbpEntNo(String ebpEntNo) {
		this.ebpEntNo = ebpEntNo;
	}

	public String getEbpEntName() {
		return ebpEntName;
	}

	public void setEbpEntName(String ebpEntName) {
		this.ebpEntName = ebpEntName;
	}

	public Integer getEbpEntId() {
		return ebpEntId;
	}

	public void setEbpEntId(Integer ebpEntId) {
		this.ebpEntId = ebpEntId;
	}

	public String getInternetDomainName() {
		return internetDomainName;
	}

	public void setInternetDomainName(String internetDomainName) {
		this.internetDomainName = internetDomainName;
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
