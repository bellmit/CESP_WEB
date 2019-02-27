package com.yunyitg.cesp.core.imports.order.validation;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.yunyitg.cesp.core.imports.order.entity.OrderHead;

public class OrderImportResult {

	/**
	 * 一次导入的电子订单所有数据  
	 */
	private OrderHead orderHead;
	
	
	/**
	 * 检验失败原因
	 */
	private String msg;
	
	/**
	 * 是否存在校验失败
	 */
	private boolean verfiyFail;
	
	public OrderImportResult() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderImportResult(boolean verfiyFail, String msg) {
		this.verfiyFail = verfiyFail;
		this.msg = msg;
	}

	public OrderHead getOrderHead() {
		return orderHead;
	}

	public void setOrderHead(OrderHead orderHead) {
		this.orderHead = orderHead;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isVerfiyFail() {
		return verfiyFail;
	}

	public void setVerfiyFail(boolean verfiyFail) {
		this.verfiyFail = verfiyFail;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
