package com.yunyitg.cesp.core.imports.order.vo;

/**
 * 一份订单内容
 * @author yangyuantao
 *
 */
public class OrderContentVo {
	
	/**
	 * 电子订单详情信息
	 */
	private OrderDetailVo orderDetail;
	
	/**
	 * 电子订单关联运单表体
	 */
	private OrderWaybillRelVo orderWaybillRel;
	
	/**
	 * 电子订单关联支付表体
	 */
	private OrderPaymentRelVo orderPaymentRel;

	public OrderContentVo() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetailVo getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetailVo orderDetail) {
		this.orderDetail = orderDetail;
	}

	public OrderWaybillRelVo getOrderWaybillRel() {
		return orderWaybillRel;
	}

	public void setOrderWaybillRel(OrderWaybillRelVo orderWaybillRel) {
		this.orderWaybillRel = orderWaybillRel;
	}

	public OrderPaymentRelVo getOrderPaymentRel() {
		return orderPaymentRel;
	}

	public void setOrderPaymentRel(OrderPaymentRelVo orderPaymentRel) {
		this.orderPaymentRel = orderPaymentRel;
	}
}
