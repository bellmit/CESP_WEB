package com.yunyitg.cesp.core.imports.order.vo;

public class OrderPaymentRelVo {

	/**
	 * 支付企业代码
	 */
	private String payEntNo;
	
	/**
	 * 支付企业名称
	 */
	private String payEntName;
	
	/**
	 * 支付交易编号
	 */
	private String payNo;
	
	/**
	 * 备注
	 */
	private String notes;
	
	public OrderPaymentRelVo() {
		// TODO Auto-generated constructor stub
	}

	public String getPayEntNo() {
		return payEntNo;
	}

	public void setPayEntNo(String payEntNo) {
		this.payEntNo = payEntNo;
	}

	public String getPayEntName() {
		return payEntName;
	}

	public void setPayEntName(String payEntName) {
		this.payEntName = payEntName;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
