package com.yunyitg.cesp.core.imports.goods.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "goods_content")
public class GoodsContent {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联商品备案申报头id
     */
    @Column(name = "goods_reg_head_id")
    private Integer goodsRegHeadId;

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
     * 所属电商平台ID
     */
    @Column(name = "ebp_ent_id")
    private Integer ebpEntId;

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
     * 商品序号
     */
    @Column(name = "seq")
    private Short seq;

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
     * 账册编号
     */
    @Column(name = "ems_no")
    private String emsNo;

    /**
     * 保税账册中的项号
     */
    @Column(name = "item_no")
    private String itemNo;

    /**
     * 上架品名
     */
    @Column(name = "shelf_gname")
    private String shelfGname;

    /**
     * 行邮税号
     */
    @Column(name = "ncad_code")
    private String ncadCode;

    /**
     * HS编码
     */
    @Column(name = "hs_code")
    private String hsCode;

    /**
     * 商品条形码
     */
    @Column(name = "bar_code")
    private String barCode;

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
     * 品牌
     */
    @Column(name = "brand")
    private String brand;

    /**
     * 申报计量单位
     */
    @Column(name = "gunit")
    private String gunit;

    /**
     * 第一法定计量单位
     */
    @Column(name = "std_unit")
    private String stdUnit;

    /**
     * 第二法定计量单位
     */
    @Column(name = "sec_unit")
    private String secUnit;

    /**
     * 单价（指无税的销售价格, RMB）
     */
    @Column(name = "reg_price")
    private BigDecimal regPrice;

    /**
     * 是否赠品（0-是；1-否，默认否）
     */
    @Column(name = "gift_flag")
    private String giftFlag;

    /**
     * 原产国代码
     */
    @Column(name = "origin_country")
    private String originCountry;

    /**
     * 商品品质及说明
     */
    @Column(name = "quality")
    private String quality;

    /**
     * 品质证明说明
     */
    @Column(name = "qualify_certify")
    private String qualifyCertify;

    /**
     * 生产厂家或供应商
     */
    @Column(name = "manufactory")
    private String manufactory;

    /**
     * 净重，单位KG
     */
    @Column(name = "net_wt")
    private BigDecimal netWt;

    /**
     * 毛重，单位KG
     */
    @Column(name = "gross_wt")
    private BigDecimal grossWt;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 海关商品备案状态
     */
    @Column(name = "cus_message_status_goods")
    private String cusMessageStatusGoods;

    /**
     * 海关商品备案回执内容
     */
    @Column(name = "cus_goods_return_info")
    private String cusGoodsReturnInfo;

    /**
     * 国检商品备案状态
     */
    @Column(name = "ciq_message_status_goods")
    private String ciqMessageStatusGoods;

    /**
     * 国检商品备案回执内容
     */
    @Column(name = "ciq_goods_return_info")
    private String ciqGoodsReturnInfo;

    /**
     * 数据入库时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 数据录入用户ID
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 最近操作时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 操作用户ID
     */
    @Column(name = "update_user_id")
    private Integer updateUserId;

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
     * 获取关联商品备案申报头id
     *
     * @return goods_reg_head_id - 关联商品备案申报头id
     */
    public Integer getGoodsRegHeadId() {
        return goodsRegHeadId;
    }

    /**
     * 设置关联商品备案申报头id
     *
     * @param goodsRegHeadId 关联商品备案申报头id
     */
    public void setGoodsRegHeadId(Integer goodsRegHeadId) {
        this.goodsRegHeadId = goodsRegHeadId;
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
     * 获取保税账册中的项号
     *
     * @return item_no - 保税账册中的项号
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * 设置保税账册中的项号
     *
     * @param itemNo 保税账册中的项号
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * 获取上架品名
     *
     * @return shelf_gname - 上架品名
     */
    public String getShelfGname() {
        return shelfGname;
    }

    /**
     * 设置上架品名
     *
     * @param shelfGname 上架品名
     */
    public void setShelfGname(String shelfGname) {
        this.shelfGname = shelfGname;
    }

    /**
     * 获取行邮税号
     *
     * @return ncad_code - 行邮税号
     */
    public String getNcadCode() {
        return ncadCode;
    }

    /**
     * 设置行邮税号
     *
     * @param ncadCode 行邮税号
     */
    public void setNcadCode(String ncadCode) {
        this.ncadCode = ncadCode;
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
     * 获取申报计量单位
     *
     * @return gunit - 申报计量单位
     */
    public String getGunit() {
        return gunit;
    }

    /**
     * 设置申报计量单位
     *
     * @param gunit 申报计量单位
     */
    public void setGunit(String gunit) {
        this.gunit = gunit;
    }

    /**
     * 获取第一法定计量单位
     *
     * @return std_unit - 第一法定计量单位
     */
    public String getStdUnit() {
        return stdUnit;
    }

    /**
     * 设置第一法定计量单位
     *
     * @param stdUnit 第一法定计量单位
     */
    public void setStdUnit(String stdUnit) {
        this.stdUnit = stdUnit;
    }

    /**
     * 获取第二法定计量单位
     *
     * @return sec_unit - 第二法定计量单位
     */
    public String getSecUnit() {
        return secUnit;
    }

    /**
     * 设置第二法定计量单位
     *
     * @param secUnit 第二法定计量单位
     */
    public void setSecUnit(String secUnit) {
        this.secUnit = secUnit;
    }

    /**
     * 获取单价（指无税的销售价格, RMB）
     *
     * @return reg_price - 单价（指无税的销售价格, RMB）
     */
    public BigDecimal getRegPrice() {
        return regPrice;
    }

    /**
     * 设置单价（指无税的销售价格, RMB）
     *
     * @param regPrice 单价（指无税的销售价格, RMB）
     */
    public void setRegPrice(BigDecimal regPrice) {
        this.regPrice = regPrice;
    }

    /**
     * 获取是否赠品（0-是；1-否，默认否）
     *
     * @return gift_flag - 是否赠品（0-是；1-否，默认否）
     */
    public String getGiftFlag() {
        return giftFlag;
    }

    /**
     * 设置是否赠品（0-是；1-否，默认否）
     *
     * @param giftFlag 是否赠品（0-是；1-否，默认否）
     */
    public void setGiftFlag(String giftFlag) {
        this.giftFlag = giftFlag;
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
     * 获取商品品质及说明
     *
     * @return quality - 商品品质及说明
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 设置商品品质及说明
     *
     * @param quality 商品品质及说明
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * 获取品质证明说明
     *
     * @return qualify_certify - 品质证明说明
     */
    public String getQualifyCertify() {
        return qualifyCertify;
    }

    /**
     * 设置品质证明说明
     *
     * @param qualifyCertify 品质证明说明
     */
    public void setQualifyCertify(String qualifyCertify) {
        this.qualifyCertify = qualifyCertify;
    }

    /**
     * 获取生产厂家或供应商
     *
     * @return manufactory - 生产厂家或供应商
     */
    public String getManufactory() {
        return manufactory;
    }

    /**
     * 设置生产厂家或供应商
     *
     * @param manufactory 生产厂家或供应商
     */
    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    /**
     * 获取净重，单位KG
     *
     * @return net_wt - 净重，单位KG
     */
    public BigDecimal getNetWt() {
        return netWt;
    }

    /**
     * 设置净重，单位KG
     *
     * @param netWt 净重，单位KG
     */
    public void setNetWt(BigDecimal netWt) {
        this.netWt = netWt;
    }

    /**
     * 获取毛重，单位KG
     *
     * @return gross_wt - 毛重，单位KG
     */
    public BigDecimal getGrossWt() {
        return grossWt;
    }

    /**
     * 设置毛重，单位KG
     *
     * @param grossWt 毛重，单位KG
     */
    public void setGrossWt(BigDecimal grossWt) {
        this.grossWt = grossWt;
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

    /**
     * 获取海关商品备案状态
     *
     * @return cus_message_status_goods - 海关商品备案状态
     */
    public String getCusMessageStatusGoods() {
        return cusMessageStatusGoods;
    }

    /**
     * 设置海关商品备案状态
     *
     * @param cusMessageStatusGoods 海关商品备案状态
     */
    public void setCusMessageStatusGoods(String cusMessageStatusGoods) {
        this.cusMessageStatusGoods = cusMessageStatusGoods;
    }

    /**
     * 获取海关商品备案回执内容
     *
     * @return cus_goods_return_info - 海关商品备案回执内容
     */
    public String getCusGoodsReturnInfo() {
        return cusGoodsReturnInfo;
    }

    /**
     * 设置海关商品备案回执内容
     *
     * @param cusGoodsReturnInfo 海关商品备案回执内容
     */
    public void setCusGoodsReturnInfo(String cusGoodsReturnInfo) {
        this.cusGoodsReturnInfo = cusGoodsReturnInfo;
    }

    /**
     * 获取国检商品备案状态
     *
     * @return ciq_message_status_goods - 国检商品备案状态
     */
    public String getCiqMessageStatusGoods() {
        return ciqMessageStatusGoods;
    }

    /**
     * 设置国检商品备案状态
     *
     * @param ciqMessageStatusGoods 国检商品备案状态
     */
    public void setCiqMessageStatusGoods(String ciqMessageStatusGoods) {
        this.ciqMessageStatusGoods = ciqMessageStatusGoods;
    }

    /**
     * 获取国检商品备案回执内容
     *
     * @return ciq_goods_return_info - 国检商品备案回执内容
     */
    public String getCiqGoodsReturnInfo() {
        return ciqGoodsReturnInfo;
    }

    /**
     * 设置国检商品备案回执内容
     *
     * @param ciqGoodsReturnInfo 国检商品备案回执内容
     */
    public void setCiqGoodsReturnInfo(String ciqGoodsReturnInfo) {
        this.ciqGoodsReturnInfo = ciqGoodsReturnInfo;
    }

    /**
     * 获取数据入库时间
     *
     * @return create_at - 数据入库时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置数据入库时间
     *
     * @param createAt 数据入库时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取数据录入用户ID
     *
     * @return create_user_id - 数据录入用户ID
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置数据录入用户ID
     *
     * @param createUserId 数据录入用户ID
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取最近操作时间
     *
     * @return update_at - 最近操作时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置最近操作时间
     *
     * @param updateAt 最近操作时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 获取操作用户ID
     *
     * @return update_user_id - 操作用户ID
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置操作用户ID
     *
     * @param updateUserId 操作用户ID
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
}