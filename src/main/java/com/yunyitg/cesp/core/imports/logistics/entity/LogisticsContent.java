package com.yunyitg.cesp.core.imports.logistics.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "logistics_content")
public class LogisticsContent {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联总运单申报表头ID
     */
    @Column(name = "logistics_head_id")
    private Integer logisticsHeadId;

    /**
     * 企业电子运单编号
     */
    @Column(name = "ent_waybill_no")
    private String entWaybillNo;

    /**
     * 海关电子清单编号
     */
    @Column(name = "cus_elist_no")
    private String cusElistNo;

    /**
     * 检验检疫入仓编号
     */
    @Column(name = "ciq_inbound_no")
    private String ciqInboundNo;

    /**
     * 托盘/托架/主箱编号
     */
    @Column(name = "tray_no")
    private String trayNo;

    /**
     * 毛重
     */
    @Column(name = "gross_wt")
    private BigDecimal grossWt;

    /**
     * 申报数量（单个运单下件数）
     */
    @Column(name = "qty")
    private BigDecimal qty;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

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
     * 获取关联总运单申报表头ID
     *
     * @return logistics_head_id - 关联总运单申报表头ID
     */
    public Integer getLogisticsHeadId() {
        return logisticsHeadId;
    }

    /**
     * 设置关联总运单申报表头ID
     *
     * @param logisticsHeadId 关联总运单申报表头ID
     */
    public void setLogisticsHeadId(Integer logisticsHeadId) {
        this.logisticsHeadId = logisticsHeadId;
    }

    /**
     * 获取企业电子运单编号
     *
     * @return ent_waybill_no - 企业电子运单编号
     */
    public String getEntWaybillNo() {
        return entWaybillNo;
    }

    /**
     * 设置企业电子运单编号
     *
     * @param entWaybillNo 企业电子运单编号
     */
    public void setEntWaybillNo(String entWaybillNo) {
        this.entWaybillNo = entWaybillNo;
    }

    /**
     * 获取海关电子清单编号
     *
     * @return cus_elist_no - 海关电子清单编号
     */
    public String getCusElistNo() {
        return cusElistNo;
    }

    /**
     * 设置海关电子清单编号
     *
     * @param cusElistNo 海关电子清单编号
     */
    public void setCusElistNo(String cusElistNo) {
        this.cusElistNo = cusElistNo;
    }

    /**
     * 获取检验检疫入仓编号
     *
     * @return ciq_inbound_no - 检验检疫入仓编号
     */
    public String getCiqInboundNo() {
        return ciqInboundNo;
    }

    /**
     * 设置检验检疫入仓编号
     *
     * @param ciqInboundNo 检验检疫入仓编号
     */
    public void setCiqInboundNo(String ciqInboundNo) {
        this.ciqInboundNo = ciqInboundNo;
    }

    /**
     * 获取托盘/托架/主箱编号
     *
     * @return tray_no - 托盘/托架/主箱编号
     */
    public String getTrayNo() {
        return trayNo;
    }

    /**
     * 设置托盘/托架/主箱编号
     *
     * @param trayNo 托盘/托架/主箱编号
     */
    public void setTrayNo(String trayNo) {
        this.trayNo = trayNo;
    }

    /**
     * 获取毛重
     *
     * @return gross_wt - 毛重
     */
    public BigDecimal getGrossWt() {
        return grossWt;
    }

    /**
     * 设置毛重
     *
     * @param grossWt 毛重
     */
    public void setGrossWt(BigDecimal grossWt) {
        this.grossWt = grossWt;
    }

    /**
     * 获取申报数量（单个运单下件数）
     *
     * @return qty - 申报数量（单个运单下件数）
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * 设置申报数量（单个运单下件数）
     *
     * @param qty 申报数量（单个运单下件数）
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * 获取备注
     *
     * @return notes - 备注
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注
     *
     * @param notes 备注
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}