package com.yunyitg.cesp.core.imports.waybill.validation;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.yunyitg.cesp.core.imports.waybill.entity.WaybillHead;

public class WaybillImportResult {

	/**
	 * 一次导入的物流运单所有数据
	 */
	private WaybillHead waybillHead;
	
	/**
	 * 校验失败原因
	 */
	private String msg;
	
	/**
	 * 是否存在校验失败标志
	 */
	private boolean verifyFail;
	
	public WaybillImportResult() {
		// TODO Auto-generated constructor stub
	}
	
	public WaybillImportResult(boolean verifyFail, String msg) {
		this.verifyFail = verifyFail;
		this.msg = msg;
	}
	
	public WaybillHead getWaybillHead() {
		return waybillHead;
	}
	
	public void setWaybillHead(WaybillHead waybillHead) {
		this.waybillHead = waybillHead;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public boolean isVerifyFail() {
		return verifyFail;
	}
	
	public void setVerifyFail(boolean verifyFail) {
		this.verifyFail = verifyFail;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
