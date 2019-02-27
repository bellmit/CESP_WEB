package com.yunyitg.cesp.system.user.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.user.dao.PermissionMapper;
import com.yunyitg.cesp.system.user.entity.Permission;
import com.yunyitg.cesp.system.user.service.PermissionService;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Permission insert(Permission record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission insertSelective(Permission record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Permission record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Permission record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<String> listPermissionByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
