package com.yunyitg.cesp.core.imports.order.enums;

/**
 * 发票类型 枚举类
 * @author yangyuantao
 *
 */
public enum InvoiceTypeEnum {

	E_INVOICE("1", "电子发票"),
	G_INVOICE("2", "普通发票（纸质）"),
	S_INVOICE("3", "专用发票（纸质）"),
	OTHER("0", "其他")
	;
	
	private String code;
	
	private String desc;
	
	private InvoiceTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public static InvoiceTypeEnum statusOf(String index) {
		for (InvoiceTypeEnum invoiceType : values()) {
			if (invoiceType.getCode().equals(index)) {
				return invoiceType;
			}
		}
		return null;
	}
	
	public static String DescOf(String type) {
		if (null == type) {
			return null;
		} else {
			for (InvoiceTypeEnum invoiceType : values()) {
				if (invoiceType.getCode().equals(type)) {
					return invoiceType.getDesc();
				}
			} 
			return "未知状态";
		}
	}
}
