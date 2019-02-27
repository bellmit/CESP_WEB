package com.yunyitg.cesp.system.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.system.shiro.token.ShiroToken;
import com.yunyitg.cesp.system.shiro.token.manager.TokenManager;
import com.yunyitg.cesp.system.user.entity.User;
import com.yunyitg.cesp.system.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public BaseResult<User> login(@RequestParam(value="username", required=true)String username,
			 @RequestParam(value="password", required=true)String password, Boolean rememberMe,
			 HttpServletRequest request) {
		LOG.info("invoke----------/user/login");
		Subject subject = SecurityUtils.getSubject();
		ShiroToken token = new ShiroToken(username, password);
		try {
//			TokenManager.login(user, rememberMe);
			subject.login(token);//会跳到我们自定义的realm中
			return new BaseResult<User>(true, "登录成功");
		} catch(Exception e){
//          e.printStackTrace();
          return new BaseResult<User>(false, e.getMessage());
      }
	}
	
	@RequestMapping(value = "/logout", method =RequestMethod.GET)
	public BaseResult<Object> logout() {
		LOG.info("invoke----------/user/logout");
		try {
			TokenManager.logout();
			return new BaseResult<Object>(true, "登出成功");
		} catch(Exception e) {
			return new BaseResult<Object>(true, e.getMessage(), "登出出现错误");
		}
	}
}
