package com.yunyitg.cesp.core.imports.waybill.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yunyitg.cesp.common.validation.constraints.BaseCurrency;
import com.yunyitg.cesp.common.validation.constraints.BaseProvince;
import com.yunyitg.cesp.common.validation.constraints.Country;
import com.yunyitg.cesp.common.validation.constraints.FeeMark;
import com.yunyitg.cesp.common.validation.constraints.WaybillStatus;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class WaybillDetailPoiEntity {

	
	@Excel(name = "企业电子运单编号")
	@NotBlank(message = "企业电子运单编号不能为空")
	private String entWaybillNo;
	
	@Excel(name = "企业电子订单编号")
	@NotBlank(message = "企业电子订单编号不能为空")
	private String entOrderNo;
	
	@Excel(name = "提运单号")
	private String billNo;
	
	@Excel(name = "物流批次号")
	private String ehsBatchNo;
	
	@Excel(name = "运单创建日期")
	@NotNull(message = "运单创建日期不能为空")
	private Date createDate;
	
	@Excel(name = "电子运单状态")
	@WaybillStatus(message = "电子运单状态取值不符")
	private String waybillStatus;
	
	@Excel(name = "路由状态")
	private String routeStatus;
	
	@Excel(name = "出仓进境日期")
	@NotNull(message = "出仓进境日期不能为空")
	private Date outDate;
	
	@Excel(name = "货物存放地")
	@NotBlank(message = "货物存放地不能为空")
	private String dischargePlace;
	
	@Excel(name = "件数")
	@NotNull(message = "件数不能为空")
	private BigDecimal packNo;
	
	@Excel(name = "毛重")
	@NotNull(message = "毛重不能为空")
	private BigDecimal grossWt;
	
	@Excel(name = "运费/率")
	@NotNull(message = "运费/率不能为空")
	private BigDecimal feeRate;
	
	@Excel(name = "运费币制")
	@BaseCurrency(message = "运费币制代码不在合理取值范围内")
	private String feeCurrCode;
	
	@Excel(name = "运费标志")
	@FeeMark(message = "运费标志不在合理取值范围内")
	private String feeMark;
	
	@Excel(name = "保费/率")
	@NotNull(message = "保费/率不能为空")
	private BigDecimal insurRate;
	
	@Excel(name = "杂费/率")
	@NotNull(message = "杂费/率不能为空")
	private BigDecimal otherRate;
	
	@Excel(name = "运送货物总价")
	@NotNull(message = "运送货物总价不能为空")
	private BigDecimal totalAmount;
	
	@Excel(name = "收货人名称")
	@NotBlank(message = "收货人名称")
	private String recipientName;
	
	@Excel(name = "收货人地址")
	@NotBlank(message = "收货人地址不能为空")
	private String recipientAddr;
	
	@Excel(name = "收货人电话")
	@NotBlank(message = "收货人电话不能为空")
	private String recipientTel;
	
	@Excel(name = "收件人省市区代码")
	@BaseProvince(message = "收件人省市区代码不在合理取值范围内")
	private String recipientProvincesCode;
	
	@Excel(name = "收货人所在国")
	@Country(message = "收货人所在国 不在合理取值范围内")
	private String recipientCountry;
	
	@Excel(name = "发货人名称")
	@NotBlank(message = "发货人名称不能为空")
	private String shipperName;
	
	@Excel(name = "发货人地址")
	@NotBlank(message = "发货人地址不能为空")
	private String shipperDatailedAddress;
	
	@Excel(name = "发货人电话")
	@NotBlank(message = "发货人电话不能为空")
	private String shipperPhone;
	
	@Excel(name = "发货人所在国")
	@Country(message = "发货人所在国不在合理取值范围内")
	private String shipperCountryCode;
	
	@Excel(name = "发货人省市区代码")
	@BaseProvince(message = "发货人省市区代码不在合理取值范围内")
	private String shipperProvincesCode;
	
	@Excel(name = "商品信息")
	private String goodsDetail;
	
	@Excel(name = "净重")
	private BigDecimal netWt;
	
	@Excel(name = "备注")
	private String notes;
	
	public WaybillDetailPoiEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getEntWaybillNo() {
		return entWaybillNo;
	}

	public void setEntWaybillNo(String entWaybillNo) {
		this.entWaybillNo = entWaybillNo;
	}

	public String getEntOrderNo() {
		return entOrderNo;
	}

	public void setEntOrderNo(String entOrderNo) {
		this.entOrderNo = entOrderNo;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getEhsBatchNo() {
		return ehsBatchNo;
	}

	public void setEhsBatchNo(String ehsBatchNo) {
		this.ehsBatchNo = ehsBatchNo;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getWaybillStatus() {
		return waybillStatus;
	}

	public void setWaybillStatus(String waybillStatus) {
		this.waybillStatus = waybillStatus;
	}

	public String getRouteStatus() {
		return routeStatus;
	}

	public void setRouteStatus(String routeStatus) {
		this.routeStatus = routeStatus;
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
		this.dischargePlace = dischargePlace;
	}

	public BigDecimal getPackNo() {
		return packNo;
	}

	public void setPackNo(BigDecimal packNo) {
		this.packNo = packNo;
	}

	public BigDecimal getGrossWt() {
		return grossWt;
	}

	public void setGrossWt(BigDecimal grossWt) {
		this.grossWt = grossWt;
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
		this.feeCurrCode = feeCurrCode;
	}

	public String getFeeMark() {
		return feeMark;
	}

	public void setFeeMark(String feeMark) {
		this.feeMark = feeMark;
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

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientAddr() {
		return recipientAddr;
	}

	public void setRecipientAddr(String recipientAddr) {
		this.recipientAddr = recipientAddr;
	}

	public String getRecipientTel() {
		return recipientTel;
	}

	public void setRecipientTel(String recipientTel) {
		this.recipientTel = recipientTel;
	}

	public String getRecipientProvincesCode() {
		return recipientProvincesCode;
	}

	public void setRecipientProvincesCode(String recipientProvincesCode) {
		this.recipientProvincesCode = recipientProvincesCode;
	}

	public String getRecipientCountry() {
		return recipientCountry;
	}

	public void setRecipientCountry(String recipientCountry) {
		this.recipientCountry = recipientCountry;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getShipperDatailedAddress() {
		return shipperDatailedAddress;
	}

	public void setShipperDatailedAddress(String shipperDatailedAddress) {
		this.shipperDatailedAddress = shipperDatailedAddress;
	}

	public String getShipperPhone() {
		return shipperPhone;
	}

	public void setShipperPhone(String shipperPhone) {
		this.shipperPhone = shipperPhone;
	}

	public String getShipperCountryCode() {
		return shipperCountryCode;
	}

	public void setShipperCountryCode(String shipperCountryCode) {
		this.shipperCountryCode = shipperCountryCode;
	}

	public String getShipperProvincesCode() {
		return shipperProvincesCode;
	}

	public void setShipperProvincesCode(String shipperProvincesCode) {
		this.shipperProvincesCode = shipperProvincesCode;
	}

	public String getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public BigDecimal getNetWt() {
		return netWt;
	}

	public void setNetWt(BigDecimal netWt) {
		this.netWt = netWt;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
