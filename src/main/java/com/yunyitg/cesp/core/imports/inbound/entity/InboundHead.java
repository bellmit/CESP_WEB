package com.yunyitg.cesp.core.imports.inbound.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * 进仓清单申报头 信息
 * @author yangyuantao
 *
 */
@Table(name = "inbound_head")
public class InboundHead {
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
     * 企业自编号（可以是总运单号）
     */
    @Column(name = "ent_inbound_no")
    private String entInboundNo;

    /**
     * 公共平台入仓编号
     */
    @Column(name = "eport_inbound_no")
    private String eportInboundNo;

    /**
     * 检验检疫入仓编号
     */
    @Column(name = "ciq_inbound_no")
    private String ciqInboundNo;

    /**
     * 海关入仓编号
     */
    @Column(name = "cis_inbound_no")
    private String cisInboundNo;

    /**
     * 货物存放地（填在检验检疫申请到的仓库编号）
     */
    @Column(name = "discharge_place")
    private String dischargePlace;

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
     * 对应单据类型（0-报关单　1-进口转关单　2-出口转关单；）
     */
    @Column(name = "corr_doc_type")
    private String corrDocType;

    /**
     * 账册编号
     */
    @Column(name = "ems_no")
    private String emsNo;

    /**
     * 监管方式
     */
    @Column(name = "trade_mode")
    private String tradeMode;

    /**
     * 收货人（填写保税进口商名称。非具体货物的收货人）
     */
    @Column(name = "recipient")
    private String recipient;

    /**
     * 发货人（填写境外交易人名称。非具体货物的发货人）
     */
    @Column(name = "shipper")
    private String shipper;

    /**
     * 进境口岸（检验检疫口岸代码，具体哪个现场就填哪个口岸代码）
     */
    @Column(name = "inbound_port")
    private String inboundPort;

    /**
     * 起抵国（国家代码）
     */
    @Column(name = "country_code")
    private String countryCode;

    /**
     * 进出仓日期
     */
    @Column(name = "inbound_date")
    private Date inboundDate;

    /**
     * 录入日期
     */
    @Column(name = "input_date")
    private Date inputDate;

    /**
     * 操作方式(A-新增M-变更D-删除)
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
     * 获取企业自编号（可以是总运单号）
     *
     * @return ent_inbound_no - 企业自编号（可以是总运单号）
     */
    public String getEntInboundNo() {
        return entInboundNo;
    }

    /**
     * 设置企业自编号（可以是总运单号）
     *
     * @param entInboundNo 企业自编号（可以是总运单号）
     */
    public void setEntInboundNo(String entInboundNo) {
        this.entInboundNo = entInboundNo;
    }

    /**
     * 获取公共平台入仓编号
     *
     * @return eport_inbound_no - 公共平台入仓编号
     */
    public String getEportInboundNo() {
        return eportInboundNo;
    }

    /**
     * 设置公共平台入仓编号
     *
     * @param eportInboundNo 公共平台入仓编号
     */
    public void setEportInboundNo(String eportInboundNo) {
        this.eportInboundNo = eportInboundNo;
    }

    /**
     * 获取检验检疫入仓编号
     *
     * @return ciq_inbound_no - 检验检疫入仓编号
     */
    public String getCiqInboundNo() {
        return ciqInboundNo;
    }

    /**
     * 设置检验检疫入仓编号
     *
     * @param ciqInboundNo 检验检疫入仓编号
     */
    public void setCiqInboundNo(String ciqInboundNo) {
        this.ciqInboundNo = ciqInboundNo;
    }

    /**
     * 获取海关入仓编号
     *
     * @return cis_inbound_no - 海关入仓编号
     */
    public String getCisInboundNo() {
        return cisInboundNo;
    }

    /**
     * 设置海关入仓编号
     *
     * @param cisInboundNo 海关入仓编号
     */
    public void setCisInboundNo(String cisInboundNo) {
        this.cisInboundNo = cisInboundNo;
    }

    /**
     * 获取货物存放地（填在检验检疫申请到的仓库编号）
     *
     * @return discharge_place - 货物存放地（填在检验检疫申请到的仓库编号）
     */
    public String getDischargePlace() {
        return dischargePlace;
    }

    /**
     * 设置货物存放地（填在检验检疫申请到的仓库编号）
     *
     * @param dischargePlace 货物存放地（填在检验检疫申请到的仓库编号）
     */
    public void setDischargePlace(String dischargePlace) {
        this.dischargePlace = dischargePlace;
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
     * 获取对应单据类型（0-报关单　1-进口转关单　2-出口转关单；）
     *
     * @return corr_doc_type - 对应单据类型（0-报关单　1-进口转关单　2-出口转关单；）
     */
    public String getCorrDocType() {
        return corrDocType;
    }

    /**
     * 设置对应单据类型（0-报关单　1-进口转关单　2-出口转关单；）
     *
     * @param corrDocType 对应单据类型（0-报关单　1-进口转关单　2-出口转关单；）
     */
    public void setCorrDocType(String corrDocType) {
        this.corrDocType = corrDocType;
    }

    /**
     * 获取账册编号
     *
     * @return ems_no - 账册编号
     */
    public String getEmsNo() {
        return emsNo;
    }

    /**
     * 设置账册编号
     *
     * @param emsNo 账册编号
     */
    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo;
    }

    /**
     * 获取监管方式
     *
     * @return trade_mode - 监管方式
     */
    public String getTradeMode() {
        return tradeMode;
    }

    /**
     * 设置监管方式
     *
     * @param tradeMode 监管方式
     */
    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

    /**
     * 获取收货人（填写保税进口商名称。非具体货物的收货人）
     *
     * @return recipient - 收货人（填写保税进口商名称。非具体货物的收货人）
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * 设置收货人（填写保税进口商名称。非具体货物的收货人）
     *
     * @param recipient 收货人（填写保税进口商名称。非具体货物的收货人）
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * 获取发货人（填写境外交易人名称。非具体货物的发货人）
     *
     * @return shipper - 发货人（填写境外交易人名称。非具体货物的发货人）
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * 设置发货人（填写境外交易人名称。非具体货物的发货人）
     *
     * @param shipper 发货人（填写境外交易人名称。非具体货物的发货人）
     */
    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    /**
     * 获取进境口岸（检验检疫口岸代码，具体哪个现场就填哪个口岸代码）
     *
     * @return inbound_port - 进境口岸（检验检疫口岸代码，具体哪个现场就填哪个口岸代码）
     */
    public String getInboundPort() {
        return inboundPort;
    }

    /**
     * 设置进境口岸（检验检疫口岸代码，具体哪个现场就填哪个口岸代码）
     *
     * @param inboundPort 进境口岸（检验检疫口岸代码，具体哪个现场就填哪个口岸代码）
     */
    public void setInboundPort(String inboundPort) {
        this.inboundPort = inboundPort;
    }

    /**
     * 获取起抵国（国家代码）
     *
     * @return country_code - 起抵国（国家代码）
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置起抵国（国家代码）
     *
     * @param countryCode 起抵国（国家代码）
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 获取进出仓日期
     *
     * @return inbound_date - 进出仓日期
     */
    public Date getInboundDate() {
        return inboundDate;
    }

    /**
     * 设置进出仓日期
     *
     * @param inboundDate 进出仓日期
     */
    public void setInboundDate(Date inboundDate) {
        this.inboundDate = inboundDate;
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