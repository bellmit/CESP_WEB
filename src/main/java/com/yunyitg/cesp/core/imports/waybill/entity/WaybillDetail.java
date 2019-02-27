package com.yunyitg.cesp.core.imports.waybill.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "waybill_detail")
public class WaybillDetail {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联电子运单表头ID
     */
    @Column(name = "waybill_head_id")
    private Integer waybillHeadId;

    /**
     * 企业电子运单编号
     */
    @Column(name = "ent_waybill_no")
    private String entWaybillNo;

    /**
     * 申报企业ID
     */
    @Column(name = "decl_ent_id")
    private Integer declEntId;

    /**
     * 所属物流企业ID
     */
    @Column(name = "ehs_ent_id")
    private Integer ehsEntId;

    /**
     * 进出口标示(I-进口;E-出口)
     */
    @Column(name = "ie_flag")
    private String ieFlag;

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
     * 企业电子订单号
     */
    @Column(name = "ent_order_no")
    private String entOrderNo;

    /**
     * 提运单号
     */
    @Column(name = "bill_no")
    private String billNo;

    /**
     * 出仓/进境日期
     */
    @Column(name = "out_date")
    private Date outDate;

    /**
     * 货物存放地
     */
    @Column(name = "discharge_place")
    private String dischargePlace;

    /**
     * 物流批次号
     */
    @Column(name = "ehs_batch_no")
    private String ehsBatchNo;

    /**
     * 运单创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 路由状态
     */
    @Column(name = "route_status")
    private String routeStatus;

    /**
     * 电子运单状态
     */
    @Column(name = "waybill_status")
    private String waybillStatus;

    /**
     * 运费/率
     */
    @Column(name = "fee_rate")
    private BigDecimal feeRate;

    /**
     * 运费币制
     */
    @Column(name = "fee_curr_code")
    private String feeCurrCode;

    /**
     * 运费标志（1代表率；2代表单价；3代表总价）
     */
    @Column(name = "fee_mark")
    private String feeMark;

    /**
     * 保费/率
     */
    @Column(name = "insur_rate")
    private BigDecimal insurRate;

    /**
     * 杂费/率
     */
    @Column(name = "other_rate")
    private BigDecimal otherRate;

    /**
     * 运送货物总价
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 件数
     */
    @Column(name = "pack_no")
    private BigDecimal packNo;

    /**
     * 净重
     */
    @Column(name = "net_wt")
    private BigDecimal netWt;

    /**
     * 毛重
     */
    @Column(name = "gross_wt")
    private BigDecimal grossWt;

    /**
     * 商品信息
     */
    @Column(name = "goods_detail")
    private String goodsDetail;

    /**
     * 收货人名称
     */
    @Column(name = "recipient_name")
    private String recipientName;

    /**
     * 收货人地址
     */
    @Column(name = "recipient_addr")
    private String recipientAddr;

    /**
     * 收货人电话
     */
    @Column(name = "recipient_tel")
    private String recipientTel;

    /**
     * 收货人所在国家代码
     */
    @Column(name = "recipient_country")
    private String recipientCountry;

    /**
     * 收件人省市区代码
     */
    @Column(name = "recipient_provinces_code")
    private String recipientProvincesCode;

    /**
     * 发货人名称
     */
    @Column(name = "shipper_name")
    private String shipperName;

    /**
     * 发货人地址
     */
    @Column(name = "shipper_datailed_address")
    private String shipperDatailedAddress;

    /**
     * 发货人电话
     */
    @Column(name = "shipper_phone")
    private String shipperPhone;

    /**
     * 发货人所在国家代码
     */
    @Column(name = "shipper_country_code")
    private String shipperCountryCode;

    /**
     * 发货人省市区代码
     */
    @Column(name = "shipper_provinces_code")
    private String shipperProvincesCode;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 海关电子运单状态
     */
    @Column(name = "cus_message_status_waybill")
    private String cusMessageStatusWaybill;

    /**
     * 海关运单回执内容
     */
    @Column(name = "cus_waybill_return_info")
    private String cusWaybillReturnInfo;

    /**
     * 国检电子运单状态
     */
    @Column(name = "ciq_message_status_waybill")
    private String ciqMessageStatusWaybill;

    /**
     * 国检运单回执内容
     */
    @Column(name = "ciq_waybill_return_info")
    private String ciqWaybillReturnInfo;

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
     * 获取关联电子运单表头ID
     *
     * @return waybill_head_id - 关联电子运单表头ID
     */
    public Integer getWaybillHeadId() {
        return waybillHeadId;
    }

    /**
     * 设置关联电子运单表头ID
     *
     * @param waybillHeadId 关联电子运单表头ID
     */
    public void setWaybillHeadId(Integer waybillHeadId) {
        this.waybillHeadId = waybillHeadId;
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
     * 获取所属物流企业ID
     *
     * @return ehs_ent_id - 所属物流企业ID
     */
    public Integer getEhsEntId() {
        return ehsEntId;
    }

    /**
     * 设置所属物流企业ID
     *
     * @param ehsEntId 所属物流企业ID
     */
    public void setEhsEntId(Integer ehsEntId) {
        this.ehsEntId = ehsEntId;
    }

    /**
     * 获取进出口标示(I-进口;E-出口)
     *
     * @return ie_flag - 进出口标示(I-进口;E-出口)
     */
    public String getIeFlag() {
        return ieFlag;
    }

    /**
     * 设置进出口标示(I-进口;E-出口)
     *
     * @param ieFlag 进出口标示(I-进口;E-出口)
     */
    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag;
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
     * 获取企业电子订单号
     *
     * @return ent_order_no - 企业电子订单号
     */
    public String getEntOrderNo() {
        return entOrderNo;
    }

    /**
     * 设置企业电子订单号
     *
     * @param entOrderNo 企业电子订单号
     */
    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo;
    }

    /**
     * 获取提运单号
     *
     * @return bill_no - 提运单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置提运单号
     *
     * @param billNo 提运单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 获取出仓/进境日期
     *
     * @return out_date - 出仓/进境日期
     */
    public Date getOutDate() {
        return outDate;
    }

    /**
     * 设置出仓/进境日期
     *
     * @param outDate 出仓/进境日期
     */
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    /**
     * 获取货物存放地
     *
     * @return discharge_place - 货物存放地
     */
    public String getDischargePlace() {
        return dischargePlace;
    }

    /**
     * 设置货物存放地
     *
     * @param dischargePlace 货物存放地
     */
    public void setDischargePlace(String dischargePlace) {
        this.dischargePlace = dischargePlace;
    }

    /**
     * 获取物流批次号
     *
     * @return ehs_batch_no - 物流批次号
     */
    public String getEhsBatchNo() {
        return ehsBatchNo;
    }

    /**
     * 设置物流批次号
     *
     * @param ehsBatchNo 物流批次号
     */
    public void setEhsBatchNo(String ehsBatchNo) {
        this.ehsBatchNo = ehsBatchNo;
    }

    /**
     * 获取运单创建日期
     *
     * @return create_date - 运单创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置运单创建日期
     *
     * @param createDate 运单创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取路由状态
     *
     * @return route_status - 路由状态
     */
    public String getRouteStatus() {
        return routeStatus;
    }

    /**
     * 设置路由状态
     *
     * @param routeStatus 路由状态
     */
    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
    }

    /**
     * 获取电子运单状态
     *
     * @return waybill_status - 电子运单状态
     */
    public String getWaybillStatus() {
        return waybillStatus;
    }

    /**
     * 设置电子运单状态
     *
     * @param waybillStatus 电子运单状态
     */
    public void setWaybillStatus(String waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    /**
     * 获取运费/率
     *
     * @return fee_rate - 运费/率
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * 设置运费/率
     *
     * @param feeRate 运费/率
     */
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * 获取运费币制
     *
     * @return fee_curr_code - 运费币制
     */
    public String getFeeCurrCode() {
        return feeCurrCode;
    }

    /**
     * 设置运费币制
     *
     * @param feeCurrCode 运费币制
     */
    public void setFeeCurrCode(String feeCurrCode) {
        this.feeCurrCode = feeCurrCode;
    }

    /**
     * 获取运费标志（1代表率；2代表单价；3代表总价）
     *
     * @return fee_mark - 运费标志（1代表率；2代表单价；3代表总价）
     */
    public String getFeeMark() {
        return feeMark;
    }

    /**
     * 设置运费标志（1代表率；2代表单价；3代表总价）
     *
     * @param feeMark 运费标志（1代表率；2代表单价；3代表总价）
     */
    public void setFeeMark(String feeMark) {
        this.feeMark = feeMark;
    }

    /**
     * 获取保费/率
     *
     * @return insur_rate - 保费/率
     */
    public BigDecimal getInsurRate() {
        return insurRate;
    }

    /**
     * 设置保费/率
     *
     * @param insurRate 保费/率
     */
    public void setInsurRate(BigDecimal insurRate) {
        this.insurRate = insurRate;
    }

    /**
     * 获取杂费/率
     *
     * @return other_rate - 杂费/率
     */
    public BigDecimal getOtherRate() {
        return otherRate;
    }

    /**
     * 设置杂费/率
     *
     * @param otherRate 杂费/率
     */
    public void setOtherRate(BigDecimal otherRate) {
        this.otherRate = otherRate;
    }

    /**
     * 获取运送货物总价
     *
     * @return total_amount - 运送货物总价
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置运送货物总价
     *
     * @param totalAmount 运送货物总价
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取件数
     *
     * @return pack_no - 件数
     */
    public BigDecimal getPackNo() {
        return packNo;
    }

    /**
     * 设置件数
     *
     * @param packNo 件数
     */
    public void setPackNo(BigDecimal packNo) {
        this.packNo = packNo;
    }

    /**
     * 获取净重
     *
     * @return net_wt - 净重
     */
    public BigDecimal getNetWt() {
        return netWt;
    }

    /**
     * 设置净重
     *
     * @param netWt 净重
     */
    public void setNetWt(BigDecimal netWt) {
        this.netWt = netWt;
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
     * 获取商品信息
     *
     * @return goods_detail - 商品信息
     */
    public String getGoodsDetail() {
        return goodsDetail;
    }

    /**
     * 设置商品信息
     *
     * @param goodsDetail 商品信息
     */
    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    /**
     * 获取收货人名称
     *
     * @return recipient_name - 收货人名称
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * 设置收货人名称
     *
     * @param recipientName 收货人名称
     */
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * 获取收货人地址
     *
     * @return recipient_addr - 收货人地址
     */
    public String getRecipientAddr() {
        return recipientAddr;
    }

    /**
     * 设置收货人地址
     *
     * @param recipientAddr 收货人地址
     */
    public void setRecipientAddr(String recipientAddr) {
        this.recipientAddr = recipientAddr;
    }

    /**
     * 获取收货人电话
     *
     * @return recipient_tel - 收货人电话
     */
    public String getRecipientTel() {
        return recipientTel;
    }

    /**
     * 设置收货人电话
     *
     * @param recipientTel 收货人电话
     */
    public void setRecipientTel(String recipientTel) {
        this.recipientTel = recipientTel;
    }

    /**
     * 获取收货人所在国家代码
     *
     * @return recipient_country - 收货人所在国家代码
     */
    public String getRecipientCountry() {
        return recipientCountry;
    }

    /**
     * 设置收货人所在国家代码
     *
     * @param recipientCountry 收货人所在国家代码
     */
    public void setRecipientCountry(String recipientCountry) {
        this.recipientCountry = recipientCountry;
    }

    /**
     * 获取收件人省市区代码
     *
     * @return recipient_provinces_code - 收件人省市区代码
     */
    public String getRecipientProvincesCode() {
        return recipientProvincesCode;
    }

    /**
     * 设置收件人省市区代码
     *
     * @param recipientProvincesCode 收件人省市区代码
     */
    public void setRecipientProvincesCode(String recipientProvincesCode) {
        this.recipientProvincesCode = recipientProvincesCode;
    }

    /**
     * 获取发货人名称
     *
     * @return shipper_name - 发货人名称
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * 设置发货人名称
     *
     * @param shipperName 发货人名称
     */
    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    /**
     * 获取发货人地址
     *
     * @return shipper_datailed_address - 发货人地址
     */
    public String getShipperDatailedAddress() {
        return shipperDatailedAddress;
    }

    /**
     * 设置发货人地址
     *
     * @param shipperDatailedAddress 发货人地址
     */
    public void setShipperDatailedAddress(String shipperDatailedAddress) {
        this.shipperDatailedAddress = shipperDatailedAddress;
    }

    /**
     * 获取发货人电话
     *
     * @return shipper_phone - 发货人电话
     */
    public String getShipperPhone() {
        return shipperPhone;
    }

    /**
     * 设置发货人电话
     *
     * @param shipperPhone 发货人电话
     */
    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }

    /**
     * 获取发货人所在国家代码
     *
     * @return shipper_country_code - 发货人所在国家代码
     */
    public String getShipperCountryCode() {
        return shipperCountryCode;
    }

    /**
     * 设置发货人所在国家代码
     *
     * @param shipperCountryCode 发货人所在国家代码
     */
    public void setShipperCountryCode(String shipperCountryCode) {
        this.shipperCountryCode = shipperCountryCode;
    }

    /**
     * 获取发货人省市区代码
     *
     * @return shipper_provinces_code - 发货人省市区代码
     */
    public String getShipperProvincesCode() {
        return shipperProvincesCode;
    }

    /**
     * 设置发货人省市区代码
     *
     * @param shipperProvincesCode 发货人省市区代码
     */
    public void setShipperProvincesCode(String shipperProvincesCode) {
        this.shipperProvincesCode = shipperProvincesCode;
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
     * 获取海关电子运单状态
     *
     * @return cus_message_status_waybill - 海关电子运单状态
     */
    public String getCusMessageStatusWaybill() {
        return cusMessageStatusWaybill;
    }

    /**
     * 设置海关电子运单状态
     *
     * @param cusMessageStatusWaybill 海关电子运单状态
     */
    public void setCusMessageStatusWaybill(String cusMessageStatusWaybill) {
        this.cusMessageStatusWaybill = cusMessageStatusWaybill;
    }

    /**
     * 获取海关运单回执内容
     *
     * @return cus_waybill_return_info - 海关运单回执内容
     */
    public String getCusWaybillReturnInfo() {
        return cusWaybillReturnInfo;
    }

    /**
     * 设置海关运单回执内容
     *
     * @param cusWaybillReturnInfo 海关运单回执内容
     */
    public void setCusWaybillReturnInfo(String cusWaybillReturnInfo) {
        this.cusWaybillReturnInfo = cusWaybillReturnInfo;
    }

    /**
     * 获取国检电子运单状态
     *
     * @return ciq_message_status_waybill - 国检电子运单状态
     */
    public String getCiqMessageStatusWaybill() {
        return ciqMessageStatusWaybill;
    }

    /**
     * 设置国检电子运单状态
     *
     * @param ciqMessageStatusWaybill 国检电子运单状态
     */
    public void setCiqMessageStatusWaybill(String ciqMessageStatusWaybill) {
        this.ciqMessageStatusWaybill = ciqMessageStatusWaybill;
    }

    /**
     * 获取国检运单回执内容
     *
     * @return ciq_waybill_return_info - 国检运单回执内容
     */
    public String getCiqWaybillReturnInfo() {
        return ciqWaybillReturnInfo;
    }

    /**
     * 设置国检运单回执内容
     *
     * @param ciqWaybillReturnInfo 国检运单回执内容
     */
    public void setCiqWaybillReturnInfo(String ciqWaybillReturnInfo) {
        this.ciqWaybillReturnInfo = ciqWaybillReturnInfo;
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
    
    public boolean isCusWaybillEditable() {
    	if(cusMessageStatusWaybill == null || cusMessageStatusWaybill.trim().equals("") || cusMessageStatusWaybill.equals("0") || cusMessageStatusWaybill.equals("F")
    			|| cusMessageStatusWaybill.equals("3") || cusMessageStatusWaybill.equals("100") || cusMessageStatusWaybill.startsWith("-")){
    		return true;
    	}
    	return false;
    }
    
    public boolean isCiqWaybillEditable() {
    	if(ciqMessageStatusWaybill == null || ciqMessageStatusWaybill.trim().equals("") || ciqMessageStatusWaybill.equals("0") || ciqMessageStatusWaybill.equals("F")
				|| ciqMessageStatusWaybill.equals("3") || ciqMessageStatusWaybill.equals("100") || ciqMessageStatusWaybill.startsWith("-")){
			return true;
		}
		return false;
    }
    
    public boolean isBothWaybillEditable() {
    	if (isCusWaybillEditable() && isCiqWaybillEditable()) {
    		return true;
    	}
    	return false;
    }
}