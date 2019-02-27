package com.yunyitg.cesp.core.imports.logistics.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "logistics_head")
public class LogisticsHead {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 申报企业ID
     */
    @Column(name = "decl_ent_id")
    private Integer declEntId;

    /**
     * 所属物流企业ID
     */
    @Column(name = "ehs_ent_id")
    private Integer ehsEntId;

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
     * 总运单号(BC业务填写转关单号；BBC业务企业自编号)
     */
    @Column(name = "ent_loading_no")
    private String entLoadingNo;

    /**
     * 总运单类型（1：转关单，2: 舱单）
     */
    @Column(name = "bill_type")
    private String billType;

    /**
     * 进出口标志（I-进口；E-出口）
     */
    @Column(name = "ie_flag")
    private String ieFlag;

    /**
     * 进出口岸代码
     */
    @Column(name = "ie_port")
    private String iePort;

    /**
     * 指运港/抵运港代码
     */
    @Column(name = "destination_port")
    private String destinationPort;

    /**
     * 总件数(运单数据累加)
     */
    @Column(name = "pack_no")
    private BigDecimal packNo;

    /**
     * 毛重/总重
     */
    @Column(name = "gross_weight")
    private BigDecimal grossWeight;

    /**
     * 进出口日期
     */
    @Column(name = "ie_date")
    private Date ieDate;

    /**
     * 业务类型
     */
    @Column(name = "app_type")
    private String appType;

    /**
     * 运输方式
     */
    @Column(name = "traf_mode")
    private String trafMode;

    /**
     * 运输工具，车牌号
     */
    @Column(name = "tran_no")
    private String tranNo;

    /**
     * IC卡号，预留字段
     */
    @Column(name = "app_uid")
    private String appUid;

    /**
     * 电子车牌，预留字段
     */
    @Column(name = "car_ec_no")
    private String carEcNo;

    /**
     * 运输工具备案号，预留字段
     */
    @Column(name = "ship_custom_no")
    private String shipCustomNo;

    /**
     * 车次/航次
     */
    @Column(name = "vayage_no")
    private String vayageNo;

    /**
     * 提运单号
     */
    @Column(name = "bill_no")
    private String billNo;

    /**
     * 监管点（四位海关代码+两位序号）
     */
    @Column(name = "loc_code")
    private String locCode;

    /**
     * 卸货库位
     */
    @Column(name = "unload_location")
    private String unloadLocation;

    /**
     * 装载时间
     */
    @Column(name = "load_date")
    private Date loadDate;

    /**
     * 申报日期
     */
    @Column(name = "decl_time")
    private Date declTime;

    /**
     * 录入日期
     */
    @Column(name = "input_date")
    private Date inputDate;

    /**
     * 操作方式(A-新增M-变更D-取消)
     */
    @Column(name = "op_type")
    private String opType;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 申报状态
     */
    @Column(name = "decl_status")
    private String declStatus;

    /**
     * 报送方式
     */
    @Column(name = "decl_mode")
    private String declMode;

    /**
     * 报文编号
     */
    @Column(name = "message_id")
    private String messageId;

    /**
     * 业务类型(CIQ/CUS/BOTH)
     */
    @Column(name = "function_code")
    private String functionCode;

    /**
     * 关联集中申报表头ID
     */
    @Column(name = "central_id")
    private Integer centralId;

    /**
     * 海关入区总运单状态
     */
    @Column(name = "cus_message_status_logistics")
    private String cusMessageStatusLogistics;

    /**
     * 海关入区总运单回执内容
     */
    @Column(name = "cus_logistics_return_info")
    private String cusLogisticsReturnInfo;

    /**
     * 国检入区总运单状态
     */
    @Column(name = "ciq_message_status_logistics")
    private String ciqMessageStatusLogistics;

    /**
     * 国检入区总运单回执内容
     */
    @Column(name = "ciq_logistics_return_info")
    private String ciqLogisticsReturnInfo;

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
     * 获取总运单号(BC业务填写转关单号；BBC业务企业自编号)
     *
     * @return ent_loading_no - 总运单号(BC业务填写转关单号；BBC业务企业自编号)
     */
    public String getEntLoadingNo() {
        return entLoadingNo;
    }

    /**
     * 设置总运单号(BC业务填写转关单号；BBC业务企业自编号)
     *
     * @param entLoadingNo 总运单号(BC业务填写转关单号；BBC业务企业自编号)
     */
    public void setEntLoadingNo(String entLoadingNo) {
        this.entLoadingNo = entLoadingNo;
    }

    /**
     * 获取总运单类型（1：转关单，2: 舱单）
     *
     * @return bill_type - 总运单类型（1：转关单，2: 舱单）
     */
    public String getBillType() {
        return billType;
    }

    /**
     * 设置总运单类型（1：转关单，2: 舱单）
     *
     * @param billType 总运单类型（1：转关单，2: 舱单）
     */
    public void setBillType(String billType) {
        this.billType = billType;
    }

    /**
     * 获取进出口标志（I-进口；E-出口）
     *
     * @return ie_flag - 进出口标志（I-进口；E-出口）
     */
    public String getIeFlag() {
        return ieFlag;
    }

    /**
     * 设置进出口标志（I-进口；E-出口）
     *
     * @param ieFlag 进出口标志（I-进口；E-出口）
     */
    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag;
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
     * 获取指运港/抵运港代码
     *
     * @return destination_port - 指运港/抵运港代码
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /**
     * 设置指运港/抵运港代码
     *
     * @param destinationPort 指运港/抵运港代码
     */
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * 获取总件数(运单数据累加)
     *
     * @return pack_no - 总件数(运单数据累加)
     */
    public BigDecimal getPackNo() {
        return packNo;
    }

    /**
     * 设置总件数(运单数据累加)
     *
     * @param packNo 总件数(运单数据累加)
     */
    public void setPackNo(BigDecimal packNo) {
        this.packNo = packNo;
    }

    /**
     * 获取毛重/总重
     *
     * @return gross_weight - 毛重/总重
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * 设置毛重/总重
     *
     * @param grossWeight 毛重/总重
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
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
     * 获取业务类型
     *
     * @return app_type - 业务类型
     */
    public String getAppType() {
        return appType;
    }

    /**
     * 设置业务类型
     *
     * @param appType 业务类型
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * 获取运输方式
     *
     * @return traf_mode - 运输方式
     */
    public String getTrafMode() {
        return trafMode;
    }

    /**
     * 设置运输方式
     *
     * @param trafMode 运输方式
     */
    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }

    /**
     * 获取运输工具，车牌号
     *
     * @return tran_no - 运输工具，车牌号
     */
    public String getTranNo() {
        return tranNo;
    }

    /**
     * 设置运输工具，车牌号
     *
     * @param tranNo 运输工具，车牌号
     */
    public void setTranNo(String tranNo) {
        this.tranNo = tranNo;
    }

    /**
     * 获取IC卡号，预留字段
     *
     * @return app_uid - IC卡号，预留字段
     */
    public String getAppUid() {
        return appUid;
    }

    /**
     * 设置IC卡号，预留字段
     *
     * @param appUid IC卡号，预留字段
     */
    public void setAppUid(String appUid) {
        this.appUid = appUid;
    }

    /**
     * 获取电子车牌，预留字段
     *
     * @return car_ec_no - 电子车牌，预留字段
     */
    public String getCarEcNo() {
        return carEcNo;
    }

    /**
     * 设置电子车牌，预留字段
     *
     * @param carEcNo 电子车牌，预留字段
     */
    public void setCarEcNo(String carEcNo) {
        this.carEcNo = carEcNo;
    }

    /**
     * 获取运输工具备案号，预留字段
     *
     * @return ship_custom_no - 运输工具备案号，预留字段
     */
    public String getShipCustomNo() {
        return shipCustomNo;
    }

    /**
     * 设置运输工具备案号，预留字段
     *
     * @param shipCustomNo 运输工具备案号，预留字段
     */
    public void setShipCustomNo(String shipCustomNo) {
        this.shipCustomNo = shipCustomNo;
    }

    /**
     * 获取车次/航次
     *
     * @return vayage_no - 车次/航次
     */
    public String getVayageNo() {
        return vayageNo;
    }

    /**
     * 设置车次/航次
     *
     * @param vayageNo 车次/航次
     */
    public void setVayageNo(String vayageNo) {
        this.vayageNo = vayageNo;
    }

    /**
     * 获取提运单号
     *
     * @return bill_no - 提运单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置提运单号
     *
     * @param billNo 提运单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 获取监管点（四位海关代码+两位序号）
     *
     * @return loc_code - 监管点（四位海关代码+两位序号）
     */
    public String getLocCode() {
        return locCode;
    }

    /**
     * 设置监管点（四位海关代码+两位序号）
     *
     * @param locCode 监管点（四位海关代码+两位序号）
     */
    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    /**
     * 获取卸货库位
     *
     * @return unload_location - 卸货库位
     */
    public String getUnloadLocation() {
        return unloadLocation;
    }

    /**
     * 设置卸货库位
     *
     * @param unloadLocation 卸货库位
     */
    public void setUnloadLocation(String unloadLocation) {
        this.unloadLocation = unloadLocation;
    }

    /**
     * 获取装载时间
     *
     * @return load_date - 装载时间
     */
    public Date getLoadDate() {
        return loadDate;
    }

    /**
     * 设置装载时间
     *
     * @param loadDate 装载时间
     */
    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    /**
     * 获取申报日期
     *
     * @return decl_time - 申报日期
     */
    public Date getDeclTime() {
        return declTime;
    }

    /**
     * 设置申报日期
     *
     * @param declTime 申报日期
     */
    public void setDeclTime(Date declTime) {
        this.declTime = declTime;
    }

    /**
     * 获取录入日期
     *
     * @return input_date - 录入日期
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * 设置录入日期
     *
     * @param inputDate 录入日期
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    /**
     * 获取操作方式(A-新增M-变更D-取消)
     *
     * @return op_type - 操作方式(A-新增M-变更D-取消)
     */
    public String getOpType() {
        return opType;
    }

    /**
     * 设置操作方式(A-新增M-变更D-取消)
     *
     * @param opType 操作方式(A-新增M-变更D-取消)
     */
    public void setOpType(String opType) {
        this.opType = opType;
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
     * 获取申报状态
     *
     * @return decl_status - 申报状态
     */
    public String getDeclStatus() {
        return declStatus;
    }

    /**
     * 设置申报状态
     *
     * @param declStatus 申报状态
     */
    public void setDeclStatus(String declStatus) {
        this.declStatus = declStatus;
    }

    /**
     * 获取报送方式
     *
     * @return decl_mode - 报送方式
     */
    public String getDeclMode() {
        return declMode;
    }

    /**
     * 设置报送方式
     *
     * @param declMode 报送方式
     */
    public void setDeclMode(String declMode) {
        this.declMode = declMode;
    }

    /**
     * 获取报文编号
     *
     * @return message_id - 报文编号
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * 设置报文编号
     *
     * @param messageId 报文编号
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * 获取业务类型(CIQ/CUS/BOTH)
     *
     * @return function_code - 业务类型(CIQ/CUS/BOTH)
     */
    public String getFunctionCode() {
        return functionCode;
    }

    /**
     * 设置业务类型(CIQ/CUS/BOTH)
     *
     * @param functionCode 业务类型(CIQ/CUS/BOTH)
     */
    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * 获取关联集中申报表头ID
     *
     * @return central_id - 关联集中申报表头ID
     */
    public Integer getCentralId() {
        return centralId;
    }

    /**
     * 设置关联集中申报表头ID
     *
     * @param centralId 关联集中申报表头ID
     */
    public void setCentralId(Integer centralId) {
        this.centralId = centralId;
    }

    /**
     * 获取海关入区总运单状态
     *
     * @return cus_message_status_logistics - 海关入区总运单状态
     */
    public String getCusMessageStatusLogistics() {
        return cusMessageStatusLogistics;
    }

    /**
     * 设置海关入区总运单状态
     *
     * @param cusMessageStatusLogistics 海关入区总运单状态
     */
    public void setCusMessageStatusLogistics(String cusMessageStatusLogistics) {
        this.cusMessageStatusLogistics = cusMessageStatusLogistics;
    }

    /**
     * 获取海关入区总运单回执内容
     *
     * @return cus_logistics_return_info - 海关入区总运单回执内容
     */
    public String getCusLogisticsReturnInfo() {
        return cusLogisticsReturnInfo;
    }

    /**
     * 设置海关入区总运单回执内容
     *
     * @param cusLogisticsReturnInfo 海关入区总运单回执内容
     */
    public void setCusLogisticsReturnInfo(String cusLogisticsReturnInfo) {
        this.cusLogisticsReturnInfo = cusLogisticsReturnInfo;
    }

    /**
     * 获取国检入区总运单状态
     *
     * @return ciq_message_status_logistics - 国检入区总运单状态
     */
    public String getCiqMessageStatusLogistics() {
        return ciqMessageStatusLogistics;
    }

    /**
     * 设置国检入区总运单状态
     *
     * @param ciqMessageStatusLogistics 国检入区总运单状态
     */
    public void setCiqMessageStatusLogistics(String ciqMessageStatusLogistics) {
        this.ciqMessageStatusLogistics = ciqMessageStatusLogistics;
    }

    /**
     * 获取国检入区总运单回执内容
     *
     * @return ciq_logistics_return_info - 国检入区总运单回执内容
     */
    public String getCiqLogisticsReturnInfo() {
        return ciqLogisticsReturnInfo;
    }

    /**
     * 设置国检入区总运单回执内容
     *
     * @param ciqLogisticsReturnInfo 国检入区总运单回执内容
     */
    public void setCiqLogisticsReturnInfo(String ciqLogisticsReturnInfo) {
        this.ciqLogisticsReturnInfo = ciqLogisticsReturnInfo;
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