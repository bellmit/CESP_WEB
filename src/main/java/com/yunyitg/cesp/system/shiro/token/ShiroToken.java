package com.yunyitg.cesp.system.shiro.token;

import java.io.Serializable;

import org.apache.shiro.authc.UsernamePasswordToken;

public class ShiroToken extends UsernamePasswordToken implements Serializable {

	private static final long serialVersionUID = 1L;

	public ShiroToken(String username, String password) {
		super(username, password);
		this.pswd = password;
	}

	/** 登录密码[字符串类型] 因为父类是char[] ] **/
	private String pswd;
	/** 登录的IP地址 */
	private String ip;
	/**
	 * Whether or not 'rememberMe' should be enabled for the corresponding login
	 * attempt; default is <code>false</code>
	 */
	private boolean rememberMe = Boolean.FALSE;

	public String getPswd() {
		return pswd;
	}
	
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
