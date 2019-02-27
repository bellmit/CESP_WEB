package com.yunyitg.cesp.core.exports.list.entity;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_e_list_waybill")
public class ExEListWaybill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer eListDetailInfoId;

    private String entWaybillNo;

    private Integer eHSEntId;

    private BigDecimal grossWeight;

    private BigDecimal netWt;

    private BigDecimal feeRate;

    private String feeMark;

    private BigDecimal insurRate;

    private String insurCurrCode;

    private String insurMark;

    private BigDecimal otherRate;

    private String recipientNameC;

    private String recipientCountry;

    private String recipientProvincesCode;

    private String recipientAddrC;

    private String recipientTel;

    private String shipperCode;

    private String shipperC;

    private String shipperAddrC;

    private String shipperPhone;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer geteListDetailInfoId() {
        return eListDetailInfoId;
    }

    public void seteListDetailInfoId(Integer eListDetailInfoId) {
        this.eListDetailInfoId = eListDetailInfoId;
    }

    public String getEntWaybillNo() {
        return entWaybillNo;
    }

    public void setEntWaybillNo(String entWaybillNo) {
        this.entWaybillNo = entWaybillNo == null ? null : entWaybillNo.trim();
    }

    public Integer geteHSEntId() {
        return eHSEntId;
    }

    public void seteHSEntId(Integer eHSEntId) {
        this.eHSEntId = eHSEntId;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWt() {
        return netWt;
    }

    public void setNetWt(BigDecimal netWt) {
        this.netWt = netWt;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
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

    public String getInsurCurrCode() {
        return insurCurrCode;
    }

    public void setInsurCurrCode(String insurCurrCode) {
        this.insurCurrCode = insurCurrCode == null ? null : insurCurrCode.trim();
    }

    public String getInsurMark() {
        return insurMark;
    }

    public void setInsurMark(String insurMark) {
        this.insurMark = insurMark == null ? null : insurMark.trim();
    }

    public BigDecimal getOtherRate() {
        return otherRate;
    }

    public void setOtherRate(BigDecimal otherRate) {
        this.otherRate = otherRate;
    }

    public String getRecipientNameC() {
        return recipientNameC;
    }

    public void setRecipientNameC(String recipientNameC) {
        this.recipientNameC = recipientNameC == null ? null : recipientNameC.trim();
    }

    public String getRecipientCountry() {
        return recipientCountry;
    }

    public void setRecipientCountry(String recipientCountry) {
        this.recipientCountry = recipientCountry == null ? null : recipientCountry.trim();
    }

    public String getRecipientProvincesCode() {
        return recipientProvincesCode;
    }

    public void setRecipientProvincesCode(String recipientProvincesCode) {
        this.recipientProvincesCode = recipientProvincesCode == null ? null : recipientProvincesCode.trim();
    }

    public String getRecipientAddrC() {
        return recipientAddrC;
    }

    public void setRecipientAddrC(String recipientAddrC) {
        this.recipientAddrC = recipientAddrC == null ? null : recipientAddrC.trim();
    }

    public String getRecipientTel() {
        return recipientTel;
    }

    public void setRecipientTel(String recipientTel) {
        this.recipientTel = recipientTel == null ? null : recipientTel.trim();
    }

    public String getShipperCode() {
        return shipperCode;
    }

    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode == null ? null : shipperCode.trim();
    }

    public String getShipperC() {
        return shipperC;
    }

    public void setShipperC(String shipperC) {
        this.shipperC = shipperC == null ? null : shipperC.trim();
    }

    public String getShipperAddrC() {
        return shipperAddrC;
    }

    public void setShipperAddrC(String shipperAddrC) {
        this.shipperAddrC = shipperAddrC == null ? null : shipperAddrC.trim();
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
}