package com.yunyitg.cesp.core.imports.load.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "load_head")
public class LoadHead {
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
     * 物流企业id
     */
    @Column(name = "ehs_id")
    private Integer ehsId;

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
     * 总运单号
     */
    @Column(name = "top_log_no")
    private String topLogNo;

    /**
     * 进出口标志
     */
    @Column(name = "ie_flag")
    private String ieFlag;

    /**
     * 进出口岸代码
     */
    @Column(name = "ie_port")
    private String iePort;

    /**
     * 指运港/抵运港
     */
    @Column(name = "destination_port")
    private String destinationPort;

    /**
     * 总件数
     */
    @Column(name = "pack_no")
    private BigDecimal packNo;

    /**
     * 进出日期
     */
    @Column(name = "ie_date")
    private Date ieDate;

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
     * IC卡号
     */
    @Column(name = "app_uid")
    private String appUid;

    /**
     * 电子车牌
     */
    @Column(name = "car_ec_no")
    private String carEcNo;

    /**
     * 运输工具备案号
     */
    @Column(name = "ship_customs_no")
    private String shipCustomsNo;

    /**
     * 车次/航次
     */
    @Column(name = "voyage_no")
    private String voyageNo;

    /**
     * 提运单号
     */
    @Column(name = "bill_no")
    private String billNo;

    /**
     * 装载日期
     */
    @Column(name = "load_date")
    private Date loadDate;

    /**
     * 毛重/总重
     */
    @Column(name = "total_weight")
    private BigDecimal totalWeight;

    /**
     * 企业装载货物自编号
     */
    @Column(name = "ent_loading_no")
    private String entLoadingNo;

    /**
     * 公共平台装载清单受理号
     */
    @Column(name = "eport_loading_no")
    private String eportLoadingNo;

    /**
     * 检验检疫装载清单编号
     */
    @Column(name = "ciq_load_no")
    private String ciqLoadNo;

    /**
     * 海关装载清单编号
     */
    @Column(name = "cus_load_no")
    private String cusLoadNo;

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
     * 海关BBC货物装载清单状态
     */
    @Column(name = "cus_message_status_load")
    private String cusMessageStatusLoad;

    /**
     * 海关BBC货物装载清单回执内容
     */
    @Column(name = "cus_load_return_info")
    private String cusLoadReturnInfo;

    /**
     * 国检BBC货物装载清单状态
     */
    @Column(name = "ciq_message_status_load")
    private String ciqMessageStatusLoad;

    /**
     * 国检BBC货物装载清单回执内容
     */
    @Column(name = "ciq_load_return_info")
    private String ciqLoadReturnInfo;

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
     * 获取物流企业id
     *
     * @return ehs_id - 物流企业id
     */
    public Integer getEhsId() {
        return ehsId;
    }

    /**
     * 设置物流企业id
     *
     * @param ehsId 物流企业id
     */
    public void setEhsId(Integer ehsId) {
        this.ehsId = ehsId;
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
     * 获取总运单号
     *
     * @return top_log_no - 总运单号
     */
    public String getTopLogNo() {
        return topLogNo;
    }

    /**
     * 设置总运单号
     *
     * @param topLogNo 总运单号
     */
    public void setTopLogNo(String topLogNo) {
        this.topLogNo = topLogNo;
    }

    /**
     * 获取进出口标志
     *
     * @return ie_flag - 进出口标志
     */
    public String getIeFlag() {
        return ieFlag;
    }

    /**
     * 设置进出口标志
     *
     * @param ieFlag 进出口标志
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
     * 获取指运港/抵运港
     *
     * @return destination_port - 指运港/抵运港
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /**
     * 设置指运港/抵运港
     *
     * @param destinationPort 指运港/抵运港
     */
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * 获取总件数
     *
     * @return pack_no - 总件数
     */
    public BigDecimal getPackNo() {
        return packNo;
    }

    /**
     * 设置总件数
     *
     * @param packNo 总件数
     */
    public void setPackNo(BigDecimal packNo) {
        this.packNo = packNo;
    }

    /**
     * 获取进出日期
     *
     * @return ie_date - 进出日期
     */
    public Date getIeDate() {
        return ieDate;
    }

    /**
     * 设置进出日期
     *
     * @param ieDate 进出日期
     */
    public void setIeDate(Date ieDate) {
        this.ieDate = ieDate;
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
     * 获取IC卡号
     *
     * @return app_uid - IC卡号
     */
    public String getAppUid() {
        return appUid;
    }

    /**
     * 设置IC卡号
     *
     * @param appUid IC卡号
     */
    public void setAppUid(String appUid) {
        this.appUid = appUid;
    }

    /**
     * 获取电子车牌
     *
     * @return car_ec_no - 电子车牌
     */
    public String getCarEcNo() {
        return carEcNo;
    }

    /**
     * 设置电子车牌
     *
     * @param carEcNo 电子车牌
     */
    public void setCarEcNo(String carEcNo) {
        this.carEcNo = carEcNo;
    }

    /**
     * 获取运输工具备案号
     *
     * @return ship_customs_no - 运输工具备案号
     */
    public String getShipCustomsNo() {
        return shipCustomsNo;
    }

    /**
     * 设置运输工具备案号
     *
     * @param shipCustomsNo 运输工具备案号
     */
    public void setShipCustomsNo(String shipCustomsNo) {
        this.shipCustomsNo = shipCustomsNo;
    }

    /**
     * 获取车次/航次
     *
     * @return voyage_no - 车次/航次
     */
    public String getVoyageNo() {
        return voyageNo;
    }

    /**
     * 设置车次/航次
     *
     * @param voyageNo 车次/航次
     */
    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo;
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
     * 获取装载日期
     *
     * @return load_date - 装载日期
     */
    public Date getLoadDate() {
        return loadDate;
    }

    /**
     * 设置装载日期
     *
     * @param loadDate 装载日期
     */
    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    /**
     * 获取毛重/总重
     *
     * @return total_weight - 毛重/总重
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * 设置毛重/总重
     *
     * @param totalWeight 毛重/总重
     */
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * 获取企业装载货物自编号
     *
     * @return ent_loading_no - 企业装载货物自编号
     */
    public String getEntLoadingNo() {
        return entLoadingNo;
    }

    /**
     * 设置企业装载货物自编号
     *
     * @param entLoadingNo 企业装载货物自编号
     */
    public void setEntLoadingNo(String entLoadingNo) {
        this.entLoadingNo = entLoadingNo;
    }

    /**
     * 获取公共平台装载清单受理号
     *
     * @return eport_loading_no - 公共平台装载清单受理号
     */
    public String getEportLoadingNo() {
        return eportLoadingNo;
    }

    /**
     * 设置公共平台装载清单受理号
     *
     * @param eportLoadingNo 公共平台装载清单受理号
     */
    public void setEportLoadingNo(String eportLoadingNo) {
        this.eportLoadingNo = eportLoadingNo;
    }

    /**
     * 获取检验检疫装载清单编号
     *
     * @return ciq_load_no - 检验检疫装载清单编号
     */
    public String getCiqLoadNo() {
        return ciqLoadNo;
    }

    /**
     * 设置检验检疫装载清单编号
     *
     * @param ciqLoadNo 检验检疫装载清单编号
     */
    public void setCiqLoadNo(String ciqLoadNo) {
        this.ciqLoadNo = ciqLoadNo;
    }

    /**
     * 获取海关装载清单编号
     *
     * @return cus_load_no - 海关装载清单编号
     */
    public String getCusLoadNo() {
        return cusLoadNo;
    }

    /**
     * 设置海关装载清单编号
     *
     * @param cusLoadNo 海关装载清单编号
     */
    public void setCusLoadNo(String cusLoadNo) {
        this.cusLoadNo = cusLoadNo;
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
     * 获取海关BBC货物装载清单状态
     *
     * @return cus_message_status_load - 海关BBC货物装载清单状态
     */
    public String getCusMessageStatusLoad() {
        return cusMessageStatusLoad;
    }

    /**
     * 设置海关BBC货物装载清单状态
     *
     * @param cusMessageStatusLoad 海关BBC货物装载清单状态
     */
    public void setCusMessageStatusLoad(String cusMessageStatusLoad) {
        this.cusMessageStatusLoad = cusMessageStatusLoad;
    }

    /**
     * 获取海关BBC货物装载清单回执内容
     *
     * @return cus_load_return_info - 海关BBC货物装载清单回执内容
     */
    public String getCusLoadReturnInfo() {
        return cusLoadReturnInfo;
    }

    /**
     * 设置海关BBC货物装载清单回执内容
     *
     * @param cusLoadReturnInfo 海关BBC货物装载清单回执内容
     */
    public void setCusLoadReturnInfo(String cusLoadReturnInfo) {
        this.cusLoadReturnInfo = cusLoadReturnInfo;
    }

    /**
     * 获取国检BBC货物装载清单状态
     *
     * @return ciq_message_status_load - 国检BBC货物装载清单状态
     */
    public String getCiqMessageStatusLoad() {
        return ciqMessageStatusLoad;
    }

    /**
     * 设置国检BBC货物装载清单状态
     *
     * @param ciqMessageStatusLoad 国检BBC货物装载清单状态
     */
    public void setCiqMessageStatusLoad(String ciqMessageStatusLoad) {
        this.ciqMessageStatusLoad = ciqMessageStatusLoad;
    }

    /**
     * 获取国检BBC货物装载清单回执内容
     *
     * @return ciq_load_return_info - 国检BBC货物装载清单回执内容
     */
    public String getCiqLoadReturnInfo() {
        return ciqLoadReturnInfo;
    }

    /**
     * 设置国检BBC货物装载清单回执内容
     *
     * @param ciqLoadReturnInfo 国检BBC货物装载清单回执内容
     */
    public void setCiqLoadReturnInfo(String ciqLoadReturnInfo) {
        this.ciqLoadReturnInfo = ciqLoadReturnInfo;
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