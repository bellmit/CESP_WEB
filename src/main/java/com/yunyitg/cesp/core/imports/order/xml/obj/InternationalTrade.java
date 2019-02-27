//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.26 时间 02:52:57 PM CST 
//


package com.yunyitg.cesp.core.imports.order.xml.obj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
    
    @XmlAttribute(name = "xmlns:xsi", required = true)
    protected String xsi = "http://www.w3.org/2001/XMLSchema-instance";

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
        "orderHead",
        "orderList"
    })
    public static class Declaration {

        @XmlElement(name = "OrderHead", required = true)
        protected InternationalTrade.Declaration.OrderHead orderHead;
        @XmlElement(name = "OrderList", required = true)
        protected InternationalTrade.Declaration.OrderList orderList;

        /**
         * 获取orderHead属性的值。
         * 
         * @return
         *     possible object is
         *     {@link InternationalTrade.Declaration.OrderHead }
         *     
         */
        public InternationalTrade.Declaration.OrderHead getOrderHead() {
            return orderHead;
        }

        /**
         * 设置orderHead属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link InternationalTrade.Declaration.OrderHead }
         *     
         */
        public void setOrderHead(InternationalTrade.Declaration.OrderHead value) {
            this.orderHead = value;
        }

        /**
         * 获取orderList属性的值。
         * 
         * @return
         *     possible object is
         *     {@link InternationalTrade.Declaration.OrderList }
         *     
         */
        public InternationalTrade.Declaration.OrderList getOrderList() {
            return orderList;
        }

        /**
         * 设置orderList属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link InternationalTrade.Declaration.OrderList }
         *     
         */
        public void setOrderList(InternationalTrade.Declaration.OrderList value) {
            this.orderList = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class OrderHead {

            @XmlElement(name = "DeclEntNo", required = true)
            protected String declEntNo;
            @XmlElement(name = "DeclEntName", required = true)
            protected String declEntName;
            @XmlElement(name = "EBEntNo", required = true)
            protected String ebEntNo;
            @XmlElement(name = "EBEntName", required = true)
            protected String ebEntName;
            @XmlElement(name = "EBPEntNo", required = true)
            protected String ebpEntNo;
            @XmlElement(name = "EBPEntName", required = true)
            protected String ebpEntName;
            @XmlElement(name = "InternetDomainName", required = true)
            protected String internetDomainName;
            @XmlElement(name = "DeclTime", required = true)
            protected String declTime;
            @XmlElement(name = "OpType", required = true)
            protected String opType;
            @XmlElement(name = "IeFlag", required = true)
            protected String ieFlag;
            @XmlElement(name = "CustomsCode", required = true)
            protected String customsCode;
            @XmlElement(name = "CIQOrgCode", required = true)
            protected String ciqOrgCode;

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

        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "orderContent"
        })
        public static class OrderList {

            @XmlElement(name = "OrderContent", required = true)
            protected List<InternationalTrade.Declaration.OrderList.OrderContent> orderContent;

            /**
             * Gets the value of the orderContent property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the orderContent property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrderContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InternationalTrade.Declaration.OrderList.OrderContent }
             * 
             * 
             */
            public List<InternationalTrade.Declaration.OrderList.OrderContent> getOrderContent() {
                if (orderContent == null) {
                    orderContent = new ArrayList<InternationalTrade.Declaration.OrderList.OrderContent>();
                }
                return this.orderContent;
            }
            
            public void setOrderContent(List<InternationalTrade.Declaration.OrderList.OrderContent> orderContent) {
				this.orderContent = orderContent;
			}


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "orderDetail",
                "orderWaybillRel",
                "orderPaymentRel"
            })
            public static class OrderContent {

                @XmlElement(name = "OrderDetail", required = true)
                protected InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail orderDetail;
                @XmlElement(name = "OrderWaybillRel", required = true)
                protected InternationalTrade.Declaration.OrderList.OrderContent.OrderWaybillRel orderWaybillRel;
                @XmlElement(name = "OrderPaymentRel", required = true)
                protected InternationalTrade.Declaration.OrderList.OrderContent.OrderPaymentRel orderPaymentRel;

                public OrderContent() {
					// TODO Auto-generated constructor stub
				}
                public OrderContent(InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail orderDetail) {
                	this.orderDetail = orderDetail;
                }
                
                /**
                 * 获取orderDetail属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail }
                 *     
                 */
                public InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail getOrderDetail() {
                    return orderDetail;
                }

                /**
                 * 设置orderDetail属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail }
                 *     
                 */
                public void setOrderDetail(InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail value) {
                    this.orderDetail = value;
                }

                /**
                 * 获取orderWaybillRel属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderWaybillRel }
                 *     
                 */
                public InternationalTrade.Declaration.OrderList.OrderContent.OrderWaybillRel getOrderWaybillRel() {
                    return orderWaybillRel;
                }

                /**
                 * 设置orderWaybillRel属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderWaybillRel }
                 *     
                 */
                public void setOrderWaybillRel(InternationalTrade.Declaration.OrderList.OrderContent.OrderWaybillRel value) {
                    this.orderWaybillRel = value;
                }

                /**
                 * 获取orderPaymentRel属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderPaymentRel }
                 *     
                 */
                public InternationalTrade.Declaration.OrderList.OrderContent.OrderPaymentRel getOrderPaymentRel() {
                    return orderPaymentRel;
                }

                /**
                 * 设置orderPaymentRel属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderPaymentRel }
                 *     
                 */
                public void setOrderPaymentRel(InternationalTrade.Declaration.OrderList.OrderContent.OrderPaymentRel value) {
                    this.orderPaymentRel = value;
                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class OrderDetail {

                    @XmlElement(name = "EntOrderNo", required = true)
                    protected String entOrderNo;
                    @XmlElement(name = "OrderStatus", required = true, defaultValue = "0")
                    protected String orderStatus;
                    @XmlElement(name = "PayStatus", required = true, defaultValue = "0")
                    protected String payStatus;
                    @XmlElement(name = "OrderGoodTotal", required = true)
                    protected BigDecimal orderGoodTotal;
                    @XmlElement(name = "OrderGoodTotalCurr", required = true)
                    protected String orderGoodTotalCurr;
                    @XmlElement(name = "Freight", required = true)
                    protected BigDecimal freight;
                    @XmlElement(name = "Tax", required = true)
                    protected BigDecimal tax;
                    @XmlElement(name = "OtherPayment", defaultValue = "0")
                    protected BigDecimal otherPayment;
                    @XmlElement(name = "OtherPayNotes")
                    protected String otherPayNotes;
                    @XmlElement(name = "OtherCharges", defaultValue = "0")
                    protected BigDecimal otherCharges;
                    @XmlElement(name = "ActualAmountPaid", required = true)
                    protected BigDecimal actualAmountPaid;
                    @XmlElement(name = "RecipientName", required = true)
                    protected String recipientName;
                    @XmlElement(name = "RecipientAddr", required = true)
                    protected String recipientAddr;
                    @XmlElement(name = "RecipientTel", required = true)
                    protected String recipientTel;
                    @XmlElement(name = "RecipientCountry", required = true)
                    protected String recipientCountry;
                    @XmlElement(name = "RecipientProvincesCode", required = true)
                    protected String recipientProvincesCode;
                    @XmlElement(name = "OrderDocAcount", required = true)
                    protected String orderDocAcount;
                    @XmlElement(name = "OrderDocName", required = true)
                    protected String orderDocName;
                    @XmlElement(name = "OrderDocType", required = true, defaultValue = "01")
                    protected String orderDocType;
                    @XmlElement(name = "OrderDocId", required = true)
                    protected String orderDocId;
                    @XmlElement(name = "OrderDocTel", required = true)
                    protected String orderDocTel;
                    @XmlElement(name = "OrderDate", required = true)
                    protected String orderDate;
                    @XmlElement(name = "BatchNumbers")
                    protected String batchNumbers;
                    @XmlElement(name = "InvoiceType")
                    protected String invoiceType;
                    @XmlElement(name = "InvoiceNo")
                    protected String invoiceNo;
                    @XmlElement(name = "InvoiceTitle")
                    protected String invoiceTitle;
                    @XmlElement(name = "InvoiceIdentifyID")
                    protected String invoiceIdentifyID;
                    @XmlElement(name = "InvoiceDesc")
                    protected String invoiceDesc;
                    @XmlElement(name = "InvoiceAmount")
                    protected BigDecimal invoiceAmount;
                    @XmlElement(name = "InvoiceDate")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar invoiceDate;
                    @XmlElement(name = "Notes")
                    protected String notes;
                    @XmlElement(name = "GoodsList", required = true)
                    protected InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList goodsList;

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
                     * 获取orderStatus属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderStatus() {
                        return orderStatus;
                    }

                    /**
                     * 设置orderStatus属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderStatus(String value) {
                        this.orderStatus = value;
                    }

                    /**
                     * 获取payStatus属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPayStatus() {
                        return payStatus;
                    }

                    /**
                     * 设置payStatus属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPayStatus(String value) {
                        this.payStatus = value;
                    }

                    /**
                     * 获取orderGoodTotal属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getOrderGoodTotal() {
                        return orderGoodTotal;
                    }

                    /**
                     * 设置orderGoodTotal属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setOrderGoodTotal(BigDecimal value) {
                        this.orderGoodTotal = value;
                    }

                    /**
                     * 获取orderGoodTotalCurr属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderGoodTotalCurr() {
                        return orderGoodTotalCurr;
                    }

                    /**
                     * 设置orderGoodTotalCurr属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderGoodTotalCurr(String value) {
                        this.orderGoodTotalCurr = value;
                    }

                    /**
                     * 获取freight属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getFreight() {
                        return freight;
                    }

                    /**
                     * 设置freight属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setFreight(BigDecimal value) {
                        this.freight = value;
                    }

                    /**
                     * 获取tax属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getTax() {
                        return tax;
                    }

                    /**
                     * 设置tax属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setTax(BigDecimal value) {
                        this.tax = value;
                    }

                    /**
                     * 获取otherPayment属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getOtherPayment() {
                        return otherPayment;
                    }

                    /**
                     * 设置otherPayment属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setOtherPayment(BigDecimal value) {
                        this.otherPayment = value;
                    }

                    /**
                     * 获取otherPayNotes属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOtherPayNotes() {
                        return otherPayNotes;
                    }

                    /**
                     * 设置otherPayNotes属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOtherPayNotes(String value) {
                        this.otherPayNotes = value;
                    }

                    /**
                     * 获取otherCharges属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getOtherCharges() {
                        return otherCharges;
                    }

                    /**
                     * 设置otherCharges属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setOtherCharges(BigDecimal value) {
                        this.otherCharges = value;
                    }

                    /**
                     * 获取actualAmountPaid属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getActualAmountPaid() {
                        return actualAmountPaid;
                    }

                    /**
                     * 设置actualAmountPaid属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setActualAmountPaid(BigDecimal value) {
                        this.actualAmountPaid = value;
                    }

                    /**
                     * 获取recipientName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientName() {
                        return recipientName;
                    }

                    /**
                     * 设置recipientName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientName(String value) {
                        this.recipientName = value;
                    }

                    /**
                     * 获取recipientAddr属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecipientAddr() {
                        return recipientAddr;
                    }

                    /**
                     * 设置recipientAddr属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRecipientAddr(String value) {
                        this.recipientAddr = value;
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
                     * 获取orderDocAcount属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderDocAcount() {
                        return orderDocAcount;
                    }

                    /**
                     * 设置orderDocAcount属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderDocAcount(String value) {
                        this.orderDocAcount = value;
                    }

                    /**
                     * 获取orderDocName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderDocName() {
                        return orderDocName;
                    }

                    /**
                     * 设置orderDocName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderDocName(String value) {
                        this.orderDocName = value;
                    }

                    /**
                     * 获取orderDocType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderDocType() {
                        return orderDocType;
                    }

                    /**
                     * 设置orderDocType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderDocType(String value) {
                        this.orderDocType = value;
                    }

                    /**
                     * 获取orderDocId属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderDocId() {
                        return orderDocId;
                    }

                    /**
                     * 设置orderDocId属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderDocId(String value) {
                        this.orderDocId = value;
                    }

                    /**
                     * 获取orderDocTel属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderDocTel() {
                        return orderDocTel;
                    }

                    /**
                     * 设置orderDocTel属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderDocTel(String value) {
                        this.orderDocTel = value;
                    }

                    /**
                     * 获取orderDate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOrderDate() {
                        return orderDate;
                    }

                    /**
                     * 设置orderDate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOrderDate(String value) {
                        this.orderDate = value;
                    }

                    /**
                     * 获取batchNumbers属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBatchNumbers() {
                        return batchNumbers;
                    }

                    /**
                     * 设置batchNumbers属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBatchNumbers(String value) {
                        this.batchNumbers = value;
                    }

                    /**
                     * 获取invoiceType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInvoiceType() {
                        return invoiceType;
                    }

                    /**
                     * 设置invoiceType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInvoiceType(String value) {
                        this.invoiceType = value;
                    }

                    /**
                     * 获取invoiceNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInvoiceNo() {
                        return invoiceNo;
                    }

                    /**
                     * 设置invoiceNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInvoiceNo(String value) {
                        this.invoiceNo = value;
                    }

                    /**
                     * 获取invoiceTitle属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInvoiceTitle() {
                        return invoiceTitle;
                    }

                    /**
                     * 设置invoiceTitle属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInvoiceTitle(String value) {
                        this.invoiceTitle = value;
                    }

                    /**
                     * 获取invoiceIdentifyID属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInvoiceIdentifyID() {
                        return invoiceIdentifyID;
                    }

                    /**
                     * 设置invoiceIdentifyID属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInvoiceIdentifyID(String value) {
                        this.invoiceIdentifyID = value;
                    }

                    /**
                     * 获取invoiceDesc属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInvoiceDesc() {
                        return invoiceDesc;
                    }

                    /**
                     * 设置invoiceDesc属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInvoiceDesc(String value) {
                        this.invoiceDesc = value;
                    }

                    /**
                     * 获取invoiceAmount属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getInvoiceAmount() {
                        return invoiceAmount;
                    }

                    /**
                     * 设置invoiceAmount属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setInvoiceAmount(BigDecimal value) {
                        this.invoiceAmount = value;
                    }

                    /**
                     * 获取invoiceDate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getInvoiceDate() {
                        return invoiceDate;
                    }

                    /**
                     * 设置invoiceDate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setInvoiceDate(XMLGregorianCalendar value) {
                        this.invoiceDate = value;
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
                     * 获取goodsList属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList }
                     *     
                     */
                    public InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList getGoodsList() {
                        return goodsList;
                    }

                    /**
                     * 设置goodsList属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList }
                     *     
                     */
                    public void setGoodsList(InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList value) {
                        this.goodsList = value;
                    }


                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "orderGoodsList"
                    })
                    public static class GoodsList {

                        @XmlElement(name = "OrderGoodsList", required = true)
                        protected List<InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList> orderGoodsList;

                        /**
                         * Gets the value of the orderGoodsList property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the orderGoodsList property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getOrderGoodsList().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList }
                         * 
                         * 
                         */
                        public List<InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList> getOrderGoodsList() {
                            if (orderGoodsList == null) {
                                orderGoodsList = new ArrayList<InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList>();
                            }
                            return this.orderGoodsList;
                        }

                        
                        public void setOrderGoodsList(
								List<InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList> orderGoodsList) {
							this.orderGoodsList = orderGoodsList;
						}

                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {

                        })
                        public static class OrderGoodsList {

                            @XmlElement(name = "Seq")
                            protected int seq;
                            @XmlElement(name = "EntGoodsNo", required = true)
                            protected String entGoodsNo;
                            @XmlElement(name = "CIQGoodsNo", required = true)
                            protected String ciqGoodsNo;
                            @XmlElement(name = "CusGoodsNo", required = true)
                            protected String cusGoodsNo;
                            @XmlElement(name = "HSCode")
                            protected String hsCode;
                            @XmlElement(name = "GoodsName", required = true)
                            protected String goodsName;
                            @XmlElement(name = "GoodsStyle", required = true)
                            protected String goodsStyle;
                            @XmlElement(name = "GoodsDescribe")
                            protected String goodsDescribe;
                            @XmlElement(name = "OriginCountry", required = true)
                            protected String originCountry;
                            @XmlElement(name = "BarCode")
                            protected String barCode;
                            @XmlElement(name = "Brand")
                            protected String brand;
                            @XmlElement(name = "Qty", required = true)
                            protected BigDecimal qty;
                            @XmlElement(name = "Unit", required = true)
                            protected String unit;
                            @XmlElement(name = "Price", required = true)
                            protected BigDecimal price;
                            @XmlElement(name = "Total", required = true)
                            protected BigDecimal total;
                            @XmlElement(name = "CurrCode", required = true)
                            protected String currCode;
                            @XmlElement(name = "Notes")
                            protected String notes;

                            /**
                             * 获取seq属性的值。
                             * 
                             */
                            public int getSeq() {
                                return seq;
                            }

                            /**
                             * 设置seq属性的值。
                             * 
                             */
                            public void setSeq(int value) {
                                this.seq = value;
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
                             * 获取goodsDescribe属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGoodsDescribe() {
                                return goodsDescribe;
                            }

                            /**
                             * 设置goodsDescribe属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGoodsDescribe(String value) {
                                this.goodsDescribe = value;
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
                             * 获取unit属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getUnit() {
                                return unit;
                            }

                            /**
                             * 设置unit属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setUnit(String value) {
                                this.unit = value;
                            }

                            /**
                             * 获取price属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getPrice() {
                                return price;
                            }

                            /**
                             * 设置price属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setPrice(BigDecimal value) {
                                this.price = value;
                            }

                            /**
                             * 获取total属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getTotal() {
                                return total;
                            }

                            /**
                             * 设置total属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setTotal(BigDecimal value) {
                                this.total = value;
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
                public static class OrderPaymentRel {

                    @XmlElement(name = "PayEntNo", required = true)
                    protected String payEntNo;
                    @XmlElement(name = "PayEntName", required = true)
                    protected String payEntName;
                    @XmlElement(name = "PayNo", required = true)
                    protected String payNo;
                    @XmlElement(name = "Notes")
                    protected String notes;

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
                     * 获取payNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPayNo() {
                        return payNo;
                    }

                    /**
                     * 设置payNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPayNo(String value) {
                        this.payNo = value;
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
                public static class OrderWaybillRel {

                    @XmlElement(name = "EHSEntNo", required = true)
                    protected String ehsEntNo;
                    @XmlElement(name = "EHSEntName", required = true)
                    protected String ehsEntName;
                    @XmlElement(name = "WaybillNo", required = true)
                    protected String waybillNo;
                    @XmlElement(name = "Notes")
                    protected String notes;

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
                     * 获取waybillNo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWaybillNo() {
                        return waybillNo;
                    }

                    /**
                     * 设置waybillNo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWaybillNo(String value) {
                        this.waybillNo = value;
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
