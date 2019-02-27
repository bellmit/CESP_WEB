package com.yunyitg.cesp.core.imports.load.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "load_content")
public class LoadContent {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联货物装载清单申报头id
     */
    @Column(name = "load_head_id")
    private Integer loadHeadId;

    /**
     * 流水号
     */
    @Column(name = "seq")
    private Short seq;

    /**
     * 检验检疫电子清单编号
     */
    @Column(name = "ciq_elist_no")
    private String ciqElistNo;

    /**
     * 海关电子清单编号
     */
    @Column(name = "cus_elist_no")
    private String cusElistNo;

    /**
     * 企业电子运单编号
     */
    @Column(name = "ent_waybill_no")
    private String entWaybillNo;

    /**
     * 毛重
     */
    @Column(name = "gross_wt")
    private BigDecimal grossWt;

    /**
     * 申报数量
     */
    @Column(name = "qty")
    private BigDecimal qty;

    /**
     * 申报数量
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 海关BBC货物出区确认状态
     */
    @Column(name = "cus_message_status_confirm")
    private String cusMessageStatusConfirm;

    /**
     * 海关BBC货物装载清单回执内容
     */
    @Column(name = "cus_confirm_return_info")
    private String cusConfirmReturnInfo;

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
     * 获取关联货物装载清单申报头id
     *
     * @return load_head_id - 关联货物装载清单申报头id
     */
    public Integer getLoadHeadId() {
        return loadHeadId;
    }

    /**
     * 设置关联货物装载清单申报头id
     *
     * @param loadHeadId 关联货物装载清单申报头id
     */
    public void setLoadHeadId(Integer loadHeadId) {
        this.loadHeadId = loadHeadId;
    }

    /**
     * 获取流水号
     *
     * @return seq - 流水号
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * 设置流水号
     *
     * @param seq 流水号
     */
    public void setSeq(Short seq) {
        this.seq = seq;
    }

    /**
     * 获取检验检疫电子清单编号
     *
     * @return ciq_elist_no - 检验检疫电子清单编号
     */
    public String getCiqElistNo() {
        return ciqElistNo;
    }

    /**
     * 设置检验检疫电子清单编号
     *
     * @param ciqElistNo 检验检疫电子清单编号
     */
    public void setCiqElistNo(String ciqElistNo) {
        this.ciqElistNo = ciqElistNo;
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
     * 获取申报数量
     *
     * @return qty - 申报数量
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * 设置申报数量
     *
     * @param qty 申报数量
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * 获取申报数量
     *
     * @return notes - 申报数量
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置申报数量
     *
     * @param notes 申报数量
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * 获取海关BBC货物出区确认状态
     *
     * @return cus_message_status_confirm - 海关BBC货物出区确认状态
     */
    public String getCusMessageStatusConfirm() {
        return cusMessageStatusConfirm;
    }

    /**
     * 设置海关BBC货物出区确认状态
     *
     * @param cusMessageStatusConfirm 海关BBC货物出区确认状态
     */
    public void setCusMessageStatusConfirm(String cusMessageStatusConfirm) {
        this.cusMessageStatusConfirm = cusMessageStatusConfirm;
    }

    /**
     * 获取海关BBC货物装载清单回执内容
     *
     * @return cus_confirm_return_info - 海关BBC货物装载清单回执内容
     */
    public String getCusConfirmReturnInfo() {
        return cusConfirmReturnInfo;
    }

    /**
     * 设置海关BBC货物装载清单回执内容
     *
     * @param cusConfirmReturnInfo 海关BBC货物装载清单回执内容
     */
    public void setCusConfirmReturnInfo(String cusConfirmReturnInfo) {
        this.cusConfirmReturnInfo = cusConfirmReturnInfo;
    }
}