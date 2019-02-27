package com.yunyitg.cesp.core.exports.waybill.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_waybill_detail")
public class ExWaybillDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer waybillHeadId;

    private String entWaybillNo;

    private Integer declEntId;

    private Integer eHSEntId;

    private String iEFlag;

    private String customsCode;

    private String ciqOrgCode;

    private String entOrderNo;

    private String billNo;

    private Date outDate;

    private String dischargePlace;

    private BigDecimal feeRate;

    private String feeCurrCode;

    private String feeMark;

    private BigDecimal insurRate;

    private BigDecimal otherRate;

    private BigDecimal packNo;

    private BigDecimal netWt;

    private BigDecimal grossWt;

    private String goodsDetail;

    private String recipientName;

    private String recipientAddr;

    private String recipientTel;

    private String recipientCountry;

    private String shipperCode;

    private String shipperName;

    private String shipperDatailedAddress;

    private String shipperPhone;

    private String notes;

    private String cusMessageStatusWaybill;

    private String cusWaybillReturnInfo;

    private String ciqMessageStatusWaybill;

    private String ciqWaybillReturnInfo;

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

    public Integer getWaybillHeadId() {
        return waybillHeadId;
    }

    public void setWaybillHeadId(Integer waybillHeadId) {
        this.waybillHeadId = waybillHeadId;
    }

    public String getEntWaybillNo() {
        return entWaybillNo;
    }

    public void setEntWaybillNo(String entWaybillNo) {
        this.entWaybillNo = entWaybillNo == null ? null : entWaybillNo.trim();
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

    public String getEntOrderNo() {
        return entOrderNo;
    }

    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo == null ? null : entOrderNo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getDischargePlace() {
        return dischargePlace;
    }

    public void setDischargePlace(String dischargePlace) {
        this.dischargePlace = dischargePlace == null ? null : dischargePlace.trim();
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public String getFeeCurrCode() {
        return feeCurrCode;
    }

    public void setFeeCurrCode(String feeCurrCode) {
        this.feeCurrCode = feeCurrCode == null ? null : feeCurrCode.trim();
    }

    public String getFeeMark() {
        return feeMark;
    }

    public void setFeeMark(String feeMark) {
        this.feeMark = feeMark == null ? null : feeMark.trim();
    }

    public BigDecimal getInsurRate() {
        return insurRate;
    }

    public void setInsurRate(BigDecimal insurRate) {
        this.insurRate = insurRate;
    }

    public BigDecimal getOtherRate() {
        return otherRate;
    }

    public void setOtherRate(BigDecimal otherRate) {
        this.otherRate = otherRate;
    }

    public BigDecimal getPackNo() {
        return packNo;
    }

    public void setPackNo(BigDecimal packNo) {
        this.packNo = packNo;
    }

    public BigDecimal getNetWt() {
        return netWt;
    }

    public void setNetWt(BigDecimal netWt) {
        this.netWt = netWt;
    }

    public BigDecimal getGrossWt() {
        return grossWt;
    }

    public void setGrossWt(BigDecimal grossWt) {
        this.grossWt = grossWt;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
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

    public String getShipperCode() {
        return shipperCode;
    }

    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode == null ? null : shipperCode.trim();
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName == null ? null : shipperName.trim();
    }

    public String getShipperDatailedAddress() {
        return shipperDatailedAddress;
    }

    public void setShipperDatailedAddress(String shipperDatailedAddress) {
        this.shipperDatailedAddress = shipperDatailedAddress == null ? null : shipperDatailedAddress.trim();
    }

    public String getShipperPhone() {
        return shipperPhone;
    }

    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone == null ? null : shipperPhone.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getCusMessageStatusWaybill() {
        return cusMessageStatusWaybill;
    }

    public void setCusMessageStatusWaybill(String cusMessageStatusWaybill) {
        this.cusMessageStatusWaybill = cusMessageStatusWaybill == null ? null : cusMessageStatusWaybill.trim();
    }

    public String getCusWaybillReturnInfo() {
        return cusWaybillReturnInfo;
    }

    public void setCusWaybillReturnInfo(String cusWaybillReturnInfo) {
        this.cusWaybillReturnInfo = cusWaybillReturnInfo == null ? null : cusWaybillReturnInfo.trim();
    }

    public String getCiqMessageStatusWaybill() {
        return ciqMessageStatusWaybill;
    }

    public void setCiqMessageStatusWaybill(String ciqMessageStatusWaybill) {
        this.ciqMessageStatusWaybill = ciqMessageStatusWaybill == null ? null : ciqMessageStatusWaybill.trim();
    }

    public String getCiqWaybillReturnInfo() {
        return ciqWaybillReturnInfo;
    }

    public void setCiqWaybillReturnInfo(String ciqWaybillReturnInfo) {
        this.ciqWaybillReturnInfo = ciqWaybillReturnInfo == null ? null : ciqWaybillReturnInfo.trim();
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