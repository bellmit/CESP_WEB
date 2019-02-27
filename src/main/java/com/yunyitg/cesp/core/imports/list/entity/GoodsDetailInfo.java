package com.yunyitg.cesp.core.imports.list.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "goods_detail_info")
public class GoodsDetailInfo {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联电子清单关联订单表体ID
     */
    @Column(name = "elist_order_id")
    private Integer elistOrderId;

    /**
     * 商品序号,从1开始连续序号（一一对应关联电子订单）
     */
    @Column(name = "seq")
    private Short seq;

    /**
     * 检验检疫商品备案编号
     */
    @Column(name = "ciq_goods_no")
    private String ciqGoodsNo;

    /**
     * 海关商品备案号（总署申报1210 账册备案料号；总署申报9610 填行邮税号或HS编号）
     */
    @Column(name = "cus_goods_no")
    private String cusGoodsNo;

    /**
     * 企业商品货号
     */
    @Column(name = "ent_goods_no")
    private String entGoodsNo;

    /**
     * 企业商品品名
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 海关商品归类名称
     */
    @Column(name = "gname")
    private String gname;

    /**
     * 商品规格型号
     */
    @Column(name = "goods_style")
    private String goodsStyle;

    /**
     * HS编码
     */
    @Column(name = "hs_code")
    private String hsCode;

    /**
     * 品牌
     */
    @Column(name = "brand")
    private String brand;

    /**
     * 商品条形码
     */
    @Column(name = "bar_code")
    private String barCode;

    /**
     * 原产国/ 消费国（进口填原产国或地区，填中国可能导致退单。出口填中国（142））
     */
    @Column(name = "origin_country")
    private String originCountry;

    /**
     * 货物存放地（1210进口为企业保税仓名称。9610进口为企业海外仓名称。出口为发货仓名称。）
     */
    @Column(name = "discharge_place")
    private String dischargePlace;

    /**
     * 商品批次
     */
    @Column(name = "goods_batch_no")
    private String goodsBatchNo;

    /**
     * 商品许可证号
     */
    @Column(name = "license_no")
    private String licenseNo;

    /**
     * 商品批准文号
     */
    @Column(name = "appr_no")
    private String apprNo;

    /**
     * 包装类型
     */
    @Column(name = "package_type")
    private String packageType;

    /**
     * 包装件数
     */
    @Column(name = "pack_num")
    private Integer packNum;

    /**
     * 数量
     */
    @Column(name = "qty")
    private BigDecimal qty;

    /**
     * 成交计量单位
     */
    @Column(name = "gunit")
    private String gunit;

    /**
     * 第一计量单位
     */
    @Column(name = "std_unit")
    private String stdUnit;

    /**
     * 第一计量数量
     */
    @Column(name = "std_qty")
    private BigDecimal stdQty;

    /**
     * 第二计量单位
     */
    @Column(name = "sec_unit")
    private String secUnit;

    /**
     * 第二计量单位数量
     */
    @Column(name = "sec_qty")
    private BigDecimal secQty;

    /**
     * 重量
     */
    @Column(name = "gross_weight")
    private BigDecimal grossWeight;

    /**
     * 商品单价
     */
    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    /**
     * 商品总价
     */
    @Column(name = "total_price")
    private BigDecimal totalPrice;

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
     * 获取关联电子清单关联订单表体ID
     *
     * @return elist_order_id - 关联电子清单关联订单表体ID
     */
    public Integer getElistOrderId() {
        return elistOrderId;
    }

    /**
     * 设置关联电子清单关联订单表体ID
     *
     * @param elistOrderId 关联电子清单关联订单表体ID
     */
    public void setElistOrderId(Integer elistOrderId) {
        this.elistOrderId = elistOrderId;
    }

    /**
     * 获取商品序号,从1开始连续序号（一一对应关联电子订单）
     *
     * @return seq - 商品序号,从1开始连续序号（一一对应关联电子订单）
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * 设置商品序号,从1开始连续序号（一一对应关联电子订单）
     *
     * @param seq 商品序号,从1开始连续序号（一一对应关联电子订单）
     */
    public void setSeq(Short seq) {
        this.seq = seq;
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
     * 获取海关商品备案号（总署申报1210 账册备案料号；总署申报9610 填行邮税号或HS编号）
     *
     * @return cus_goods_no - 海关商品备案号（总署申报1210 账册备案料号；总署申报9610 填行邮税号或HS编号）
     */
    public String getCusGoodsNo() {
        return cusGoodsNo;
    }

    /**
     * 设置海关商品备案号（总署申报1210 账册备案料号；总署申报9610 填行邮税号或HS编号）
     *
     * @param cusGoodsNo 海关商品备案号（总署申报1210 账册备案料号；总署申报9610 填行邮税号或HS编号）
     */
    public void setCusGoodsNo(String cusGoodsNo) {
        this.cusGoodsNo = cusGoodsNo;
    }

    /**
     * 获取企业商品货号
     *
     * @return ent_goods_no - 企业商品货号
     */
    public String getEntGoodsNo() {
        return entGoodsNo;
    }

    /**
     * 设置企业商品货号
     *
     * @param entGoodsNo 企业商品货号
     */
    public void setEntGoodsNo(String entGoodsNo) {
        this.entGoodsNo = entGoodsNo;
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
     * 获取海关商品归类名称
     *
     * @return gname - 海关商品归类名称
     */
    public String getGname() {
        return gname;
    }

    /**
     * 设置海关商品归类名称
     *
     * @param gname 海关商品归类名称
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * 获取商品规格型号
     *
     * @return goods_style - 商品规格型号
     */
    public String getGoodsStyle() {
        return goodsStyle;
    }

    /**
     * 设置商品规格型号
     *
     * @param goodsStyle 商品规格型号
     */
    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle;
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
     * 获取原产国/ 消费国（进口填原产国或地区，填中国可能导致退单。出口填中国（142））
     *
     * @return origin_country - 原产国/ 消费国（进口填原产国或地区，填中国可能导致退单。出口填中国（142））
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * 设置原产国/ 消费国（进口填原产国或地区，填中国可能导致退单。出口填中国（142））
     *
     * @param originCountry 原产国/ 消费国（进口填原产国或地区，填中国可能导致退单。出口填中国（142））
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * 获取货物存放地（1210进口为企业保税仓名称。9610进口为企业海外仓名称。出口为发货仓名称。）
     *
     * @return discharge_place - 货物存放地（1210进口为企业保税仓名称。9610进口为企业海外仓名称。出口为发货仓名称。）
     */
    public String getDischargePlace() {
        return dischargePlace;
    }

    /**
     * 设置货物存放地（1210进口为企业保税仓名称。9610进口为企业海外仓名称。出口为发货仓名称。）
     *
     * @param dischargePlace 货物存放地（1210进口为企业保税仓名称。9610进口为企业海外仓名称。出口为发货仓名称。）
     */
    public void setDischargePlace(String dischargePlace) {
        this.dischargePlace = dischargePlace;
    }

    /**
     * 获取商品批次
     *
     * @return goods_batch_no - 商品批次
     */
    public String getGoodsBatchNo() {
        return goodsBatchNo;
    }

    /**
     * 设置商品批次
     *
     * @param goodsBatchNo 商品批次
     */
    public void setGoodsBatchNo(String goodsBatchNo) {
        this.goodsBatchNo = goodsBatchNo;
    }

    /**
     * 获取商品许可证号
     *
     * @return license_no - 商品许可证号
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * 设置商品许可证号
     *
     * @param licenseNo 商品许可证号
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    /**
     * 获取商品批准文号
     *
     * @return appr_no - 商品批准文号
     */
    public String getApprNo() {
        return apprNo;
    }

    /**
     * 设置商品批准文号
     *
     * @param apprNo 商品批准文号
     */
    public void setApprNo(String apprNo) {
        this.apprNo = apprNo;
    }

    /**
     * 获取包装类型
     *
     * @return package_type - 包装类型
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * 设置包装类型
     *
     * @param packageType 包装类型
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * 获取包装件数
     *
     * @return pack_num - 包装件数
     */
    public Integer getPackNum() {
        return packNum;
    }

    /**
     * 设置包装件数
     *
     * @param packNum 包装件数
     */
    public void setPackNum(Integer packNum) {
        this.packNum = packNum;
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
     * 获取成交计量单位
     *
     * @return gunit - 成交计量单位
     */
    public String getGunit() {
        return gunit;
    }

    /**
     * 设置成交计量单位
     *
     * @param gunit 成交计量单位
     */
    public void setGunit(String gunit) {
        this.gunit = gunit;
    }

    /**
     * 获取第一计量单位
     *
     * @return std_unit - 第一计量单位
     */
    public String getStdUnit() {
        return stdUnit;
    }

    /**
     * 设置第一计量单位
     *
     * @param stdUnit 第一计量单位
     */
    public void setStdUnit(String stdUnit) {
        this.stdUnit = stdUnit;
    }

    /**
     * 获取第一计量数量
     *
     * @return std_qty - 第一计量数量
     */
    public BigDecimal getStdQty() {
        return stdQty;
    }

    /**
     * 设置第一计量数量
     *
     * @param stdQty 第一计量数量
     */
    public void setStdQty(BigDecimal stdQty) {
        this.stdQty = stdQty;
    }

    /**
     * 获取第二计量单位
     *
     * @return sec_unit - 第二计量单位
     */
    public String getSecUnit() {
        return secUnit;
    }

    /**
     * 设置第二计量单位
     *
     * @param secUnit 第二计量单位
     */
    public void setSecUnit(String secUnit) {
        this.secUnit = secUnit;
    }

    /**
     * 获取第二计量单位数量
     *
     * @return sec_qty - 第二计量单位数量
     */
    public BigDecimal getSecQty() {
        return secQty;
    }

    /**
     * 设置第二计量单位数量
     *
     * @param secQty 第二计量单位数量
     */
    public void setSecQty(BigDecimal secQty) {
        this.secQty = secQty;
    }

    /**
     * 获取重量
     *
     * @return gross_weight - 重量
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * 设置重量
     *
     * @param grossWeight 重量
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * 获取商品单价
     *
     * @return unit_price - 商品单价
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置商品单价
     *
     * @param unitPrice 商品单价
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 获取商品总价
     *
     * @return total_price - 商品总价
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置商品总价
     *
     * @param totalPrice 商品总价
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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