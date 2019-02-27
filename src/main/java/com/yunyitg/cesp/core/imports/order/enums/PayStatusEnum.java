package com.yunyitg.cesp.core.imports.order.enums;

/**
 * 支付状态 枚举类
 * @author yangyuantao
 *
 */
public enum PayStatusEnum {

	PAID("0", "已付款"),
	UNPAID("1", "未付款")
	;
	
	private String status;
	
	private String desc;
	
	PayStatusEnum(String status, String desc) {
		this.status = status;
		this.desc = desc;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public static PayStatusEnum statusOf(String index) {
		for (PayStatusEnum payStatus : values()) {
			if (payStatus.getStatus().equals(index)) {
				return payStatus;
			}
		}
		return null;
	}
	
	public static String DescOf(String status) {
		for (PayStatusEnum payStatus : values()) {
			if (payStatus.getStatus().equals(status)) {
				return payStatus.getDesc();
			}
		} 
		return "未知状态";
	}
}
