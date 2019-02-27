package com.yunyitg.cesp.core.imports.order.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.yunyitg.cesp.common.dto.BaseQueryDTO;

/**
 * 订单申报头查询  条件数据对象
 * @author yangyuantao
 *
 */
public class OrderHeadQueryDto extends BaseQueryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 企业报文发送时间（申报时间）起
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date declTimeFrom;
	
	/**
	 * 企业报文发送时间末
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date declTimeTo;
	
	/**
	 * 申报状态 （0-未申报；1-待申报；2-已申报；3-申报失败；4-接受成功；5-接受失败）
	 */
	private String declStatus;
	
	/**
	 * 报送方式 （EDI报文/HTTPS报文）
	 */
	private String declMode;
	
	/**
	 * 电商企业编号
	 */
	private String ebEntNo;
	
	/**
	 * 电商企业名称
	 */
	private String ebEntName;
	
	/**
	 * 申报企业编号
	 */
	private String declEntNo;
	
	/**
	 * 申报企业名称
	 */
	private String declEntName;
	
	/**
	 * 业务类型 （CUS/CIQ/BOTH)）
	 */
	private String functionCode;
	
	/**
	 * 主管海关
	 */
	private String customsCode;
	
	/**
	 * 检验检疫机构
	 */
	private String ciqOrgCode;
	
	public OrderHeadQueryDto() {
		// TODO Auto-generated constructor stub
	}

	public Date getDeclTimeFrom() {
		return declTimeFrom;
	}

	public void setDeclTimeFrom(Date declTimeFrom) {
		this.declTimeFrom = declTimeFrom;
	}

	public Date getDeclTimeTo() {
		return declTimeTo;
	}

	public void setDeclTimeTo(Date declTimeTo) {
		this.declTimeTo = declTimeTo;
	}

	public String getDeclStatus() {
		return declStatus;
	}

	public void setDeclStatus(String declStatus) {
		this.declStatus = declStatus;
	}

	public String getDeclMode() {
		return declMode;
	}

	public void setDeclMode(String declMode) {
		this.declMode = declMode;
	}

	public String getEbEntNo() {
		return ebEntNo;
	}

	public void setEbEntNo(String ebEntNo) {
		this.ebEntNo = ebEntNo;
	}

	public String getEbEntName() {
		return ebEntName;
	}

	public void setEbEntName(String ebEntName) {
		this.ebEntName = ebEntName;
	}

	public String getDeclEntNo() {
		return declEntNo;
	}

	public void setDeclEntNo(String declEntNo) {
		this.declEntNo = declEntNo;
	}

	public String getDeclEntName() {
		return declEntName;
	}

	public void setDeclEntName(String declEntName) {
		this.declEntName = declEntName;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getCustomsCode() {
		return customsCode;
	}

	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}

	public String getCiqOrgCode() {
		return ciqOrgCode;
	}

	public void setCiqOrgCode(String ciqOrgCode) {
		this.ciqOrgCode = ciqOrgCode;
	}
	
}
