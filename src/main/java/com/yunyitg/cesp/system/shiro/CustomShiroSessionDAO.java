package com.yunyitg.cesp.system.shiro;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;

import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.system.shiro.session.ShiroSessionRepository;


/**
 * Session 操作
 * @author yangyuantao
 * @date 2017-06-12
 */
public class CustomShiroSessionDAO extends AbstractSessionDAO{ 
	
    private ShiroSessionRepository shiroSessionRepository;  
  
    public ShiroSessionRepository getShiroSessionRepository() {  
        return shiroSessionRepository;  
    }  
  
    public void setShiroSessionRepository(  
            ShiroSessionRepository shiroSessionRepository) {  
        this.shiroSessionRepository = shiroSessionRepository;  
    }  
  
    @Override  
    public void update(Session session) throws UnknownSessionException {  
        getShiroSessionRepository().saveSession(session);  
    }  
  
    @Override  
    public void delete(Session session) {  
        if (session == null) {  
        	LoggerUtils.error(getClass(), "Session 不能为null");
            return;  
        }  
        Serializable id = session.getId();  
        if (id != null)  
            getShiroSessionRepository().deleteSession(id);  
    }  
  
    @Override  
    public Collection<Session> getActiveSessions() {  
        return getShiroSessionRepository().getAllSessions();  
    }  
  
    @Override  
    public Serializable doCreate(Session session) {  
        Serializable sessionId = this.generateSessionId(session);  
        this.assignSessionId(session, sessionId);  
        getShiroSessionRepository().saveSession(session);  
        return sessionId;  
    }  
  
    @Override  
    public Session doReadSession(Serializable sessionId) {  
    	Session session = getShiroSessionRepository().getSession(sessionId);
        return session;  
    }
}
