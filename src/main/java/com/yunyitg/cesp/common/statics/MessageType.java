package com.yunyitg.cesp.common.statics;

/**
 * 跨境3.0报文类型
 * @author yangyuantao
 *
 */
public class MessageType {

	/**
	 * 商品备案（备案由电商/电商代理申请。）
	 */
	public static String GOODS = "KJ881101";
	
	/**
	 * 电子订单（数据由电商/电商平台推送。）
	 */
	public static String ORDER = "KJ881111";
	
	/**
	 * 电子支付单（数据由支付企业推送）
	 */
	public static String PAY = "KJ881112";
	
	/**
	 * 电子运单（数据由物流企业推送）
	 */
	public static String WAYBILL = "KJ881113";
	
	/**
	 * 电子清单（数据由电商/电商代理企业申报）
	 */
	public static String INVT = "KJ881110";
	
	/**
	 * BBC进仓清单
	 */
	public static String BBC_DIV = "KJ881103";
	
	/**
	 * BBC货物装载清单
	 */
	public static String BBC_CARLOAD = "KJ881105";
	
	/**
	 * BC装载清单（数据由物流企业按照实际装载情况申报。）
	 */
	public static String BC_CARLOAD = "KJ881116";
	
	/**
	 * BC预录入进区总运单（数据由物流企业申报，进区总运单需在实际货物进场前完成申报。）
	 */
	public static String BC_PRETOTAL = "KJ881114";
	
	/**
	 * BC进区总运单
	 */
	public static String  BC_TOTAL = "KJ881128";
	
	/**
	 * BC理货报告
	 */
	public static String BC_TALLY = "KJ881115";
	
	/**
	 * BC过线报告
	 */
	public static String BC_CROSS = "KJ881119";
	
	/**
	 * 运单状态信息（数据由快递企业申报，申报货物签收状态。）
	 */
	public static String TRACK = "KJ881126";
	
	/**
	 * 入仓登记
	 */
	public static String WAREHOUSE_IN = "KJ881129";
	
	/**
	 * 出仓登记
	 */
	public static String WAREHOUSE_OUT = "KJ881130";
	
	
	
	/**********************************************************************/
	/***************************总署版报文格式******************************/
	/**********************************************************************/
	
	/**
	 * 总署版电子订单
	 */
	public static String CEB_ORDER = "CEB311Message";

	/**
	 * 总署版电子运单
	 */
	public static String CEB_WAYBILL = "CEB511Message";
	
	/**
	 * 总署版运单状态
	 */
	public static String CEB_TRACK = "CEB513Message";
	
	/**
	 * 总署版电子支付单
	 */
	public static String CEB_PAY = "CEB411Message";
	
	/**
	 * 总署版电子清单
	 */
	public static String CEB_INVT = "CEB621Message";
	
	/**
	 * 总署版撤销申请单
	 */
	public static String CEB_CANCEL = "CEB623Message";
	
	/**
	 * 总署版退货申请单
	 */
	public static String CEB_REFUND = "CEB625Message";
	
	/*******************************************************************/
	/***********************出口报文类型*********************************/
	/*******************************************************************/
	
	/**
	 * 出口电子订单
	 */
	public static String EX_ORDER = "KJ881011";
	
	/**
	 * 出口电子支付单
	 */
	public static String EX_PAY = "KJ881012";
	
	/**
	 * 出口电子运单
	 */
	public static String EX_WAYBILL = "KJ881013";
	
	/**
	 * 出口电子清单
	 */
	public static String EX_INVT = "KJ881010";
	
	/**
	 * 出口BC入区总运单
	 */
	public static String EX_LOGISTICS = "KJ881028";
	
	
}
