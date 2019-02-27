//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.05.11 时间 11:07:00 AM CST 
//


package com.yunyitg.cesp.core.imports.list.xml.obj;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "head",
    "declaration"
})
@XmlRootElement(name = "InternationalTrade")
public class InternationalTrade {

    @XmlElement(name = "Head", required = true)
    protected InternationalTrade.Head head;
    @XmlElement(name = "Declaration", required = true)
    protected InternationalTrade.Declaration declaration;

    /**
     * 获取head属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InternationalTrade.Head }
     *     
     */
    public InternationalTrade.Head getHead() {
        return head;
    }

    /**
     * 设置head属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTrade.Head }
     *     
     */
    public void setHead(InternationalTrade.Head value) {
        this.head = value;
    }

    /**
     * 获取declaration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InternationalTrade.Declaration }
     *     
     */
    public InternationalTrade.Declaration getDeclaration() {
        return declaration;
    }

    /**
     * 设置declaration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTrade.Declaration }
     *     
     */
    public void setDeclaration(InternationalTrade.Declaration value) {
        this.declaration = value;
    }


    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eListHead",
        "elistDetailInfoList"
    })
    public static class Declaration {

        @XmlElement(name = "EListHead", required = true)
        protected InternationalTrade.Declaration.EListHead eListHead;
        @XmlElement(name = "ElistDetailInfoList", required = true)
        protected InternationalTrade.Declaration.ElistDetailInfoList elistDetailInfoList;

        /**
         * 获取eListHead属性的值。
         * 
         * @return
         *     possible object is
         *     {@link InternationalTrade.Declaration.EListHead }
         *     
         */
        public InternationalTrade.Declaration.EListHead getEListHead() {
            return eListHead;
        }

        /**
         * 设置eListHead属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link InternationalTrade.Declaration.EListHead }
         *     
         */
        public void setEListHead(InternationalTrade.Declaration.EListHead value) {
            this.eListHead = value;
        }

        /**
         * 获取elistDetailInfoList属性的值。
         * 
         * @return
         *     possible object is
         *     {@link InternationalTrade.Declaration.ElistDetailInfoList }
         *     
         */
        public InternationalTrade.Declaration.ElistDetailInfoList getElistDetailInfoList() {
            return elistDetailInfoList;
        }

        /**
         * 设置elistDetailInfoList属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link InternationalTrade.Declaration.ElistDetailInfoList }
         *     
         */
        public void setElistDetailInfoList(InternationalTrade.Declaration.ElistDetailInfoList value) {
            this.elistDetailInfoList = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class EListHead {

            @XmlElement(name = "DeclEntNo", required = true)
            protected String declEntNo;
            @XmlElement(name = "DeclEntName", required = true)
            protected String declEntName;
            @XmlElement(name = "ContactTel", required = true)
            protected String contactTel;
            @XmlElement(name = "EBEntNo", required = true)
            protected String ebEntNo;
            @XmlElement(name = "EBEntName", required = true)
            protected String ebEntName;
            @XmlElement(name = "InternetDomainName", required = true)
            protected String internetDomainName;
            @XmlElement(name = "CustomsCode", required = true)
            protected String customsCode;
            @XmlElement(name = "CIQOrgCode", required = true)
            protected String ciqOrgCode;
            @XmlElement(name = "ApplySeaPort", required = true)
            protected String applySeaPort;
            @XmlElement(name = "OpType", required = true)
            protected String opType;
            @XmlElement(name = "TradeMode", required = true)
            protected String tradeMode;
            @XmlElement(name = "IeFlag", required = true)
            protected String ieFlag;
            @XmlElement(name = "EListType", required = true)
            protected String eListType;
            @XmlElement(name = "TotalCount", required = true)
            protected BigInteger totalCount;
            @XmlElement(name = "TotalWeight", required = true)
            protected BigDecimal totalWeight;
            @XmlElement(name = "TotalPackNum", required = true)
            protected BigInteger totalPackNum;
            @XmlElement(name = "TotalValue", required = true)
            protected BigDecimal totalValue;
            @XmlElement(name = "CurrCode", required = true)
            protected String currCode;
            @XmlElement(name = "DeclTime", required = true)
            protected String declTime;
            @XmlElement(name = "InputDate", required = true)
            protected String inputDate;
            @XmlElement(name = "DataEntryStaff")
            protected String dataEntryStaff;
            @XmlElement(name = "DataEntryComp")
            protected String dataEntryComp;
            @XmlElement(name = "CompAccessNo", required = true)
            protected String compAccessNo;
            @XmlElement(name = "CompAccessName", required = true)
            protected String compAccessName;
            @XmlElement(name = "CustomsDeclarer")
            protected String customsDeclarer;
            @XmlElement(name = "DeclarerationCompAddr")
            protected String declarerationCompAddr;
            @XmlElement(name = "DeclarerPostCode")
            protected String declarerPostCode;
            @XmlElement(name = "CustomsDeclarerTel")
            protected String customsDeclarerTel;
            @XmlElement(name = "Notes")
            protected String notes;

            /**
             * 获取declEntNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeclEntNo() {
                return declEntNo;
            }

            /**
             * 设置declEntNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeclEntNo(String value) {
                this.declEntNo = value;
            }

            /**
             * 获取declEntName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeclEntName() {
                return declEntName;
            }

            /**
             * 设置declEntName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeclEntName(String value) {
                this.declEntName = value;
            }

            /**
             * 获取contactTel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactTel() {
                return contactTel;
            }

            /**
             * 设置contactTel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactTel(String value) {
                this.contactTel = value;
            }

            /**
             * 获取ebEntNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEBEntNo() {
                return ebEntNo;
            }

            /**
             * 设置ebEntNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEBEntNo(String value) {
                this.ebEntNo = value;
            }

            /**
             * 获取ebEntName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEBEntName() {
                return ebEntName;
            }

            /**
             * 设置ebEntName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEBEntName(String value) {
                this.ebEntName = value;
            }

            /**
             * 获取internetDomainName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInternetDomainName() {
                return internetDomainName;
            }

            /**
             * 设置internetDomainName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInternetDomainName(String value) {
                this.internetDomainName = value;
            }

            /**
             * 获取customsCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomsCode() {
                return customsCode;
            }

            /**
             * 设置customsCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomsCode(String value) {
                this.customsCode = value;
            }

            /**
             * 获取ciqOrgCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCIQOrgCode() {
                return ciqOrgCode;
            }

            /**
             * 设置ciqOrgCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCIQOrgCode(String value) {
                this.ciqOrgCode = value;
            }

            /**
             * 获取applySeaPort属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplySeaPort() {
                return applySeaPort;
            }

            /**
             * 设置applySeaPort属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplySeaPort(String value) {
                this.applySeaPort = value;
            }

            /**
             * 获取opType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpType() {
                return opType;
            }

            /**
             * 设置opType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpType(String value) {
                this.opType = value;
            }

            /**
             * 获取tradeMode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTradeMode() {
                return tradeMode;
            }

            /**
             * 设置tradeMode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradeMode(String value) {
                this.tradeMode = value;
            }

            /**
             * 获取ieFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIeFlag() {
                return ieFlag;
            }

            /**
             * 设置ieFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIeFlag(String value) {
                this.ieFlag = value;
            }

            /**
             * 获取eListType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEListType() {
                return eListType;
            }

            /**
             * 设置eListType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEListType(String value) {
                this.eListType = value;
            }

            /**
             * 获取totalCount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalCount() {
                return totalCount;
            }

            /**
             * 设置totalCount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalCount(BigInteger value) {
                this.totalCount = value;
            }

            /**
             * 获取totalWeight属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalWeight() {
                return totalWeight;
            }

            /**
             * 设置totalWeight属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalWeight(BigDecimal value) {
                this.totalWeight = value;
            }

            /**
             * 获取totalPackNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalPackNum() {
                return totalPackNum;
            }

            /**
             * 设置totalPackNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalPackNum(BigInteger value) {
                this.totalPackNum = value;
            }

            /**
             * 获取totalValue属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalValue() {
                return totalValue;
            }

            /**
             * 设置totalValue属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalValue(BigDecimal value) {
                this.totalValue = value;
            }

            /**
             * 获取currCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrCode() {
                return currCode;
            }

            /**
             * 设置currCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrCode(String value) {
                this.currCode = value;
            }

            /**
             * 获取declTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeclTime() {
                return declTime;
            }

            /**
             * 设置declTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeclTime(String value) {
                this.declTime = value;
            }

            /**
             * 获取inputDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInputDate() {
                return inputDate;
            }

            /**
             * 设置inputDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInputDate(String value) {
                this.inputDate = value;
            }

            /**
             * 获取dataEntryStaff属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataEntryStaff() {
                return dataEntryStaff;
            }

            /**
             * 设置dataEntryStaff属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataEntryStaff(String value) {
                this.dataEntryStaff = value;
            }

            /**
             * 获取dataEntryComp属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataEntryComp() {
                return dataEntryComp;
            }

            /**
             * 设置dataEntryComp属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataEntryComp(String value) {
                this.dataEntryComp = value;
            }

            /**
             * 获取compAccessNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompAccessNo() {
                return compAccessNo;
            }

            /**
             * 设置compAccessNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompAccessNo(String value) {
                this.compAccessNo = value;
            }

            /**
             * 获取compAccessName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompAccessName() {
                return compAccessName;
            }

            /**
             * 设置compAccessName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompAccessName(String value) {
                this.compAccessName = value;
            }

            /**
             * 获取customsDeclarer属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomsDeclarer() {
                return customsDeclarer;
            }

            /**
             * 设置customsDeclarer属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomsDeclarer(String value) {
                this.customsDeclarer = value;
            }

            /**
             * 获取declarerationCompAddr属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeclarerationCompAddr() {
                return declarerationCompAddr;
            }

            /**
             * 设置declarerationCompAddr属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeclarerationCompAddr(String value) {
                this.declarerationCompAddr = value;
            }

            /**
             * 获取declarerPostCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeclarerPostCode() {
                return declarerPostCode;
            }

            /**
             * 设置declarerPostCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeclarerPostCode(String value) {
                this.declarerPostCode = value;
            }

            /**
             * 获取customsDeclarerTel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomsDeclarerTel() {
                return customsDeclarerTel;
            }

            /**
             * 设置customsDeclarerTel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomsDeclarerTel(String value) {
                this.customsDeclarerTel = value;
            }

            /**
             * 获取notes属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotes() {
                return notes;
            }

            /**
             * 设置notes属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotes(String value) {
                this.notes = value;
            }

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "elistDetailInfo"
        })
        public static class ElistDetailInfoList {

            @XmlElement(name = "ElistDetailInfo", required = true)
            protected List<InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo> elistDetailInfo;

            /**
             * Gets the value of the elistDetailInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the elistDetailInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getElistDetailInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo }
             * 
             * 
             */
            public List<InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo> getElistDetailInfo() {
                if (elistDetailInfo == null) {
                    elistDetailInfo = new ArrayList<InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo>();
                }
                return this.elistDetailInfo;
            }


           
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class ElistDetailInfo {

                @XmlElement(name = "EntEListNo", required = true)
                protected String entEListNo;
                @XmlElement(name = "EPortEListNo")
                protected String ePortEListNo;
                @XmlElement(name = "CusEListNo")
                protected String cusEListNo;
                @XmlElement(name = "CIQEListNo")
                protected String ciqeListNo;
                @XmlElement(name = "AssureCode", required = true)
                protected String assureCode;
                @XmlElement(name = "IEPort", required = true)
                protected String iePort;
                @XmlElement(name = "SvPCode", required = true)
                protected String svPCode;
                @XmlElement(name = "IEDate", required = true)
                protected String ieDate;
                @XmlElement(name = "EmsNo")
                protected String emsNo;
                @XmlElement(name = "AreaCode")
                protected String areaCode;
                @XmlElement(name = "AreaName")
                protected String areaName;
                @XmlElement(name = "LicenseNo")
                protected String licenseNo;
                @XmlElement(name = "ApprNo")
                protected String apprNo;
                @XmlElement(name = "TransMode", required = true)
                protected String transMode;
                @XmlElement(name = "UseTo")
                protected String useTo;
                @XmlElement(name = "BillNo", required = true)
                protected String billNo;
                @XmlElement(name = "PackEntName")
                protected String packEntName;
                @XmlElement(name = "WrapType", required = true)
                protected String wrapType;
                @XmlElement(name = "PackQuantity")
                protected int packQuantity;
                @XmlElement(name = "TransType", required = true)
                protected String transType;
                @XmlElement(name = "TransCode", required = true)
                protected String transCode;
                @XmlElement(name = "TransNo", required = true)
                protected String transNo;
                @XmlElement(name = "VoyageNo", required = true)
                protected String voyageNo;
                @XmlElement(name = "DestinationCountry", required = true)
                protected String destinationCountry;
                @XmlElement(name = "DestinationPort", required = true)
                protected String destinationPort;
                @XmlElement(name = "EdestDate", required = true)
                protected String edestDate;
                @XmlElement(name = "RouteCountry")
                protected String routeCountry;
                @XmlElement(name = "ConsigneeName", required = true)
                protected String consigneeName;
                @XmlElement(name = "ConsigneeIdNum", required = true)
                protected String consigneeIdNum;
                @XmlElement(name = "ConsigneeCardType", required = true)
                protected String consigneeCardType;
                @XmlElement(name = "ConsigneeCountry", required = true)
                protected String consigneeCountry;
                @XmlElement(name = "ConsigneeTel", required = true)
                protected String consigneeTel;
                @XmlElement(name = "Notes")
                protected String notes;
                @XmlElement(name = "EListWaybill", required = true)
                protected InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListWaybill eListWaybill;
                @XmlElement(name = "EListPay")
                protected InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListPay eListPay;
                @XmlElement(name = "EListOrder", required = true)
                protected InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder eListOrder;

                /**
                 * 获取entEListNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEntEListNo() {
                    return entEListNo;
                }

                /**
                 * 设置entEListNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEntEListNo(String value) {
                    this.entEListNo = value;
                }

                /**
                 * 获取ePortEListNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEPortEListNo() {
                    return ePortEListNo;
                }

                /**
                 * 设置ePortEListNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEPortEListNo(String value) {
                    this.ePortEListNo = value;
                }

                /**
                 * 获取cusEListNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCusEListNo() {
                    return cusEListNo;
                }

                /**
                 * 设置cusEListNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCusEListNo(String value) {
                    this.cusEListNo = value;
                }

                /**
                 * 获取ciqeListNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCIQEListNo() {
                    return ciqeListNo;
                }

                /**
                 * 设置ciqeListNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCIQEListNo(String value) {
                    this.ciqeListNo = value;
                }

                /**
                 * 获取assureCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAssureCode() {
                    return assureCode;
                }

                /**
                 * 设置assureCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAssureCode(String value) {
                    this.assureCode = value;
                }

                /**
                 * 获取iePort属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIEPort() {
                    return iePort;
                }

                /**
                 * 设置iePort属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIEPort(String value) {
                    this.iePort = value;
                }

                /**
                 * 获取svPCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSvPCode() {
                    return svPCode;
                }

                /**
                 * 设置svPCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSvPCode(String value) {
                    this.svPCode = value;
                }

                /**
                 * 获取ieDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIEDate() {
                    return ieDate;
                }

                /**
                 * 设置ieDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIEDate(String value) {
                    this.ieDate = value;
                }

                /**
                 * 获取emsNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmsNo() {
                    return emsNo;
                }

                /**
                 * 设置emsNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmsNo(String value) {
                    this.emsNo = value;
                }

                /**
                 * 获取areaCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAreaCode() {
                    return areaCode;
                }

                /**
                 * 设置areaCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAreaCode(String value) {
                    this.areaCode = value;
                }

                /**
                 * 获取areaName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAreaName() {
                    return areaName;
                }

                /**
                 * 设置areaName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAreaName(String value) {
                    this.areaName = value;
                }

                /**
                 * 获取licenseNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLicenseNo() {
                    return licenseNo;
                }

                /**
                 * 设置licenseNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLicenseNo(String value) {
                    this.licenseNo = value;
                }

                /**
                 * 获取apprNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApprNo() {
                    return apprNo;
                }

                /**
                 * 设置apprNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApprNo(String value) {
                    this.apprNo = value;
                }

                /**
                 * 获取transMode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransMode() {
                    return transMode;
                }

                /**
                 * 设置transMode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransMode(String value) {
                    this.transMode = value;
                }

                /**
                 * 获取useTo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUseTo() {
                    return useTo;
                }

                /**
                 * 设置useTo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUseTo(String value) {
                    this.useTo = value;
                }

                /**
                 * 获取billNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBillNo() {
                    return billNo;
                }

                /**
                 * 设置billNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBillNo(String value) {
                    this.billNo = value;
                }

                /**
                 * 获取packEntName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPackEntName() {
                    return packEntName;
                }

                /**
                 * 设置packEntName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPackEntName(String value) {
                    this.packEntName = value;
                }

                /**
                 * 获取wrapType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWrapType() {
                    return wrapType;
                }

                /**
                 * 设置wrapType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWrapType(String value) {
                    this.wrapType = value;
                }

                /**
                 * 获取packQuantity属性的值。
                 * 
                 */
                public int getPackQuantity() {
                    return packQuantity;
                }

                /**
                 * 设置packQuantity属性的值。
                 * 
                 */
                public void setPackQuantity(int value) {
                    this.packQuantity = value;
                }

                /**
                 * 获取transType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransType() {
                    return transType;
                }

                /**
                 * 设置transType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransType(String value) {
                    this.transType = value;
                }

                /**
                 * 获取transCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransCode() {
                    return transCode;
                }

                /**
                 * 设置transCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransCode(String value) {
                    this.transCode = value;
                }

                /**
                 * 获取transNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransNo() {
                    return transNo;
                }

                /**
                 * 设置transNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransNo(String value) {
                    this.transNo = value;
                }

                /**
                 * 获取voyageNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVoyageNo() {
                    return voyageNo;
                }

                /**
                 * 设置voyageNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVoyageNo(String value) {
                    this.voyageNo = value;
                }

                /**
                 * 获取destinationCountry属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCountry() {
                    return destinationCountry;
                }

                /**
                 * 设置destinationCountry属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCountry(String value) {
                    this.destinationCountry = value;
                }

                /**
                 * 获取destinationPort属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationPort() {
                    return destinationPort;
                }

                /**
                 * 设置destinationPort属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationPort(String value) {
                    this.destinationPort = value;
                }

                /**
                 * 获取edestDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEdestDate() {
                    return edestDate;
                }

                /**
                 * 设置edestDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEdestDate(String value) {
                    this.edestDate = value;
                }

                /**
                 * 获取routeCountry属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRouteCountry() {
                    return routeCountry;
                }

                /**
                 * 设置routeCountry属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRouteCountry(String value) {
                    this.routeCountry = value;
                }

                /**
                 * 获取consigneeName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeName() {
                    return consigneeName;
                }

                /**
                 * 设置consigneeName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeName(String value) {
                    this.consigneeName = value;
                }

                /**
                 * 获取consigneeIdNum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeIdNum() {
                    return consigneeIdNum;
                }

                /**
                 * 设置consigneeIdNum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeIdNum(String value) {
                    this.consigneeIdNum = value;
                }

                /**
                 * 获取consigneeCardType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeCardType() {
                    return consigneeCardType;
                }

                /**
                 * 设置consigneeCardType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeCardType(String value) {
                    this.consigneeCardType = value;
                }

                /**
                 * 获取consigneeCountry属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeCountry() {
                    return consigneeCountry;
                }

                /**
                 * 设置consigneeCountry属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeCountry(String value) {
                    this.consigneeCountry = value;
                }

                /**
                 * 获取consigneeTel属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConsigneeTel() {
                    return consigneeTel;
                }

                /**
                 * 设置consigneeTel属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConsigneeTel(String value) {
                    this.consigneeTel = value;
                }

                /**
                 * 获取notes属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotes() {
                    return notes;
                }

                /**
                 * 设置notes属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotes(String value) {
                    this.notes = value;
                }

                /**
                 * 获取eListWaybill属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListWaybill }
                 *     
                 */
                public InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListWaybill getEListWaybill() {
                    return eListWaybill;
                }

                /**
                 * 设置eListWaybill属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListWaybill }
                 *     
                 */
                public void setEListWaybill(InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListWaybill value) {
                    this.eListWaybill = value;
                }

                /**
                 * 获取eListPay属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListPay }
                 *     
                 */
                public InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListPay getEListPay() {
                    return eListPay;
                }

                /**
                 * 设置eListPay属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListPay }
                 *     
                 */
                public void setEListPay(InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListPay value) {
                    this.eListPay = value;
                }

                /**
                 * 获取eListOrder属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder }
                 *     
                 */
                public InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder getEListOrder() {
                    return eListOrder;
                }

                /**
                 * 设置eListOrder属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder }
                 *     
                 */
                public void setEListOrder(InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder value) {
                    this.eListOrder = value;
                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class EListOrder {

                    @XmlElement(name = "EBPEntNo", required = true)
                    protected String ebpEntNo;
                    @XmlElement(name = "EBPEntName", required = true)
                    protected String ebpEntName;
                    @XmlElement(name = "EntOrderNo", required = true)
                    protected String entOrderNo;
                    @XmlElement(name = "GoodsDetailInfoList", required = true)
                    protected InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder.GoodsDetailInfoList goodsDetailInfoList;

                    /**
                     * 获取ebpEntNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEBPEntNo() {
                        return ebpEntNo;
                    }

                    /**
                     * 设置ebpEntNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEBPEntNo(String value) {
                        this.ebpEntNo = value;
                    }

                    /**
                     * 获取ebpEntName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEBPEntName() {
                        return ebpEntName;
                    }

                    /**
                     * 设置ebpEntName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEBPEntName(String value) {
                        this.ebpEntName = value;
                    }

                    /**
                     * 获取entOrderNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEntOrderNo() {
                        return entOrderNo;
                    }

                    /**
                     * 设置entOrderNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEntOrderNo(String value) {
                        this.entOrderNo = value;
                    }

                    /**
                     * 获取goodsDetailInfoList属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder.GoodsDetailInfoList }
                     *     
                     */
                    public InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder.GoodsDetailInfoList getGoodsDetailInfoList() {
                        return goodsDetailInfoList;
                    }

                    /**
                     * 设置goodsDetailInfoList属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder.GoodsDetailInfoList }
                     *     
                     */
                    public void setGoodsDetailInfoList(InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder.GoodsDetailInfoList value) {
                        this.goodsDetailInfoList = value;
                    }


                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "goodsDetailInfo"
                    })
                    public static class GoodsDetailInfoList {

                        @XmlElement(name = "GoodsDetailInfo", required = true)
                        protected List<InternationalTrade.Declaration.ElistDetailInfoList.ElistDetailInfo.EListOrder.GoodsDetailInfoList.GoodsDetailInfo> goodsDetailInfo;

                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {

                        })
                        public static class GoodsDetailInfo {

                            @XmlElement(name = "Seq", required = true)
                            protected BigDecimal seq;
                            @XmlElement(name = "CIQGoodsNo", required = true)
                            protected String ciqGoodsNo;
                            @XmlElement(name = "CusGoodsNo", required = true)
                            protected String cusGoodsNo;
                            @XmlElement(name = "EntGoodsNo", required = true)
                            protected String entGoodsNo;
                            @XmlElement(name = "GoodsName", required = true)
                            protected String goodsName;
                            @XmlElement(name = "GName", required = true)
                            protected String gName;
                            @XmlElement(name = "GoodsStyle", required = true)
                            protected String goodsStyle;
                            @XmlElement(name = "HSCode", required = true)
                            protected String hsCode;
                            @XmlElement(name = "Brand")
                            protected String brand;
                            @XmlElement(name = "BarCode")
                            protected String barCode;
                            @XmlElement(name = "OriginCountry", required = true)
                            protected String originCountry;
                            @XmlElement(name = "DischargePlace", required = true)
                            protected String dischargePlace;
                            @XmlElement(name = "GoodsBatchNo")
                            protected String goodsBatchNo;
                            @XmlElement(name = "LicenseNo")
                            protected String licenseNo;
                            @XmlElement(name = "ApprNo")
                            protected String apprNo;
                            @XmlElement(name = "PackageType", required = true)
                            protected String packageType;
                            @XmlElement(name = "PackNum", required = true)
                            protected BigDecimal packNum;
                            @XmlElement(name = "Qty", required = true)
                            protected BigDecimal qty;
                            @XmlElement(name = "GUnit", required = true)
                            protected String gUnit;
                            @XmlElement(name = "StdUnit", required = true)
                            protected String stdUnit;
                            @XmlElement(name = "StdQty", required = true)
                            protected BigDecimal stdQty;
                            @XmlElement(name = "SecUnit")
                            protected String secUnit;
                            @XmlElement(name = "SecQty")
                            protected BigDecimal secQty;
                            @XmlElement(name = "GrossWeight")
                            protected BigDecimal grossWeight;
                            @XmlElement(name = "UnitPrice", required = true)
                            protected BigDecimal unitPrice;
                            @XmlElement(name = "TotalPrice", required = true)
                            protected BigDecimal totalPrice;
                            @XmlElement(name = "Notes")
                            protected String notes;

                            /**
                             * 获取seq属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getSeq() {
                                return seq;
                            }

                            /**
                             * 设置seq属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setSeq(BigDecimal value) {
                                this.seq = value;
                            }

                            /**
                             * 获取ciqGoodsNo属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCIQGoodsNo() {
                                return ciqGoodsNo;
                            }

                            /**
                             * 设置ciqGoodsNo属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCIQGoodsNo(String value) {
                                this.ciqGoodsNo = value;
                            }

                            /**
                             * 获取cusGoodsNo属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCusGoodsNo() {
                                return cusGoodsNo;
                            }

                            /**
                             * 设置cusGoodsNo属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCusGoodsNo(String value) {
                                this.cusGoodsNo = value;
                            }

                            /**
                             * 获取entGoodsNo属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getEntGoodsNo() {
                                return entGoodsNo;
                            }

                            /**
                             * 设置entGoodsNo属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setEntGoodsNo(String value) {
                                this.entGoodsNo = value;
                            }

                            /**
                             * 获取goodsName属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGoodsName() {
                                return goodsName;
                            }

                            /**
                             * 设置goodsName属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGoodsName(String value) {
                                this.goodsName = value;
                            }

                            /**
                             * 获取gName属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGName() {
                                return gName;
                            }

                            /**
                             * 设置gName属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGName(String value) {
                                this.gName = value;
                            }

                            /**
                             * 获取goodsStyle属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGoodsStyle() {
                                return goodsStyle;
                            }

                            /**
                             * 设置goodsStyle属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGoodsStyle(String value) {
                                this.goodsStyle = value;
                            }

                            /**
                             * 获取hsCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getHSCode() {
                                return hsCode;
                            }

                            /**
                             * 设置hsCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setHSCode(String value) {
                                this.hsCode = value;
                            }

                            /**
                             * 获取brand属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getBrand() {
                                return brand;
                            }

                            /**
                             * 设置brand属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setBrand(String value) {
                                this.brand = value;
                            }

                            /**
                             * 获取barCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getBarCode() {
                                return barCode;
                            }

                            /**
                             * 设置barCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setBarCode(String value) {
                                this.barCode = value;
                            }

                            /**
                             * 获取originCountry属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getOriginCountry() {
                                return originCountry;
                            }

                            /**
                             * 设置originCountry属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setOriginCountry(String value) {
                                this.originCountry = value;
                            }

                            /**
                             * 获取dischargePlace属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDischargePlace() {
                                return dischargePlace;
                            }

                            /**
                             * 设置dischargePlace属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDischargePlace(String value) {
                                this.dischargePlace = value;
                            }

                            /**
                             * 获取goodsBatchNo属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGoodsBatchNo() {
                                return goodsBatchNo;
                            }

                            /**
                             * 设置goodsBatchNo属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGoodsBatchNo(String value) {
                                this.goodsBatchNo = value;
                            }

                            /**
                             * 获取licenseNo属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getLicenseNo() {
                                return licenseNo;
                            }

                            /**
                             * 设置licenseNo属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setLicenseNo(String value) {
                                this.licenseNo = value;
                            }

                            /**
                             * 获取apprNo属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getApprNo() {
                                return apprNo;
                            }

                            /**
                             * 设置apprNo属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setApprNo(String value) {
                                this.apprNo = value;
                            }

                            /**
                             * 获取packageType属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPackageType() {
                                return packageType;
                            }

                            /**
                             * 设置packageType属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPackageType(String value) {
                                this.packageType = value;
                            }

                            /**
                             * 获取packNum属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getPackNum() {
                                return packNum;
                            }

                            /**
                             * 设置packNum属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setPackNum(BigDecimal value) {
                                this.packNum = value;
                            }

                            /**
                             * 获取qty属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getQty() {
                                return qty;
                            }

                            /**
                             * 设置qty属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setQty(BigDecimal value) {
                                this.qty = value;
                            }

                            /**
                             * 获取gUnit属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGUnit() {
                                return gUnit;
                            }

                            /**
                             * 设置gUnit属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGUnit(String value) {
                                this.gUnit = value;
                            }

                            /**
                             * 获取stdUnit属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStdUnit() {
                                return stdUnit;
                            }

                            /**
                             * 设置stdUnit属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStdUnit(String value) {
                                this.stdUnit = value;
                            }

                            /**
                             * 获取stdQty属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getStdQty() {
                                return stdQty;
                            }

                            /**
                             * 设置stdQty属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setStdQty(BigDecimal value) {
                                this.stdQty = value;
                            }

                            /**
                             * 获取secUnit属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSecUnit() {
                                return secUnit;
                            }

                            /**
                             * 设置secUnit属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSecUnit(String value) {
                                this.secUnit = value;
                            }

                            /**
                             * 获取secQty属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getSecQty() {
                                return secQty;
                            }

                            /**
                             * 设置secQty属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setSecQty(BigDecimal value) {
                                this.secQty = value;
                            }

                            /**
                             * 获取grossWeight属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getGrossWeight() {
                                return grossWeight;
                            }

                            /**
                             * 设置grossWeight属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setGrossWeight(BigDecimal value) {
                                this.grossWeight = value;
                            }

                            /**
                             * 获取unitPrice属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getUnitPrice() {
                                return unitPrice;
                            }

                            /**
                             * 设置unitPrice属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setUnitPrice(BigDecimal value) {
                                this.unitPrice = value;
                            }

                            /**
                             * 获取totalPrice属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getTotalPrice() {
                                return totalPrice;
                            }

                            /**
                             * 设置totalPrice属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setTotalPrice(BigDecimal value) {
                                this.totalPrice = value;
                            }

                            /**
                             * 获取notes属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getNotes() {
                                return notes;
                            }

                            /**
                             * 设置notes属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setNotes(String value) {
                                this.notes = value;
                            }

                        }

                    }

                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class EListPay {

                    @XmlElement(name = "EntPayNo")
                    protected String entPayNo;
                    @XmlElement(name = "PayEntNo")
                    protected String payEntNo;
                    @XmlElement(name = "PayEntName")
                    protected String payEntName;
                    @XmlElement(name = "Notes")
                    protected String notes;

                    /**
                     * 获取entPayNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEntPayNo() {
                        return entPayNo;
                    }

                    /**
                     * 设置entPayNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEntPayNo(String value) {
                        this.entPayNo = value;
                    }

                    /**
                     * 获取payEntNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPayEntNo() {
                        return payEntNo;
                    }

                    /**
                     * 设置payEntNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPayEntNo(String value) {
                        this.payEntNo = value;
                    }

                    /**
                     * 获取payEntName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPayEntName() {
                        return payEntName;
                    }

                    /**
                     * 设置payEntName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPayEntName(String value) {
                        this.payEntName = value;
                    }

                    /**
                     * 获取notes属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * 设置notes属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class EListWaybill {

                    @XmlElement(name = "EntWaybillNo", required = true)
                    protected String entWaybillNo;
                    @XmlElement(name = "EHSEntNo", required = true)
                    protected String ehsEntNo;
                    @XmlElement(name = "EHSEntName", required = true)
                    protected String ehsEntName;
                    @XmlElement(name = "GrossWeight", required = true)
                    protected BigDecimal grossWeight;
                    @XmlElement(name = "NetWt", required = true)
                    protected BigDecimal netWt;
                    @XmlElement(name = "FeeRate", required = true)
                    protected BigDecimal feeRate;
                    @XmlElement(name = "FeeMark", required = true)
                    protected String feeMark;
                    @XmlElement(name = "InsurRate", required = true)
                    protected BigDecimal insurRate;
                    @XmlElement(name = "OtherRate", required = true)
                    protected BigDecimal otherRate;
                    @XmlElement(name = "RecipientNameC", required = true)
                    protected String recipientNameC;
                    @XmlElement(name = "RecipientNameE")
                    protected String recipientNameE;
                    @XmlElement(name = "RecipientCardType", required = true)
                    protected String recipientCardType;
                    @XmlElement(name = "RecipientNo", required = true)
                    protected String recipientNo;
                    @XmlElement(name = "RecipientCountry", required = true)
                    protected String recipientCountry;
                    @XmlElement(name = "RecipientProvincesCode", required = true)
                    protected String recipientProvincesCode;
                    @XmlElement(name = "RecipientAddrC", required = true)
                    protected String recipientAddrC;
                    @XmlElement(name = "RecipientAddrE")
                    protected String recipientAddrE;
                    @XmlElement(name = "RecipientTel", required = true)
                    protected String recipientTel;
                    @XmlElement(name = "ShipperC")
                    protected String shipperC;
                    @XmlElement(name = "ShipperE")
                    protected String shipperE;
                    @XmlElement(name = "ShipperCountry")
                    protected String shipperCountry;
                    @XmlElement(name = "ShipperProvincesCode")
                    protected String shipperProvincesCode;
                    @XmlElement(name = "ShipperAddrC")
                    protected String shipperAddrC;
                    @XmlElement(name = "ShipperAddrE")
                    protected String shipperAddrE;
                    @XmlElement(name = "Notes")
                    protected String notes;

                    /**
                     * 获取entWaybillNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEntWaybillNo() {
                        return entWaybillNo;
                    }

                    /**
                     * 设置entWaybillNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEntWaybillNo(String value) {
                        this.entWaybillNo = value;
                    }

                    /**
                     * 获取ehsEntNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEHSEntNo() {
                        return ehsEntNo;
                    }

                    /**
                     * 设置ehsEntNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEHSEntNo(String value) {
                        this.ehsEntNo = value;
                    }

                    /**
                     * 获取ehsEntName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEHSEntName() {
                        return ehsEntName;
                    }

                    /**
                     * 设置ehsEntName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEHSEntName(String value) {
                        this.ehsEntName = value;
                    }

                    /**
                     * 获取grossWeight属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getGrossWeight() {
                        return grossWeight;
                    }

                    /**
                     * 设置grossWeight属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setGrossWeight(BigDecimal value) {
                        this.grossWeight = value;
                    }

                    /**
                     * 获取netWt属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getNetWt() {
                        return netWt;
                    }

                    /**
                     * 设置netWt属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setNetWt(BigDecimal value) {
                        this.netWt = value;
                    }

                    /**
                     * 获取feeRate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getFeeRate() {
                        return feeRate;
                    }

                    /**
                     * 设置feeRate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setFeeRate(BigDecimal value) {
                        this.feeRate = value;
                    }

                    /**
                     * 获取feeMark属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeeMark() {
                        return feeMark;
                    }

                    /**
                     * 设置feeMark属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeeMark(String value) {
                        this.feeMark = value;
                    }

                    /**
                     * 获取insurRate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getInsurRate() {
                        return insurRate;
                    }

                    /**
                     * 设置insurRate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setInsurRate(BigDecimal value) {
                        this.insurRate = value;
                    }

                    /**
                     * 获取otherRate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getOtherRate() {
                        return otherRate;
                    }

                    /**
                     * 设置otherRate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setOtherRate(BigDecimal value) {
                        this.otherRate = value;
                    }

                    /**
                     * 获取recipientNameC属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientNameC() {
                        return recipientNameC;
                    }

                    /**
                     * 设置recipientNameC属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientNameC(String value) {
                        this.recipientNameC = value;
                    }

                    /**
                     * 获取recipientNameE属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientNameE() {
                        return recipientNameE;
                    }

                    /**
                     * 设置recipientNameE属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientNameE(String value) {
                        this.recipientNameE = value;
                    }

                    /**
                     * 获取recipientCardType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientCardType() {
                        return recipientCardType;
                    }

                    /**
                     * 设置recipientCardType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientCardType(String value) {
                        this.recipientCardType = value;
                    }

                    /**
                     * 获取recipientNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientNo() {
                        return recipientNo;
                    }

                    /**
                     * 设置recipientNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientNo(String value) {
                        this.recipientNo = value;
                    }

                    /**
                     * 获取recipientCountry属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientCountry() {
                        return recipientCountry;
                    }

                    /**
                     * 设置recipientCountry属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientCountry(String value) {
                        this.recipientCountry = value;
                    }

                    /**
                     * 获取recipientProvincesCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientProvincesCode() {
                        return recipientProvincesCode;
                    }

                    /**
                     * 设置recipientProvincesCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientProvincesCode(String value) {
                        this.recipientProvincesCode = value;
                    }

                    /**
                     * 获取recipientAddrC属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientAddrC() {
                        return recipientAddrC;
                    }

                    /**
                     * 设置recipientAddrC属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientAddrC(String value) {
                        this.recipientAddrC = value;
                    }

                    /**
                     * 获取recipientAddrE属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientAddrE() {
                        return recipientAddrE;
                    }

                    /**
                     * 设置recipientAddrE属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientAddrE(String value) {
                        this.recipientAddrE = value;
                    }

                    /**
                     * 获取recipientTel属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientTel() {
                        return recipientTel;
                    }

                    /**
                     * 设置recipientTel属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientTel(String value) {
                        this.recipientTel = value;
                    }

                    /**
                     * 获取shipperC属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShipperC() {
                        return shipperC;
                    }

                    /**
                     * 设置shipperC属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShipperC(String value) {
                        this.shipperC = value;
                    }

                    /**
                     * 获取shipperE属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShipperE() {
                        return shipperE;
                    }

                    /**
                     * 设置shipperE属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShipperE(String value) {
                        this.shipperE = value;
                    }

                    /**
                     * 获取shipperCountry属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShipperCountry() {
                        return shipperCountry;
                    }

                    /**
                     * 设置shipperCountry属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShipperCountry(String value) {
                        this.shipperCountry = value;
                    }

                    /**
                     * 获取shipperProvincesCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShipperProvincesCode() {
                        return shipperProvincesCode;
                    }

                    /**
                     * 设置shipperProvincesCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShipperProvincesCode(String value) {
                        this.shipperProvincesCode = value;
                    }

                    /**
                     * 获取shipperAddrC属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShipperAddrC() {
                        return shipperAddrC;
                    }

                    /**
                     * 设置shipperAddrC属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShipperAddrC(String value) {
                        this.shipperAddrC = value;
                    }

                    /**
                     * 获取shipperAddrE属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShipperAddrE() {
                        return shipperAddrE;
                    }

                    /**
                     * 设置shipperAddrE属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShipperAddrE(String value) {
                        this.shipperAddrE = value;
                    }

                    /**
                     * 获取notes属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * 设置notes属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                }

            }

        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "messageID",
        "messageType",
        "sender",
        "receiver",
        "sendTime",
        "functionCode",
        "signerInfo",
        "version"
    })
    public static class Head {

        @XmlElement(name = "MessageID", required = true)
        protected String messageID;
        @XmlElement(name = "MessageType", required = true)
        protected String messageType;
        @XmlElement(name = "Sender", required = true)
        protected String sender;
        @XmlElement(name = "Receiver", required = true)
        protected String receiver;
        @XmlElement(name = "SendTime", required = true)
        protected String sendTime;
        @XmlElement(name = "FunctionCode", required = true)
        protected String functionCode;
        @XmlElement(name = "SignerInfo", required = true)
        protected String signerInfo;
        @XmlElement(name = "Version", required = true)
        protected String version;

        /**
         * 获取messageID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageID() {
            return messageID;
        }

        /**
         * 设置messageID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageID(String value) {
            this.messageID = value;
        }

        /**
         * 获取messageType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageType() {
            return messageType;
        }

        /**
         * 设置messageType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageType(String value) {
            this.messageType = value;
        }

        /**
         * 获取sender属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSender() {
            return sender;
        }

        /**
         * 设置sender属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSender(String value) {
            this.sender = value;
        }

        /**
         * 获取receiver属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiver() {
            return receiver;
        }

        /**
         * 设置receiver属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiver(String value) {
            this.receiver = value;
        }

        /**
         * 获取sendTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendTime() {
            return sendTime;
        }

        /**
         * 设置sendTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendTime(String value) {
            this.sendTime = value;
        }

        /**
         * 获取functionCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunctionCode() {
            return functionCode;
        }

        /**
         * 设置functionCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunctionCode(String value) {
            this.functionCode = value;
        }

        /**
         * 获取signerInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignerInfo() {
            return signerInfo;
        }

        /**
         * 设置signerInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignerInfo(String value) {
            this.signerInfo = value;
        }

        /**
         * 获取version属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * 设置version属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

    }

}
