package com.yunyitg.cesp.core.exports.list.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_e_list_order")
public class ExEListOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer eListDetailInfoId;

    private Integer eBPEntId;

    private String entOrderNo;

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

    public Integer geteBPEntId() {
        return eBPEntId;
    }

    public void seteBPEntId(Integer eBPEntId) {
        this.eBPEntId = eBPEntId;
    }

    public String getEntOrderNo() {
        return entOrderNo;
    }

    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo == null ? null : entOrderNo.trim();
    }
}