package com.yunyitg.cesp.system.shiro.realm;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.common.statics.Constant;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.core.company.service.CompanyService;
import com.yunyitg.cesp.system.shiro.session.CustomSessionManager;
import com.yunyitg.cesp.system.shiro.token.ShiroToken;
import com.yunyitg.cesp.system.shiro.token.manager.TokenManager;
import com.yunyitg.cesp.system.user.entity.User;
import com.yunyitg.cesp.system.user.service.PermissionService;
import com.yunyitg.cesp.system.user.service.RoleService;
import com.yunyitg.cesp.system.user.service.UserService;


/**
 * shiro 认证 + 授权 重写
 * @author yangyuantao
 * @date 2017-06-12
 */
public class UserRealm extends AuthorizingRealm {

	@Resource(name = "userService")
	UserService userService;
//	@Resource(name = "permissionService")
//	PermissionService permissionService;
//	@Resource(name = "roleService")
//	RoleService roleService;
	@Resource(name = "companyService")
	CompanyService companyService;
	
	@Autowired
	CustomSessionManager customSessionManager;
	
	public UserRealm() {
		super();
	}
	/**
	 *  认证信息，主要针对用户登录， 
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		
		ShiroToken token = (ShiroToken) authcToken;
		User user = userService.login(token.getUsername(), token.getPswd());
		if(null == user){
			throw new AccountException("帐号或密码不正确！");
		/**
		 * 如果用户的status为禁用。那么就抛出<code>DisabledAccountException</code>
		 */
		}else if(Constant.I_ZERO.equals(user.getStatus())){
			throw new DisabledAccountException("帐号已经禁止登录！");
		}else{
			/**
			 * 判断开关（帐号登录多点限制）
			 */
//			if(ShiroFilterUtils.singleLoginSwitch()){
//				//处理踢出功能
//				customSessionManager.excuteLoginByUserId(user.getId());
//			}
			//更新登录时间 last login time
			user.setLastLoginTime(new Date());
			
			String ip = token.getIp();
			LoggerUtils.fmtDebug(getClass(), "登录成功，登录IP[%s] .", ip);
			/**
			 * TODO 为了吻合上一个Demo，故不添加字段，应同学要求，把ip放到这里输出，如果你要记录登录的IP，直接用即可。
			 */
			userService.updateByPrimaryKeySelective(user);
//			userService.update(user);
			//存储用户是否记住，方便下次主动帮用户登录的时候使用。
			user.setRememberMe(token.isRememberMe());
		}
		return new SimpleAuthenticationInfo(user,user.getPassword(), getName());
    }
	
	/**
	 * 存放一些信息到session中，便于获取，可以通过httpsession获取相应的信息
	 */
	private void setSessionInfo(User user) {
		
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		
		//显示的设置权限和角色，避免下次再去数据库获取，提高效率
		
	}

	 /** 
     * 授权 
     */  
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {  
    	
    	Integer userId = TokenManager.getUserId();
    	LoggerUtils.debug(getClass(), "用户数据表id" + userId);
//    	Integer userId = ((User)SecurityUtils.getSubject().getPrincipal()).getId();
		SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
		//根据用户ID查询角色（role），放入到Authorization里。
		Set<String> roles = userService.listRolesByUserId(userId);
		
		//根据用户所属企业id查询企业资质
//		Set<String> companyQualifications = companyService.listQualifications(TokenManager.getToken().getCompanyId());
//		roles.addAll(companyQualifications);
		
		LoggerUtils.fmtInfo(getClass(), "角色集合:%s ", roles.toString());
		System.out.println(roles.toString());
		info.setRoles(roles);
		//根据用户ID查询权限（permission），放入到Authorization里。
		Set<String> permissions = new HashSet<String>();
		Set<String> userPermissions = userService.listPermissionsByUserId(userId);
		permissions.addAll(userPermissions);
		//根据用户所属企业id查询系统资源（模块）
		Set<String> comModules = companyService.listModulesByCompanyId(TokenManager.getToken().getCompanyId());
		permissions.addAll(comModules);
		LoggerUtils.fmtInfo(getClass(), "权限集合:%s ", permissions.toString());
		System.out.println("权限集合:%s "+ permissions.toString());
		info.setStringPermissions(permissions);
        return info;  
    }  
    /**
     * 清空当前用户权限信息
     */
	public  void clearCachedAuthorizationInfo() {
		PrincipalCollection principalCollection = SecurityUtils.getSubject().getPrincipals();
		SimplePrincipalCollection principals = new SimplePrincipalCollection(
				principalCollection, getName());
		super.clearCachedAuthorizationInfo(principals);
	}
	/**
	 * 指定principalCollection 清除
	 */
	public void clearCachedAuthorizationInfo(PrincipalCollection principalCollection) {
		SimplePrincipalCollection principals = new SimplePrincipalCollection(
				principalCollection, getName());
		super.clearCachedAuthorizationInfo(principals);
	}
}
