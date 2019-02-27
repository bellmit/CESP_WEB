package com.yunyitg.cesp.common.enums;


/**
 * 平台状态、国检状态、海关状态编码值 枚举基类
 * 
 * @author yangyuantao
 *
 */
public enum StatusEnum {

	/**
	 * 已取消
	 */
	CANCELED("10", "已取消"),
	
	REFUND_SUCCESS("20", "退运成功"),
	REFUND_FAIL("19", "退运失败"),
	CANCEL_SUCCESS("18", "撤销成功"),
	CANCEL_FAIL("17", "撤销失败"),
	WARE_SUCCESS("120", "入库成功"),
	HANG_UP("600", "挂起"),
	REFUND("700", "退运"),
	SEIZURE("500", "查验"),
	CLEARANCE("899", "结关"),
	RELEASE("800", "放行"),
	CONCLUDED("399", "审结"),
	RETURN("100", "退单"),
	MANUAL_REVIEW("300", "人工审核"),
	DECLARE_FAIL("7", "申报失败"),
	DECLARE_SUCCESS("6", "申报成功"),
	LINE_CROSSED("14", "已过线"),
	TALLY("13", "已理货"),
	RECEIVE_SUCCESS("4", "接收成功"),
	RECEIVE_FAIL("5", "接收失败"),
	REVIEWED("400", "待运抵"),
	ARRIVED("12", "已运抵"),
	TO_BE_INSPECTED("22", "待查验"),
	NO_ADMISSION("11", "未入场"),
	/**
	 * 发送失败
	 */
	SEND_FAIL("3", "发送失败"),
	REGISTRATED("21", "已备案"),
	DECLARED("2", "已申报"),
	TO_BE_DECLARED("1", "待申报"),
	TO_BE_CHECKED("8", "待核对"),
	UNDECLARED("0", "未申报"),
	
	CANCEL("-1", "已取消"),
	
//	APPLY_SEND("-1", "请求发送新增申报"),
//	ALREADY_SEND("-2", "已发送新增申报"),
//	APPLY_MOD("-3", "请求发送变更申报"),
//	ALREADY_MOD("-4", "已发送变更申报"),
//	APPLY_DEL("-5", "请求发送删除申报"),
//	ALREADY_DEL("-6", "已发送删除申报"),
	
	ADD("A", "新增申报中"),
	MOD("M", "变更申报中"),
	DEL("D", "删除申报中"),
	
	S("S", "接收成功"),
	Q("Q", "待查验"),
	C("C", "放行"),
	N("N", "审核不通过"),
	F("F", "接收失败");
	
	
	private String state;
	
	private String desc;
	StatusEnum(String state, String desc) {
		this.state = state;
		this.desc = desc;
	}
	
	public String getState() {
		return state;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public static StatusEnum stateOf(String index) {
		for (StatusEnum state : values()) {
			if (state.getState().equals(index)) {
				return state;
			}
		}
		return null;
	}
	
	public static String DescOf(String state) {
		if (null == state) {
			return null;
		} else {
			for(StatusEnum status : values()) {
				if (status.getState().equals(state)) {
					return status.getDesc();
				}
			}
			return "未知状态";
		}
	}
	
	public static void main(String[] args) {
	}
}
