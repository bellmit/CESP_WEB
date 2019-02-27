package com.yunyitg.cesp.core.exports.logistics.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_logistics_head")
public class ExLogisticsHead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer declEntId;

    private Integer eHSEntId;

    private String customsCode;

    private String ciqOrgCode;

    private String entLoadingNo;

    private String iEPort;

    private BigDecimal packNo;

    private BigDecimal grossWeight;

    private String trafMode;

    private String tranNo;

    private String vayageNo;

    private String billNo;

    private String domesticTrafNo;

    private String locCode;

    private Date loadDate;

    private Date declTime;

    private Date inputDate;

    private String opType;

    private String notes;

    private String declStatus;

    private String declMode;

    private String messageId;

    private Boolean cusFlag;

    private Boolean ciqFlag;

    private Integer centralId;

    private String cusMessageStatusLogistics;

    private String cusLogisticsReturnInfo;

    private String ciqMessageStatusLogistics;

    private String ciqLogisticsReturnInfo;

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

    public String getEntLoadingNo() {
        return entLoadingNo;
    }

    public void setEntLoadingNo(String entLoadingNo) {
        this.entLoadingNo = entLoadingNo == null ? null : entLoadingNo.trim();
    }

    public String getiEPort() {
        return iEPort;
    }

    public void setiEPort(String iEPort) {
        this.iEPort = iEPort == null ? null : iEPort.trim();
    }

    public BigDecimal getPackNo() {
        return packNo;
    }

    public void setPackNo(BigDecimal packNo) {
        this.packNo = packNo;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String getTrafMode() {
        return trafMode;
    }

    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode == null ? null : trafMode.trim();
    }

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo == null ? null : tranNo.trim();
    }

    public String getVayageNo() {
        return vayageNo;
    }

    public void setVayageNo(String vayageNo) {
        this.vayageNo = vayageNo == null ? null : vayageNo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getDomesticTrafNo() {
        return domesticTrafNo;
    }

    public void setDomesticTrafNo(String domesticTrafNo) {
        this.domesticTrafNo = domesticTrafNo == null ? null : domesticTrafNo.trim();
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode == null ? null : locCode.trim();
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Date getDeclTime() {
        return declTime;
    }

    public void setDeclTime(Date declTime) {
        this.declTime = declTime;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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

    public String getCusMessageStatusLogistics() {
        return cusMessageStatusLogistics;
    }

    public void setCusMessageStatusLogistics(String cusMessageStatusLogistics) {
        this.cusMessageStatusLogistics = cusMessageStatusLogistics == null ? null : cusMessageStatusLogistics.trim();
    }

    public String getCusLogisticsReturnInfo() {
        return cusLogisticsReturnInfo;
    }

    public void setCusLogisticsReturnInfo(String cusLogisticsReturnInfo) {
        this.cusLogisticsReturnInfo = cusLogisticsReturnInfo == null ? null : cusLogisticsReturnInfo.trim();
    }

    public String getCiqMessageStatusLogistics() {
        return ciqMessageStatusLogistics;
    }

    public void setCiqMessageStatusLogistics(String ciqMessageStatusLogistics) {
        this.ciqMessageStatusLogistics = ciqMessageStatusLogistics == null ? null : ciqMessageStatusLogistics.trim();
    }

    public String getCiqLogisticsReturnInfo() {
        return ciqLogisticsReturnInfo;
    }

    public void setCiqLogisticsReturnInfo(String ciqLogisticsReturnInfo) {
        this.ciqLogisticsReturnInfo = ciqLogisticsReturnInfo == null ? null : ciqLogisticsReturnInfo.trim();
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