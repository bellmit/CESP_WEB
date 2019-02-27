package com.yunyitg.cesp.core.imports.list.entity;

import javax.persistence.*;

@Table(name = "elist_pay")
public class ElistPay {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联清单详情信息ID
     */
    @Column(name = "elist_detail_info_id")
    private Integer elistDetailInfoId;

    /**
     * 支付交易编号
     */
    @Column(name = "ent_pay_no")
    private String entPayNo;

    /**
     * 所属支付企业ID
     */
    @Column(name = "pay_ent_id")
    private Integer payEntId;

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
     * 获取关联清单详情信息ID
     *
     * @return elist_detail_info_id - 关联清单详情信息ID
     */
    public Integer getElistDetailInfoId() {
        return elistDetailInfoId;
    }

    /**
     * 设置关联清单详情信息ID
     *
     * @param elistDetailInfoId 关联清单详情信息ID
     */
    public void setElistDetailInfoId(Integer elistDetailInfoId) {
        this.elistDetailInfoId = elistDetailInfoId;
    }

    /**
     * 获取支付交易编号
     *
     * @return ent_pay_no - 支付交易编号
     */
    public String getEntPayNo() {
        return entPayNo;
    }

    /**
     * 设置支付交易编号
     *
     * @param entPayNo 支付交易编号
     */
    public void setEntPayNo(String entPayNo) {
        this.entPayNo = entPayNo;
    }

    /**
     * 获取所属支付企业ID
     *
     * @return pay_ent_id - 所属支付企业ID
     */
    public Integer getPayEntId() {
        return payEntId;
    }

    /**
     * 设置所属支付企业ID
     *
     * @param payEntId 所属支付企业ID
     */
    public void setPayEntId(Integer payEntId) {
        this.payEntId = payEntId;
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