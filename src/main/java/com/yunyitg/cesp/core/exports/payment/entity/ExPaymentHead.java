package com.yunyitg.cesp.core.exports.payment.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_payment_head")
public class ExPaymentHead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer declEntId;

    private Integer payEntId;

    private Date declTime;

    private String opType;

    private String iEFlag;

    private String customsCode;

    private String ciqOrgCode;

    private String declStatus;

    private String declMode;

    private String messageId;

    private Boolean cusFlag;

    private Boolean ciqFlag;

    private Integer centralId;

    private String paymentDetailIds;

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

    public Date getDeclTime() {
        return declTime;
    }

    public void setDeclTime(Date declTime) {
        this.declTime = declTime;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
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

    public String getDeclStatus() {
        return declStatus;
    }

    public void setDeclStatus(String declStatus) {
        this.declStatus = declStatus == null ? null : declStatus.trim();
    }

    public String getDeclMode() {
        return declMode;
    }

    public void setDeclMode(String declMode) {
        this.declMode = declMode == null ? null : declMode.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public Boolean getCusFlag() {
        return cusFlag;
    }

    public void setCusFlag(Boolean cusFlag) {
        this.cusFlag = cusFlag;
    }

    public Boolean getCiqFlag() {
        return ciqFlag;
    }

    public void setCiqFlag(Boolean ciqFlag) {
        this.ciqFlag = ciqFlag;
    }

    public Integer getCentralId() {
        return centralId;
    }

    public void setCentralId(Integer centralId) {
        this.centralId = centralId;
    }

    public String getPaymentDetailIds() {
        return paymentDetailIds;
    }

    public void setPaymentDetailIds(String paymentDetailIds) {
        this.paymentDetailIds = paymentDetailIds == null ? null : paymentDetailIds.trim();
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