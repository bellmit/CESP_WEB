package com.yunyitg.cesp.system.shiro.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.common.statics.Constant;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.core.company.entity.Module;
import com.yunyitg.cesp.core.company.service.ModuleService;

/**
 * 
 * 开发公司：SOJSON在线工具 <p>
 * 版权所有：© www.sojson.com<p>
 * 博客地址：http://www.sojson.com/blog/  <p>
 * <p>
 * 
 * 权限校验 Filter
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2016年6月2日 　<br/>
 *
 * @author zhou-baicheng
 * @email  so@sojson.com
 * @version 1.0,2016年6月2日 <br/>
 * 
 */
public class PermissionFilter extends AccessControlFilter {

	@Resource(name = "moduleService")
	private ModuleService moduleService;
	
	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		
		//先判断带参数的权限判断
		Subject subject = getSubject(request, response);
		if(null != mappedValue){
			String[] arra = (String[])mappedValue;
			LoggerUtils.fmtInfo(getClass(), "访问接口参数：", arra.toString());
			for (String permission : arra) {
				if(subject.isPermitted(permission)){
					return Boolean.TRUE;
				}
			}
		}
		HttpServletRequest httpRequest = ((HttpServletRequest)request);
		/**
		 * 此处是改版后，为了兼容项目不需要部署到root下，也可以正常运行，但是权限没设置目前必须到root 的URI，
		 * 原因：如果你把这个项目叫 ShiroDemo，那么路径就是 /ShiroDemo/xxxx.shtml ，那另外一个人使用，又叫Shiro_Demo,那么就要这么控制/Shiro_Demo/xxxx.shtml 
		 * 理解了吗？
		 * 所以这里替换了一下，使用根目录开始的URI
		 */
		
		String uri = httpRequest.getRequestURI();//获取URI
		String basePath = httpRequest.getContextPath();//获取basePath
		if(null != uri && uri.startsWith(basePath)){
			uri = uri.replace(basePath, "");
//			String moduleName = getModuleNameByUri(uri);
//			httpRequest.getSession().setAttribute("moduleName", moduleName);
		}
		if(subject.isPermitted(uri)){
			return Boolean.TRUE;
		}
		if(ShiroFilterUtils.isAjax(request)){
			Map<String,String> resultMap = new HashMap<String, String>();
			LoggerUtils.debug(getClass(), "当前用户没有登录，并且是Ajax请求！");
			resultMap.put("login_status", "300");
			resultMap.put("message", "\u5F53\u524D\u7528\u6237\u6CA1\u6709\u767B\u5F55\uFF01");//当前用户没有登录！
			ShiroFilterUtils.out(response, resultMap);
		}
		return Boolean.FALSE;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		
			Subject subject = getSubject(request, response);  
	        if (null == subject.getPrincipal()) {//表示没有登录，重定向到登录页面  
	           // 保存Request和Response 到登录后的链接
	    		saveRequestAndRedirectToLogin(request, response);
	    		/**	  上面替代了这2步
	    		 * 	      saveRequest(request);  
	    		 * 		  WebUtils.issueRedirect(request, response,getLoginUrl());  
	    		 */
	        } else {  
	            if (StringUtils.hasText(ShiroFilterUtils.UNAUTHORIZED_URL)) {//如果有未授权页面跳转过去  
	            	String url = String.format(ShiroFilterUtils.UNAUTHORIZED_URL, Constant.MESSAGE_601);
	                WebUtils.issueRedirect(request, response, url);  
	            } else {//否则返回401未授权状态码  
	                WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED);  
	            }  
	        }  
		return Boolean.FALSE;
	}
	
	public String getModuleNameByUri(String uri) {
		
		List<Module> modules = moduleService.listAllModule();
		
		Map<String, String> urlMapName = new HashMap<String, String>();
		for(Module m : modules) {
			if (m.getUrl() != null && !"".equals(m.getUrl().trim())) {
				urlMapName.put(m.getUrl(), m.getName());
			}
		}
		
		if (urlMapName.get(uri) != null) {
			return urlMapName.get(uri);
		}
		
		/*if (uri.equals("/corp/orderhead/list.html")) {
			return "电子订单申报";
		}
		else if (uri.equals("/corp/paymenthead/list.html")) {
			return "电子支付单申报";
		}
		else if (uri.equals("/corp/waybillhead/list.html")) {
			return "电子运单申报";
		}
		else if (uri.equals("/corp/listhead/list.html")) {
			return "电子清单申报";
		}
		else if (uri.equals("/corp/multiplehead/list.html")) {
			return "集中申报";
		}
		else if (uri.equals("/corp/logisticshead/list.html")) {
			return "总运单申报";
		}
		else if (uri.equals("/corp/loadhead/list.html")) {
			return "装载单申报";
		}
		else if (uri.equals("/corp/exportorderhead/list.html")) {
			return "出口电子订单申报";
		}
		else if (uri.equals("/corp/exportpaymenthead/list.html")) {
			return "出口电子支付单申报";
		}
		else if (uri.equals("/corp/exportwaybillhead/list.html")) {
			return "出口电子运单申报";
		}
		else if (uri.equals("/corp/exportlisthead/list.html")) {
			return "出口电子清单申报";
		}
		else if (uri.equals("/corp/exportmultiplehead/list.htm")) {
			return "出口集中申报";
		}
		else if (uri.equals("/corp/exportlogistics/list.html")) {
			return "出口总运单申报";
		}
		else if (uri.equals("/corp/exportarrival/list.html")) {
			return "货物运抵申报";
		}
		else if (uri.equals("/corp/summary/list.html")) {
			return "汇总申报单申报";
		}
		
		else if (uri.equals("/corp/list/list.html")) {
			return "进口货物查询";
		}
		else if (uri.equals("/corp/exportlist/list.html")) {
			return "出口货物查询";
		}
		else if (uri.equals("/corp/cusdata/list.html")) {
			return "报关数据查询";
		}
		else if (uri.equals("/corp/ciqdata/list.html")) {
			return "报检数据查询";
		}
		else if (uri.equals("/corp/cuscancelhead/list.html")) {
			return "撤销申请";
		}
		else if (uri.equals("/corp/cusrefundhead/list.html")) {
			return "退货申请";
		}
		else if (uri.equals("/corp/setting/list.html")) {
			return "进口初始值设置";
		}
		else if (uri.equals("/corp/exportsetting/list.html")) {
			return "出口初始值设置";
		}*/
		return "未知模块";
	}
	
//	public ModuleService getModuleService() {
//		return moduleService;
//	}
//	
//	public void setModuleService(ModuleService moduleService) {
//		this.moduleService = moduleService;
//	}

}
