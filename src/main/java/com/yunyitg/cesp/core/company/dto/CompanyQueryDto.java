package com.yunyitg.cesp.core.company.dto;

import java.io.Serializable;

import com.yunyitg.cesp.common.dto.BaseQueryDTO;

public class CompanyQueryDto extends BaseQueryDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String gzeportCode;
	
	private String name;
	
	private String cusCode;
	
	private String ciqCode;
	
	public CompanyQueryDto() {
		// TODO Auto-generated constructor stub
	}

	public String getGzeportCode() {
		return gzeportCode;
	}

	public void setGzeportCode(String gzeportCode) {
		this.gzeportCode = gzeportCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCusCode() {
		return cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	public String getCiqCode() {
		return ciqCode;
	}

	public void setCiqCode(String ciqCode) {
		this.ciqCode = ciqCode;
	}
	
}
