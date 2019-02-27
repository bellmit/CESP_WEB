package com.yunyitg.cesp.core.exports.list.entity;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_goods_detail_info")
public class ExGoodsDetailInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer eListOrderId;

    private Short seq;

    private String ciqGoodsNo;

    private String cusGoodsNo;

    private String entGoodsNo;

    private String goodsName;

    private String gName;

    private String goodsStyle;

    private String hSCode;

    private String brand;

    private String barCode;

    private String originCountry;

    private String originPlace;

    private String manufacturer;

    private String manufacturerId;

    private String batchNumbers;

    private String productionDate;

    private String ipCode;

    private String dischargePlace;

    private String goodsBatchNo;

    private String licenseNo;

    private String apprNo;

    private String orgCusDeclNo;

    private String orgCusDeclShipper;

    private String orgBillNo;

    private String packageType;

    private Integer packNum;

    private BigDecimal qty;

    private String gUnit;

    private String stdUnit;

    private BigDecimal stdQty;

    private String secUnit;

    private BigDecimal secQty;

    private BigDecimal grossWeight;

    private BigDecimal unitPrice;

    private BigDecimal totalPrice;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer geteListOrderId() {
        return eListOrderId;
    }

    public void seteListOrderId(Integer eListOrderId) {
        this.eListOrderId = eListOrderId;
    }

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
    }

    public String getCiqGoodsNo() {
        return ciqGoodsNo;
    }

    public void setCiqGoodsNo(String ciqGoodsNo) {
        this.ciqGoodsNo = ciqGoodsNo == null ? null : ciqGoodsNo.trim();
    }

    public String getCusGoodsNo() {
        return cusGoodsNo;
    }

    public void setCusGoodsNo(String cusGoodsNo) {
        this.cusGoodsNo = cusGoodsNo == null ? null : cusGoodsNo.trim();
    }

    public String getEntGoodsNo() {
        return entGoodsNo;
    }

    public void setEntGoodsNo(String entGoodsNo) {
        this.entGoodsNo = entGoodsNo == null ? null : entGoodsNo.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getGoodsStyle() {
        return goodsStyle;
    }

    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle == null ? null : goodsStyle.trim();
    }

    public String gethSCode() {
        return hSCode;
    }

    public void sethSCode(String hSCode) {
        this.hSCode = hSCode == null ? null : hSCode.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry == null ? null : originCountry.trim();
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace == null ? null : originPlace.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId == null ? null : manufacturerId.trim();
    }

    public String getBatchNumbers() {
        return batchNumbers;
    }

    public void setBatchNumbers(String batchNumbers) {
        this.batchNumbers = batchNumbers == null ? null : batchNumbers.trim();
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate == null ? null : productionDate.trim();
    }

    public String getIpCode() {
        return ipCode;
    }

    public void setIpCode(String ipCode) {
        this.ipCode = ipCode == null ? null : ipCode.trim();
    }

    public String getDischargePlace() {
        return dischargePlace;
    }

    public void setDischargePlace(String dischargePlace) {
        this.dischargePlace = dischargePlace == null ? null : dischargePlace.trim();
    }

    public String getGoodsBatchNo() {
        return goodsBatchNo;
    }

    public void setGoodsBatchNo(String goodsBatchNo) {
        this.goodsBatchNo = goodsBatchNo == null ? null : goodsBatchNo.trim();
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    public String getApprNo() {
        return apprNo;
    }

    public void setApprNo(String apprNo) {
        this.apprNo = apprNo == null ? null : apprNo.trim();
    }

    public String getOrgCusDeclNo() {
        return orgCusDeclNo;
    }

    public void setOrgCusDeclNo(String orgCusDeclNo) {
        this.orgCusDeclNo = orgCusDeclNo == null ? null : orgCusDeclNo.trim();
    }

    public String getOrgCusDeclShipper() {
        return orgCusDeclShipper;
    }

    public void setOrgCusDeclShipper(String orgCusDeclShipper) {
        this.orgCusDeclShipper = orgCusDeclShipper == null ? null : orgCusDeclShipper.trim();
    }

    public String getOrgBillNo() {
        return orgBillNo;
    }

    public void setOrgBillNo(String orgBillNo) {
        this.orgBillNo = orgBillNo == null ? null : orgBillNo.trim();
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType == null ? null : packageType.trim();
    }

    public Integer getPackNum() {
        return packNum;
    }

    public void setPackNum(Integer packNum) {
        this.packNum = packNum;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getgUnit() {
        return gUnit;
    }

    public void setgUnit(String gUnit) {
        this.gUnit = gUnit == null ? null : gUnit.trim();
    }

    public String getStdUnit() {
        return stdUnit;
    }

    public void setStdUnit(String stdUnit) {
        this.stdUnit = stdUnit == null ? null : stdUnit.trim();
    }

    public BigDecimal getStdQty() {
        return stdQty;
    }

    public void setStdQty(BigDecimal stdQty) {
        this.stdQty = stdQty;
    }

    public String getSecUnit() {
        return secUnit;
    }

    public void setSecUnit(String secUnit) {
        this.secUnit = secUnit == null ? null : secUnit.trim();
    }

    public BigDecimal getSecQty() {
        return secQty;
    }

    public void setSecQty(BigDecimal secQty) {
        this.secQty = secQty;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}