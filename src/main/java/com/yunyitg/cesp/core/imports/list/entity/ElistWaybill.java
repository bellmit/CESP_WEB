package com.yunyitg.cesp.core.imports.list.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "elist_waybill")
public class ElistWaybill {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联清单详情信息ID
     */
    @Column(name = "elist_detail_info_id")
    private Integer elistDetailInfoId;

    /**
     * 企业电子运单编号
     */
    @Column(name = "ent_waybill_no")
    private String entWaybillNo;

    /**
     * 所属物流企业ID
     */
    @Column(name = "ehs_ent_id")
    private Integer ehsEntId;

    /**
     * 毛重
     */
    @Column(name = "gross_weight")
    private BigDecimal grossWeight;

    /**
     * 净重
     */
    @Column(name = "net_wt")
    private BigDecimal netWt;

    /**
     * 运费
     */
    @Column(name = "fee_rate")
    private BigDecimal feeRate;

    /**
     * 运费标志（预留字段）（1代表率；2代表单价；3代表总价）
     */
    @Column(name = "fee_mark")
    private String feeMark;

    /**
     * 保费
     */
    @Column(name = "insur_rate")
    private BigDecimal insurRate;

    /**
     * 杂费
     */
    @Column(name = "other_rate")
    private BigDecimal otherRate;

    /**
     * 收件人中文名称
     */
    @Column(name = "recipient_name_c")
    private String recipientNameC;

    /**
     * 收件人英文名称
     */
    @Column(name = "recipient_name_e")
    private String recipientNameE;

    /**
     * 收件人证件类型（01:身份证、02:护照、03:其他）
     */
    @Column(name = "recipient_card_type")
    private String recipientCardType;

    /**
     * 收发件人证件号
     */
    @Column(name = "recipient_no")
    private String recipientNo;

    /**
     * 收件人国家代码
     */
    @Column(name = "recipient_country")
    private String recipientCountry;

    /**
     * 收件人省市区代码（进口需要填收货人所在行政区域代码；出口填出口省市区代码）
     */
    @Column(name = "recipient_provinces_code")
    private String recipientProvincesCode;

    /**
     * 收件人中文地址
     */
    @Column(name = "recipient_addr_c")
    private String recipientAddrC;

    /**
     * 收件人英文地址
     */
    @Column(name = "recipient_addr_e")
    private String recipientAddrE;

    /**
     * 收件人电话
     */
    @Column(name = "recipient_tel")
    private String recipientTel;

    /**
     * 发件人中文名称(电商或电商物流服务商中文名)
     */
    @Column(name = "shipper_c")
    private String shipperC;

    /**
     * 发件人英文名称(电商或电商物流服务商英文名)
     */
    @Column(name = "shipper_e")
    private String shipperE;

    /**
     * 发件人国家代码(进口填发货国或地区代码；出口填中国（142）)
     */
    @Column(name = "shipper_country")
    private String shipperCountry;

    /**
     * 发件人城市（进口填境外城市名；出口填境内发货城市名）
     */
    @Column(name = "shipper_provinces_code")
    private String shipperProvincesCode;

    /**
     * 发件人中文地址
     */
    @Column(name = "shipper_addr_c")
    private String shipperAddrC;

    /**
     * 发件人英文名称
     */
    @Column(name = "shipper_addr_e")
    private String shipperAddrE;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

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
     * 获取关联清单详情信息ID
     *
     * @return elist_detail_info_id - 关联清单详情信息ID
     */
    public Integer getElistDetailInfoId() {
        return elistDetailInfoId;
    }

    /**
     * 设置关联清单详情信息ID
     *
     * @param elistDetailInfoId 关联清单详情信息ID
     */
    public void setElistDetailInfoId(Integer elistDetailInfoId) {
        this.elistDetailInfoId = elistDetailInfoId;
    }

    /**
     * 获取企业电子运单编号
     *
     * @return ent_waybill_no - 企业电子运单编号
     */
    public String getEntWaybillNo() {
        return entWaybillNo;
    }

    /**
     * 设置企业电子运单编号
     *
     * @param entWaybillNo 企业电子运单编号
     */
    public void setEntWaybillNo(String entWaybillNo) {
        this.entWaybillNo = entWaybillNo;
    }

    /**
     * 获取所属物流企业ID
     *
     * @return ehs_ent_id - 所属物流企业ID
     */
    public Integer getEhsEntId() {
        return ehsEntId;
    }

    /**
     * 设置所属物流企业ID
     *
     * @param ehsEntId 所属物流企业ID
     */
    public void setEhsEntId(Integer ehsEntId) {
        this.ehsEntId = ehsEntId;
    }

    /**
     * 获取毛重
     *
     * @return gross_weight - 毛重
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * 设置毛重
     *
     * @param grossWeight 毛重
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * 获取净重
     *
     * @return net_wt - 净重
     */
    public BigDecimal getNetWt() {
        return netWt;
    }

    /**
     * 设置净重
     *
     * @param netWt 净重
     */
    public void setNetWt(BigDecimal netWt) {
        this.netWt = netWt;
    }

    /**
     * 获取运费
     *
     * @return fee_rate - 运费
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * 设置运费
     *
     * @param feeRate 运费
     */
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * 获取运费标志（预留字段）（1代表率；2代表单价；3代表总价）
     *
     * @return fee_mark - 运费标志（预留字段）（1代表率；2代表单价；3代表总价）
     */
    public String getFeeMark() {
        return feeMark;
    }

    /**
     * 设置运费标志（预留字段）（1代表率；2代表单价；3代表总价）
     *
     * @param feeMark 运费标志（预留字段）（1代表率；2代表单价；3代表总价）
     */
    public void setFeeMark(String feeMark) {
        this.feeMark = feeMark;
    }

    /**
     * 获取保费
     *
     * @return insur_rate - 保费
     */
    public BigDecimal getInsurRate() {
        return insurRate;
    }

    /**
     * 设置保费
     *
     * @param insurRate 保费
     */
    public void setInsurRate(BigDecimal insurRate) {
        this.insurRate = insurRate;
    }

    /**
     * 获取杂费
     *
     * @return other_rate - 杂费
     */
    public BigDecimal getOtherRate() {
        return otherRate;
    }

    /**
     * 设置杂费
     *
     * @param otherRate 杂费
     */
    public void setOtherRate(BigDecimal otherRate) {
        this.otherRate = otherRate;
    }

    /**
     * 获取收件人中文名称
     *
     * @return recipient_name_c - 收件人中文名称
     */
    public String getRecipientNameC() {
        return recipientNameC;
    }

    /**
     * 设置收件人中文名称
     *
     * @param recipientNameC 收件人中文名称
     */
    public void setRecipientNameC(String recipientNameC) {
        this.recipientNameC = recipientNameC;
    }

    /**
     * 获取收件人英文名称
     *
     * @return recipient_name_e - 收件人英文名称
     */
    public String getRecipientNameE() {
        return recipientNameE;
    }

    /**
     * 设置收件人英文名称
     *
     * @param recipientNameE 收件人英文名称
     */
    public void setRecipientNameE(String recipientNameE) {
        this.recipientNameE = recipientNameE;
    }

    /**
     * 获取收件人证件类型（01:身份证、02:护照、03:其他）
     *
     * @return recipient_card_type - 收件人证件类型（01:身份证、02:护照、03:其他）
     */
    public String getRecipientCardType() {
        return recipientCardType;
    }

    /**
     * 设置收件人证件类型（01:身份证、02:护照、03:其他）
     *
     * @param recipientCardType 收件人证件类型（01:身份证、02:护照、03:其他）
     */
    public void setRecipientCardType(String recipientCardType) {
        this.recipientCardType = recipientCardType;
    }

    /**
     * 获取收发件人证件号
     *
     * @return recipient_no - 收发件人证件号
     */
    public String getRecipientNo() {
        return recipientNo;
    }

    /**
     * 设置收发件人证件号
     *
     * @param recipientNo 收发件人证件号
     */
    public void setRecipientNo(String recipientNo) {
        this.recipientNo = recipientNo;
    }

    /**
     * 获取收件人国家代码
     *
     * @return recipient_country - 收件人国家代码
     */
    public String getRecipientCountry() {
        return recipientCountry;
    }

    /**
     * 设置收件人国家代码
     *
     * @param recipientCountry 收件人国家代码
     */
    public void setRecipientCountry(String recipientCountry) {
        this.recipientCountry = recipientCountry;
    }

    /**
     * 获取收件人省市区代码（进口需要填收货人所在行政区域代码；出口填出口省市区代码）
     *
     * @return recipient_provinces_code - 收件人省市区代码（进口需要填收货人所在行政区域代码；出口填出口省市区代码）
     */
    public String getRecipientProvincesCode() {
        return recipientProvincesCode;
    }

    /**
     * 设置收件人省市区代码（进口需要填收货人所在行政区域代码；出口填出口省市区代码）
     *
     * @param recipientProvincesCode 收件人省市区代码（进口需要填收货人所在行政区域代码；出口填出口省市区代码）
     */
    public void setRecipientProvincesCode(String recipientProvincesCode) {
        this.recipientProvincesCode = recipientProvincesCode;
    }

    /**
     * 获取收件人中文地址
     *
     * @return recipient_addr_c - 收件人中文地址
     */
    public String getRecipientAddrC() {
        return recipientAddrC;
    }

    /**
     * 设置收件人中文地址
     *
     * @param recipientAddrC 收件人中文地址
     */
    public void setRecipientAddrC(String recipientAddrC) {
        this.recipientAddrC = recipientAddrC;
    }

    /**
     * 获取收件人英文地址
     *
     * @return recipient_addr_e - 收件人英文地址
     */
    public String getRecipientAddrE() {
        return recipientAddrE;
    }

    /**
     * 设置收件人英文地址
     *
     * @param recipientAddrE 收件人英文地址
     */
    public void setRecipientAddrE(String recipientAddrE) {
        this.recipientAddrE = recipientAddrE;
    }

    /**
     * 获取收件人电话
     *
     * @return recipient_tel - 收件人电话
     */
    public String getRecipientTel() {
        return recipientTel;
    }

    /**
     * 设置收件人电话
     *
     * @param recipientTel 收件人电话
     */
    public void setRecipientTel(String recipientTel) {
        this.recipientTel = recipientTel;
    }

    /**
     * 获取发件人中文名称(电商或电商物流服务商中文名)
     *
     * @return shipper_c - 发件人中文名称(电商或电商物流服务商中文名)
     */
    public String getShipperC() {
        return shipperC;
    }

    /**
     * 设置发件人中文名称(电商或电商物流服务商中文名)
     *
     * @param shipperC 发件人中文名称(电商或电商物流服务商中文名)
     */
    public void setShipperC(String shipperC) {
        this.shipperC = shipperC;
    }

    /**
     * 获取发件人英文名称(电商或电商物流服务商英文名)
     *
     * @return shipper_e - 发件人英文名称(电商或电商物流服务商英文名)
     */
    public String getShipperE() {
        return shipperE;
    }

    /**
     * 设置发件人英文名称(电商或电商物流服务商英文名)
     *
     * @param shipperE 发件人英文名称(电商或电商物流服务商英文名)
     */
    public void setShipperE(String shipperE) {
        this.shipperE = shipperE;
    }

    /**
     * 获取发件人国家代码(进口填发货国或地区代码；出口填中国（142）)
     *
     * @return shipper_country - 发件人国家代码(进口填发货国或地区代码；出口填中国（142）)
     */
    public String getShipperCountry() {
        return shipperCountry;
    }

    /**
     * 设置发件人国家代码(进口填发货国或地区代码；出口填中国（142）)
     *
     * @param shipperCountry 发件人国家代码(进口填发货国或地区代码；出口填中国（142）)
     */
    public void setShipperCountry(String shipperCountry) {
        this.shipperCountry = shipperCountry;
    }

    /**
     * 获取发件人城市（进口填境外城市名；出口填境内发货城市名）
     *
     * @return shipper_provinces_code - 发件人城市（进口填境外城市名；出口填境内发货城市名）
     */
    public String getShipperProvincesCode() {
        return shipperProvincesCode;
    }

    /**
     * 设置发件人城市（进口填境外城市名；出口填境内发货城市名）
     *
     * @param shipperProvincesCode 发件人城市（进口填境外城市名；出口填境内发货城市名）
     */
    public void setShipperProvincesCode(String shipperProvincesCode) {
        this.shipperProvincesCode = shipperProvincesCode;
    }

    /**
     * 获取发件人中文地址
     *
     * @return shipper_addr_c - 发件人中文地址
     */
    public String getShipperAddrC() {
        return shipperAddrC;
    }

    /**
     * 设置发件人中文地址
     *
     * @param shipperAddrC 发件人中文地址
     */
    public void setShipperAddrC(String shipperAddrC) {
        this.shipperAddrC = shipperAddrC;
    }

    /**
     * 获取发件人英文名称
     *
     * @return shipper_addr_e - 发件人英文名称
     */
    public String getShipperAddrE() {
        return shipperAddrE;
    }

    /**
     * 设置发件人英文名称
     *
     * @param shipperAddrE 发件人英文名称
     */
    public void setShipperAddrE(String shipperAddrE) {
        this.shipperAddrE = shipperAddrE;
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
}