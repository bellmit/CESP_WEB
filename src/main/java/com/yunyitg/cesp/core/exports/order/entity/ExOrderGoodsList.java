package com.yunyitg.cesp.core.exports.order.entity;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_order_goods_list")
public class ExOrderGoodsList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer orderDetailId;

    private Short seq;

    private String entGoodsNo;

    private String goodsName;

    private String goodsStyle;

    private String goodsDescribe;

    private String originCountry;

    private String originPlace;

    private String manufacturer;

    private String manufacturerId;

    private String batchNumbers;

    private String productionDate;

    private String barCode;

    private String brand;

    private String ipCode;

    private BigDecimal qty;

    private String unit;

    private BigDecimal price;

    private BigDecimal total;

    private String currCode;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
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

    public String getGoodsStyle() {
        return goodsStyle;
    }

    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle == null ? null : goodsStyle.trim();
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe == null ? null : goodsDescribe.trim();
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

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getIpCode() {
        return ipCode;
    }

    public void setIpCode(String ipCode) {
        this.ipCode = ipCode == null ? null : ipCode.trim();
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode == null ? null : currCode.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}