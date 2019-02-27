package com.yunyitg.cesp.core.imports.order.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 电子订单明细  前端视图对象
 * @author yangyuantao
 *
 */
public class OrderDetailListVo {

	/**
	 * 序号
	 */
	private Integer id;
	
	/**
	 * 海关状态
	 */
    private String cusMessageStatusOrder;
    
    /**
     * 海关状态描述
     */
    private String cusMessageStatusOrderDesc;
    
    /**
     * 海关回执
     */
    private String cusOrderReturnInfo;

    /**
     * 国检订单状态
     */
    private String ciqMessageStatusOrder;
    
    /**
     * 国检订单状态描述
     */
    private String ciqMessageStatusOrderDesc;

    /**
     * 国检回执
     */
    private String ciqOrderReturnInfo;
    
    /**
     * 企业订单编号
     */
    private String entOrderNo;
    
    /**
     * 平台接收时间
     */
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createAt;
    
    /**
     * 申报企业名称
     */
    private String declEntName;
    
    /**
     * 电商企业名称
     */
    private String ebEntName;
    
    /**
     * 电子运单编号
     */
    private String waybillNo;
    
    /**
     * 支付交易编号
     */
    private String payNo;
    
    public OrderDetailListVo() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCusMessageStatusOrder() {
		return cusMessageStatusOrder;
	}

	public void setCusMessageStatusOrder(String cusMessageStatusOrder) {
		this.cusMessageStatusOrder = cusMessageStatusOrder;
	}

	public String getCusMessageStatusOrderDesc() {
		return cusMessageStatusOrderDesc;
	}

	public void setCusMessageStatusOrderDesc(String cusMessageStatusOrderDesc) {
		this.cusMessageStatusOrderDesc = cusMessageStatusOrderDesc;
	}

	public String getCusOrderReturnInfo() {
		return cusOrderReturnInfo;
	}

	public void setCusOrderReturnInfo(String cusOrderReturnInfo) {
		this.cusOrderReturnInfo = cusOrderReturnInfo;
	}

	public String getCiqMessageStatusOrder() {
		return ciqMessageStatusOrder;
	}

	public void setCiqMessageStatusOrder(String ciqMessageStatusOrder) {
		this.ciqMessageStatusOrder = ciqMessageStatusOrder;
	}

	public String getCiqMessageStatusOrderDesc() {
		return ciqMessageStatusOrderDesc;
	}

	public void setCiqMessageStatusOrderDesc(String ciqMessageStatusOrderDesc) {
		this.ciqMessageStatusOrderDesc = ciqMessageStatusOrderDesc;
	}

	public String getCiqOrderReturnInfo() {
		return ciqOrderReturnInfo;
	}

	public void setCiqOrderReturnInfo(String ciqOrderReturnInfo) {
		this.ciqOrderReturnInfo = ciqOrderReturnInfo;
	}

	public String getEntOrderNo() {
		return entOrderNo;
	}

	public void setEntOrderNo(String entOrderNo) {
		this.entOrderNo = entOrderNo;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getDeclEntName() {
		return declEntName;
	}

	public void setDeclEntName(String declEntName) {
		this.declEntName = declEntName;
	}

	public String getEbEntName() {
		return ebEntName;
	}

	public void setEbEntName(String ebEntName) {
		this.ebEntName = ebEntName;
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
}
