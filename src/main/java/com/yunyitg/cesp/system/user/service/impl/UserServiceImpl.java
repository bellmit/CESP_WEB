package com.yunyitg.cesp.system.user.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.user.dao.UserMapper;
import com.yunyitg.cesp.system.user.entity.User;
import com.yunyitg.cesp.system.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User insert(User record) {
		userMapper.insert(record);
		return record;
	}

	@Override
	public User insertSelective(User record) {
		userMapper.insertSelective(record);
		return record;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public User login(String name, String password) {
		return userMapper.doLogin(name, password);
	}
	
	@Override
	public Set<String> listRolesByUserId(Integer userId) {
		return userMapper.findRoleByUserId(userId);
	}

	@Override
	public Set<String> listPermissionsByUserId(Integer userId) {
		return userMapper.findPermissionByUserId(userId);
	}

}
