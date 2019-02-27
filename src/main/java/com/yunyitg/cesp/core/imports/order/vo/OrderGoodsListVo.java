package com.yunyitg.cesp.core.imports.order.vo;

import java.math.BigDecimal;

/**
 * 订单商品信息  前端视图对象
 * @author yangyuantao
 *
 */
public class OrderGoodsListVo {

	/**
	 * 商品序号
	 */
	private Integer seq;
	
	/**
	 * 企业商品自编号
	 */
	private String entGoodsNo;
	
	/**
	 * 检验检疫商品备案编号
	 */
	private String ciqGoodsNo;
	
	/**
	 * 海关正式备案编号
	 */
	private String cusGoodsNo;
	
	/**
	 * HS编码
	 */
	private String hsCode;
	
	/**
	 * 企业商品品名
	 */
	private String goodsName;
	
	 /**
     * 规格型号
     */
    private String goodsStyle;
    
    /**
     * 企业商品描述
     */
    private String goodsDescribe;
    
    /**
     * 原产国代码
     */
    private String originCountry;
    
    /**
     * 原产国名称
     */
    private String originCountryName;
    
    /**
     * 商品条形码
     */
    private String barCode;
    
    /**
     * 品牌
     */
    private String brand;
    
    /**
     * 数量
     */
    private BigDecimal qty;
    
    /**
     * 计量单位
     */
    private String unit;
    
    /**
     * 计量单位名称
     */
    private String unitName;
    
    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 总价
     */
    private BigDecimal total;
    
    /**
     * 币制代码
     */
    private String currCode;
    
    /**
     * 币制名称
     */
    private String currCodeName;
    
    /**
     * 备注
     */
    private String notes;
    
    public OrderGoodsListVo() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getEntGoodsNo() {
		return entGoodsNo;
	}

	public void setEntGoodsNo(String entGoodsNo) {
		this.entGoodsNo = entGoodsNo;
	}

	public String getCiqGoodsNo() {
		return ciqGoodsNo;
	}

	public void setCiqGoodsNo(String ciqGoodsNo) {
		this.ciqGoodsNo = ciqGoodsNo;
	}

	public String getCusGoodsNo() {
		return cusGoodsNo;
	}

	public void setCusGoodsNo(String cusGoodsNo) {
		this.cusGoodsNo = cusGoodsNo;
	}

	public String getHsCode() {
		return hsCode;
	}

	public void setHsCode(String hsCode) {
		this.hsCode = hsCode;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsStyle() {
		return goodsStyle;
	}

	public void setGoodsStyle(String goodsStyle) {
		this.goodsStyle = goodsStyle;
	}

	public String getGoodsDescribe() {
		return goodsDescribe;
	}

	public void setGoodsDescribe(String goodsDescribe) {
		this.goodsDescribe = goodsDescribe;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getOriginCountryName() {
		return originCountryName;
	}

	public void setOriginCountryName(String originCountryName) {
		this.originCountryName = originCountryName;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getCurrCodeName() {
		return currCodeName;
	}

	public void setCurrCodeName(String currCodeName) {
		this.currCodeName = currCodeName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
