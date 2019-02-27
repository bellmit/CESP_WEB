package com.yunyitg.cesp.system.user.service;

import java.util.Set;

import com.yunyitg.cesp.system.user.entity.User;

public interface UserService {
	
	int deleteByPrimaryKey(Integer id);
	
	User insert(User record);

	User insertSelective(User record);
	
	User selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(User record);
	
	int updateByPrimaryKey(User user);
	
	User login(String name, String password);
	
	/**
	 * 根据用户主键ID获取用户角色role字段【type】集合
	 * @param userId
	 * @return
	 */
	Set<String> listRolesByUserId(Integer userId);
	
	/**
	 * 根据用户主键ID获取用户权限permission字段【url】集合
	 * @param userId
	 * @return
	 */
	Set<String> listPermissionsByUserId(Integer userId);
	
	
	
	
}
