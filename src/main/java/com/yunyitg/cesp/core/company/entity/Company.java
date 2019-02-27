package com.yunyitg.cesp.core.company.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private Date createAt;

    private Integer createUserId;

    private Date updateAt;

    private Integer updateUserId;

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
        this.gzeportCode = gzeportCode == null ? null : gzeportCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEdiCode() {
        return ediCode;
    }

    public void setEdiCode(String ediCode) {
        this.ediCode = ediCode == null ? null : ediCode.trim();
    }

    public String getDxpId() {
        return dxpId;
    }

    public void setDxpId(String dxpId) {
        this.dxpId = dxpId == null ? null : dxpId.trim();
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode == null ? null : cusCode.trim();
    }

    public String getCiqCode() {
        return ciqCode;
    }

    public void setCiqCode(String ciqCode) {
        this.ciqCode = ciqCode == null ? null : ciqCode.trim();
    }

    public String getInternetDomainName() {
        return internetDomainName;
    }

    public void setInternetDomainName(String internetDomainName) {
        this.internetDomainName = internetDomainName == null ? null : internetDomainName.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
}