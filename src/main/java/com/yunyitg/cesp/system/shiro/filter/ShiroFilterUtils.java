package com.yunyitg.cesp.system.shiro.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.yunyitg.cesp.common.statics.Constant;
import com.yunyitg.cesp.common.utils.FastJsonUtils;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.system.shiro.cache.VCache;
import com.yunyitg.cesp.system.user.entity.SystemConfig;
import com.yunyitg.cesp.system.user.service.SystemConfigService;


/**
 * 
 * 开发公司：itboy.net<br/>
 * 版权：itboy.net<br/>
 * <p>
 * 
 * Shiro Filter 工具类
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2016年5月27日 　<br/>
 * <p>
 * *******
 * <p>
 * 
 * @author zhou-baicheng
 * @email i@itboy.net
 * @version 1.0,2016年5月27日 <br/>
 * 
 */
public class ShiroFilterUtils {
	
	//系统配置service
	final static SystemConfigService systemConfigService = 
				SpringContextUtil.getBean("systemConfigServiceImpl", SystemConfigService.class);
	final static Class<? extends ShiroFilterUtils> CLAZZ = ShiroFilterUtils.class;
	//踢出URL
	final static String KICKOUT_URL = "/open/kickedOut/%s.shtml";
	//没有权限URL
	static final String UNAUTHORIZED_URL = "/open/unauthorized/%s.shtml";
	
	/**
	 * 是否是Ajax请求
	 * @param request
	 * @return
	 */
	public static boolean isAjax(ServletRequest request){
		String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
		if("XMLHttpRequest".equalsIgnoreCase(header)){
			LoggerUtils.debug(CLAZZ, "当前请求为Ajax请求");
			return Boolean.TRUE;
		}
		LoggerUtils.debug(CLAZZ, "当前请求非Ajax请求");
		return Boolean.FALSE;
	}
	
	/**
	 *  使用	response 输出JSON
	 * @param hresponse
	 * @param resultMap
	 * @throws IOException
	 */
	public static void out(ServletResponse response, Map<String, String> resultMap){
		PrintWriter out = null;
		try {
			response.setCharacterEncoding("UTF-8");//设置编码
			response.setContentType("application/json");//设置返回类型
			out = response.getWriter();
			out.println(FastJsonUtils.collectToString(resultMap));//输出
		} catch (Exception e) {
			LoggerUtils.fmtError(CLAZZ, e, "输出JSON报错。");
		}finally{
			if(null != out){
				out.flush();
				out.close();
			}
		}
	}
	/**
	 * 登录校验开关（帐号登录多点限制）
	 * 
	 * @return
	 */
	public static boolean singleLoginSwitch() {
		
		SystemConfig entity = VCache.get(Constant.SINGLE_LOGIN, SystemConfig.class);
		if(null == entity){
			entity = systemConfigService.selectByPrimaryKey(Constant.SINGLE_LOGIN);
			if(null == entity){
				entity = new SystemConfig().setK(Constant.SINGLE_LOGIN).setV(Constant.FALSE);
				systemConfigService.insert(entity);
			}
			VCache.setTTL(Constant.SINGLE_LOGIN, entity, 3600);
		}
		return entity.isBooleanV();
	}
	/**
	 * 更新的时候用，直接覆盖的方式
	 * @param entity
	 * @return
	 */
	public static boolean singleLoginSwitch(SystemConfig entity) {
		VCache.setTTL(Constant.SINGLE_LOGIN, entity, 3600);
		return entity.isBooleanV();
	}
}
