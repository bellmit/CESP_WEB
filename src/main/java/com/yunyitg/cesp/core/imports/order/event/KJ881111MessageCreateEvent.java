package com.yunyitg.cesp.core.imports.order.event;

import org.springframework.context.ApplicationEvent;

import com.yunyitg.cesp.core.imports.order.entity.OrderHead;

/**
 * 进口电子订单报文（KJ881111） 生成事件
 * @author yangyuantao
 *
 */
public class KJ881111MessageCreateEvent extends ApplicationEvent{
	
	private static final long serialVersionUID = 1L;
	
	private OrderHead orderHead;

	public KJ881111MessageCreateEvent(Object source, OrderHead orderHead) {
		super(source);
		this.orderHead = orderHead;
	}
	
	public OrderHead getOrderHead() {
		return orderHead;
	}

}
