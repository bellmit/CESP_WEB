package com.yunyitg.cesp.core.imports.order.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 进口订单详情信息  前端表单展示对象
 * @author yangyuantao
 *
 */
public class OrderDetailVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	/**
	 * 入库时间
	 */
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createAt;

	/**
	 * 企业电子订单编号
	 */
    private String entOrderNo;

    /**
     * 申报企业 代码
     */
    private String declEntNo;
    
    /**
     * 申报企业名称
     */
    private String declEntName;

    /**
     * 电商企业代码
     */
    private String ebEntNo;
    
    /**
     * 电商企业名称
     */
    private String ebEntName;

    /**
     * 电商平台企业代码
     */
    private String ebpEntNo;
    
    /**
     * 电商平台企业名称
     */
    private String ebpEntName;

    /**
     * 进出口标志
     */
    private String ieFlag;

    /**
     * 主管海关代码
     */
    private String customsCode;
    
    /**
     * 主管海关名称
     */
    private String customsName;

    /**
     * 检验检疫机构代码
     */
    private String ciqOrgCode;
    
    /**
     * 检验检疫机构名称
     */
    private String ciqOrgName;

    /**
     * 订单状态 
     */
    private String orderStatus;
    
    /**
     * 订单状态描述
     */
    private String orderStatusDesc;

    /**
     * 支付状态
     */
    private String payStatus;
    
    /**
     * 支付状态描述
     */
    private String payStatusDesc;

    /**
     * 订单商品总额
     */
    private BigDecimal orderGoodTotal;

    /**
     * 订单商品总额币制(代码)
     */
    private String orderGoodTotalCurr;
    
    /**
     * 订单商品总额币制名称
     */
    private String orderGoodTotalCurrName;

    /**
     * 订单运费
     */
    private BigDecimal freight;

    /**
     * 税款
     */
    private BigDecimal tax;

    /**
     * 抵付金额
     */
    private BigDecimal otherPayment;

    /**
     * 抵付说明
     */
    private String otherPayNotes;

    /**
     * 其他费用
     */
    private BigDecimal otherCharges;

    /**
     * 实际支付金额
     */
    private BigDecimal actualAmountPaid;

    /**
     * 收货人名称
     */
    private String recipientName;

    /**
     * 收货人地址
     */
    private String recipientAddr;

    /**
     * 收货人电话
     */
    private String recipientTel;

    /**
     * 收货人所在国家代码
     */
    private String recipientCountry;
    
    /**
     * 收货人所在国家名称
     */
    private String recipientCountryName;

    /**
     * 收货人行政区代码
     */
    private String recipientProvincesCode;
    
    /**
     * 收货人行政区名称
     */
    private String recipientProvincesName;

    /**
     * 下单人账户
     */
    private String orderDocAccount;

    /**
     * 下单人姓名
     */
    private String orderDocName;

    /**
     * 下单人证件类型
     */
    private String orderDocType;
    
    /**
     * 下单人证件类型描述
     */
    private String orderDocTypeDesc;

    /**
     * 下单人证件号
     */
    private String orderDocId;

    /**
     * 下单人电话
     */
    private String orderDocTel;

    /**
     * 订单日期
     */
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderDate;

    /**
     * 商品批次号
     */
    private String batchNumbers;

    /**
     * 发票类型
     */
    private String invoiceType;
    
    /**
     * 发票类型描述
     */
    private String invoiceTypeDesc;

    /**
     * 发票编号
     */
    private String invoiceNo;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 纳税人标志号
     */
    private String invoiceIdentifyId;

    /**
     * 发票内容
     */
    private String invoiceDesc;

    /**
     * 发票金额
     */
    private BigDecimal invoiceAmount;

    /**
     * 开票日期
     */
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date invoiceDate;

    /**
     * 备注
     */
    private String notes;

    /**
     * 海关电子订单状态码
     */
    private String cusMessageStatusOrder;

    /**
     * 海关电子订单状态
     */
    private String cusMessageStatusOrderDesc;
    
    /**
     * 海关订单回执内容
     */
    private String cusOrderReturnInfo;

    /**
     * 国检订单状态码
     */
    private String ciqMessageStatusOrder;

    /**
     * 国检订单状态
     */
    private String ciqMessageStatusOrderDesc;
    
    /**
     * 国检订单回执内容
     */
    private String ciqOrderReturnInfo;
    
    /**
     * 电子订单商品信息
     */
    private List<OrderGoodsListVo> goodsList;

    public OrderDetailVo() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getCreateAt() {
		return createAt;
	}
	
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getEntOrderNo() {
		return entOrderNo;
	}

	public void setEntOrderNo(String entOrderNo) {
		this.entOrderNo = entOrderNo;
	}

	public String getDeclEntNo() {
		return declEntNo;
	}

	public void setDeclEntNo(String declEntNo) {
		this.declEntNo = declEntNo;
	}

	public String getDeclEntName() {
		return declEntName;
	}

	public void setDeclEntName(String declEntName) {
		this.declEntName = declEntName;
	}

	public String getEbEntNo() {
		return ebEntNo;
	}

	public void setEbEntNo(String ebEntNo) {
		this.ebEntNo = ebEntNo;
	}

	public String getEbEntName() {
		return ebEntName;
	}

	public void setEbEntName(String ebEntName) {
		this.ebEntName = ebEntName;
	}

	public String getEbpEntNo() {
		return ebpEntNo;
	}

	public void setEbpEntNo(String ebpEntNo) {
		this.ebpEntNo = ebpEntNo;
	}

	public String getEbpEntName() {
		return ebpEntName;
	}

	public void setEbpEntName(String ebpEntName) {
		this.ebpEntName = ebpEntName;
	}

	public String getIeFlag() {
		return ieFlag;
	}

	public void setIeFlag(String ieFlag) {
		this.ieFlag = ieFlag;
	}

	public String getCustomsCode() {
		return customsCode;
	}

	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}

	public String getCustomsName() {
		return customsName;
	}

	public void setCustomsName(String customsName) {
		this.customsName = customsName;
	}

	public String getCiqOrgCode() {
		return ciqOrgCode;
	}

	public void setCiqOrgCode(String ciqOrgCode) {
		this.ciqOrgCode = ciqOrgCode;
	}

	public String getCiqOrgName() {
		return ciqOrgName;
	}

	public void setCiqOrgName(String ciqOrgName) {
		this.ciqOrgName = ciqOrgName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusDesc() {
		return orderStatusDesc;
	}

	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayStatusDesc() {
		return payStatusDesc;
	}

	public void setPayStatusDesc(String payStatusDesc) {
		this.payStatusDesc = payStatusDesc;
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

	public String getOrderGoodTotalCurrName() {
		return orderGoodTotalCurrName;
	}

	public void setOrderGoodTotalCurrName(String orderGoodTotalCurrName) {
		this.orderGoodTotalCurrName = orderGoodTotalCurrName;
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

	public String getRecipientCountryName() {
		return recipientCountryName;
	}

	public void setRecipientCountryName(String recipientCountryName) {
		this.recipientCountryName = recipientCountryName;
	}

	public String getRecipientProvincesCode() {
		return recipientProvincesCode;
	}

	public void setRecipientProvincesCode(String recipientProvincesCode) {
		this.recipientProvincesCode = recipientProvincesCode;
	}

	public String getRecipientProvincesName() {
		return recipientProvincesName;
	}

	public void setRecipientProvincesName(String recipientProvincesName) {
		this.recipientProvincesName = recipientProvincesName;
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

	public String getOrderDocTypeDesc() {
		return orderDocTypeDesc;
	}

	public void setOrderDocTypeDesc(String orderDocTypeDesc) {
		this.orderDocTypeDesc = orderDocTypeDesc;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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

	public String getInvoiceTypeDesc() {
		return invoiceTypeDesc;
	}

	public void setInvoiceTypeDesc(String invoiceTypeDesc) {
		this.invoiceTypeDesc = invoiceTypeDesc;
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

	public String getCusMessageStatusOrder() {
		return cusMessageStatusOrder;
	}

	public void setCusMessageStatusOrder(String cusMessageStatusOrder) {
		this.cusMessageStatusOrder = cusMessageStatusOrder;
	}

	public String getCusMessageStatusOrderDesc() {
		return cusMessageStatusOrderDesc;
	}

	public void setCusMessageStatusOrderDesc(String cusMessageStatusOrderDesc) {
		this.cusMessageStatusOrderDesc = cusMessageStatusOrderDesc;
	}

	public String getCusOrderReturnInfo() {
		return cusOrderReturnInfo;
	}

	public void setCusOrderReturnInfo(String cusOrderReturnInfo) {
		this.cusOrderReturnInfo = cusOrderReturnInfo;
	}

	public String getCiqMessageStatusOrder() {
		return ciqMessageStatusOrder;
	}

	public void setCiqMessageStatusOrder(String ciqMessageStatusOrder) {
		this.ciqMessageStatusOrder = ciqMessageStatusOrder;
	}

	public String getCiqMessageStatusOrderDesc() {
		return ciqMessageStatusOrderDesc;
	}
	
	public void setCiqMessageStatusOrderDesc(String ciqMessageStatusOrderDesc) {
		this.ciqMessageStatusOrderDesc = ciqMessageStatusOrderDesc;
	}
	
	public String getCiqOrderReturnInfo() {
		return ciqOrderReturnInfo;
	}

	public void setCiqOrderReturnInfo(String ciqOrderReturnInfo) {
		this.ciqOrderReturnInfo = ciqOrderReturnInfo;
	}
	
	public List<OrderGoodsListVo> getGoodsList() {
		return goodsList;
	}
	
	public void setGoodsList(List<OrderGoodsListVo> goodsList) {
		this.goodsList = goodsList;
	}
	
}
