package com.yunyitg.cesp.core.imports.payment.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "payment_detail")
public class PaymentDetail {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联电子支付单表头ID
     */
    @Column(name = "payment_head_id")
    private Integer paymentHeadId;

    /**
     * 支付交易编号
     */
    @Column(name = "ent_pay_no")
    private String entPayNo;

    /**
     * 申报企业ID
     */
    @Column(name = "decl_ent_id")
    private Integer declEntId;

    /**
     * 支付企业ID
     */
    @Column(name = "pay_ent_id")
    private Integer payEntId;

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
     * 支付交易状态
     */
    @Column(name = "pay_status")
    private String payStatus;

    /**
     * 支付金额
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 支付币制
     */
    @Column(name = "pay_curr_code")
    private String payCurrCode;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 支付人姓名
     */
    @Column(name = "payer_name")
    private String payerName;

    /**
     * 支付人证件类型(01:身份证;02:护照;04:其他)
     */
    @Column(name = "payer_document_type")
    private String payerDocumentType;

    /**
     * 支付人证件号码
     */
    @Column(name = "payer_document_number")
    private String payerDocumentNumber;

    /**
     * 电子订单编号
     */
    @Column(name = "ent_order_no")
    private String entOrderNo;

    /**
     * 所属电商企业ID
     */
    @Column(name = "eb_ent_id")
    private Integer ebEntId;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 海关电子支付单状态
     */
    @Column(name = "cus_message_status_pay")
    private String cusMessageStatusPay;

    /**
     * 海关支付单回执内容
     */
    @Column(name = "cus_pay_return_info")
    private String cusPayReturnInfo;

    /**
     * 国检电子支付单状态
     */
    @Column(name = "ciq_message_status_pay")
    private String ciqMessageStatusPay;

    /**
     * 国检支付单回执内容
     */
    @Column(name = "ciq_pay_return_info")
    private String ciqPayReturnInfo;

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
     * 获取关联电子支付单表头ID
     *
     * @return payment_head_id - 关联电子支付单表头ID
     */
    public Integer getPaymentHeadId() {
        return paymentHeadId;
    }

    /**
     * 设置关联电子支付单表头ID
     *
     * @param paymentHeadId 关联电子支付单表头ID
     */
    public void setPaymentHeadId(Integer paymentHeadId) {
        this.paymentHeadId = paymentHeadId;
    }

    /**
     * 获取支付交易编号
     *
     * @return ent_pay_no - 支付交易编号
     */
    public String getEntPayNo() {
        return entPayNo;
    }

    /**
     * 设置支付交易编号
     *
     * @param entPayNo 支付交易编号
     */
    public void setEntPayNo(String entPayNo) {
        this.entPayNo = entPayNo;
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
     * 获取支付企业ID
     *
     * @return pay_ent_id - 支付企业ID
     */
    public Integer getPayEntId() {
        return payEntId;
    }

    /**
     * 设置支付企业ID
     *
     * @param payEntId 支付企业ID
     */
    public void setPayEntId(Integer payEntId) {
        this.payEntId = payEntId;
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
     * 获取支付交易状态
     *
     * @return pay_status - 支付交易状态
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付交易状态
     *
     * @param payStatus 支付交易状态
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取支付金额
     *
     * @return pay_amount - 支付金额
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置支付金额
     *
     * @param payAmount 支付金额
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取支付币制
     *
     * @return pay_curr_code - 支付币制
     */
    public String getPayCurrCode() {
        return payCurrCode;
    }

    /**
     * 设置支付币制
     *
     * @param payCurrCode 支付币制
     */
    public void setPayCurrCode(String payCurrCode) {
        this.payCurrCode = payCurrCode;
    }

    /**
     * 获取付款时间
     *
     * @return pay_time - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取支付人姓名
     *
     * @return payer_name - 支付人姓名
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * 设置支付人姓名
     *
     * @param payerName 支付人姓名
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    /**
     * 获取支付人证件类型(01:身份证;02:护照;04:其他)
     *
     * @return payer_document_type - 支付人证件类型(01:身份证;02:护照;04:其他)
     */
    public String getPayerDocumentType() {
        return payerDocumentType;
    }

    /**
     * 设置支付人证件类型(01:身份证;02:护照;04:其他)
     *
     * @param payerDocumentType 支付人证件类型(01:身份证;02:护照;04:其他)
     */
    public void setPayerDocumentType(String payerDocumentType) {
        this.payerDocumentType = payerDocumentType;
    }

    /**
     * 获取支付人证件号码
     *
     * @return payer_document_number - 支付人证件号码
     */
    public String getPayerDocumentNumber() {
        return payerDocumentNumber;
    }

    /**
     * 设置支付人证件号码
     *
     * @param payerDocumentNumber 支付人证件号码
     */
    public void setPayerDocumentNumber(String payerDocumentNumber) {
        this.payerDocumentNumber = payerDocumentNumber;
    }

    /**
     * 获取电子订单编号
     *
     * @return ent_order_no - 电子订单编号
     */
    public String getEntOrderNo() {
        return entOrderNo;
    }

    /**
     * 设置电子订单编号
     *
     * @param entOrderNo 电子订单编号
     */
    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo;
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
     * 获取海关电子支付单状态
     *
     * @return cus_message_status_pay - 海关电子支付单状态
     */
    public String getCusMessageStatusPay() {
        return cusMessageStatusPay;
    }

    /**
     * 设置海关电子支付单状态
     *
     * @param cusMessageStatusPay 海关电子支付单状态
     */
    public void setCusMessageStatusPay(String cusMessageStatusPay) {
        this.cusMessageStatusPay = cusMessageStatusPay;
    }

    /**
     * 获取海关支付单回执内容
     *
     * @return cus_pay_return_info - 海关支付单回执内容
     */
    public String getCusPayReturnInfo() {
        return cusPayReturnInfo;
    }

    /**
     * 设置海关支付单回执内容
     *
     * @param cusPayReturnInfo 海关支付单回执内容
     */
    public void setCusPayReturnInfo(String cusPayReturnInfo) {
        this.cusPayReturnInfo = cusPayReturnInfo;
    }

    /**
     * 获取国检电子支付单状态
     *
     * @return ciq_message_status_pay - 国检电子支付单状态
     */
    public String getCiqMessageStatusPay() {
        return ciqMessageStatusPay;
    }

    /**
     * 设置国检电子支付单状态
     *
     * @param ciqMessageStatusPay 国检电子支付单状态
     */
    public void setCiqMessageStatusPay(String ciqMessageStatusPay) {
        this.ciqMessageStatusPay = ciqMessageStatusPay;
    }

    /**
     * 获取国检支付单回执内容
     *
     * @return ciq_pay_return_info - 国检支付单回执内容
     */
    public String getCiqPayReturnInfo() {
        return ciqPayReturnInfo;
    }

    /**
     * 设置国检支付单回执内容
     *
     * @param ciqPayReturnInfo 国检支付单回执内容
     */
    public void setCiqPayReturnInfo(String ciqPayReturnInfo) {
        this.ciqPayReturnInfo = ciqPayReturnInfo;
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
}