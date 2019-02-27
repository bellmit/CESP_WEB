package com.yunyitg.cesp.system.shiro.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.core.io.ClassPathResource;

import com.yunyitg.cesp.common.config.INI4j;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.system.shiro.service.ShiroManager;

/**
 * 
 * 开发公司：SOJSON在线工具 <p>
 * 版权所有：© www.sojson.com<p>
 * 博客地址：http://www.sojson.com/blog/  <p>
 * <p>
 * 
 * 动态加载权限 Service
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
public class ShiroManagerImpl implements ShiroManager {
	
	//TODO --- 这里本是 *.ini 文件 ,但是老有同学打开的时候，用系统自带的文本编辑器编辑，导致乱码，我这么加个 .t 这样就双击是开发工具打开了
	public static final String INI_FILE_NAME ="shiro_base_auth.ini.t";
	// 注意/r/n前不能有空格
	static final String CRLF = "\r\n",
			//权限space
			BASE_AUTH = "base_auth",
			//系统设置校验
			SYSTEM_FILTER=",systemConfigFilter",
			//不过滤Filter anon
			ANON="anon",LOGOUT="logout";

	@Resource
	private ShiroFilterFactoryBean shiroFilterFactoryBean;


	@Override
	public String loadFilterChainDefinitions() {
		
		StringBuffer sb = new StringBuffer();
			sb.append(getFixedAuthRule());//固定权限，采用读取配置文件
		return sb.toString();
	}
	
	/**
	 * 从配额文件获取固定权限验证规则串
	 */
	private String getFixedAuthRule(){
		
		ClassPathResource cp = new ClassPathResource(INI_FILE_NAME);
		INI4j ini = null;
		try {
			
			File file = cp.getFile();
			String path = file.getPath();
			LoggerUtils.fmtDebug(getClass(), "[%s]， init file path[%s]", INI_FILE_NAME,path);
			
			double length = file.length();
			LoggerUtils.fmtDebug(getClass(), "文件[%s]，大小：%sKB", INI_FILE_NAME,length/1024);
			if(length == 0 ){
				LoggerUtils.fmtError(getClass(), "文件[%s]，大小：0，无法进行下去，正在停止 JVM ... ", INI_FILE_NAME);
				System.exit(0);
			}
			
			
			ini = new INI4j(file);
		} catch (IOException e) {
			LoggerUtils.fmtError(getClass(), e, "加载文件出错。file:[%s]", INI_FILE_NAME);
		}
		String section = "base_auth";
		Set<String> keys = ini.get(section).keySet();
		StringBuffer sb = new StringBuffer();
		for (String key : keys) {
			String value = ini.get(section, key);
			sb.append(key).append(" = ").append(value);
			//校验是不是不拦截，默认追加系统Filter，用来拦截已经踢出或者已经被其他用户挤下去的用户。
			/*if(!ANON.equals(StringUtils.trim(value) )&& !LOGOUT.equals(StringUtils.trim(value) )){
				*//**
				 * 此处业务逻辑说明。
				 * 
				 * 我开始想着用这个拦截器拦在最前面，但是发现当用户Session过期，或者没登陆的情况下，也被这个拦截器拦截了，提示已经被踢出去了。
				 * 所以现在改成从后面追加，这样可以不影响原有的Filter业务，然后再到这个Filter进行判断是否被踢出去。
				 *//*
				sb.append(SYSTEM_FILTER);
			}*/
			sb.append(CRLF);//换行
		}
		return sb.toString();
	}
	/**
	 * 写入配置文件
	 */
	@Override
	public void updateFilterChain(String content) {
		ClassPathResource cp = new ClassPathResource(INI_FILE_NAME);
		BufferedWriter out = null;
		try {
			//覆盖原有配置内容
			out = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(cp.getFile()),"utf-8"));
			out.write(content);
			out.flush();
			//权限配置
			reCreateFilterChains();
		} catch (Exception e) {
			e.printStackTrace();
			LoggerUtils.fmtError(getClass(), "操作写入[%s]文件失败，写入的内容为：%s%s。", e,INI_FILE_NAME,CRLF,content);
		}finally{
			if(null != out)
				try {
					out.close();
				} catch (IOException e) {
					LoggerUtils.fmtError(getClass(), "操作写入[%s]，关闭文件输出流失败。", e,INI_FILE_NAME);
				}
			
		}
		
	}
	// 此方法加同步锁
	@Override
	public synchronized void reCreateFilterChains() {
//		ShiroFilterFactoryBean shiroFilterFactoryBean = (ShiroFilterFactoryBean) SpringContextUtil.getBean("shiroFilterFactoryBean");
		AbstractShiroFilter shiroFilter = null;
		try {
			shiroFilter = (AbstractShiroFilter) shiroFilterFactoryBean.getObject();
			
			
		} catch (Exception e) {
			LoggerUtils.error(getClass(),"getShiroFilter from shiroFilterFactoryBean error!", e);
			throw new RuntimeException("get ShiroFilter from shiroFilterFactoryBean error!");
		}

		PathMatchingFilterChainResolver filterChainResolver = (PathMatchingFilterChainResolver) shiroFilter
				.getFilterChainResolver();
		
		//
		DefaultFilterChainManager manager = (DefaultFilterChainManager) filterChainResolver
				.getFilterChainManager();

		// 清空老的权限控制
		manager.getFilterChains().clear();

		shiroFilterFactoryBean.getFilterChainDefinitionMap().clear();
		//把生成的值重新设置 filterChainDefinitions
		shiroFilterFactoryBean.setFilterChainDefinitions(loadFilterChainDefinitions());
		// 重新构建生成
		Map<String, String> chains = shiroFilterFactoryBean.getFilterChainDefinitionMap();
		
		for (Map.Entry<String, String> entry : chains.entrySet()) {
			String url = entry.getKey();
			String chainDefinition = entry.getValue().trim().replace(" ", "");
			manager.createChain(url, chainDefinition);
		}

	}
	public void setShiroFilterFactoryBean(
			ShiroFilterFactoryBean shiroFilterFactoryBean) {
		this.shiroFilterFactoryBean = shiroFilterFactoryBean;
	}


	

}
