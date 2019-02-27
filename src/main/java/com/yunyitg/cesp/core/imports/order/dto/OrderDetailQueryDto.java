package com.yunyitg.cesp.core.imports.order.dto;

import java.io.Serializable;

import com.yunyitg.cesp.common.dto.BaseQueryDTO;

/**
 * 进口电子订单条件查询  条件数据对象
 * @author yangyuantao
 *
 */
public class OrderDetailQueryDto extends BaseQueryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 企业订单编号
	 */
	private String entOrderNo;
	
	/**
	 * 电子运单编号
	 */
	private String waybillNo;
	
	/**
	 * 支付交易编号
	 */
	private String payNo;
	
	/**
	 * 电商企业编号
	 */
	private String ebEntNo;
	
	/**
	 * 电商企业名称
	 */
	private String ebEntName;
	
	/**
	 * 申报企业编号
	 */
	private String declEntNo;
	
	/**
	 * 申报企业名称
	 */
	private String declEntName;
	
	/**
	 * 海关电子订单状态
	 */
	private String cusMessageStatusOrder;
	
	/**
	 * 国检电子订单状态
	 */
	private String ciqMessageStatusOrder;
	
	public OrderDetailQueryDto() {
		super();
	}

	public String getEntOrderNo() {
		return entOrderNo;
	}

	public void setEntOrderNo(String entOrderNo) {
		this.entOrderNo = entOrderNo;
	}
	
	public String getWaybillNo() {
		return waybillNo;
	}
	
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}
	
	public String getPayNo() {
		return payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
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
	
	public String getDeclEntNo() {
		return declEntNo;
	}
	
	public void setDeclEntNo(String declEntNo) {
		this.declEntNo = declEntNo;
	}
	
	public String getDeclEntName() {
		return declEntName;
	}
	
	public void setDeclEntName(String declEntName) {
		this.declEntName = declEntName;
	}

	public String getCusMessageStatusOrder() {
		return cusMessageStatusOrder;
	}

	public void setCusMessageStatusOrder(String cusMessageStatusOrder) {
		this.cusMessageStatusOrder = cusMessageStatusOrder;
	}

	public String getCiqMessageStatusOrder() {
		return ciqMessageStatusOrder;
	}

	public void setCiqMessageStatusOrder(String ciqMessageStatusOrder) {
		this.ciqMessageStatusOrder = ciqMessageStatusOrder;
	}
	
}
