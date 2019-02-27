package com.yunyitg.cesp.common.enums;

public enum SendMessageEnum {

	/**
	 * 商品备案申报报文
	 */
	KJ881101("KJ881101", "KJ881101MessageCreater"),
	/**
	 * 进口电子订单
	 */
	KJ881111("KJ881111", "KJ881111MessageCreater"),
	/**
	 * 进口电子支付单
	 */
	KJ881112("KJ881112", "KJ881112MessageCreater"),
	/**
	 * 进口电子运单
	 */
	KJ881113("KJ881113", "KJ881113MessageCreater"),
	/**
	 * 进口电子清单
	 */
	KJ881110("KJ881110", "KJ881110MessageCreater"),
	
	
	;
	
	/**
	 * 报文类型
	 */
	private String type;
	
	/**
	 * 报文生成 bean 名
	 */
	private String beanName;
	
	private SendMessageEnum(String type, String beanName) {
		this.type = type;
		this.beanName = beanName;
	}
	
	public String getType() {
		return type;
	}
	
	public String getBeanName() {
		return beanName;
	}
	
	public static String BeanNameOf(String type) {
		for (SendMessageEnum e : values()) {
			if (e.getType().equals(type)) {
				return e.getBeanName();
			}
		}
		return null;
	}
}
