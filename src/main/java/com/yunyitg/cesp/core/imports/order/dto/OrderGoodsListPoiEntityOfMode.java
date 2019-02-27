package com.yunyitg.cesp.core.imports.order.dto;

import cn.afterturn.easypoi.handler.inter.IExcelModel;

public class OrderGoodsListPoiEntityOfMode extends OrderGoodsListPoiEntity implements IExcelModel {

	private String errorMsg;
	
	@Override
	public String getErrorMsg() {
		return errorMsg;
	}

	@Override
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
