package com.yunyitg.cesp.core.imports.waybill.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import cn.afterturn.easypoi.handler.inter.IExcelModel;

public class WaybillDetailPoiEntityOfMode extends WaybillDetailPoiEntity implements IExcelModel {

	private String errorMsg;
	
	@Override
	public String getErrorMsg() {
		return errorMsg;
	}

	@Override
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
