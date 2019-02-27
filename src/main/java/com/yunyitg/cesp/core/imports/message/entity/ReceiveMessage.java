package com.yunyitg.cesp.core.imports.message.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "receive_message")
public class ReceiveMessage {
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
     * 业务编号（企业内部唯一编号）
     */
    @Column(name = "business_no")
    private String businessNo;

    /**
     * 回执报文编号
     */
    @Column(name = "message_id")
    private String messageId;

    /**
     * 报文类型
     */
    @Column(name = "message_type")
    private String messageType;

    /**
     * 旧（申报）报文类型
     */
    @Column(name = "org_message_type")
    private String orgMessageType;

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
     * 接收时间
     */
    @Column(name = "receive_time")
    private Date receiveTime;

    /**
     * 处理时间
     */
    @Column(name = "deal_time")
    private Date dealTime;

    /**
     * 回执返回方（01-平台，02-海关，03-国检）
     */
    @Column(name = "response_by")
    private String responseBy;

    /**
     * 回执状态编码
     */
    @Column(name = "return_status")
    private String returnStatus;

    /**
     * 回执接收信息
     */
    @Column(name = "return_info")
    private String returnInfo;

    /**
     * 标识这份回执是否被成功处理(0-未处理，1-待处理，2-已处理，3-处理失败)
     */
    @Column(name = "result")
    private String result;

    /**
     * 回执处理结果描述
     */
    @Column(name = "description")
    private String description;

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
     * 获取业务编号（企业内部唯一编号）
     *
     * @return business_no - 业务编号（企业内部唯一编号）
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * 设置业务编号（企业内部唯一编号）
     *
     * @param businessNo 业务编号（企业内部唯一编号）
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    /**
     * 获取回执报文编号
     *
     * @return message_id - 回执报文编号
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * 设置回执报文编号
     *
     * @param messageId 回执报文编号
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
     * 获取旧（申报）报文类型
     *
     * @return org_message_type - 旧（申报）报文类型
     */
    public String getOrgMessageType() {
        return orgMessageType;
    }

    /**
     * 设置旧（申报）报文类型
     *
     * @param orgMessageType 旧（申报）报文类型
     */
    public void setOrgMessageType(String orgMessageType) {
        this.orgMessageType = orgMessageType;
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
     * 获取接收时间
     *
     * @return receive_time - 接收时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置接收时间
     *
     * @param receiveTime 接收时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取处理时间
     *
     * @return deal_time - 处理时间
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * 设置处理时间
     *
     * @param dealTime 处理时间
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * 获取回执返回方（01-平台，02-海关，03-国检）
     *
     * @return response_by - 回执返回方（01-平台，02-海关，03-国检）
     */
    public String getResponseBy() {
        return responseBy;
    }

    /**
     * 设置回执返回方（01-平台，02-海关，03-国检）
     *
     * @param responseBy 回执返回方（01-平台，02-海关，03-国检）
     */
    public void setResponseBy(String responseBy) {
        this.responseBy = responseBy;
    }

    /**
     * 获取回执状态编码
     *
     * @return return_status - 回执状态编码
     */
    public String getReturnStatus() {
        return returnStatus;
    }

    /**
     * 设置回执状态编码
     *
     * @param returnStatus 回执状态编码
     */
    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    /**
     * 获取回执接收信息
     *
     * @return return_info - 回执接收信息
     */
    public String getReturnInfo() {
        return returnInfo;
    }

    /**
     * 设置回执接收信息
     *
     * @param returnInfo 回执接收信息
     */
    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo;
    }

    /**
     * 获取标识这份回执是否被成功处理(0-未处理，1-待处理，2-已处理，3-处理失败)
     *
     * @return result - 标识这份回执是否被成功处理(0-未处理，1-待处理，2-已处理，3-处理失败)
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置标识这份回执是否被成功处理(0-未处理，1-待处理，2-已处理，3-处理失败)
     *
     * @param result 标识这份回执是否被成功处理(0-未处理，1-待处理，2-已处理，3-处理失败)
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取回执处理结果描述
     *
     * @return description - 回执处理结果描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置回执处理结果描述
     *
     * @param description 回执处理结果描述
     */
    public void setDescription(String description) {
        this.description = description;
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