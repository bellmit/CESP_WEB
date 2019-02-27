package com.yunyitg.cesp.core.company.dao;

import com.yunyitg.cesp.core.company.entity.HttpAccount;

import tk.mybatis.mapper.common.Mapper;

public interface HttpAccountMapper extends Mapper<HttpAccount> {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(HttpAccount record);
//
//    int insertSelective(HttpAccount record);
//
//    HttpAccount selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(HttpAccount record);
//
//    int updateByPrimaryKey(HttpAccount record);
	HttpAccount selectByCompanyId(Integer companyId);
}