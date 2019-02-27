package com.yunyitg.cesp.core.company.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.yunyitg.cesp.core.company.entity.Company;

import tk.mybatis.mapper.common.Mapper;

public interface CompanyMapper extends Mapper<Company> {
    
//    Set<String> findModuleByCompanyId(Integer companyId);
	
	/**
	 * 根据企业电子口岸备案号和企业创建者id
	 * @param gzeportCode
	 * @param creUserId
	 * @return
	 */
	Company selectByGzeportCodeAndCreUserId(@Param("gzeportCode")String gzeportCode,
			@Param("creUserId")Integer creUserId);
    
}