package com.yunyitg.cesp.system.user.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.user.entity.Role;
import com.yunyitg.cesp.system.user.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Role selectByPrimary(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<String> findRoleByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
