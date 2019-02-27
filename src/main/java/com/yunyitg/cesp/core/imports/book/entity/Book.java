package com.yunyitg.cesp.core.imports.book.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "book")
public class Book {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 账册编号
     */
    @Column(name = "ems_no")
    private String emsNo;

    /**
     * 主管海关代码
     */
    @Column(name = "customs_code")
    private String customsCode;

    /**
     * 检验检疫机构代码
     */
    @Column(name = "ciq_org_code")
    private String ciqOrgCode;

    /**
     * 申报企业ID
     */
    @Column(name = "decl_ent_id")
    private Integer declEntId;

    /**
     * 所属电商企业ID
     */
    @Column(name = "eb_ent_id")
    private Integer ebEntId;

    /**
     * 企业商品自编号
     */
    @Column(name = "ent_goods_no")
    private String entGoodsNo;

    /**
     * 跨境公共平台商品备案申请号
     */
    @Column(name = "eport_goods_no")
    private String eportGoodsNo;

    /**
     * 检验检疫商品备案编号
     */
    @Column(name = "ciq_goods_no")
    private String ciqGoodsNo;

    /**
     * 海关正式备案编号
     */
    @Column(name = "cus_goods_no")
    private String cusGoodsNo;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 规格型号
     */
    @Column(name = "goods_style")
    private String goodsStyle;

    /**
     * 计量单位
     */
    @Column(name = "unit")
    private String unit;

    /**
     * 商品库存
     */
    @Column(name = "inventory")
    private BigDecimal inventory;

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
     * 获取账册编号
     *
     * @return ems_no - 账册编号
     */
    public String getEmsNo() {
        return emsNo;
    }

    /**
     * 设置账册编号
     *
     * @param emsNo 账册编号
     */
    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo;
    }

    /**
     * 获取主管海关代码
     *
     * @return customs_code - 主管海关代码
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /**
     * 设置主管海关代码
     *
     * @param customsCode 主管海关代码
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /**
     * 获取检验检疫机构代码
     *
     * @return ciq_org_code - 检验检疫机构代码
     */
    public String getCiqOrgCode() {
        return ciqOrgCode;
    }

    /**
     * 设置检验检疫机构代码
     *
     * @param ciqOrgCode 检验检疫机构代码
     */
    public void setCiqOrgCode(String ciqOrgCode) {
        this.ciqOrgCode = ciqOrgCode;
    }

    /**
     * 获取申报企业ID
     *
     * @return decl_ent_id - 申报企业ID
     */
    public Integer getDeclEntId() {
        return declEntId;
    }

    /**
     * 设置申报企业ID
     *
     * @param declEntId 申报企业ID
     */
    public void setDeclEntId(Integer declEntId) {
        this.declEntId = declEntId;
    }

    /**
     * 获取所属电商企业ID
     *
     * @return eb_ent_id - 所属电商企业ID
     */
    public Integer getEbEntId() {
        return ebEntId;
    }

    /**
     * 设置所属电商企业ID
     *
     * @param ebEntId 所属电商企业ID
     */
    public void setEbEntId(Integer ebEntId) {
        this.ebEntId = ebEntId;
    }

    /**
     * 获取企业商品自编号
     *
     * @return ent_goods_no - 企业商品自编号
     */
    public String getEntGoodsNo() {
        return entGoodsNo;
    }

    /**
     * 设置企业商品自编号
     *
     * @param entGoodsNo 企业商品自编号
     */
    public void setEntGoodsNo(String entGoodsNo) {
        this.entGoodsNo = entGoodsNo;
    }

    /**
     * 获取跨境公共平台商品备案申请号
     *
     * @return eport_goods_no - 跨境公共平台商品备案申请号
     */
    public String getEportGoodsNo() {
        return eportGoodsNo;
    }

    /**
     * 设置跨境公共平台商品备案申请号
     *
     * @param eportGoodsNo 跨境公共平台商品备案申请号
     */
    public void setEportGoodsNo(String eportGoodsNo) {
        this.eportGoodsNo = eportGoodsNo;
    }

    /**
     * 获取检验检疫商品备案编号
     *
     * @return ciq_goods_no - 检验检疫商品备案编号
     */
    public String getCiqGoodsNo() {
        return ciqGoodsNo;
    }

    /**
     * 设置检验检疫商品备案编号
     *
     * @param ciqGoodsNo 检验检疫商品备案编号
     */
    public void setCiqGoodsNo(String ciqGoodsNo) {
        this.ciqGoodsNo = ciqGoodsNo;
    }

    /**
     * 获取海关正式备案编号
     *
     * @return cus_goods_no - 海关正式备案编号
     */
    public String getCusGoodsNo() {
        return cusGoodsNo;
    }

    /**
     * 设置海关正式备案编号
     *
     * @param cusGoodsNo 海关正式备案编号
     */
    public void setCusGoodsNo(String cusGoodsNo) {
        this.cusGoodsNo = cusGoodsNo;
    }

    /**
     * 获取商品名称
     *
     * @return goods_name - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取规格型号
     *
     * @return goods_style - 规格型号
     */
    public String getGoodsStyle() {
        return goodsStyle;
    }

    /**
     * 设置规格型号
     *
     * @param goodsStyle 规格型号
     */
    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle;
    }

    /**
     * 获取计量单位
     *
     * @return unit - 计量单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置计量单位
     *
     * @param unit 计量单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取商品库存
     *
     * @return inventory - 商品库存
     */
    public BigDecimal getInventory() {
        return inventory;
    }

    /**
     * 设置商品库存
     *
     * @param inventory 商品库存
     */
    public void setInventory(BigDecimal inventory) {
        this.inventory = inventory;
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