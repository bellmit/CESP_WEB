package com.yunyitg.cesp.core.imports.list.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "elist_detail_info")
public class ElistDetailInfo {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联电子清单申报表头ID
     */
    @Column(name = "elist_head_id")
    private Integer elistHeadId;

    /**
     * 清单编号(企业内部的清单编号)
     */
    @Column(name = "ent_elist_no")
    private String entElistNo;

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
     * 贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)
     */
    @Column(name = "trade_mode")
    private String tradeMode;

    /**
     * 税务编号
     */
    @Column(name = "tax_no")
    private String taxNo;

    /**
     * 征税状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 关税
     */
    @Column(name = "customs_tax")
    private BigDecimal customsTax;

    /**
     * 增值税
     */
    @Column(name = "value_added_tax")
    private BigDecimal valueAddedTax;

    /**
     * 消费税
     */
    @Column(name = "consumption_tax")
    private BigDecimal consumptionTax;

    /**
     * 企业电子订单编号
     */
    @Column(name = "ent_order_no")
    private String entOrderNo;

    /**
     * 企业电子运单编号
     */
    @Column(name = "ent_waybill_no")
    private String entWaybillNo;

    /**
     * 跨境平台清单编号
     */
    @Column(name = "eport_elist_no")
    private String eportElistNo;

    /**
     * 预录入编号（电子口岸标识单证编号）
     */
    @Column(name = "pre_no")
    private String preNo;

    /**
     * 海关清单编号
     */
    @Column(name = "cus_elist_no")
    private String cusElistNo;

    /**
     * 检验检疫清单编号
     */
    @Column(name = "ciq_elist_no")
    private String ciqElistNo;

    /**
     * 担保企业ID
     */
    @Column(name = "assure_id")
    private Integer assureId;

    /**
     * 进出口岸代码
     */
    @Column(name = "ie_port")
    private String iePort;

    /**
     * 监管场所代码
     */
    @Column(name = "sv_p_code")
    private String svPCode;

    /**
     * 进出口日期
     */
    @Column(name = "ie_date")
    private Date ieDate;

    /**
     * 备案号/账册编号
     */
    @Column(name = "ems_no")
    private String emsNo;

    /**
     * 区内企业ID(保税业务)
     */
    @Column(name = "area_id")
    private Integer areaId;

    /**
     * 许可证号
     */
    @Column(name = "license_no")
    private String licenseNo;

    /**
     * 成交方式
     */
    @Column(name = "trans_mode")
    private String transMode;

    /**
     * 生成厂家/用途
     */
    @Column(name = "use_to")
    private String useTo;

    /**
     * 提运单号/转关单号（直购进口必填。货物提单或运单的编号，直购必填。）
     */
    @Column(name = "bill_no")
    private String billNo;

    /**
     * 组货单位名称
     */
    @Column(name = "pack_ent_name")
    private String packEntName;

    /**
     * 外包装种类代码
     */
    @Column(name = "wrap_type")
    private String wrapType;

    /**
     * 包裹件数
     */
    @Column(name = "pack_quantity")
    private Integer packQuantity;

    /**
     * 运输工具类型（1 飞机；2 卡车；3 火车；4 船；9 其他）
     */
    @Column(name = "trans_type")
    private String transType;

    /**
     * 运输方式代码
     */
    @Column(name = "trans_code")
    private String transCode;

    /**
     * 运输工具编号
     */
    @Column(name = "trans_no")
    private String transNo;

    /**
     * 航班航次号
     */
    @Column(name = "voyage_no")
    private String voyageNo;

    /**
     * 起运国/运抵国
     */
    @Column(name = "destination_country")
    private String destinationCountry;

    /**
     * 起运港/抵运港
     */
    @Column(name = "destination_port")
    private String destinationPort;

    /**
     * 拟到达时间或出发时间（直购进口为拟抵达监管场所时间；保税进口为拟发货时间；出口为抵达监管场所时间。）
     */
    @Column(name = "edest_date")
    private Date edestDate;

    /**
     * 经停地区或国家代码
     */
    @Column(name = "route_country")
    private String routeCountry;

    /**
     * 消费者名称
     */
    @Column(name = "consignee_name")
    private String consigneeName;

    /**
     * 消费者证件号码
     */
    @Column(name = "consignee_id_num")
    private String consigneeIdNum;

    /**
     * 消费者证件类型代码（1-身份证；2-其它）
     */
    @Column(name = "consignee_card_type")
    private String consigneeCardType;

    /**
     * 消费者所在国家（地区）代码(进口填中国（142）；出口填目的国海关代码)
     */
    @Column(name = "consignee_country")
    private String consigneeCountry;

    /**
     * 消费者联系电话号码
     */
    @Column(name = "consignee_tel")
    private String consigneeTel;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 海关电子清单状态
     */
    @Column(name = "cus_message_status_list")
    private String cusMessageStatusList;

    /**
     * 海关清单回执内容
     */
    @Column(name = "cus_list_return_info")
    private String cusListReturnInfo;

    /**
     * 国检电子清单状态
     */
    @Column(name = "ciq_message_status_list")
    private String ciqMessageStatusList;

    /**
     * 国检清单回执内容
     */
    @Column(name = "ciq_list_return_info")
    private String ciqListReturnInfo;

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
     * 获取关联电子清单申报表头ID
     *
     * @return elist_head_id - 关联电子清单申报表头ID
     */
    public Integer getElistHeadId() {
        return elistHeadId;
    }

    /**
     * 设置关联电子清单申报表头ID
     *
     * @param elistHeadId 关联电子清单申报表头ID
     */
    public void setElistHeadId(Integer elistHeadId) {
        this.elistHeadId = elistHeadId;
    }

    /**
     * 获取清单编号(企业内部的清单编号)
     *
     * @return ent_elist_no - 清单编号(企业内部的清单编号)
     */
    public String getEntElistNo() {
        return entElistNo;
    }

    /**
     * 设置清单编号(企业内部的清单编号)
     *
     * @param entElistNo 清单编号(企业内部的清单编号)
     */
    public void setEntElistNo(String entElistNo) {
        this.entElistNo = entElistNo;
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
     * 获取贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)
     *
     * @return trade_mode - 贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)
     */
    public String getTradeMode() {
        return tradeMode;
    }

    /**
     * 设置贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)
     *
     * @param tradeMode 贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)
     */
    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

    /**
     * 获取税务编号
     *
     * @return tax_no - 税务编号
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * 设置税务编号
     *
     * @param taxNo 税务编号
     */
    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    /**
     * 获取征税状态
     *
     * @return status - 征税状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置征税状态
     *
     * @param status 征税状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取关税
     *
     * @return customs_tax - 关税
     */
    public BigDecimal getCustomsTax() {
        return customsTax;
    }

    /**
     * 设置关税
     *
     * @param customsTax 关税
     */
    public void setCustomsTax(BigDecimal customsTax) {
        this.customsTax = customsTax;
    }

    /**
     * 获取增值税
     *
     * @return value_added_tax - 增值税
     */
    public BigDecimal getValueAddedTax() {
        return valueAddedTax;
    }

    /**
     * 设置增值税
     *
     * @param valueAddedTax 增值税
     */
    public void setValueAddedTax(BigDecimal valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }

    /**
     * 获取消费税
     *
     * @return consumption_tax - 消费税
     */
    public BigDecimal getConsumptionTax() {
        return consumptionTax;
    }

    /**
     * 设置消费税
     *
     * @param consumptionTax 消费税
     */
    public void setConsumptionTax(BigDecimal consumptionTax) {
        this.consumptionTax = consumptionTax;
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
     * 获取跨境平台清单编号
     *
     * @return eport_elist_no - 跨境平台清单编号
     */
    public String getEportElistNo() {
        return eportElistNo;
    }

    /**
     * 设置跨境平台清单编号
     *
     * @param eportElistNo 跨境平台清单编号
     */
    public void setEportElistNo(String eportElistNo) {
        this.eportElistNo = eportElistNo;
    }

    /**
     * 获取预录入编号（电子口岸标识单证编号）
     *
     * @return pre_no - 预录入编号（电子口岸标识单证编号）
     */
    public String getPreNo() {
        return preNo;
    }

    /**
     * 设置预录入编号（电子口岸标识单证编号）
     *
     * @param preNo 预录入编号（电子口岸标识单证编号）
     */
    public void setPreNo(String preNo) {
        this.preNo = preNo;
    }

    /**
     * 获取海关清单编号
     *
     * @return cus_elist_no - 海关清单编号
     */
    public String getCusElistNo() {
        return cusElistNo;
    }

    /**
     * 设置海关清单编号
     *
     * @param cusElistNo 海关清单编号
     */
    public void setCusElistNo(String cusElistNo) {
        this.cusElistNo = cusElistNo;
    }

    /**
     * 获取检验检疫清单编号
     *
     * @return ciq_elist_no - 检验检疫清单编号
     */
    public String getCiqElistNo() {
        return ciqElistNo;
    }

    /**
     * 设置检验检疫清单编号
     *
     * @param ciqElistNo 检验检疫清单编号
     */
    public void setCiqElistNo(String ciqElistNo) {
        this.ciqElistNo = ciqElistNo;
    }

    /**
     * 获取担保企业ID
     *
     * @return assure_id - 担保企业ID
     */
    public Integer getAssureId() {
        return assureId;
    }

    /**
     * 设置担保企业ID
     *
     * @param assureId 担保企业ID
     */
    public void setAssureId(Integer assureId) {
        this.assureId = assureId;
    }

    /**
     * 获取进出口岸代码
     *
     * @return ie_port - 进出口岸代码
     */
    public String getIePort() {
        return iePort;
    }

    /**
     * 设置进出口岸代码
     *
     * @param iePort 进出口岸代码
     */
    public void setIePort(String iePort) {
        this.iePort = iePort;
    }

    /**
     * 获取监管场所代码
     *
     * @return sv_p_code - 监管场所代码
     */
    public String getSvPCode() {
        return svPCode;
    }

    /**
     * 设置监管场所代码
     *
     * @param svPCode 监管场所代码
     */
    public void setSvPCode(String svPCode) {
        this.svPCode = svPCode;
    }

    /**
     * 获取进出口日期
     *
     * @return ie_date - 进出口日期
     */
    public Date getIeDate() {
        return ieDate;
    }

    /**
     * 设置进出口日期
     *
     * @param ieDate 进出口日期
     */
    public void setIeDate(Date ieDate) {
        this.ieDate = ieDate;
    }

    /**
     * 获取备案号/账册编号
     *
     * @return ems_no - 备案号/账册编号
     */
    public String getEmsNo() {
        return emsNo;
    }

    /**
     * 设置备案号/账册编号
     *
     * @param emsNo 备案号/账册编号
     */
    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo;
    }

    /**
     * 获取区内企业ID(保税业务)
     *
     * @return area_id - 区内企业ID(保税业务)
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 设置区内企业ID(保税业务)
     *
     * @param areaId 区内企业ID(保税业务)
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取许可证号
     *
     * @return license_no - 许可证号
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * 设置许可证号
     *
     * @param licenseNo 许可证号
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    /**
     * 获取成交方式
     *
     * @return trans_mode - 成交方式
     */
    public String getTransMode() {
        return transMode;
    }

    /**
     * 设置成交方式
     *
     * @param transMode 成交方式
     */
    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }

    /**
     * 获取生成厂家/用途
     *
     * @return use_to - 生成厂家/用途
     */
    public String getUseTo() {
        return useTo;
    }

    /**
     * 设置生成厂家/用途
     *
     * @param useTo 生成厂家/用途
     */
    public void setUseTo(String useTo) {
        this.useTo = useTo;
    }

    /**
     * 获取提运单号/转关单号（直购进口必填。货物提单或运单的编号，直购必填。）
     *
     * @return bill_no - 提运单号/转关单号（直购进口必填。货物提单或运单的编号，直购必填。）
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置提运单号/转关单号（直购进口必填。货物提单或运单的编号，直购必填。）
     *
     * @param billNo 提运单号/转关单号（直购进口必填。货物提单或运单的编号，直购必填。）
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 获取组货单位名称
     *
     * @return pack_ent_name - 组货单位名称
     */
    public String getPackEntName() {
        return packEntName;
    }

    /**
     * 设置组货单位名称
     *
     * @param packEntName 组货单位名称
     */
    public void setPackEntName(String packEntName) {
        this.packEntName = packEntName;
    }

    /**
     * 获取外包装种类代码
     *
     * @return wrap_type - 外包装种类代码
     */
    public String getWrapType() {
        return wrapType;
    }

    /**
     * 设置外包装种类代码
     *
     * @param wrapType 外包装种类代码
     */
    public void setWrapType(String wrapType) {
        this.wrapType = wrapType;
    }

    /**
     * 获取包裹件数
     *
     * @return pack_quantity - 包裹件数
     */
    public Integer getPackQuantity() {
        return packQuantity;
    }

    /**
     * 设置包裹件数
     *
     * @param packQuantity 包裹件数
     */
    public void setPackQuantity(Integer packQuantity) {
        this.packQuantity = packQuantity;
    }

    /**
     * 获取运输工具类型（1 飞机；2 卡车；3 火车；4 船；9 其他）
     *
     * @return trans_type - 运输工具类型（1 飞机；2 卡车；3 火车；4 船；9 其他）
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置运输工具类型（1 飞机；2 卡车；3 火车；4 船；9 其他）
     *
     * @param transType 运输工具类型（1 飞机；2 卡车；3 火车；4 船；9 其他）
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * 获取运输方式代码
     *
     * @return trans_code - 运输方式代码
     */
    public String getTransCode() {
        return transCode;
    }

    /**
     * 设置运输方式代码
     *
     * @param transCode 运输方式代码
     */
    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    /**
     * 获取运输工具编号
     *
     * @return trans_no - 运输工具编号
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * 设置运输工具编号
     *
     * @param transNo 运输工具编号
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    /**
     * 获取航班航次号
     *
     * @return voyage_no - 航班航次号
     */
    public String getVoyageNo() {
        return voyageNo;
    }

    /**
     * 设置航班航次号
     *
     * @param voyageNo 航班航次号
     */
    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo;
    }

    /**
     * 获取起运国/运抵国
     *
     * @return destination_country - 起运国/运抵国
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * 设置起运国/运抵国
     *
     * @param destinationCountry 起运国/运抵国
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /**
     * 获取起运港/抵运港
     *
     * @return destination_port - 起运港/抵运港
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /**
     * 设置起运港/抵运港
     *
     * @param destinationPort 起运港/抵运港
     */
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * 获取拟到达时间或出发时间（直购进口为拟抵达监管场所时间；保税进口为拟发货时间；出口为抵达监管场所时间。）
     *
     * @return edest_date - 拟到达时间或出发时间（直购进口为拟抵达监管场所时间；保税进口为拟发货时间；出口为抵达监管场所时间。）
     */
    public Date getEdestDate() {
        return edestDate;
    }

    /**
     * 设置拟到达时间或出发时间（直购进口为拟抵达监管场所时间；保税进口为拟发货时间；出口为抵达监管场所时间。）
     *
     * @param edestDate 拟到达时间或出发时间（直购进口为拟抵达监管场所时间；保税进口为拟发货时间；出口为抵达监管场所时间。）
     */
    public void setEdestDate(Date edestDate) {
        this.edestDate = edestDate;
    }

    /**
     * 获取经停地区或国家代码
     *
     * @return route_country - 经停地区或国家代码
     */
    public String getRouteCountry() {
        return routeCountry;
    }

    /**
     * 设置经停地区或国家代码
     *
     * @param routeCountry 经停地区或国家代码
     */
    public void setRouteCountry(String routeCountry) {
        this.routeCountry = routeCountry;
    }

    /**
     * 获取消费者名称
     *
     * @return consignee_name - 消费者名称
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * 设置消费者名称
     *
     * @param consigneeName 消费者名称
     */
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    /**
     * 获取消费者证件号码
     *
     * @return consignee_id_num - 消费者证件号码
     */
    public String getConsigneeIdNum() {
        return consigneeIdNum;
    }

    /**
     * 设置消费者证件号码
     *
     * @param consigneeIdNum 消费者证件号码
     */
    public void setConsigneeIdNum(String consigneeIdNum) {
        this.consigneeIdNum = consigneeIdNum;
    }

    /**
     * 获取消费者证件类型代码（1-身份证；2-其它）
     *
     * @return consignee_card_type - 消费者证件类型代码（1-身份证；2-其它）
     */
    public String getConsigneeCardType() {
        return consigneeCardType;
    }

    /**
     * 设置消费者证件类型代码（1-身份证；2-其它）
     *
     * @param consigneeCardType 消费者证件类型代码（1-身份证；2-其它）
     */
    public void setConsigneeCardType(String consigneeCardType) {
        this.consigneeCardType = consigneeCardType;
    }

    /**
     * 获取消费者所在国家（地区）代码(进口填中国（142）；出口填目的国海关代码)
     *
     * @return consignee_country - 消费者所在国家（地区）代码(进口填中国（142）；出口填目的国海关代码)
     */
    public String getConsigneeCountry() {
        return consigneeCountry;
    }

    /**
     * 设置消费者所在国家（地区）代码(进口填中国（142）；出口填目的国海关代码)
     *
     * @param consigneeCountry 消费者所在国家（地区）代码(进口填中国（142）；出口填目的国海关代码)
     */
    public void setConsigneeCountry(String consigneeCountry) {
        this.consigneeCountry = consigneeCountry;
    }

    /**
     * 获取消费者联系电话号码
     *
     * @return consignee_tel - 消费者联系电话号码
     */
    public String getConsigneeTel() {
        return consigneeTel;
    }

    /**
     * 设置消费者联系电话号码
     *
     * @param consigneeTel 消费者联系电话号码
     */
    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
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
     * 获取海关电子清单状态
     *
     * @return cus_message_status_list - 海关电子清单状态
     */
    public String getCusMessageStatusList() {
        return cusMessageStatusList;
    }

    /**
     * 设置海关电子清单状态
     *
     * @param cusMessageStatusList 海关电子清单状态
     */
    public void setCusMessageStatusList(String cusMessageStatusList) {
        this.cusMessageStatusList = cusMessageStatusList;
    }

    /**
     * 获取海关清单回执内容
     *
     * @return cus_list_return_info - 海关清单回执内容
     */
    public String getCusListReturnInfo() {
        return cusListReturnInfo;
    }

    /**
     * 设置海关清单回执内容
     *
     * @param cusListReturnInfo 海关清单回执内容
     */
    public void setCusListReturnInfo(String cusListReturnInfo) {
        this.cusListReturnInfo = cusListReturnInfo;
    }

    /**
     * 获取国检电子清单状态
     *
     * @return ciq_message_status_list - 国检电子清单状态
     */
    public String getCiqMessageStatusList() {
        return ciqMessageStatusList;
    }

    /**
     * 设置国检电子清单状态
     *
     * @param ciqMessageStatusList 国检电子清单状态
     */
    public void setCiqMessageStatusList(String ciqMessageStatusList) {
        this.ciqMessageStatusList = ciqMessageStatusList;
    }

    /**
     * 获取国检清单回执内容
     *
     * @return ciq_list_return_info - 国检清单回执内容
     */
    public String getCiqListReturnInfo() {
        return ciqListReturnInfo;
    }

    /**
     * 设置国检清单回执内容
     *
     * @param ciqListReturnInfo 国检清单回执内容
     */
    public void setCiqListReturnInfo(String ciqListReturnInfo) {
        this.ciqListReturnInfo = ciqListReturnInfo;
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