package com.yunyitg.cesp.core.exports.order.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_order_head")
public class ExOrderHead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer declEntId;

    private Integer eBEntId;

    private Integer eBPEntId;

    private String internetDomainName;

    private Date declTime;

    private String opType;

    private String iEFlag;

    private String customsCode;

    private String ciqOrgCode;

    private String proposerType;

    private String proposerId;

    private String proposerName;

    private String declStatus;

    private String declMode;

    private String messageId;

    private Boolean cusFlag;

    private Boolean ciqFlag;

    private Integer centralId;

    private String orderDetailIds;

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

    public String getInternetDomainName() {
        return internetDomainName;
    }

    public void setInternetDomainName(String internetDomainName) {
        this.internetDomainName = internetDomainName == null ? null : internetDomainName.trim();
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

    public String getProposerType() {
        return proposerType;
    }

    public void setProposerType(String proposerType) {
        this.proposerType = proposerType == null ? null : proposerType.trim();
    }

    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId == null ? null : proposerId.trim();
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName == null ? null : proposerName.trim();
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

    public String getOrderDetailIds() {
        return orderDetailIds;
    }

    public void setOrderDetailIds(String orderDetailIds) {
        this.orderDetailIds = orderDetailIds == null ? null : orderDetailIds.trim();
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