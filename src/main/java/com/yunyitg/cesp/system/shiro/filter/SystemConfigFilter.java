package com.yunyitg.cesp.system.shiro.filter;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import com.yunyitg.cesp.common.statics.Constant;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.system.shiro.session.CustomSessionManager;
import com.yunyitg.cesp.system.shiro.session.SessionStatus;
import com.yunyitg.cesp.system.shiro.token.manager.TokenManager;


/**
 * 
 * 开发公司：SOJSON在线工具 <p>
 * 版权所有：© www.sojson.com<p>
 * 博客地址：http://www.sojson.com/blog/  <p>
 * <p>
 * 
 * 系统配置过滤器
 * 1.是否单个帐号限制一个地点登录（可配置）
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2017年2月25日 　<br/>
 *
 * @author zhou-baicheng
 * @email  so@sojson.com
 * @version 1.0,2017年2月25日 <br/>
 * 
 */
public class SystemConfigFilter  extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object array) throws Exception {
	
		/**
		 * 判断开关（帐号登录多点限制）
		 */
//		if(!ShiroFilterUtils.singleLoginSwitch()){
//			return Boolean.TRUE;
//		}
	
		HttpServletRequest httpRequest = ((HttpServletRequest)request);
		
		Subject subject = getSubject(request, response);
		
		
		String url = httpRequest.getRequestURI();
		//如果是相关目录 or 如果没有登录 就直接return true
		if(url.startsWith("/open/") || (!subject.isAuthenticated() && !subject.isRemembered())){
			return Boolean.TRUE;
		}
		
	
		
		
		Session session = subject.getSession();
		/**
		 * 如果是记住的用户信息，那么走一次登录操作，用来踢出其他用户。
		 * 这个踢出功能因为rememberme的功能，所以还不怎么好实现，这里功能算是实现了，但是不完美。
		 */
		if(subject.isRemembered() && !subject.isAuthenticated() ){
			TokenManager.login(session, Boolean.TRUE);
		}
		/***
		 * 是否踢出判断，对Session里的自定义的Session状态进行检测。
		 */
		Map<String, String> resultMap = new HashMap<String, String>();
		//获取Session对象
		SessionStatus sessionStatus = (SessionStatus) session.getAttribute(CustomSessionManager.SESSION_STATUS);
		if (null != sessionStatus && !sessionStatus.isOnlineStatus()) {
			//判断是不是Ajax请求
			if (ShiroFilterUtils.isAjax(request) ) {
				LoggerUtils.debug(getClass(), "当前用户已经被踢出，并且是Ajax请求！");
				resultMap.put("user_status", "300");
				resultMap.put("message", "您已经被踢出，请重新登录！");
				//用response 输出JSON格式数据到页面
				ShiroFilterUtils.out(response, resultMap);
			}
			return  Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response)
			throws Exception {
		//先退出
		Subject subject = getSubject(request, response);
		subject.logout();
		/**
		 * 保存Request，用来保存当前Request，然后登录后可以跳转到当前浏览的页面。
		 * 比如：
		 * 我要访问一个URL地址，/admin/index.html，这个页面是要登录。然后要跳转到登录页面，但是登录后要跳转回来到/admin/index.html这个地址，怎么办？
		 * 传统的解决方法是变成/user/login.shtml?redirectUrl=/admin/index.html。
		 * shiro的解决办法不是这样的。需要：<code>WebUtils.getSavedRequest(request);</code>
		 * 							 然后：{@link UserLoginController.submitLogin(...)}中的<code>String url = WebUtils.getSavedRequest(request).getRequestUrl();</code>
		 * 如果还有问题，请咨询我。
		 */
		WebUtils.saveRequest(request);
		//再重定向
		WebUtils.issueRedirect(request, response, String.format(ShiroFilterUtils.KICKOUT_URL, Constant.MESSAGE_501));
		return Boolean.FALSE;
	}

}
