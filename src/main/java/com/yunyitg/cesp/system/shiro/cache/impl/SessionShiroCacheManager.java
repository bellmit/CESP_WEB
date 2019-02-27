package com.yunyitg.cesp.system.shiro.cache.impl;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.session.Session;

import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.system.shiro.cache.ShiroCacheManager;
import com.yunyitg.cesp.system.shiro.session.CustomSessionManager;
import com.yunyitg.cesp.system.shiro.session.SessionStatus;
import com.yunyitg.cesp.system.shiro.session.ShiroSessionRepository;


public class SessionShiroCacheManager<K, V> implements ShiroCacheManager,ShiroSessionRepository {
	
//	static final String REDIS_SHIRO_SESSION = "sojson-shiro-demo-session:";
	EhCacheManager ehCacheManager;
	
	@Override
	public void destroy() {
		ehCacheManager.destroy();
	}
	/**这里是默认的配置信息
	  <!-- We want eternal="true" and no timeToIdle or timeToLive settings because Shiro manages session
       expirations explicitly.  If we set it to false and then set corresponding timeToIdle and timeToLive properties,
       ehcache would evict sessions without Shiro's knowledge, which would cause many problems
      (e.g. "My Shiro session timeout is 30 minutes - why isn't a session available after 2 minutes?"
             Answer - ehcache expired it due to the timeToIdle property set to 120 seconds.)

      diskPersistent=true since we want an enterprise session management feature - ability to use sessions after
      even after a JVM restart.  -->
  <cache name="shiro-activeSessionCache"
         maxElementsInMemory="10000"
         overflowToDisk="true"
         eternal="true"
         timeToLiveSeconds="0"
         timeToIdleSeconds="0"
         diskPersistent="true"
         diskExpiryThreadIntervalSeconds="600"/>
	 */
	/**
	 * 返回父类cache
	 * Session管理cache
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Cache<Serializable, Session> getCache() {
		return ehCacheManager.getCache("shiro-activeSessionCache");
	}
	@Override
	public void clear() {
		getCache().clear();
	}
	@Override
	public void deleteSession(Serializable id) {
        if (id == null) {
            throw new NullPointerException("session id is empty");
        }
        try {
        	getCache().remove(id);
        } catch (Exception e) {
        	LoggerUtils.fmtError(getClass(), e, "删除session出现异常，id:[%s]",id);
        }
    
		
	}
	@Override
	public Collection<Session> getAllSessions() {
    	Collection<Session> sessions = null;
		try {
			sessions = getCache().values();
		} catch (Exception e) {
			LoggerUtils.fmtError(getClass(), e, "获取全部session异常");
		}
       
        return sessions;
    }
	@Override
	public Session getSession(Serializable sessionId) {
		return getCache().get(sessionId);
	}
	@Override
	public void saveSession(Session session) {
        if (session == null || session.getId() == null)
            throw new NullPointerException("session is empty");
        try {
        	SessionStatus sessionStatus = (SessionStatus) session.getAttribute(CustomSessionManager.SESSION_STATUS);
            //不存在才添加。
            if(null == sessionStatus){
            	//Session 踢出自存存储。
            	sessionStatus = new SessionStatus();
            	session.setAttribute(CustomSessionManager.SESSION_STATUS, sessionStatus);
            }
            LoggerUtils.fmtDebug(getClass(), "当前SessionId：%s，状态为：%s", session.getId(),
        										sessionStatus.isOnlineStatus() ? "可用" : "不可用");
            getCache().put(session.getId(), session);
        } catch (Exception e) {
        	LoggerUtils.fmtError(getClass(), e, "save session error，id:[%s]",session.getId());
        }
    }
	public EhCacheManager getEhCacheManager() {
		return ehCacheManager;
	}
	public void setEhCacheManager(EhCacheManager ehCacheManager) {
		this.ehCacheManager = ehCacheManager;
	}
}
