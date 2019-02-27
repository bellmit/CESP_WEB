package com.yunyitg.cesp.common.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 出口电子订单 报文体
 * @author yangyuantao
 *
 */
@XmlRootElement(name = "declaration")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderHead",
    "orderList"
})
public class OrderDeclaration extends Declaration{


	@XmlElement(name = "OrderHead", required = true)
	protected OrderDeclaration.OrderHead orderHead;
	@XmlElement(name = "OrderList", required = true)
	protected OrderDeclaration.OrderList orderList;

	/**
	 * 获取orderHead属性的值。
	 * 
	 * @return
	 *     possible object is
	 *     {@link InternationalTradePay.Declaration.OrderHead }
	 *     
	 */
	public OrderDeclaration.OrderHead getOrderHead() {
		return orderHead;
	}

	/**
	 * 设置orderHead属性的值。
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link InternationalTradePay.Declaration.OrderHead }
	 *     
	 */
	public void setOrderHead(OrderDeclaration.OrderHead value) {
		this.orderHead = value;
	}

	/**
	 * 获取orderList属性的值。
	 * 
	 * @return
	 *     possible object is
	 *     {@link InternationalTradePay.Declaration.OrderList }
	 *     
	 */
	public OrderDeclaration.OrderList getOrderList() {
		return orderList;
	}

	/**
	 * 设置orderList属性的值。
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link InternationalTradePay.Declaration.OrderList }
	 *     
	 */
	public void setOrderList(OrderDeclaration.OrderList value) {
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
		@XmlElement(name = "InternetDomainName")
		protected String internetDomainName;
		@XmlElement(name = "DeclTime", required = true)
		protected String declTime;
		@XmlElement(name = "OpType", required = true)
		protected String opType;
		@XmlElement(name = "CustomsCode", required = true)
		protected String customsCode;
		@XmlElement(name = "CIQOrgCode", required = true)
		protected String ciqOrgCode;
		@XmlElement(name = "ProposerType")
		protected String proposerType;
		@XmlElement(name = "ProposerID")
		protected String proposerID;
		@XmlElement(name = "ProposerName")
		protected String proposerName;

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
		 * 获取proposerType属性的值。
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 *     
		 */
		public String getProposerType() {
			return proposerType;
		}

		/**
		 * 设置proposerType属性的值。
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 *     
		 */
		public void setProposerType(String value) {
			this.proposerType = value;
		}

		/**
		 * 获取proposerID属性的值。
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 *     
		 */
		public String getProposerID() {
			return proposerID;
		}

		/**
		 * 设置proposerID属性的值。
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 *     
		 */
		public void setProposerID(String value) {
			this.proposerID = value;
		}

		/**
		 * 获取proposerName属性的值。
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 *     
		 */
		public String getProposerName() {
			return proposerName;
		}

		/**
		 * 设置proposerName属性的值。
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 *     
		 */
		public void setProposerName(String value) {
			this.proposerName = value;
		}

	}


	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"orderContent"
	})
	public static class OrderList {

		@XmlElement(name = "OrderContent", required = true)
		protected List<OrderDeclaration.OrderList.OrderContent> orderContent;

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
		 * {@link InternationalTradePay.Declaration.OrderList.OrderContent }
		 * 
		 * 
		 */
		public List<OrderDeclaration.OrderList.OrderContent> getOrderContent() {
			if (orderContent == null) {
				orderContent = new ArrayList<OrderDeclaration.OrderList.OrderContent>();
			}
			return this.orderContent;
		}

		public void setOrderContent(
				List<OrderDeclaration.OrderList.OrderContent> orderContent) {
			this.orderContent = orderContent;
		}


		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"orderDetail"
		})
		public static class OrderContent {

			@XmlElement(name = "OrderDetail", required = true)
			protected OrderDeclaration.OrderList.OrderContent.OrderDetail orderDetail;

			public OrderContent() {
			}
			public OrderContent(OrderDeclaration.OrderList.OrderContent.OrderDetail orderDetail) {
				this.orderDetail = orderDetail;
			}

			/**
			 * 获取orderDetail属性的值。
			 * 
			 * @return
			 *     possible object is
			 *     {@link InternationalTradePay.Declaration.OrderList.OrderContent.OrderDetail }
			 *     
			 */
			public OrderDeclaration.OrderList.OrderContent.OrderDetail getOrderDetail() {
				return orderDetail;
			}

			/**
			 * 设置orderDetail属性的值。
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link InternationalTradePay.Declaration.OrderList.OrderContent.OrderDetail }
			 *     
			 */
			public void setOrderDetail(OrderDeclaration.OrderList.OrderContent.OrderDetail value) {
				this.orderDetail = value;
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
				@XmlElement(name = "CheckingNo", required = true)
				protected String checkingNo;
				@XmlElement(name = "DeliveryEnt", required = true)
				protected String deliveryEnt;
				@XmlElement(name = "RecipientName", required = true)
				protected String recipientName;
				@XmlElement(name = "RecipientAddr", required = true)
				protected String recipientAddr;
				@XmlElement(name = "RecipientTel", required = true)
				protected String recipientTel;
				@XmlElement(name = "RecipientCountry", required = true)
				protected String recipientCountry;
				@XmlElement(name = "OrderDocAcount", required = true)
				protected String orderDocAcount;
				@XmlElement(name = "OrderDate", required = true)
				protected String orderDate;
				@XmlElement(name = "Notes")
				protected String notes;
				@XmlElement(name = "GoodsList", required = true)
				protected OrderDeclaration.OrderList.OrderContent.OrderDetail.GoodsList goodsList;

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
				 * 获取checkingNo属性的值。
				 * 
				 * @return
				 *     possible object is
				 *     {@link String }
				 *     
				 */
				public String getCheckingNo() {
					return checkingNo;
				}

				/**
				 * 设置checkingNo属性的值。
				 * 
				 * @param value
				 *     allowed object is
				 *     {@link String }
				 *     
				 */
				public void setCheckingNo(String value) {
					this.checkingNo = value;
				}

				/**
				 * 获取deliveryEnt属性的值。
				 * 
				 * @return
				 *     possible object is
				 *     {@link String }
				 *     
				 */
				public String getDeliveryEnt() {
					return deliveryEnt;
				}

				/**
				 * 设置deliveryEnt属性的值。
				 * 
				 * @param value
				 *     allowed object is
				 *     {@link String }
				 *     
				 */
				public void setDeliveryEnt(String value) {
					this.deliveryEnt = value;
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
				 *     {@link InternationalTradePay.Declaration.OrderList.OrderContent.OrderDetail.GoodsList }
				 *     
				 */
				public OrderDeclaration.OrderList.OrderContent.OrderDetail.GoodsList getGoodsList() {
					return goodsList;
				}

				/**
				 * 设置goodsList属性的值。
				 * 
				 * @param value
				 *     allowed object is
				 *     {@link InternationalTradePay.Declaration.OrderList.OrderContent.OrderDetail.GoodsList }
				 *     
				 */
				public void setGoodsList(OrderDeclaration.OrderList.OrderContent.OrderDetail.GoodsList value) {
					this.goodsList = value;
				}


				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"orderGoodsList"
				})
				public static class GoodsList {

					@XmlElement(name = "OrderGoodsList", required = true)
					protected List<OrderDeclaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList> orderGoodsList;

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
					 * {@link InternationalTradePay.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList }
					 * 
					 * 
					 */
					public List<OrderDeclaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList> getOrderGoodsList() {
						if (orderGoodsList == null) {
							orderGoodsList = new ArrayList<OrderDeclaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList>();
						}
						return this.orderGoodsList;
					}

					public void setOrderGoodsList(
							List<OrderDeclaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList> orderGoodsList) {
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
						@XmlElement(name = "SellWebSite")
						protected String sellWebSite;
						@XmlElement(name = "OriginPlace")
						protected String originPlace;
						@XmlElement(name = "Manufacturer")
						protected String manufacturer;
						@XmlElement(name = "ManufacturerID")
						protected String manufacturerID;
						@XmlElement(name = "BatchNumbers")
						protected String batchNumbers;
						@XmlElement(name = "ProductionDate")
						protected String productionDate;
						@XmlElement(name = "IPCode")
						protected String ipCode;
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
						 * 获取sellWebSite属性的值。
						 * 
						 * @return
						 *     possible object is
						 *     {@link String }
						 *     
						 */
						public String getSellWebSite() {
							return sellWebSite;
						}

						/**
						 * 设置sellWebSite属性的值。
						 * 
						 * @param value
						 *     allowed object is
						 *     {@link String }
						 *     
						 */
						public void setSellWebSite(String value) {
							this.sellWebSite = value;
						}

						/**
						 * 获取originPlace属性的值。
						 * 
						 * @return
						 *     possible object is
						 *     {@link String }
						 *     
						 */
						public String getOriginPlace() {
							return originPlace;
						}

						/**
						 * 设置originPlace属性的值。
						 * 
						 * @param value
						 *     allowed object is
						 *     {@link String }
						 *     
						 */
						public void setOriginPlace(String value) {
							this.originPlace = value;
						}

						/**
						 * 获取manufacturer属性的值。
						 * 
						 * @return
						 *     possible object is
						 *     {@link String }
						 *     
						 */
						public String getManufacturer() {
							return manufacturer;
						}

						/**
						 * 设置manufacturer属性的值。
						 * 
						 * @param value
						 *     allowed object is
						 *     {@link String }
						 *     
						 */
						public void setManufacturer(String value) {
							this.manufacturer = value;
						}

						/**
						 * 获取manufacturerID属性的值。
						 * 
						 * @return
						 *     possible object is
						 *     {@link String }
						 *     
						 */
						public String getManufacturerID() {
							return manufacturerID;
						}

						/**
						 * 设置manufacturerID属性的值。
						 * 
						 * @param value
						 *     allowed object is
						 *     {@link String }
						 *     
						 */
						public void setManufacturerID(String value) {
							this.manufacturerID = value;
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
						 * 获取productionDate属性的值。
						 * 
						 * @return
						 *     possible object is
						 *     {@link String }
						 *     
						 */
						public String getProductionDate() {
							return productionDate;
						}

						/**
						 * 设置productionDate属性的值。
						 * 
						 * @param value
						 *     allowed object is
						 *     {@link String }
						 *     
						 */
						public void setProductionDate(String value) {
							this.productionDate = value;
						}

						/**
						 * 获取ipCode属性的值。
						 * 
						 * @return
						 *     possible object is
						 *     {@link String }
						 *     
						 */
						public String getIPCode() {
							return ipCode;
						}

						/**
						 * 设置ipCode属性的值。
						 * 
						 * @param value
						 *     allowed object is
						 *     {@link String }
						 *     
						 */
						public void setIPCode(String value) {
							this.ipCode = value;
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

	}

}
