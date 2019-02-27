package com.yunyitg.cesp.common.statics;

/**
 * 跨境3.0回执类型
 * @author yangyuantao
 *
 */
public class ReceiptType {
	
	/**
	 * 商品备案国检审核回执
	 */
	public static String GOODSCIQREC = "KJ881101CIQREC";
	
	/**
	 * 进仓清单国检审核回执
	 */
	public static String BBC_DIVCIQREC = "KJ881103CIQREC";
	
	/**
	 * BBC货物装载清单国检审核回执
	 */
	public static String BBC_CARLOADCIQREC = "KJ881105CIQREC";
	
	/**
	 * BBC货物装载清单海关审核回执
	 */
	public static String BBC_CARLOADCUSREC = "KJ881105CUSREC";
	
	/**
	 * BC预录入进区总运单审核回执（返回检验检疫总运单审核回执）
	 */
	public static String TOTAL_CIQREC = "KJ881114CIQREC";
	
	/**
	 * BC预录入进区总运单审核回执（返回海关总运单审核回执）
	 */
	public static String TOTAL_CUSREC = "KJ881114CUSREC";
	
	/**
	 * BC进区总运单国检审核回执
	 */
	public static String BC_TOTALCIQREC = "KJ881128CIQREC";
	
	/**
	 * BC进区总运单海关审核回执
	 */
	public static String BC_TOTALCUSREC = "KJ881128CUSREC";
	
	/**
	 * BC理货清单 (回执)
	 */
	public static String BC_TALLYREC = "KJ881124";
	
	/**
	 * BC过线清单 (回执)
	 */
	public static String BC_CROSSREC = "KJ881125";
	
	/**
	 * 清单业务回执 （返回检验检疫清单审核回执）
	 */
	public static String INVT_CIQREC = "KJ881110CIQREC";
	
	/**
	 * 清单业务回执（返回海关清单审核回执）
	 */
	public static String INVT_CUSREC = "KJ881110CUSREC";
	
	/**
	 * 报文接收回执（返回平台、海关、国检接收企业报文的情况。）
	 */
	public static String KJREC = "KJDOCREC";
	
	
	/**********************************************************************/
	/***************************总署版回执格式******************************/
	/**********************************************************************/
	
	/**
	 * 总署电子订单回执
	 */
	public static String CEB_ORDERREC = "CEB312Message";
	
	/**
	 * 总署物流运单回执
	 */
	public static String CEB_WAYBILLREC = "CEB512Message";
	
	/**
	 * 总署支付凭证回执
	 */
	public static String CEB_PAYREC = "CEB412Message";
	
	/**
	 * 总署进口清单回执
	 */
	public static String CEB_INVTREC = "CEB622Message";
	
	/**
	 * 总署撤销申请单回执
	 */
	public static String CEB_CALCELREC = "CEB624Message";
	
	/**
	 * 总署退货申请单回执
	 */
	public static String CEB_REFUNDREC = "CEB626Message";
	
	/**
	 * 总署入库明细数据回执
	 */
	public static String CEB_DIVREC = "CEB712Message";
	
	/**
	 * 税单回执
	 */
	public static String TAX = "CEB816Message";
	
	/**
	 * 税单状态回执
	 */
	public static String TAX_STATUS = "CEB818Message";
	
	
	/***********************************************************************/
	/*****************************出口报文回执******************************/
	/**********************************************************************/
	
	/**
	 * 出口报文接收回执
	 */
	public static String KJEXPORTREC = "KJEXPORTDOCREC";
	
	/**
	 * 出口海关电子清单审核回执
	 */
	public static String EXLIST_CUSREC = "KJ881010CUSREC";
	
	/**
	 * 出口入区总运单海关审核回执
	 */
	public static String EXLOGISTICS_CUSREC = "KJ881028CUSREC";
	
}
