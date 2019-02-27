package com.yunyitg.cesp.core.imports.order.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Table(name = "order_detail")
public class OrderDetail {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联电子订单表头ID
     */
    @Column(name = "order_head_id")
    private Integer orderHeadId;

    /**
     * 企业电子订单编号
     */
    @Column(name = "ent_order_no")
    private String entOrderNo;

    /**
     * 申报企业ID
     */
    @Column(name = "decl_ent_id")
    private Integer declEntId;

    /**
     * 所属电商企业ID
     */
    @Column(name = "eb_ent_id")
    private Integer ebEntId;

    /**
     * 所属电商平台ID
     */
    @Column(name = "ebp_ent_id")
    private Integer ebpEntId;

    /**
     * 进出口标示(I-进口;E-出口)
     */
    @Column(name = "ie_flag")
    private String ieFlag;

    /**
     * 主管海关代码
     */
    @Column(name = "customs_code")
    private String customsCode;

    /**
     * 检验检疫机构代码
     */
    @Column(name = "ciq_org_code")
    private String ciqOrgCode;

    /**
     * 电子订单状态（0-订单确认；1-订单完成；2-订单取消）
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 支付状态（0-已付款；1-未付款）
     */
    @Column(name = "pay_status")
    private String payStatus;

    /**
     * 订单商品总额
     */
    @Column(name = "order_good_total")
    private BigDecimal orderGoodTotal;

    /**
     * 订单商品总额币制
     */
    @Column(name = "order_good_total_curr")
    private String orderGoodTotalCurr;

    /**
     * 订单运费(无则填“0”)
     */
    @Column(name = "freight")
    private BigDecimal freight;

    /**
     * 税款(无则填“0”)
     */
    @Column(name = "tax")
    private BigDecimal tax;

    /**
     * 抵付金额(优惠减免金额，无则填“0”)
     */
    @Column(name = "other_payment")
    private BigDecimal otherPayment;

    /**
     * 抵付说明
     */
    @Column(name = "other_pay_notes")
    private String otherPayNotes;

    /**
     * 其他费用(无则填“0”)
     */
    @Column(name = "other_charges")
    private BigDecimal otherCharges;

    /**
     * 实际支付金额（货款+运费+税款-优惠金额，与支付保持一致（精确到元））
     */
    @Column(name = "actual_amount_paid")
    private BigDecimal actualAmountPaid;

    /**
     * 收货人名称，同运单
     */
    @Column(name = "recipient_name")
    private String recipientName;

    /**
     * 收货人地址，同运单
     */
    @Column(name = "recipient_addr")
    private String recipientAddr;

    /**
     * 收货人电话，同运单
     */
    @Column(name = "recipient_tel")
    private String recipientTel;

    /**
     * 收货人所在国家代码
     */
    @Column(name = "recipient_country")
    private String recipientCountry;

    /**
     * 收货人行政区代码
     */
    @Column(name = "recipient_provinces_code")
    private String recipientProvincesCode;

    /**
     * 下单人账户
     */
    @Column(name = "order_doc_account")
    private String orderDocAccount;

    /**
     * 下单人姓名
     */
    @Column(name = "order_doc_name")
    private String orderDocName;

    /**
     * 下单人证件类型（01:身份证、02:护照、04:其他）
     */
    @Column(name = "order_doc_type")
    private String orderDocType;

    /**
     * 下单人证件号(默认为身份证号)
     */
    @Column(name = "order_doc_id")
    private String orderDocId;

    /**
     * 下单人电话
     */
    @Column(name = "order_doc_tel")
    private String orderDocTel;

    /**
     * 订单日期
     */
    @Column(name = "order_date")
    private Date orderDate;

    /**
     * 商品批次号
     */
    @Column(name = "batch_numbers")
    private String batchNumbers;

    /**
     * 发票类型（1- 电子发票；2- 普通发票（纸质）；3- 专用发票（纸质）；0- 其它；）
     */
    @Column(name = "invoice_type")
    private String invoiceType;

    /**
     * 发票编号
     */
    @Column(name = "invoice_no")
    private String invoiceNo;

    /**
     * 发票抬头
     */
    @Column(name = "invoice_title")
    private String invoiceTitle;

    /**
     * 纳税人标志号
     */
    @Column(name = "invoice_identify_id")
    private String invoiceIdentifyId;

    /**
     * 发票内容
     */
    @Column(name = "invoice_desc")
    private String invoiceDesc;

    /**
     * 发票金额
     */
    @Column(name = "invoice_amount")
    private BigDecimal invoiceAmount;

    /**
     * 开票日期
     */
    @Column(name = "invoice_date")
    private Date invoiceDate;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 海关电子订单状态
     */
    @Column(name = "cus_message_status_order")
    private String cusMessageStatusOrder;

    /**
     * 海关订单回执内容
     */
    @Column(name = "cus_order_return_info")
    private String cusOrderReturnInfo;

    /**
     * 国检电子订单状态
     */
    @Column(name = "ciq_message_status_order")
    private String ciqMessageStatusOrder;

    /**
     * 国检订单回执内容
     */
    @Column(name = "ciq_order_return_info")
    private String ciqOrderReturnInfo;

    /**
     * 数据入库时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 数据录入用户ID
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 最近操作时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 操作用户ID
     */
    @Column(name = "update_user_id")
    private Integer updateUserId;
	
	@Transient
    private List<OrderGoodsList> goodsList;

    /**
     * 获取pk
     *
     * @return id - pk
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置pk
     *
     * @param id pk
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取关联电子订单表头ID
     *
     * @return order_head_id - 关联电子订单表头ID
     */
    public Integer getOrderHeadId() {
        return orderHeadId;
    }

    /**
     * 设置关联电子订单表头ID
     *
     * @param orderHeadId 关联电子订单表头ID
     */
    public void setOrderHeadId(Integer orderHeadId) {
        this.orderHeadId = orderHeadId;
    }

    /**
     * 获取企业电子订单编号
     *
     * @return ent_order_no - 企业电子订单编号
     */
    public String getEntOrderNo() {
        return entOrderNo;
    }

    /**
     * 设置企业电子订单编号
     *
     * @param entOrderNo 企业电子订单编号
     */
    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo;
    }

    /**
     * 获取申报企业ID
     *
     * @return decl_ent_id - 申报企业ID
     */
    public Integer getDeclEntId() {
        return declEntId;
    }

    /**
     * 设置申报企业ID
     *
     * @param declEntId 申报企业ID
     */
    public void setDeclEntId(Integer declEntId) {
        this.declEntId = declEntId;
    }

    /**
     * 获取所属电商企业ID
     *
     * @return eb_ent_id - 所属电商企业ID
     */
    public Integer getEbEntId() {
        return ebEntId;
    }

    /**
     * 设置所属电商企业ID
     *
     * @param ebEntId 所属电商企业ID
     */
    public void setEbEntId(Integer ebEntId) {
        this.ebEntId = ebEntId;
    }

    /**
     * 获取所属电商平台ID
     *
     * @return ebp_ent_id - 所属电商平台ID
     */
    public Integer getEbpEntId() {
        return ebpEntId;
    }

    /**
     * 设置所属电商平台ID
     *
     * @param ebpEntId 所属电商平台ID
     */
    public void setEbpEntId(Integer ebpEntId) {
        this.ebpEntId = ebpEntId;
    }

    /**
     * 获取进出口标示(I-进口;E-出口)
     *
     * @return ie_flag - 进出口标示(I-进口;E-出口)
     */
    public String getIeFlag() {
        return ieFlag;
    }

    /**
     * 设置进出口标示(I-进口;E-出口)
     *
     * @param ieFlag 进出口标示(I-进口;E-出口)
     */
    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag;
    }

    /**
     * 获取主管海关代码
     *
     * @return customs_code - 主管海关代码
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /**
     * 设置主管海关代码
     *
     * @param customsCode 主管海关代码
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /**
     * 获取检验检疫机构代码
     *
     * @return ciq_org_code - 检验检疫机构代码
     */
    public String getCiqOrgCode() {
        return ciqOrgCode;
    }

    /**
     * 设置检验检疫机构代码
     *
     * @param ciqOrgCode 检验检疫机构代码
     */
    public void setCiqOrgCode(String ciqOrgCode) {
        this.ciqOrgCode = ciqOrgCode;
    }

    /**
     * 获取电子订单状态（0-订单确认；1-订单完成；2-订单取消）
     *
     * @return order_status - 电子订单状态（0-订单确认；1-订单完成；2-订单取消）
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置电子订单状态（0-订单确认；1-订单完成；2-订单取消）
     *
     * @param orderStatus 电子订单状态（0-订单确认；1-订单完成；2-订单取消）
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取支付状态（0-已付款；1-未付款）
     *
     * @return pay_status - 支付状态（0-已付款；1-未付款）
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付状态（0-已付款；1-未付款）
     *
     * @param payStatus 支付状态（0-已付款；1-未付款）
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取订单商品总额
     *
     * @return order_good_total - 订单商品总额
     */
    public BigDecimal getOrderGoodTotal() {
        return orderGoodTotal;
    }

    /**
     * 设置订单商品总额
     *
     * @param orderGoodTotal 订单商品总额
     */
    public void setOrderGoodTotal(BigDecimal orderGoodTotal) {
        this.orderGoodTotal = orderGoodTotal;
    }

    /**
     * 获取订单商品总额币制
     *
     * @return order_good_total_curr - 订单商品总额币制
     */
    public String getOrderGoodTotalCurr() {
        return orderGoodTotalCurr;
    }

    /**
     * 设置订单商品总额币制
     *
     * @param orderGoodTotalCurr 订单商品总额币制
     */
    public void setOrderGoodTotalCurr(String orderGoodTotalCurr) {
        this.orderGoodTotalCurr = orderGoodTotalCurr;
    }

    /**
     * 获取订单运费(无则填“0”)
     *
     * @return freight - 订单运费(无则填“0”)
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * 设置订单运费(无则填“0”)
     *
     * @param freight 订单运费(无则填“0”)
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * 获取税款(无则填“0”)
     *
     * @return tax - 税款(无则填“0”)
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * 设置税款(无则填“0”)
     *
     * @param tax 税款(无则填“0”)
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * 获取抵付金额(优惠减免金额，无则填“0”)
     *
     * @return other_payment - 抵付金额(优惠减免金额，无则填“0”)
     */
    public BigDecimal getOtherPayment() {
        return otherPayment;
    }

    /**
     * 设置抵付金额(优惠减免金额，无则填“0”)
     *
     * @param otherPayment 抵付金额(优惠减免金额，无则填“0”)
     */
    public void setOtherPayment(BigDecimal otherPayment) {
        this.otherPayment = otherPayment;
    }

    /**
     * 获取抵付说明
     *
     * @return other_pay_notes - 抵付说明
     */
    public String getOtherPayNotes() {
        return otherPayNotes;
    }

    /**
     * 设置抵付说明
     *
     * @param otherPayNotes 抵付说明
     */
    public void setOtherPayNotes(String otherPayNotes) {
        this.otherPayNotes = otherPayNotes;
    }

    /**
     * 获取其他费用(无则填“0”)
     *
     * @return other_charges - 其他费用(无则填“0”)
     */
    public BigDecimal getOtherCharges() {
        return otherCharges;
    }

    /**
     * 设置其他费用(无则填“0”)
     *
     * @param otherCharges 其他费用(无则填“0”)
     */
    public void setOtherCharges(BigDecimal otherCharges) {
        this.otherCharges = otherCharges;
    }

    /**
     * 获取实际支付金额（货款+运费+税款-优惠金额，与支付保持一致（精确到元））
     *
     * @return actual_amount_paid - 实际支付金额（货款+运费+税款-优惠金额，与支付保持一致（精确到元））
     */
    public BigDecimal getActualAmountPaid() {
        return actualAmountPaid;
    }

    /**
     * 设置实际支付金额（货款+运费+税款-优惠金额，与支付保持一致（精确到元））
     *
     * @param actualAmountPaid 实际支付金额（货款+运费+税款-优惠金额，与支付保持一致（精确到元））
     */
    public void setActualAmountPaid(BigDecimal actualAmountPaid) {
        this.actualAmountPaid = actualAmountPaid;
    }

    /**
     * 获取收货人名称，同运单
     *
     * @return recipient_name - 收货人名称，同运单
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * 设置收货人名称，同运单
     *
     * @param recipientName 收货人名称，同运单
     */
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * 获取收货人地址，同运单
     *
     * @return recipient_addr - 收货人地址，同运单
     */
    public String getRecipientAddr() {
        return recipientAddr;
    }

    /**
     * 设置收货人地址，同运单
     *
     * @param recipientAddr 收货人地址，同运单
     */
    public void setRecipientAddr(String recipientAddr) {
        this.recipientAddr = recipientAddr;
    }

    /**
     * 获取收货人电话，同运单
     *
     * @return recipient_tel - 收货人电话，同运单
     */
    public String getRecipientTel() {
        return recipientTel;
    }

    /**
     * 设置收货人电话，同运单
     *
     * @param recipientTel 收货人电话，同运单
     */
    public void setRecipientTel(String recipientTel) {
        this.recipientTel = recipientTel;
    }

    /**
     * 获取收货人所在国家代码
     *
     * @return recipient_country - 收货人所在国家代码
     */
    public String getRecipientCountry() {
        return recipientCountry;
    }

    /**
     * 设置收货人所在国家代码
     *
     * @param recipientCountry 收货人所在国家代码
     */
    public void setRecipientCountry(String recipientCountry) {
        this.recipientCountry = recipientCountry;
    }

    /**
     * 获取收货人行政区代码
     *
     * @return recipient_provinces_code - 收货人行政区代码
     */
    public String getRecipientProvincesCode() {
        return recipientProvincesCode;
    }

    /**
     * 设置收货人行政区代码
     *
     * @param recipientProvincesCode 收货人行政区代码
     */
    public void setRecipientProvincesCode(String recipientProvincesCode) {
        this.recipientProvincesCode = recipientProvincesCode;
    }

    /**
     * 获取下单人账户
     *
     * @return order_doc_account - 下单人账户
     */
    public String getOrderDocAccount() {
        return orderDocAccount;
    }

    /**
     * 设置下单人账户
     *
     * @param orderDocAccount 下单人账户
     */
    public void setOrderDocAccount(String orderDocAccount) {
        this.orderDocAccount = orderDocAccount;
    }

    /**
     * 获取下单人姓名
     *
     * @return order_doc_name - 下单人姓名
     */
    public String getOrderDocName() {
        return orderDocName;
    }

    /**
     * 设置下单人姓名
     *
     * @param orderDocName 下单人姓名
     */
    public void setOrderDocName(String orderDocName) {
        this.orderDocName = orderDocName;
    }

    /**
     * 获取下单人证件类型（01:身份证、02:护照、04:其他）
     *
     * @return order_doc_type - 下单人证件类型（01:身份证、02:护照、04:其他）
     */
    public String getOrderDocType() {
        return orderDocType;
    }

    /**
     * 设置下单人证件类型（01:身份证、02:护照、04:其他）
     *
     * @param orderDocType 下单人证件类型（01:身份证、02:护照、04:其他）
     */
    public void setOrderDocType(String orderDocType) {
        this.orderDocType = orderDocType;
    }

    /**
     * 获取下单人证件号(默认为身份证号)
     *
     * @return order_doc_id - 下单人证件号(默认为身份证号)
     */
    public String getOrderDocId() {
        return orderDocId;
    }

    /**
     * 设置下单人证件号(默认为身份证号)
     *
     * @param orderDocId 下单人证件号(默认为身份证号)
     */
    public void setOrderDocId(String orderDocId) {
        this.orderDocId = orderDocId;
    }

    /**
     * 获取下单人电话
     *
     * @return order_doc_tel - 下单人电话
     */
    public String getOrderDocTel() {
        return orderDocTel;
    }

    /**
     * 设置下单人电话
     *
     * @param orderDocTel 下单人电话
     */
    public void setOrderDocTel(String orderDocTel) {
        this.orderDocTel = orderDocTel;
    }

    /**
     * 获取订单日期
     *
     * @return order_date - 订单日期
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * 设置订单日期
     *
     * @param orderDate 订单日期
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取商品批次号
     *
     * @return batch_numbers - 商品批次号
     */
    public String getBatchNumbers() {
        return batchNumbers;
    }

    /**
     * 设置商品批次号
     *
     * @param batchNumbers 商品批次号
     */
    public void setBatchNumbers(String batchNumbers) {
        this.batchNumbers = batchNumbers;
    }

    /**
     * 获取发票类型（1- 电子发票；2- 普通发票（纸质）；3- 专用发票（纸质）；0- 其它；）
     *
     * @return invoice_type - 发票类型（1- 电子发票；2- 普通发票（纸质）；3- 专用发票（纸质）；0- 其它；）
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型（1- 电子发票；2- 普通发票（纸质）；3- 专用发票（纸质）；0- 其它；）
     *
     * @param invoiceType 发票类型（1- 电子发票；2- 普通发票（纸质）；3- 专用发票（纸质）；0- 其它；）
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 获取发票编号
     *
     * @return invoice_no - 发票编号
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 设置发票编号
     *
     * @param invoiceNo 发票编号
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * 获取发票抬头
     *
     * @return invoice_title - 发票抬头
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 设置发票抬头
     *
     * @param invoiceTitle 发票抬头
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * 获取纳税人标志号
     *
     * @return invoice_identify_id - 纳税人标志号
     */
    public String getInvoiceIdentifyId() {
        return invoiceIdentifyId;
    }

    /**
     * 设置纳税人标志号
     *
     * @param invoiceIdentifyId 纳税人标志号
     */
    public void setInvoiceIdentifyId(String invoiceIdentifyId) {
        this.invoiceIdentifyId = invoiceIdentifyId;
    }

    /**
     * 获取发票内容
     *
     * @return invoice_desc - 发票内容
     */
    public String getInvoiceDesc() {
        return invoiceDesc;
    }

    /**
     * 设置发票内容
     *
     * @param invoiceDesc 发票内容
     */
    public void setInvoiceDesc(String invoiceDesc) {
        this.invoiceDesc = invoiceDesc;
    }

    /**
     * 获取发票金额
     *
     * @return invoice_amount - 发票金额
     */
    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * 设置发票金额
     *
     * @param invoiceAmount 发票金额
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * 获取开票日期
     *
     * @return invoice_date - 开票日期
     */
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * 设置开票日期
     *
     * @param invoiceDate 开票日期
     */
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * 获取备注
     *
     * @return notes - 备注
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注
     *
     * @param notes 备注
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * 获取海关电子订单状态
     *
     * @return cus_message_status_order - 海关电子订单状态
     */
    public String getCusMessageStatusOrder() {
        return cusMessageStatusOrder;
    }

    /**
     * 设置海关电子订单状态
     *
     * @param cusMessageStatusOrder 海关电子订单状态
     */
    public void setCusMessageStatusOrder(String cusMessageStatusOrder) {
        this.cusMessageStatusOrder = cusMessageStatusOrder;
    }

    /**
     * 获取海关订单回执内容
     *
     * @return cus_order_return_info - 海关订单回执内容
     */
    public String getCusOrderReturnInfo() {
        return cusOrderReturnInfo;
    }

    /**
     * 设置海关订单回执内容
     *
     * @param cusOrderReturnInfo 海关订单回执内容
     */
    public void setCusOrderReturnInfo(String cusOrderReturnInfo) {
        this.cusOrderReturnInfo = cusOrderReturnInfo;
    }

    /**
     * 获取国检电子订单状态
     *
     * @return ciq_message_status_order - 国检电子订单状态
     */
    public String getCiqMessageStatusOrder() {
        return ciqMessageStatusOrder;
    }

    /**
     * 设置国检电子订单状态
     *
     * @param ciqMessageStatusOrder 国检电子订单状态
     */
    public void setCiqMessageStatusOrder(String ciqMessageStatusOrder) {
        this.ciqMessageStatusOrder = ciqMessageStatusOrder;
    }

    /**
     * 获取国检订单回执内容
     *
     * @return ciq_order_return_info - 国检订单回执内容
     */
    public String getCiqOrderReturnInfo() {
        return ciqOrderReturnInfo;
    }

    /**
     * 设置国检订单回执内容
     *
     * @param ciqOrderReturnInfo 国检订单回执内容
     */
    public void setCiqOrderReturnInfo(String ciqOrderReturnInfo) {
        this.ciqOrderReturnInfo = ciqOrderReturnInfo;
    }

    /**
     * 获取数据入库时间
     *
     * @return create_at - 数据入库时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置数据入库时间
     *
     * @param createAt 数据入库时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取数据录入用户ID
     *
     * @return create_user_id - 数据录入用户ID
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置数据录入用户ID
     *
     * @param createUserId 数据录入用户ID
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取最近操作时间
     *
     * @return update_at - 最近操作时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置最近操作时间
     *
     * @param updateAt 最近操作时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 获取操作用户ID
     *
     * @return update_user_id - 操作用户ID
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置操作用户ID
     *
     * @param updateUserId 操作用户ID
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
	 public List<OrderGoodsList> getGoodsList() {
		return goodsList;
	}
    
    public void setGoodsList(List<OrderGoodsList> goodsList) {
		this.goodsList = goodsList;
	}
    
    public void addGoodsList(OrderGoodsList orderGoodsList) {
    	if (this.goodsList == null) {
    		this.goodsList = new ArrayList<OrderGoodsList>();
    		this.goodsList.add(orderGoodsList);
    	} else {
    		this.goodsList.add(orderGoodsList);
    	}
    }
	
	public boolean isCusOrderEditable() {
	   if(cusMessageStatusOrder == null || cusMessageStatusOrder.trim().equals("") || cusMessageStatusOrder.equals("0") || cusMessageStatusOrder.equals("F")
				|| cusMessageStatusOrder.equals("3") || cusMessageStatusOrder.equals("100") || cusMessageStatusOrder.startsWith("-")){
			return true;
		}
		return false;
   }
   
   public boolean isCiqOrderEditable() {
		if(ciqMessageStatusOrder == null || ciqMessageStatusOrder.trim().equals("") || ciqMessageStatusOrder.equals("0") || ciqMessageStatusOrder.equals("F")
				|| ciqMessageStatusOrder.equals("3") || ciqMessageStatusOrder.equals("100") || ciqMessageStatusOrder.startsWith("-")){
			return true;
		}
		return false;
	}
   
   public boolean isBothOrderEditable() {
	   if (isCusOrderEditable() && isCiqOrderEditable()) {
		   return true;
	   }
	   return false;
   }
   
   @Override
   public String toString() {
	   return ToStringBuilder.reflectionToString(this);
   }
}