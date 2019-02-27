package com.yunyitg.cesp.core.imports.order.enums;

/**
 * 订单状态  枚举类
 * @author yangyuantao
 *
 */
public enum OrderStatusEnum {

	CONFIRM("0", "订单确认"),
	COMPLETE("1", "订单完成"),
	CANCEL("2", "订单取消")
	;
	
	private String status;
	
	private String desc;
	
	OrderStatusEnum(String status, String desc) {
		this.status = status;
		this.desc = desc;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public static OrderStatusEnum statusOf(String index) {
		for (OrderStatusEnum orderStatus : values()) {
			if (orderStatus.getStatus().equals(index)) {
				return orderStatus;
			}
		}
		return null;
	}
	
	public static String DescOf(String status) {
		for (OrderStatusEnum orderStatus : values()) {
			if (orderStatus.getStatus().equals(status)) {
				return orderStatus.getDesc();
			}
		} 
		return "未知状态";
	}
}
