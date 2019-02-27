package com.yunyitg.cesp.core.company.dao;

import java.util.List;

import com.yunyitg.cesp.core.company.entity.Qualification;

import tk.mybatis.mapper.common.Mapper;

public interface QualificationMapper extends Mapper<Qualification> {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Qualification record);
//
//    int insertSelective(Qualification record);
//
//    Qualification selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(Qualification record);
//
//    int updateByPrimaryKey(Qualification record);
	
	List<Qualification> listByCompanyId(Integer companyId);
}