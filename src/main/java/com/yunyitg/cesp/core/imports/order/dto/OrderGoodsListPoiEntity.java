package com.yunyitg.cesp.core.imports.order.dto;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yunyitg.cesp.common.validation.constraints.BaseCurrency;
import com.yunyitg.cesp.common.validation.constraints.BaseUnit;
import com.yunyitg.cesp.common.validation.constraints.Country;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class OrderGoodsListPoiEntity {

	@Excel(name = "电子订单编号")
	private String entOrderNo;

	@Excel(name = "序号")
	private Integer seq;

	@Excel(name = "企业商品编号")
	@NotBlank(message = "企业商品编号不能为空")
	private String entGoodsNo;

	@Excel(name = "检验检疫商品备案编号")
	@NotBlank(message = "检验检疫商品备案编号不能为空")
	private String ciqGoodsNo;

	@Excel(name = "海关商品备案编号")
	@NotBlank(message = "海关商品备案编号不能为空")
	private String cusGoodsNo;
	
	@Excel(name = "HS编码")
	@NotBlank(message = "HS编码不能为空")
	private String hsCode;

	@Excel(name = "商品名称")
	@NotBlank(message = "商品名称不能为空")
	private String goodsName;

	@Excel(name = "规格型号")
	@NotBlank(message = "规格型号不能为空")
	private String goodsStyle;

	@Excel(name = "商品描述")
	private String goodsDescribe;

	@Excel(name = "原产国")
	@Country(message = "原产国代码取值不合法")
	private String originCountry;

	@Excel(name = "商品条形码")
	private String barCode;

	@Excel(name = "品牌")
	private String brand;

	@Excel(name = "数量")
	@NotNull(message = "数量不能为空")
	@DecimalMin(value = "0.0", message = "数量必须大于等于0")
	private BigDecimal qty;

	@Excel(name = "计量单位")
	@BaseUnit(message = "计量单位代码取值不合法")
	private String unit;

	@Excel(name = "单价")
	@NotNull(message = "单价不能为空")
	@DecimalMin(value = "0.0", message = "单价必须大于等于0")
	private BigDecimal price;

	@Excel(name = "总价")
	@NotNull(message = "总价不能为空")
	@DecimalMin(value = "0.0", message = "总价必须大于等于0")
	private BigDecimal total;

	@Excel(name = "币制")
	@BaseCurrency(message = "币制代码取值不在合理范围内")
	private String currCode;

	@Excel(name = "备注")
	private String notes;
	
	public OrderGoodsListPoiEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getEntOrderNo() {
		return entOrderNo;
	}

	public void setEntOrderNo(String entOrderNo) {
		this.entOrderNo = entOrderNo;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
