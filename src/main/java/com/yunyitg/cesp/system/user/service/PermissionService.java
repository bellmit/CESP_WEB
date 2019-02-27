package com.yunyitg.cesp.system.user.service;

import java.util.Set;

import com.yunyitg.cesp.system.user.entity.Permission;

public interface PermissionService {

	int deleteByPrimaryKey(Integer id);
	
	Permission insert(Permission record);
	
	Permission insertSelective(Permission record);
	
	Permission selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(Permission record);
	
	int updateByPrimaryKey(Permission record);
	
	/**
	 * 根据用户ID查询所拥有的权限permission集合
	 * @param userId
	 * @return
	 */
	Set<String> listPermissionByUserId(Integer userId);
}
