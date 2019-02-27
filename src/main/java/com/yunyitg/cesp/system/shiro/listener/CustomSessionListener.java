package com.yunyitg.cesp.system.shiro.listener;


import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.system.shiro.cache.impl.SessionShiroCacheManager;

/**
 * 
 * shiro 回话 监听
 *
 * @author zhou-baicheng
 * @email  so@sojson.com
 * @version 1.0,2016年6月2日 <br/>
 * 
 */
@SuppressWarnings("rawtypes")
public class CustomSessionListener implements SessionListener {

	SessionShiroCacheManager sessionShiroCacheManager;

    /**
     * 一个回话的生命周期开始
     */
    @Override
    public void onStart(Session session) {
       LoggerUtils.fmtDebug(getClass(), "session 创建成功，SessionId[%s]", session.getId());
    }
    /**
     * 一个回话的生命周期结束
     */
    @Override
    public void onStop(Session session) {
    	 LoggerUtils.fmtDebug(getClass(), "session 销毁成功，SessionId[%s]", session.getId());
    }

    @Override
    public void onExpiration(Session session) {
    	sessionShiroCacheManager.deleteSession(session.getId());
    	 LoggerUtils.fmtDebug(getClass(), "session 删除成功，SessionId[%s]", session.getId());
    }
	public SessionShiroCacheManager getSessionShiroCacheManager() {
		return sessionShiroCacheManager;
	}
	public void setSessionShiroCacheManager(
			SessionShiroCacheManager sessionShiroCacheManager) {
		this.sessionShiroCacheManager = sessionShiroCacheManager;
	}

}

