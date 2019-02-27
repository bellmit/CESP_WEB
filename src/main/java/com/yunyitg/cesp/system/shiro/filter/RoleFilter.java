package com.yunyitg.cesp.system.shiro.filter;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import com.yunyitg.cesp.common.statics.Constant;

/**
 * 
 * 开发公司：SOJSON在线工具 <p>
 * 版权所有：© www.sojson.com<p>
 * 博客地址：http://www.sojson.com/blog/  <p>
 * <p>
 * 
 * 角色判断校验
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
public class RoleFilter extends AccessControlFilter {

	@Resource
	private ShiroFilterFactoryBean shiroFilterFactoryBean;
	
	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		//取到数字参数[xxx] ，强制转换判断。
		String[] arra = (String[])mappedValue;
		
		Subject subject = getSubject(request, response);
		
		for (String role : arra) {
			//判断是否有拥有当前权限，有则返回true
			if(subject.hasRole(role)){
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		
			Subject subject = getSubject(request, response);  
	        if (subject.getPrincipal() == null) {//表示没有登录，重定向到登录页面  
	            saveRequest(request);  
	            WebUtils.issueRedirect(request, response, getLoginUrl());  
	        } else {  
	        	
	        	//这里特意从当前对象
	        	/**
	        	 * 这里特意从 shiroFilterFactoryBean 获取相关url，而 PermissionFilter 是从成员变量获取。
	        	 */
	        	String url = shiroFilterFactoryBean.getUnauthorizedUrl();
	            if (StringUtils.hasText(url)) {//如果有未授权页面跳转过去  
	            	url = String.format(url, Constant.MESSAGE_401);
	                WebUtils.issueRedirect(request, response,url);  
	            } else {//否则返回401未授权状态码  
	                WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED);  
	            }  
	        }  
		return Boolean.FALSE;
	}

}
