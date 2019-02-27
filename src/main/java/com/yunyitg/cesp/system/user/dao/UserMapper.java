package com.yunyitg.cesp.system.user.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.yunyitg.cesp.system.user.entity.User;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    
    /**
     * 通过User属性字段【name】、【password】查找有效用户User
     * 进行登录校验
     * @param name
     * @param password
     * @return
     */
    User doLogin(@Param("name")String name, @Param("password")String password);
    
    Set<String> findRoleByUserId(@Param("userId")Integer userId);
    
    Set<String> findPermissionByUserId(@Param("userId")Integer userId);
}