package com.yunyitg.cesp.core.imports.list.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "elist_head")
public class ElistHead {
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
     * 所属电商企业ID
     */
    @Column(name = "eb_ent_id")
    private Integer ebEntId;

    /**
     * 电商平台互联网域名
     */
    @Column(name = "internet_domain_name")
    private String internetDomainName;

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
     * 申报口岸 关区代码
     */
    @Column(name = "apply_sea_port")
    private String applySeaPort;

    /**
     * 操作方式(A-新增M-变更D-删除)
     */
    @Column(name = "op_type")
    private String opType;

    /**
     * 贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)
     */
    @Column(name = "trade_mode")
    private String tradeMode;

    /**
     * 进出口标示(I-进口;E-出口)
     */
    @Column(name = "ie_flag")
    private String ieFlag;

    /**
     * 清单类型
     */
    @Column(name = "elist_type")
    private String elistType;

    /**
     * 清单总票数
     */
    @Column(name = "total_count")
    private Integer totalCount;

    /**
     * 总重量
     */
    @Column(name = "total_weight")
    private BigDecimal totalWeight;

    /**
     * 商品总件数
     */
    @Column(name = "total_pack_num")
    private Integer totalPackNum;

    /**
     * 总货值
     */
    @Column(name = "total_value")
    private BigDecimal totalValue;

    /**
     * 货币代码
     */
    @Column(name = "curr_code")
    private String currCode;

    /**
     * 申报时间
     */
    @Column(name = "decl_time")
    private Date declTime;

    /**
     * 录入日期
     */
    @Column(name = "input_date")
    private Date inputDate;

    /**
     * 录入员ID
     */
    @Column(name = "input_staff_id")
    private Integer inputStaffId;

    /**
     * 报关企业ID
     */
    @Column(name = "comp_access_id")
    private Integer compAccessId;

    /**
     * 报关员ID
     */
    @Column(name = "customs_declarer_id")
    private Integer customsDeclarerId;

    /**
     * 核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))
     */
    @Column(name = "check_documents")
    private String checkDocuments;

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
     * 关联清单详情id集合
     */
    @Column(name = "elist_detail_info_ids")
    private String elistDetailInfoIds;

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
     * 获取电商平台互联网域名
     *
     * @return internet_domain_name - 电商平台互联网域名
     */
    public String getInternetDomainName() {
        return internetDomainName;
    }

    /**
     * 设置电商平台互联网域名
     *
     * @param internetDomainName 电商平台互联网域名
     */
    public void setInternetDomainName(String internetDomainName) {
        this.internetDomainName = internetDomainName;
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
     * 获取申报口岸 关区代码
     *
     * @return apply_sea_port - 申报口岸 关区代码
     */
    public String getApplySeaPort() {
        return applySeaPort;
    }

    /**
     * 设置申报口岸 关区代码
     *
     * @param applySeaPort 申报口岸 关区代码
     */
    public void setApplySeaPort(String applySeaPort) {
        this.applySeaPort = applySeaPort;
    }

    /**
     * 获取操作方式(A-新增M-变更D-删除)
     *
     * @return op_type - 操作方式(A-新增M-变更D-删除)
     */
    public String getOpType() {
        return opType;
    }

    /**
     * 设置操作方式(A-新增M-变更D-删除)
     *
     * @param opType 操作方式(A-新增M-变更D-删除)
     */
    public void setOpType(String opType) {
        this.opType = opType;
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
     * 获取清单类型
     *
     * @return elist_type - 清单类型
     */
    public String getElistType() {
        return elistType;
    }

    /**
     * 设置清单类型
     *
     * @param elistType 清单类型
     */
    public void setElistType(String elistType) {
        this.elistType = elistType;
    }

    /**
     * 获取清单总票数
     *
     * @return total_count - 清单总票数
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 设置清单总票数
     *
     * @param totalCount 清单总票数
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取总重量
     *
     * @return total_weight - 总重量
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * 设置总重量
     *
     * @param totalWeight 总重量
     */
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * 获取商品总件数
     *
     * @return total_pack_num - 商品总件数
     */
    public Integer getTotalPackNum() {
        return totalPackNum;
    }

    /**
     * 设置商品总件数
     *
     * @param totalPackNum 商品总件数
     */
    public void setTotalPackNum(Integer totalPackNum) {
        this.totalPackNum = totalPackNum;
    }

    /**
     * 获取总货值
     *
     * @return total_value - 总货值
     */
    public BigDecimal getTotalValue() {
        return totalValue;
    }

    /**
     * 设置总货值
     *
     * @param totalValue 总货值
     */
    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * 获取货币代码
     *
     * @return curr_code - 货币代码
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * 设置货币代码
     *
     * @param currCode 货币代码
     */
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    /**
     * 获取申报时间
     *
     * @return decl_time - 申报时间
     */
    public Date getDeclTime() {
        return declTime;
    }

    /**
     * 设置申报时间
     *
     * @param declTime 申报时间
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
     * 获取录入员ID
     *
     * @return input_staff_id - 录入员ID
     */
    public Integer getInputStaffId() {
        return inputStaffId;
    }

    /**
     * 设置录入员ID
     *
     * @param inputStaffId 录入员ID
     */
    public void setInputStaffId(Integer inputStaffId) {
        this.inputStaffId = inputStaffId;
    }

    /**
     * 获取报关企业ID
     *
     * @return comp_access_id - 报关企业ID
     */
    public Integer getCompAccessId() {
        return compAccessId;
    }

    /**
     * 设置报关企业ID
     *
     * @param compAccessId 报关企业ID
     */
    public void setCompAccessId(Integer compAccessId) {
        this.compAccessId = compAccessId;
    }

    /**
     * 获取报关员ID
     *
     * @return customs_declarer_id - 报关员ID
     */
    public Integer getCustomsDeclarerId() {
        return customsDeclarerId;
    }

    /**
     * 设置报关员ID
     *
     * @param customsDeclarerId 报关员ID
     */
    public void setCustomsDeclarerId(Integer customsDeclarerId) {
        this.customsDeclarerId = customsDeclarerId;
    }

    /**
     * 获取核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))
     *
     * @return check_documents - 核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))
     */
    public String getCheckDocuments() {
        return checkDocuments;
    }

    /**
     * 设置核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))
     *
     * @param checkDocuments 核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))
     */
    public void setCheckDocuments(String checkDocuments) {
        this.checkDocuments = checkDocuments;
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
     * 获取关联清单详情id集合
     *
     * @return elist_detail_info_ids - 关联清单详情id集合
     */
    public String getElistDetailInfoIds() {
        return elistDetailInfoIds;
    }

    /**
     * 设置关联清单详情id集合
     *
     * @param elistDetailInfoIds 关联清单详情id集合
     */
    public void setElistDetailInfoIds(String elistDetailInfoIds) {
        this.elistDetailInfoIds = elistDetailInfoIds;
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