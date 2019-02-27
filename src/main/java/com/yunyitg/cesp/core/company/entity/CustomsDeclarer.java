package com.yunyitg.cesp.core.company.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "customs_declarer")
public class CustomsDeclarer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String customsDeclarer;

    private Integer compAccessId;

    private String declarationCompAddr;

    private String declarerPostCode;

    private String customsDeclarerTel;

    private String notes;

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

    public String getCustomsDeclarer() {
        return customsDeclarer;
    }

    public void setCustomsDeclarer(String customsDeclarer) {
        this.customsDeclarer = customsDeclarer == null ? null : customsDeclarer.trim();
    }

    public Integer getCompAccessId() {
        return compAccessId;
    }

    public void setCompAccessId(Integer compAccessId) {
        this.compAccessId = compAccessId;
    }

    public String getDeclarationCompAddr() {
        return declarationCompAddr;
    }

    public void setDeclarationCompAddr(String declarationCompAddr) {
        this.declarationCompAddr = declarationCompAddr == null ? null : declarationCompAddr.trim();
    }

    public String getDeclarerPostCode() {
        return declarerPostCode;
    }

    public void setDeclarerPostCode(String declarerPostCode) {
        this.declarerPostCode = declarerPostCode == null ? null : declarerPostCode.trim();
    }

    public String getCustomsDeclarerTel() {
        return customsDeclarerTel;
    }

    public void setCustomsDeclarerTel(String customsDeclarerTel) {
        this.customsDeclarerTel = customsDeclarerTel == null ? null : customsDeclarerTel.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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