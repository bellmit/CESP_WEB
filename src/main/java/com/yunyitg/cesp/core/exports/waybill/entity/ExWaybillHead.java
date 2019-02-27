package com.yunyitg.cesp.core.exports.waybill.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_waybill_head")
public class ExWaybillHead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer declEntId;

    private Integer eHSEntId;

    private Date declTime;

    private String opType;

    private String iEFlag;

    private String transMode;

    private String customsCode;

    private String ciqOrgCode;

    private String declStatus;

    private String declMode;

    private String messageId;

    private Boolean cusFlag;

    private Boolean ciqFlag;

    private Integer centralId;

    private String waybillDetailIds;

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

    public Integer geteHSEntId() {
        return eHSEntId;
    }

    public void seteHSEntId(Integer eHSEntId) {
        this.eHSEntId = eHSEntId;
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

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode == null ? null : transMode.trim();
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

    public String getWaybillDetailIds() {
        return waybillDetailIds;
    }

    public void setWaybillDetailIds(String waybillDetailIds) {
        this.waybillDetailIds = waybillDetailIds == null ? null : waybillDetailIds.trim();
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