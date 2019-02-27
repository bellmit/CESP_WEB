package com.yunyitg.cesp.core.imports.inbound.entity;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 * 进仓清单信息 
 * @author yangyuantao
 *
 */
@Table(name = "inbound_content")
public class InboundContent {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联进仓清单申报头id
     */
    @Column(name = "inbound_head_id")
    private Integer inboundHeadId;

    /**
     * 商品序号
     */
    @Column(name = "seq")
    private Short seq;

    /**
     * 商品批次号（溯源商品必须填写提运单号）
     */
    @Column(name = "goods_batch_no")
    private String goodsBatchNo;

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
     * 海关商品编码
     */
    @Column(name = "hs_code")
    private String hsCode;

    /**
     * 原产国/地区（参照国别代码表）
     */
    @Column(name = "origin_country")
    private String originCountry;

    /**
     * 采购地点（参照国别代码表）
     */
    @Column(name = "purchase_place")
    private String purchasePlace;

    /**
     * 商品名称（对应报关单的商品名称）
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 型号规格（对应报关单的商品规格、型号）
     */
    @Column(name = "goods_style")
    private String goodsStyle;

    /**
     * 标准计量单位（对应报关单的第一计量单位）
     */
    @Column(name = "std_unit")
    private String stdUnit;

    /**
     * 第二计量单位（对应报关单的第二计量单位）
     */
    @Column(name = "sec_unit")
    private String secUnit;

    /**
     * 生产厂家
     */
    @Column(name = "manufactory")
    private String manufactory;

    /**
     * 标准数量（对应报关单的第一数量）
     */
    @Column(name = "std_qty")
    private BigDecimal stdQty;

    /**
     * 第二数量（对应报关单的第二数量）
     */
    @Column(name = "sec_qty")
    private BigDecimal secQty;

    /**
     * 申报单价（采购价格）
     */
    @Column(name = "declare_price")
    private BigDecimal declarePrice;

    /**
     * 申报总价
     */
    @Column(name = "dec_total")
    private BigDecimal decTotal;

    /**
     * 币制代码
     */
    @Column(name = "curr_code")
    private String currCode;

    /**
     * 贸易国别代码
     */
    @Column(name = "trade_country")
    private String tradeCountry;

    /**
     * 包装种类（内包装）代码
     */
    @Column(name = "package_type")
    private String packageType;

    /**
     * 辅助包材
     */
    @Column(name = "outer_package")
    private String outerPackage;

    /**
     * 毛重
     */
    @Column(name = "gross_weight")
    private BigDecimal grossWeight;

    /**
     * 净重
     */
    @Column(name = "net_weight")
    private BigDecimal netWeight;

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
     * 获取关联进仓清单申报头id
     *
     * @return inbound_head_id - 关联进仓清单申报头id
     */
    public Integer getInboundHeadId() {
        return inboundHeadId;
    }

    /**
     * 设置关联进仓清单申报头id
     *
     * @param inboundHeadId 关联进仓清单申报头id
     */
    public void setInboundHeadId(Integer inboundHeadId) {
        this.inboundHeadId = inboundHeadId;
    }

    /**
     * 获取商品序号
     *
     * @return seq - 商品序号
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * 设置商品序号
     *
     * @param seq 商品序号
     */
    public void setSeq(Short seq) {
        this.seq = seq;
    }

    /**
     * 获取商品批次号（溯源商品必须填写提运单号）
     *
     * @return goods_batch_no - 商品批次号（溯源商品必须填写提运单号）
     */
    public String getGoodsBatchNo() {
        return goodsBatchNo;
    }

    /**
     * 设置商品批次号（溯源商品必须填写提运单号）
     *
     * @param goodsBatchNo 商品批次号（溯源商品必须填写提运单号）
     */
    public void setGoodsBatchNo(String goodsBatchNo) {
        this.goodsBatchNo = goodsBatchNo;
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
     * 获取海关商品编码
     *
     * @return hs_code - 海关商品编码
     */
    public String getHsCode() {
        return hsCode;
    }

    /**
     * 设置海关商品编码
     *
     * @param hsCode 海关商品编码
     */
    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    /**
     * 获取原产国/地区（参照国别代码表）
     *
     * @return origin_country - 原产国/地区（参照国别代码表）
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * 设置原产国/地区（参照国别代码表）
     *
     * @param originCountry 原产国/地区（参照国别代码表）
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * 获取采购地点（参照国别代码表）
     *
     * @return purchase_place - 采购地点（参照国别代码表）
     */
    public String getPurchasePlace() {
        return purchasePlace;
    }

    /**
     * 设置采购地点（参照国别代码表）
     *
     * @param purchasePlace 采购地点（参照国别代码表）
     */
    public void setPurchasePlace(String purchasePlace) {
        this.purchasePlace = purchasePlace;
    }

    /**
     * 获取商品名称（对应报关单的商品名称）
     *
     * @return goods_name - 商品名称（对应报关单的商品名称）
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称（对应报关单的商品名称）
     *
     * @param goodsName 商品名称（对应报关单的商品名称）
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取型号规格（对应报关单的商品规格、型号）
     *
     * @return goods_style - 型号规格（对应报关单的商品规格、型号）
     */
    public String getGoodsStyle() {
        return goodsStyle;
    }

    /**
     * 设置型号规格（对应报关单的商品规格、型号）
     *
     * @param goodsStyle 型号规格（对应报关单的商品规格、型号）
     */
    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle;
    }

    /**
     * 获取标准计量单位（对应报关单的第一计量单位）
     *
     * @return std_unit - 标准计量单位（对应报关单的第一计量单位）
     */
    public String getStdUnit() {
        return stdUnit;
    }

    /**
     * 设置标准计量单位（对应报关单的第一计量单位）
     *
     * @param stdUnit 标准计量单位（对应报关单的第一计量单位）
     */
    public void setStdUnit(String stdUnit) {
        this.stdUnit = stdUnit;
    }

    /**
     * 获取第二计量单位（对应报关单的第二计量单位）
     *
     * @return sec_unit - 第二计量单位（对应报关单的第二计量单位）
     */
    public String getSecUnit() {
        return secUnit;
    }

    /**
     * 设置第二计量单位（对应报关单的第二计量单位）
     *
     * @param secUnit 第二计量单位（对应报关单的第二计量单位）
     */
    public void setSecUnit(String secUnit) {
        this.secUnit = secUnit;
    }

    /**
     * 获取生产厂家
     *
     * @return manufactory - 生产厂家
     */
    public String getManufactory() {
        return manufactory;
    }

    /**
     * 设置生产厂家
     *
     * @param manufactory 生产厂家
     */
    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    /**
     * 获取标准数量（对应报关单的第一数量）
     *
     * @return std_qty - 标准数量（对应报关单的第一数量）
     */
    public BigDecimal getStdQty() {
        return stdQty;
    }

    /**
     * 设置标准数量（对应报关单的第一数量）
     *
     * @param stdQty 标准数量（对应报关单的第一数量）
     */
    public void setStdQty(BigDecimal stdQty) {
        this.stdQty = stdQty;
    }

    /**
     * 获取第二数量（对应报关单的第二数量）
     *
     * @return sec_qty - 第二数量（对应报关单的第二数量）
     */
    public BigDecimal getSecQty() {
        return secQty;
    }

    /**
     * 设置第二数量（对应报关单的第二数量）
     *
     * @param secQty 第二数量（对应报关单的第二数量）
     */
    public void setSecQty(BigDecimal secQty) {
        this.secQty = secQty;
    }

    /**
     * 获取申报单价（采购价格）
     *
     * @return declare_price - 申报单价（采购价格）
     */
    public BigDecimal getDeclarePrice() {
        return declarePrice;
    }

    /**
     * 设置申报单价（采购价格）
     *
     * @param declarePrice 申报单价（采购价格）
     */
    public void setDeclarePrice(BigDecimal declarePrice) {
        this.declarePrice = declarePrice;
    }

    /**
     * 获取申报总价
     *
     * @return dec_total - 申报总价
     */
    public BigDecimal getDecTotal() {
        return decTotal;
    }

    /**
     * 设置申报总价
     *
     * @param decTotal 申报总价
     */
    public void setDecTotal(BigDecimal decTotal) {
        this.decTotal = decTotal;
    }

    /**
     * 获取币制代码
     *
     * @return curr_code - 币制代码
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * 设置币制代码
     *
     * @param currCode 币制代码
     */
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    /**
     * 获取贸易国别代码
     *
     * @return trade_country - 贸易国别代码
     */
    public String getTradeCountry() {
        return tradeCountry;
    }

    /**
     * 设置贸易国别代码
     *
     * @param tradeCountry 贸易国别代码
     */
    public void setTradeCountry(String tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    /**
     * 获取包装种类（内包装）代码
     *
     * @return package_type - 包装种类（内包装）代码
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * 设置包装种类（内包装）代码
     *
     * @param packageType 包装种类（内包装）代码
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * 获取辅助包材
     *
     * @return outer_package - 辅助包材
     */
    public String getOuterPackage() {
        return outerPackage;
    }

    /**
     * 设置辅助包材
     *
     * @param outerPackage 辅助包材
     */
    public void setOuterPackage(String outerPackage) {
        this.outerPackage = outerPackage;
    }

    /**
     * 获取毛重
     *
     * @return gross_weight - 毛重
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * 设置毛重
     *
     * @param grossWeight 毛重
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * 获取净重
     *
     * @return net_weight - 净重
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * 设置净重
     *
     * @param netWeight 净重
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
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