package com.yunyitg.cesp.core.imports.order.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 电子订单申报头  前端视图对象
 * @author yangyuantao
 *
 */
public class OrderHeadListVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 序号
	 */
	private Integer id;

	/**
	 * 平台接收事件
	 */
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createAt;

	/**
	 * 企业申报时间
	 */
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date declTime;

	/**
	 * 申报状态 （0-未申报；1-待申报；2-已申报；3-申报失败；4-接受成功；5-接受失败）
	 */
	private String declStatus;
	
	/**
	 * 申报状态描述
	 */
	public String declStatusDesc;

	/**
	 * 报文编号
	 */
	private String messageId;

	/**
	 * 报送方式 (HTTPS，EDI)
	 */
	private String declMode;

	/**
	 * 申报企业名称
	 */
	private String declEntName;

	/**
	 * 电商企业名称
	 */
	private String ebEntName;
	
	/**
	 * 电子运单编号
	 */
	private String waybillNo;
	
	/**
	 * 支付交易编号
	 */
	private String payNo;

	/**
	 * 是否报送海关标志
	 */
//	private String cusFlag;

	/**
	 * 是否报文国检标志
	 */
//	private String ciqFlag;
	
	/**
	 * 业务类型（CUS/CIQ/BOTH）
	 */
	private String functinCode;

	/**
	 * 主管海关代码
	 */
	private String customsCode;
	
	/**
	 * 主管海关名称
	 */
	private String customsName;

	/**
	 * 检验检验机构代码
	 */
	private String ciqOrgCode;
	
	/**
	 * 检验检疫机构名称
	 */
	private String ciqOrgName;

	public OrderHeadListVo() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getDeclTime() {
		return declTime;
	}

	public void setDeclTime(Date declTime) {
		this.declTime = declTime;
	}

	public String getDeclStatus() {
		return declStatus;
	}

	public void setDeclStatus(String declStatus) {
		this.declStatus = declStatus;
	}
	
	public String getDeclStatusDesc() {
		return declStatusDesc;
	}
	
	public void setDeclStatusDesc(String declStatusDesc) {
		this.declStatusDesc = declStatusDesc;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getDeclMode() {
		return declMode;
	}

	public void setDeclMode(String declMode) {
		this.declMode = declMode;
	}

	public String getDeclEntName() {
		return declEntName;
	}

	public void setDeclEntName(String declEntName) {
		this.declEntName = declEntName;
	}

	public String getEbEntName() {
		return ebEntName;
	}
	
	public void setEbEntName(String ebEntName) {
		this.ebEntName = ebEntName;
	}
	
	public String getWaybillNo() {
		return waybillNo;
	}
	
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}
	
	public String getPayNo() {
		return payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getFunctinCode() {
		return functinCode;
	}
	
	public void setFunctinCode(String functinCode) {
		this.functinCode = functinCode;
	}

	public String getCustomsCode() {
		return customsCode;
	}

	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}
	
	public String getCustomsName() {
		return customsName;
	}
	
	public void setCustomsName(String customsName) {
		this.customsName = customsName;
	}
	
	public String getCiqOrgCode() {
		return ciqOrgCode;
	}

	public void setCiqOrgCode(String ciqOrgCode) {
		this.ciqOrgCode = ciqOrgCode;
	}
	
	public String getCiqOrgName() {
		return ciqOrgName;
	}
	
	public void setCiqOrgName(String ciqOrgName) {
		this.ciqOrgName = ciqOrgName;
	}

}
