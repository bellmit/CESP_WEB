package com.yunyitg.cesp.system.user.service;

import java.util.Set;

import com.yunyitg.cesp.system.user.entity.Role;

public interface RoleService {

	int deleteByPrimaryKey(Integer id);
	
	int insert(Role record);
	
	int insertSelective(Role record);
	
	Role selectByPrimary(Integer id);
	
	int updateByPrimaryKey(Role record);
	
	int updateByPrimaryKeySelective(Role record);
	
	//根据用户ID查询角色（role），放入到Authorization里。
	Set<String> findRoleByUserId(Integer userId);
	
	
}
