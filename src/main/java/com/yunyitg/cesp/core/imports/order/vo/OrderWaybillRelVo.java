package com.yunyitg.cesp.core.imports.order.vo;

/**
 * 电子订单关联 运单信息
 * @author yangyuantao
 *
 */
public class OrderWaybillRelVo {

	/**
	 * 物流企业代码
	 */
	private String ehsEntNo;
	
	/**
	 * 物流企业名称
	 */
	private String ehsEntName;
	
	/**
	 * 电子运单编号
	 */
	private String waybillNo;
	
	/**
	 * 备注
	 */
	private String notes;
	
	public OrderWaybillRelVo() {
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

	public String getWaybillNo() {
		return waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
