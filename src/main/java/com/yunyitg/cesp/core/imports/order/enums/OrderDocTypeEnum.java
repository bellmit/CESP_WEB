package com.yunyitg.cesp.core.imports.order.enums;

/**
 * 下单人证件类型 枚举类
 * @author yangyuantao
 *
 */
public enum OrderDocTypeEnum {

	ID_CARD("01", "身份证"),
	PASSPORT("02", "护照"),
	OTHER("04", "其他")
	;
	
	private String code;
	
	private String desc;
	
	OrderDocTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public static OrderDocTypeEnum statusOf(String index) {
		for (OrderDocTypeEnum orderDocType : values()) {
			if (orderDocType.getCode().equals(index)) {
				return orderDocType;
			}
		}
		return null;
	}
	
	public static String DescOf(String type) {
		for (OrderDocTypeEnum orderDocType : values()) {
			if (orderDocType.getCode().equals(type)) {
				return orderDocType.getDesc();
			}
		} 
		return "未知状态";
	}
}
