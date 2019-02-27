package com.yunyitg.cesp.core.company.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Controller
@RequestMapping("/corp")
public class ModuleController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 电子订单申报 页面
	 */
	@RequestMapping(value = "/orderhead/list.html", method = RequestMethod.GET)
	public String orderheadList() {
		return "module/module";
	}
	
	/**
	 * 电子支付单申报 页面
	 */
	@RequestMapping(value = "/paymenthead/list.html", method = RequestMethod.GET)
	public String paymentheadList() {
		return "module/module";
	}
	
	/**
	 * 电子运单申报 页面
	 */
	@RequestMapping(value = "/waybillhead/list.html", method = RequestMethod.GET)
	public String waybillheadList() {
		return "module/module";
	}
	
	/** 
	 * 电子清单申报 页面
	 */
	@RequestMapping(value = "/listhead/list.html", method = RequestMethod.GET)
	public String listheadList() {
		return "module/module";
	}
	
	/**
	 * 集中申报 页面
	 */
	@RequestMapping(value = "/multiplehead/list.html", method = RequestMethod.GET)
	public String multipleheadList() {
		return "module/module";
	}
	
	/**
	 * 总运单申报 页面
	 */
	@RequestMapping(value = "/logisticshead/list.html", method = RequestMethod.GET)
	public String logisticsheadList() {
		return "module/module";
	}
	
	/**
	 * 装载单申报 页面
	 */
	@RequestMapping(value = "/loadhead/list.html", method = RequestMethod.GET)
	public String loadheadList() {
		return "module/module";
	}
	
	/**
	 * 出口电子订单申报 页面
	 */
	@RequestMapping(value = "/exportorderhead/list.html", method = RequestMethod.GET)
	public String exportorderheadList() {
		return "module/module";
	}
	
	/**
	 * 出口电子支付单申报 页面
	 */
	@RequestMapping(value = "/exportpaymenthead/list.html", method = RequestMethod.GET)
	public String exportpaymentheadList() {
		return "module/module";
	}
	
	/**
	 * 出口电子运单申报 页面
	 */
	@RequestMapping(value = "/exportwaybillhead/list.html", method = RequestMethod.GET)
	public String exportwaybillheadList() {
		return "module/module";
	}
	
	/**
	 * 出口电子清单申报 页面
	 */
	@RequestMapping(value = "/exportlisthead/list.html", method = RequestMethod.GET)
	public String exportlistheadList() {
		return "module/module";
	}
	
	/**
	 * 出口集中申报  页面
	 */
	@RequestMapping(value = "/exportmultiplehead/list.html", method = RequestMethod.GET)
	public String exportmultipleheadList() {
		return "module/module";
	}
	
	/**
	 * 出口总运单申报 页面
	 */
	@RequestMapping(value = "/exportlogistics/list.html", method = RequestMethod.GET)
	public String exportlogisticsList() {
		return "module/module";
	}
	
	/**
	 * 货物运抵申报 页面
	 */
	@RequestMapping(value = "/exportarrival/list.html", method = RequestMethod.GET)
	public String exportarrivalList() {
		return "module/module";
	}
	
	/** 
	 * 汇总申报单申报 页面
	 */
	@RequestMapping(value = "/summary/list.html", method = RequestMethod.GET)
	public String summaryList() {
		return "module/module";
	}
	
	/**
	 * 进口货物查询 页面
	 */
	@RequestMapping(value = "/list/list.html", method = RequestMethod.GET)
	public String listList() {
		return "module/module";
	}
	
	/**
	 * 出口货物查询 页面
	 */
	@RequestMapping(value = "/exportlist/list.html", method = RequestMethod.GET)
	public String exportlistList() {
		return "module/module";
	}
	
	/**
	 * 报关数据查询
	 */
	@RequestMapping(value = "/cusdata/list.html", method = RequestMethod.GET)
	public String cusdataList() {
		return "module/module";
	}
	
	/**
	 * 报检数据查询
	 */
	@RequestMapping(value = "/ciqdata/list.html", method = RequestMethod.GET)
	public String ciqdataList() {
		return "module/module";
	}
	
	/**
	 * 报关业务统计
	 */
	@RequestMapping(value = "/cusbusiness/list.html", method = RequestMethod.GET)
	public String cusbusinessList() {
		return "module/module";
	}
	
	/**
	 * 报检业务统计
	 */
	@RequestMapping(value = "/ciqbusiness/list.html", method = RequestMethod.GET)
	public String ciqbusinessList() {
		return "module/module";
	}
	
	/**
	 * 撤销申请 
	 */
	@RequestMapping(value = "/cuscancelhead/list.html", method = RequestMethod.GET)
	public String cuscancelheadList() {
		return "module/module";
	}
	
	/**
	 * 退货申请
	 */
	@RequestMapping(value = "/cusrefundhead/list.html", method = RequestMethod.GET)
	public String cusrefundheadList() {
		return "module/module";
	}
	
	/**
	 * 进口初始值设置
	 */
	@RequestMapping(value = "/setting/list.html", method = RequestMethod.GET)
	public String settingsList() {
		return "module/module";
	}
	
	/**
	 * 出口初始值设置
	 */
	@RequestMapping(value = "/exportsetting/list.html", method = RequestMethod.GET)
	public String exportsettingsList() {
		return "module/module";
	}
}
