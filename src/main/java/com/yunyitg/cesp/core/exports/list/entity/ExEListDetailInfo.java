package com.yunyitg.cesp.core.exports.list.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_e_list_detail_info")
public class ExEListDetailInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer eListHeadId;

    private String entEListNo;

    private Integer declEntId;

    private Integer eBEntId;

    private String iEFlag;

    private String customsCode;

    private String ciqOrgCode;

    private String tradeMode;

    private String entOrderNo;

    private String entWaybillNo;

    private String ePortEListNo;

    private String preNo;

    private String cusEListNo;

    private String ciqEListNo;

    private String iEPort;

    private String svPCode;

    private Date iEDate;

    private String emsNo;

    private Integer areaId;

    private String transMode;

    private String useTo;

    private String billNo;

    private String packEntName;

    private String wrapType;

    private Integer packQuantity;

    private String transType;

    private String transCode;

    private String transNo;

    private String voyageNo;

    private String destinationCountry;

    private String destinationPort;

    private Date edestDate;

    private String routeCountry;

    private String notes;

    private String cusMessageStatusList;

    private String cusListReturnInfo;

    private String ciqMessageStatusList;

    private String ciqListReturnInfo;

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

    public Integer geteListHeadId() {
        return eListHeadId;
    }

    public void seteListHeadId(Integer eListHeadId) {
        this.eListHeadId = eListHeadId;
    }

    public String getEntEListNo() {
        return entEListNo;
    }

    public void setEntEListNo(String entEListNo) {
        this.entEListNo = entEListNo == null ? null : entEListNo.trim();
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

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    public String getEntOrderNo() {
        return entOrderNo;
    }

    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo == null ? null : entOrderNo.trim();
    }

    public String getEntWaybillNo() {
        return entWaybillNo;
    }

    public void setEntWaybillNo(String entWaybillNo) {
        this.entWaybillNo = entWaybillNo == null ? null : entWaybillNo.trim();
    }

    public String getePortEListNo() {
        return ePortEListNo;
    }

    public void setePortEListNo(String ePortEListNo) {
        this.ePortEListNo = ePortEListNo == null ? null : ePortEListNo.trim();
    }

    public String getPreNo() {
        return preNo;
    }

    public void setPreNo(String preNo) {
        this.preNo = preNo == null ? null : preNo.trim();
    }

    public String getCusEListNo() {
        return cusEListNo;
    }

    public void setCusEListNo(String cusEListNo) {
        this.cusEListNo = cusEListNo == null ? null : cusEListNo.trim();
    }

    public String getCiqEListNo() {
        return ciqEListNo;
    }

    public void setCiqEListNo(String ciqEListNo) {
        this.ciqEListNo = ciqEListNo == null ? null : ciqEListNo.trim();
    }

    public String getiEPort() {
        return iEPort;
    }

    public void setiEPort(String iEPort) {
        this.iEPort = iEPort == null ? null : iEPort.trim();
    }

    public String getSvPCode() {
        return svPCode;
    }

    public void setSvPCode(String svPCode) {
        this.svPCode = svPCode == null ? null : svPCode.trim();
    }

    public Date getiEDate() {
        return iEDate;
    }

    public void setiEDate(Date iEDate) {
        this.iEDate = iEDate;
    }

    public String getEmsNo() {
        return emsNo;
    }

    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo == null ? null : emsNo.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode == null ? null : transMode.trim();
    }

    public String getUseTo() {
        return useTo;
    }

    public void setUseTo(String useTo) {
        this.useTo = useTo == null ? null : useTo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getPackEntName() {
        return packEntName;
    }

    public void setPackEntName(String packEntName) {
        this.packEntName = packEntName == null ? null : packEntName.trim();
    }

    public String getWrapType() {
        return wrapType;
    }

    public void setWrapType(String wrapType) {
        this.wrapType = wrapType == null ? null : wrapType.trim();
    }

    public Integer getPackQuantity() {
        return packQuantity;
    }

    public void setPackQuantity(Integer packQuantity) {
        this.packQuantity = packQuantity;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    public String getVoyageNo() {
        return voyageNo;
    }

    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo == null ? null : voyageNo.trim();
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry == null ? null : destinationCountry.trim();
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort == null ? null : destinationPort.trim();
    }

    public Date getEdestDate() {
        return edestDate;
    }

    public void setEdestDate(Date edestDate) {
        this.edestDate = edestDate;
    }

    public String getRouteCountry() {
        return routeCountry;
    }

    public void setRouteCountry(String routeCountry) {
        this.routeCountry = routeCountry == null ? null : routeCountry.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getCusMessageStatusList() {
        return cusMessageStatusList;
    }

    public void setCusMessageStatusList(String cusMessageStatusList) {
        this.cusMessageStatusList = cusMessageStatusList == null ? null : cusMessageStatusList.trim();
    }

    public String getCusListReturnInfo() {
        return cusListReturnInfo;
    }

    public void setCusListReturnInfo(String cusListReturnInfo) {
        this.cusListReturnInfo = cusListReturnInfo == null ? null : cusListReturnInfo.trim();
    }

    public String getCiqMessageStatusList() {
        return ciqMessageStatusList;
    }

    public void setCiqMessageStatusList(String ciqMessageStatusList) {
        this.ciqMessageStatusList = ciqMessageStatusList == null ? null : ciqMessageStatusList.trim();
    }

    public String getCiqListReturnInfo() {
        return ciqListReturnInfo;
    }

    public void setCiqListReturnInfo(String ciqListReturnInfo) {
        this.ciqListReturnInfo = ciqListReturnInfo == null ? null : ciqListReturnInfo.trim();
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