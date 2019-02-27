package com.yunyitg.cesp.core.exports.order.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_order_detail")
public class ExOrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer orderHeadId;

    private String entOrderNo;

    private Integer declEntId;

    private Integer eBEntId;

    private Integer eBPEntId;

    private String iEFlag;

    private String customsCode;

    private String ciqOrgCode;

    private String orderStatus;

    private String payStatus;

    private BigDecimal orderGoodTotal;

    private String orderGoodTotalCurr;

    private BigDecimal freight;

    private String checkingNo;

    private String deliveryEnt;

    private String recipientName;

    private String recipientAddr;

    private String recipientTel;

    private String recipientCountry;

    private String orderDocAccount;

    private Date orderDate;

    private String notes;

    private String cusMessageStatusOrder;

    private String cusOrderReturnInfo;

    private String ciqMessageStatusOrder;

    private String ciqOrderReturnInfo;

    private Date createAt;

    private Integer createUserId;

    private Date updateAt;

    private Integer updateUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderHeadId() {
        return orderHeadId;
    }

    public void setOrderHeadId(Integer orderHeadId) {
        this.orderHeadId = orderHeadId;
    }

    public String getEntOrderNo() {
        return entOrderNo;
    }

    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo == null ? null : entOrderNo.trim();
    }

    public Integer getDeclEntId() {
        return declEntId;
    }

    public void setDeclEntId(Integer declEntId) {
        this.declEntId = declEntId;
    }

    public Integer geteBEntId() {
        return eBEntId;
    }

    public void seteBEntId(Integer eBEntId) {
        this.eBEntId = eBEntId;
    }

    public Integer geteBPEntId() {
        return eBPEntId;
    }

    public void seteBPEntId(Integer eBPEntId) {
        this.eBPEntId = eBPEntId;
    }

    public String getiEFlag() {
        return iEFlag;
    }

    public void setiEFlag(String iEFlag) {
        this.iEFlag = iEFlag == null ? null : iEFlag.trim();
    }

    public String getCustomsCode() {
        return customsCode;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode == null ? null : customsCode.trim();
    }

    public String getCiqOrgCode() {
        return ciqOrgCode;
    }

    public void setCiqOrgCode(String ciqOrgCode) {
        this.ciqOrgCode = ciqOrgCode == null ? null : ciqOrgCode.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public BigDecimal getOrderGoodTotal() {
        return orderGoodTotal;
    }

    public void setOrderGoodTotal(BigDecimal orderGoodTotal) {
        this.orderGoodTotal = orderGoodTotal;
    }

    public String getOrderGoodTotalCurr() {
        return orderGoodTotalCurr;
    }

    public void setOrderGoodTotalCurr(String orderGoodTotalCurr) {
        this.orderGoodTotalCurr = orderGoodTotalCurr == null ? null : orderGoodTotalCurr.trim();
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getCheckingNo() {
        return checkingNo;
    }

    public void setCheckingNo(String checkingNo) {
        this.checkingNo = checkingNo == null ? null : checkingNo.trim();
    }

    public String getDeliveryEnt() {
        return deliveryEnt;
    }

    public void setDeliveryEnt(String deliveryEnt) {
        this.deliveryEnt = deliveryEnt == null ? null : deliveryEnt.trim();
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName == null ? null : recipientName.trim();
    }

    public String getRecipientAddr() {
        return recipientAddr;
    }

    public void setRecipientAddr(String recipientAddr) {
        this.recipientAddr = recipientAddr == null ? null : recipientAddr.trim();
    }

    public String getRecipientTel() {
        return recipientTel;
    }

    public void setRecipientTel(String recipientTel) {
        this.recipientTel = recipientTel == null ? null : recipientTel.trim();
    }

    public String getRecipientCountry() {
        return recipientCountry;
    }

    public void setRecipientCountry(String recipientCountry) {
        this.recipientCountry = recipientCountry == null ? null : recipientCountry.trim();
    }

    public String getOrderDocAccount() {
        return orderDocAccount;
    }

    public void setOrderDocAccount(String orderDocAccount) {
        this.orderDocAccount = orderDocAccount == null ? null : orderDocAccount.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getCusMessageStatusOrder() {
        return cusMessageStatusOrder;
    }

    public void setCusMessageStatusOrder(String cusMessageStatusOrder) {
        this.cusMessageStatusOrder = cusMessageStatusOrder == null ? null : cusMessageStatusOrder.trim();
    }

    public String getCusOrderReturnInfo() {
        return cusOrderReturnInfo;
    }

    public void setCusOrderReturnInfo(String cusOrderReturnInfo) {
        this.cusOrderReturnInfo = cusOrderReturnInfo == null ? null : cusOrderReturnInfo.trim();
    }

    public String getCiqMessageStatusOrder() {
        return ciqMessageStatusOrder;
    }

    public void setCiqMessageStatusOrder(String ciqMessageStatusOrder) {
        this.ciqMessageStatusOrder = ciqMessageStatusOrder == null ? null : ciqMessageStatusOrder.trim();
    }

    public String getCiqOrderReturnInfo() {
        return ciqOrderReturnInfo;
    }

    public void setCiqOrderReturnInfo(String ciqOrderReturnInfo) {
        this.ciqOrderReturnInfo = ciqOrderReturnInfo == null ? null : ciqOrderReturnInfo.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
}