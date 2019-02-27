package com.yunyitg.cesp.core.imports.goods.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "goods_reg_head")
public class GoodsRegHead {
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
     * 操作方式(A-新增M-变更D-删除)
     */
    @Column(name = "op_type")
    private String opType;

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
     * 所属电商平台ID
     */
    @Column(name = "ebp_ent_id")
    private Integer ebpEntId;

    /**
     * 币制代码
     */
    @Column(name = "curr_code")
    private String currCode;

    /**
     * 跨境业务类型（1-特殊监管区域BBC保税进口；2-保税仓库BBC保税进口；3-BC直购进口；）
     */
    @Column(name = "business_type")
    private String businessType;

    /**
     * 录入日期
     */
    @Column(name = "input_date")
    private Date inputDate;

    /**
     * 申报时间
     */
    @Column(name = "decl_time")
    private Date declTime;

    /**
     * 进出口标示(I-进口;E-出口)
     */
    @Column(name = "ie_flag")
    private String ieFlag;

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
     * 获取币制代码
     *
     * @return curr_code - 币制代码
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * 设置币制代码
     *
     * @param currCode 币制代码
     */
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    /**
     * 获取跨境业务类型（1-特殊监管区域BBC保税进口；2-保税仓库BBC保税进口；3-BC直购进口；）
     *
     * @return business_type - 跨境业务类型（1-特殊监管区域BBC保税进口；2-保税仓库BBC保税进口；3-BC直购进口；）
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置跨境业务类型（1-特殊监管区域BBC保税进口；2-保税仓库BBC保税进口；3-BC直购进口；）
     *
     * @param businessType 跨境业务类型（1-特殊监管区域BBC保税进口；2-保税仓库BBC保税进口；3-BC直购进口；）
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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