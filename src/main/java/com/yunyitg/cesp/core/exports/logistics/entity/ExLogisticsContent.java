package com.yunyitg.cesp.core.exports.logistics.entity;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ex_logistics_content")
public class ExLogisticsContent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer logisticsHeadId;

    private String entWaybillNo;

    private String cusEListNo;

    private String trayNo;

    private BigDecimal grossWt;

    private BigDecimal qty;

    private String importInvtNo;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLogisticsHeadId() {
        return logisticsHeadId;
    }

    public void setLogisticsHeadId(Integer logisticsHeadId) {
        this.logisticsHeadId = logisticsHeadId;
    }

    public String getEntWaybillNo() {
        return entWaybillNo;
    }

    public void setEntWaybillNo(String entWaybillNo) {
        this.entWaybillNo = entWaybillNo == null ? null : entWaybillNo.trim();
    }

    public String getCusEListNo() {
        return cusEListNo;
    }

    public void setCusEListNo(String cusEListNo) {
        this.cusEListNo = cusEListNo == null ? null : cusEListNo.trim();
    }

    public String getTrayNo() {
        return trayNo;
    }

    public void setTrayNo(String trayNo) {
        this.trayNo = trayNo == null ? null : trayNo.trim();
    }

    public BigDecimal getGrossWt() {
        return grossWt;
    }

    public void setGrossWt(BigDecimal grossWt) {
        this.grossWt = grossWt;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getImportInvtNo() {
        return importInvtNo;
    }

    public void setImportInvtNo(String importInvtNo) {
        this.importInvtNo = importInvtNo == null ? null : importInvtNo.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}