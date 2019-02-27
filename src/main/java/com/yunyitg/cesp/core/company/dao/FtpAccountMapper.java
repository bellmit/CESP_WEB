package com.yunyitg.cesp.core.company.dao;

import com.yunyitg.cesp.core.company.entity.FtpAccount;

import tk.mybatis.mapper.common.Mapper;

public interface FtpAccountMapper extends Mapper<FtpAccount> {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(FtpAccount record);
//
//    int insertSelective(FtpAccount record);
//
//    FtpAccount selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(FtpAccount record);
//
//    int updateByPrimaryKey(FtpAccount record);
	FtpAccount selectByCompanyId(Integer companyId);
}