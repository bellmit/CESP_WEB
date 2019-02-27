package com.yunyitg.cesp.core.company.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * 企业实体  新增（添加）表单数据对象
 * @author yangyuantao
 *
 */
public class CompanyInsertDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "企业电子口岸（单一窗口）【gzeportCode】备案号不能为空")
	private String gzeportCode;

	@NotBlank(message = "企业名称【name】不能为空")
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
     * 企业类别集合
     */
    @NotNull(message = "企业类别【qualifications】不能为空")
    List<Integer> qualifications;
    
    public CompanyInsertDto() {
		// TODO Auto-generated constructor stub
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

	public List<Integer> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Integer> qualifications) {
		this.qualifications = qualifications;
	}
}
