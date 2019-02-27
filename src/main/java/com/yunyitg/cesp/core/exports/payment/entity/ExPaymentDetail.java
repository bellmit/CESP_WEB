package com.yunyitg.cesp.core.exports.payment.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_payment_detail")
public class ExPaymentDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer paymentHeadId;

    private String entPayNo;

    private Integer declEntId;

    private Integer payEntId;

    private String iEFlag;

    private String customsCode;

    private String ciqOrgCode;

    private BigDecimal payAmount;

    private String payCurrCode;

    private Date payTime;

    private String entOrderNo;

    private Integer eBEntId;

    private String notes;

    private String cusMessageStatusPay;

    private String cusPayReturnInfo;

    private String ciqMessageStatusPay;

    private String ciqPayReturnInfo;

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

    public Integer getPaymentHeadId() {
        return paymentHeadId;
    }

    public void setPaymentHeadId(Integer paymentHeadId) {
        this.paymentHeadId = paymentHeadId;
    }

    public String getEntPayNo() {
        return entPayNo;
    }

    public void setEntPayNo(String entPayNo) {
        this.entPayNo = entPayNo == null ? null : entPayNo.trim();
    }

    public Integer getDeclEntId() {
        return declEntId;
    }

    public void setDeclEntId(Integer declEntId) {
        this.declEntId = declEntId;
    }

    public Integer getPayEntId() {
        return payEntId;
    }

    public void setPayEntId(Integer payEntId) {
        this.payEntId = payEntId;
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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayCurrCode() {
        return payCurrCode;
    }

    public void setPayCurrCode(String payCurrCode) {
        this.payCurrCode = payCurrCode == null ? null : payCurrCode.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getEntOrderNo() {
        return entOrderNo;
    }

    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo == null ? null : entOrderNo.trim();
    }

    public Integer geteBEntId() {
        return eBEntId;
    }

    public void seteBEntId(Integer eBEntId) {
        this.eBEntId = eBEntId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getCusMessageStatusPay() {
        return cusMessageStatusPay;
    }

    public void setCusMessageStatusPay(String cusMessageStatusPay) {
        this.cusMessageStatusPay = cusMessageStatusPay == null ? null : cusMessageStatusPay.trim();
    }

    public String getCusPayReturnInfo() {
        return cusPayReturnInfo;
    }

    public void setCusPayReturnInfo(String cusPayReturnInfo) {
        this.cusPayReturnInfo = cusPayReturnInfo == null ? null : cusPayReturnInfo.trim();
    }

    public String getCiqMessageStatusPay() {
        return ciqMessageStatusPay;
    }

    public void setCiqMessageStatusPay(String ciqMessageStatusPay) {
        this.ciqMessageStatusPay = ciqMessageStatusPay == null ? null : ciqMessageStatusPay.trim();
    }

    public String getCiqPayReturnInfo() {
        return ciqPayReturnInfo;
    }

    public void setCiqPayReturnInfo(String ciqPayReturnInfo) {
        this.ciqPayReturnInfo = ciqPayReturnInfo == null ? null : ciqPayReturnInfo.trim();
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