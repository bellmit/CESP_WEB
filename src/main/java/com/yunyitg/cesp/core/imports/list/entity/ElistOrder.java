package com.yunyitg.cesp.core.imports.list.entity;

import javax.persistence.*;

@Table(name = "elist_order")
public class ElistOrder {
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
     * 所属电商平台ID
     */
    @Column(name = "ebp_ent_id")
    private Integer ebpEntId;

    /**
     * 企业电子订单编号
     */
    @Column(name = "ent_order_no")
    private String entOrderNo;

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
     * 获取所属电商平台ID
     *
     * @return ebp_ent_id - 所属电商平台ID
     */
    public Integer getEbpEntId() {
        return ebpEntId;
    }

    /**
     * 设置所属电商平台ID
     *
     * @param ebpEntId 所属电商平台ID
     */
    public void setEbpEntId(Integer ebpEntId) {
        this.ebpEntId = ebpEntId;
    }

    /**
     * 获取企业电子订单编号
     *
     * @return ent_order_no - 企业电子订单编号
     */
    public String getEntOrderNo() {
        return entOrderNo;
    }

    /**
     * 设置企业电子订单编号
     *
     * @param entOrderNo 企业电子订单编号
     */
    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo;
    }
}