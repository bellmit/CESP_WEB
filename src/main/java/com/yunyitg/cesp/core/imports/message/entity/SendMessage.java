package com.yunyitg.cesp.core.imports.message.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "send_message")
public class SendMessage {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 申报信息详情ID
     */
    @Column(name = "detail_id")
    private Integer detailId;

    /**
     * 申报企业ID
     */
    @Column(name = "decl_ent_id")
    private Integer declEntId;

    /**
     * 报文编号
     */
    @Column(name = "message_id")
    private String messageId;

    /**
     * 报文类型
     */
    @Column(name = "message_type")
    private String messageType;

    /**
     * 进出口标示(I-进口;E-出口)
     */
    @Column(name = "ie_flag")
    private String ieFlag;

    /**
     * 报文发送者标识
     */
    @Column(name = "sender")
    private String sender;

    /**
     * 报文接收人标识
     */
    @Column(name = "receiver")
    private String receiver;

    /**
     * 数据入库时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 报文发送时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 报送方式
     */
    @Column(name = "decl_mode")
    private String declMode;

    /**
     * 状态（0-未发送；1-待发送；2-发送成功；3-发送失败）
     */
    @Column(name = "status")
    private String status;

    /**
     * 报文发送结果描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 业务类型(CIQ/CUS/BOTH)
     */
    @Column(name = "function_code")
    private String functionCode;

    /**
     * 版本号（默认3.0）
     */
    @Column(name = "version")
    private String version;

    /**
     * 报文详情
     */
    @Column(name = "message_detail")
    private String messageDetail;

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
     * 获取申报信息详情ID
     *
     * @return detail_id - 申报信息详情ID
     */
    public Integer getDetailId() {
        return detailId;
    }

    /**
     * 设置申报信息详情ID
     *
     * @param detailId 申报信息详情ID
     */
    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
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
     * 获取报文类型
     *
     * @return message_type - 报文类型
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * 设置报文类型
     *
     * @param messageType 报文类型
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
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
     * 获取报文发送者标识
     *
     * @return sender - 报文发送者标识
     */
    public String getSender() {
        return sender;
    }

    /**
     * 设置报文发送者标识
     *
     * @param sender 报文发送者标识
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * 获取报文接收人标识
     *
     * @return receiver - 报文接收人标识
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置报文接收人标识
     *
     * @param receiver 报文接收人标识
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
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
     * 获取报文发送时间
     *
     * @return send_time - 报文发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置报文发送时间
     *
     * @param sendTime 报文发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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
     * 获取状态（0-未发送；1-待发送；2-发送成功；3-发送失败）
     *
     * @return status - 状态（0-未发送；1-待发送；2-发送成功；3-发送失败）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态（0-未发送；1-待发送；2-发送成功；3-发送失败）
     *
     * @param status 状态（0-未发送；1-待发送；2-发送成功；3-发送失败）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取报文发送结果描述
     *
     * @return description - 报文发送结果描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置报文发送结果描述
     *
     * @param description 报文发送结果描述
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取版本号（默认3.0）
     *
     * @return version - 版本号（默认3.0）
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号（默认3.0）
     *
     * @param version 版本号（默认3.0）
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取报文详情
     *
     * @return message_detail - 报文详情
     */
    public String getMessageDetail() {
        return messageDetail;
    }

    /**
     * 设置报文详情
     *
     * @param messageDetail 报文详情
     */
    public void setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
    }
}