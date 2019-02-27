package com.yunyitg.cesp.system.user.dao;

import java.util.List;
import java.util.Set;

import com.yunyitg.cesp.system.user.entity.Permission;

import tk.mybatis.mapper.common.Mapper;

public interface PermissionMapper extends Mapper<Permission> {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Permission record);
//
//    int insertSelective(Permission record);
//
//    Permission selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(Permission record);
//
//    int updateByPrimaryKey(Permission record);
    
    List<Permission> listPermissionByUserId(Integer userId);
}