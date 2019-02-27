package com.yunyitg.cesp.core.company.vo;

import java.io.Serializable;
import java.util.List;

import com.yunyitg.cesp.core.company.entity.FtpAccount;
import com.yunyitg.cesp.core.company.entity.HttpAccount;
import com.yunyitg.cesp.core.company.entity.Qualification;

/**
 * 企业属性展示 视图对象
 * @author yangyuantao
 *
 */
public class CompanyVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String gzeportCode;

	private String name;

	private String ediCode;

	private String dxpId;

	private String cusCode;

	private String ciqCode;

	private String internetDomainName;

	private String contact;

	private String telephone;

	private String address;

	private String email;

	private String note;
	
	/**
	 * 企业类别（角色）
	 */
	private List<Qualification> qualifications;
	
	/**
	 * ftp传输通道账户
	 */
	private FtpAccount ftpAccount;
	
	/**
	 * http传输通道账户
	 */
	private HttpAccount httpAccount;
	
	public CompanyVo() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGzeportCode() {
		return gzeportCode;
	}

	public void setGzeportCode(String gzeportCode) {
		this.gzeportCode = gzeportCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEdiCode() {
		return ediCode;
	}

	public void setEdiCode(String ediCode) {
		this.ediCode = ediCode;
	}

	public String getDxpId() {
		return dxpId;
	}

	public void setDxpId(String dxpId) {
		this.dxpId = dxpId;
	}

	public String getCusCode() {
		return cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	public String getCiqCode() {
		return ciqCode;
	}

	public void setCiqCode(String ciqCode) {
		this.ciqCode = ciqCode;
	}

	public String getInternetDomainName() {
		return internetDomainName;
	}

	public void setInternetDomainName(String internetDomainName) {
		this.internetDomainName = internetDomainName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public FtpAccount getFtpAccount() {
		return ftpAccount;
	}

	public void setFtpAccount(FtpAccount ftpAccount) {
		this.ftpAccount = ftpAccount;
	}

	public HttpAccount getHttpAccount() {
		return httpAccount;
	}

	public void setHttpAccount(HttpAccount httpAccount) {
		this.httpAccount = httpAccount;
	}
	
}
