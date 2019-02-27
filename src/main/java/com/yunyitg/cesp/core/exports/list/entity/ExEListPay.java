package com.yunyitg.cesp.core.exports.list.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_e_list_pay")
public class ExEListPay {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer eListDetailInfoId;

    private String entPayNo;

    private Integer payEntId;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer geteListDetailInfoId() {
        return eListDetailInfoId;
    }

    public void seteListDetailInfoId(Integer eListDetailInfoId) {
        this.eListDetailInfoId = eListDetailInfoId;
    }

    public String getEntPayNo() {
        return entPayNo;
    }

    public void setEntPayNo(String entPayNo) {
        this.entPayNo = entPayNo == null ? null : entPayNo.trim();
    }

    public Integer getPayEntId() {
        return payEntId;
    }

    public void setPayEntId(Integer payEntId) {
        this.payEntId = payEntId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}