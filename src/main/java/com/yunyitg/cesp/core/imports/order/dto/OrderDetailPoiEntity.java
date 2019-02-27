package com.yunyitg.cesp.core.imports.order.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yunyitg.cesp.common.validation.constraints.BaseCurrency;
import com.yunyitg.cesp.common.validation.constraints.BaseProvince;
import com.yunyitg.cesp.common.validation.constraints.Country;
import com.yunyitg.cesp.common.validation.constraints.OrderStatus;
import com.yunyitg.cesp.common.validation.constraints.PayStatus;
import com.yunyitg.cesp.common.validation.constraints.RangeOfString;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class OrderDetailPoiEntity {

	@Excel(name = "电子订单编号")
	@NotBlank(message = "电子订单号不能为空")
	private String entOrderNo;

	@Excel(name = "电子订单状态")
	@OrderStatus(message = "电子订单状态取值不符")
	private String orderStatus;

	@Excel(name = "支付状态")
	@PayStatus(message = "支付状态取值不符")
	private String payStatus;

	@Excel(name = "订单总额")
	@NotNull(message = "订单总额不能为空")
	@DecimalMin(value = "0.00001", message = "订单总额必须大于等于0")
	private BigDecimal orderGoodTotal;

	@Excel(name = "币制")
	@Size(min = 3, max = 3)
	@BaseCurrency(message = "币制代码取值不在合理范围内")
	private String orderGoodTotalCurr;

	@Excel(name = "运费")
	@NotNull(message = "运费不能为空(无则填“0”)")
	@DecimalMin(value = "0.0", message = "运费必须大于等于0")
	private BigDecimal freight;

	@Excel(name = "税款")
	@NotNull(message = "税款不能为空(无则填“0”)")
	@DecimalMin(value = "0.0", message = "税款必须大于等于0")
	private BigDecimal tax;
	
	@Excel(name = "抵付金额")
	@NotNull(message = "抵付金额不能为空(无则填“0”)")
	@DecimalMin(value = "0.0", message = "抵付金额必须大于等于0")
	private BigDecimal otherPayment;

	@Excel(name = "抵付说明")
	private String otherPayNotes;

	@Excel(name = "其他费用")
	@NotNull(message = "其他费用不能为空(无则填“0”)")
	@DecimalMin(value = "0.0", message = "其他费用必须大于等于0")
	private BigDecimal otherCharges;

	@Excel(name = "实际支付金额")
	@NotNull(message = "实际支付金额不能为空(无则填“0”)")
	@DecimalMin(value = "0.0", message = "实际支付金额必须大于等于0")
	private BigDecimal actualAmountPaid;

	@Excel(name = "收货人名称")
	@NotBlank(message = "收货人名称不能为空")
	private String recipientName;

	@Excel(name = "收货人地址")
	@NotBlank(message = "收货人地址不能为空")
	private String recipientAddr;

	@Excel(name = "收货人电话")
	@NotBlank(message = "收货人电话不能为空")
	private String recipientTel;

	@Excel(name = "收货人所在国")
	@Country(message = "收货人所在国代码取值不在合理范围内")
	private String recipientCountry;

	@Excel(name = "收货人行政区代码")
	@BaseProvince(message = "收货人行政区域代码取值不在合理范围内")
	private String recipientProvincesCode;

	@Excel(name = "订单日期")
	private Date orderDate;

	@Excel(name = "下单人账户")
	@NotBlank(message = "下单人账户不能为空")
	private String orderDocAccount;

	@Excel(name = "下单人姓名")
	@NotBlank(message = "下单人姓名不能空")
	private String orderDocName;

	@Excel(name = "下单人证件类型")
	@RangeOfString(between = {"01","02","04"}, message = "下单人证件类型取值不符")
	private String orderDocType;

	@Excel(name = "下单人证件号")
	@NotBlank(message = "下单人证件号不能为空")
	private String orderDocId;

	@Excel(name = "下单人电话")
	@NotBlank(message = "下单人电话不能为空")
	private String orderDocTel;

	@Excel(name = "商品批次号")
	private String batchNumbers;

	@Excel(name = "发票类型")
	private String invoiceType;

	@Excel(name = "发票编号")
	private String invoiceNo;

	@Excel(name = "发票抬头")
	private String invoiceTitle;

	@Excel(name = "纳税人标识号")
	private String invoiceIdentifyId;

	@Excel(name = "发票内容")
	private String invoiceDesc;

	@Excel(name = "发票金额")
	private BigDecimal invoiceAmount;

	@Excel(name = "开票日期")
	private Date invoiceDate;

	@Excel(name = "备注")
	private String notes;
	
	private List<OrderGoodsListPoiEntity> orderGoodsListPoiEntityList;
	
	public OrderDetailPoiEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getEntOrderNo() {
		return entOrderNo;
	}

	public void setEntOrderNo(String entOrderNo) {
		this.entOrderNo = entOrderNo;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public BigDecimal getOrderGoodTotal() {
		return orderGoodTotal;
	}

	public void setOrderGoodTotal(BigDecimal orderGoodTotal) {
		this.orderGoodTotal = orderGoodTotal;
	}

	public String getOrderGoodTotalCurr() {
		return orderGoodTotalCurr;
	}

	public void setOrderGoodTotalCurr(String orderGoodTotalCurr) {
		this.orderGoodTotalCurr = orderGoodTotalCurr;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getOtherPayment() {
		return otherPayment;
	}

	public void setOtherPayment(BigDecimal otherPayment) {
		this.otherPayment = otherPayment;
	}

	public String getOtherPayNotes() {
		return otherPayNotes;
	}

	public void setOtherPayNotes(String otherPayNotes) {
		this.otherPayNotes = otherPayNotes;
	}

	public BigDecimal getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(BigDecimal otherCharges) {
		this.otherCharges = otherCharges;
	}

	public BigDecimal getActualAmountPaid() {
		return actualAmountPaid;
	}

	public void setActualAmountPaid(BigDecimal actualAmountPaid) {
		this.actualAmountPaid = actualAmountPaid;
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

	public String getRecipientCountry() {
		return recipientCountry;
	}

	public void setRecipientCountry(String recipientCountry) {
		this.recipientCountry = recipientCountry;
	}

	public String getRecipientProvincesCode() {
		return recipientProvincesCode;
	}

	public void setRecipientProvincesCode(String recipientProvincesCode) {
		this.recipientProvincesCode = recipientProvincesCode;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderDocAccount() {
		return orderDocAccount;
	}

	public void setOrderDocAccount(String orderDocAccount) {
		this.orderDocAccount = orderDocAccount;
	}

	public String getOrderDocName() {
		return orderDocName;
	}

	public void setOrderDocName(String orderDocName) {
		this.orderDocName = orderDocName;
	}

	public String getOrderDocType() {
		return orderDocType;
	}

	public void setOrderDocType(String orderDocType) {
		this.orderDocType = orderDocType;
	}

	public String getOrderDocId() {
		return orderDocId;
	}

	public void setOrderDocId(String orderDocId) {
		this.orderDocId = orderDocId;
	}

	public String getOrderDocTel() {
		return orderDocTel;
	}

	public void setOrderDocTel(String orderDocTel) {
		this.orderDocTel = orderDocTel;
	}

	public String getBatchNumbers() {
		return batchNumbers;
	}

	public void setBatchNumbers(String batchNumbers) {
		this.batchNumbers = batchNumbers;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceIdentifyId() {
		return invoiceIdentifyId;
	}

	public void setInvoiceIdentifyId(String invoiceIdentifyId) {
		this.invoiceIdentifyId = invoiceIdentifyId;
	}

	public String getInvoiceDesc() {
		return invoiceDesc;
	}

	public void setInvoiceDesc(String invoiceDesc) {
		this.invoiceDesc = invoiceDesc;
	}

	public BigDecimal getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public List<OrderGoodsListPoiEntity> getOrderGoodsListPoiEntityList() {
		return orderGoodsListPoiEntityList;
	}
	
	public void setOrderGoodsListPoiEntityList(List<OrderGoodsListPoiEntity> orderGoodsListPoiEntityList) {
		this.orderGoodsListPoiEntityList = orderGoodsListPoiEntityList;
	}

}
