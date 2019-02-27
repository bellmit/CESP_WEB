package com.yunyitg.cesp.core.imports.order.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "order_goods_list")
public class OrderGoodsList {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联电子订单详情ID
     */
    @Column(name = "order_detail_id")
    private Integer orderDetailId;

    /**
     * 商品序号
     */
    @Column(name = "seq")
    private Integer seq;

    /**
     * 企业商品自编号
     */
    @Column(name = "ent_goods_no")
    private String entGoodsNo;

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
     * HS编码
     */
    @Column(name = "hs_code")
    private String hsCode;

    /**
     * 企业商品品名
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 规格型号
     */
    @Column(name = "goods_style")
    private String goodsStyle;

    /**
     * 企业商品描述
     */
    @Column(name = "goods_describe")
    private String goodsDescribe;

    /**
     * 原产国代码
     */
    @Column(name = "origin_country")
    private String originCountry;

    /**
     * 商品条形码
     */
    @Column(name = "bar_code")
    private String barCode;

    /**
     * 品牌
     */
    @Column(name = "brand")
    private String brand;

    /**
     * 数量
     */
    @Column(name = "qty")
    private BigDecimal qty;

    /**
     * 计量单位
     */
    @Column(name = "unit")
    private String unit;

    /**
     * 单价
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 总价
     */
    @Column(name = "total")
    private BigDecimal total;

    /**
     * 币制
     */
    @Column(name = "curr_code")
    private String currCode;

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
     * 获取关联电子订单详情ID
     *
     * @return order_detail_id - 关联电子订单详情ID
     */
    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * 设置关联电子订单详情ID
     *
     * @param orderDetailId 关联电子订单详情ID
     */
    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * 获取商品序号
     *
     * @return seq - 商品序号
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置商品序号
     *
     * @param seq 商品序号
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
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
     * 获取HS编码
     *
     * @return hs_code - HS编码
     */
    public String getHsCode() {
        return hsCode;
    }

    /**
     * 设置HS编码
     *
     * @param hsCode HS编码
     */
    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    /**
     * 获取企业商品品名
     *
     * @return goods_name - 企业商品品名
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置企业商品品名
     *
     * @param goodsName 企业商品品名
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
     * 获取企业商品描述
     *
     * @return goods_describe - 企业商品描述
     */
    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    /**
     * 设置企业商品描述
     *
     * @param goodsDescribe 企业商品描述
     */
    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    /**
     * 获取原产国代码
     *
     * @return origin_country - 原产国代码
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * 设置原产国代码
     *
     * @param originCountry 原产国代码
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * 获取商品条形码
     *
     * @return bar_code - 商品条形码
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 设置商品条形码
     *
     * @param barCode 商品条形码
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * 获取品牌
     *
     * @return brand - 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌
     *
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取数量
     *
     * @return qty - 数量
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * 设置数量
     *
     * @param qty 数量
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
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
     * 获取单价
     *
     * @return price - 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取总价
     *
     * @return total - 总价
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * 设置总价
     *
     * @param total 总价
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * 获取币制
     *
     * @return curr_code - 币制
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * 设置币制
     *
     * @param currCode 币制
     */
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
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