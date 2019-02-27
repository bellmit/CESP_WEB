package com.yunyitg.cesp.system.shiro.session;

import java.io.Serializable;

/**
 * 
 * Session 状态 VO
 * 
 * @author yangyuantao
 * @date 2017-06-10
 * 
 */
public class SessionStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	//是否踢出 true:有效，false：踢出。
	private Boolean onlineStatus = Boolean.TRUE;

	
	public Boolean isOnlineStatus(){
		return onlineStatus;
	}

	public Boolean getOnlineStatus() {
		return onlineStatus;
	}
	public void setOnlineStatus(Boolean onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
	
	
}
