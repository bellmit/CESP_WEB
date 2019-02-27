package com.yunyitg.cesp.core.company.service;

import java.util.List;
import java.util.Set;

import com.github.pagehelper.PageInfo;
import com.yunyitg.cesp.core.company.dto.CompanyInsertDto;
import com.yunyitg.cesp.core.company.dto.CompanyQueryDto;
import com.yunyitg.cesp.core.company.entity.Company;
import com.yunyitg.cesp.core.company.vo.CompanyVo;

public interface CompanyService {
	
	/**
	 * 新增企业
	 */
	boolean create(CompanyInsertDto insertDto);
	
	/**
	 * 根据条件分页查询企业
	 */
	PageInfo<Company> listByConditions(CompanyQueryDto queryDto);
	
	/**
	 * 根据电子口岸（单一窗口）备案号查找企业
	 */
	CompanyVo findByGzeportCode(String gzeportCode);
	
	/**
	 * 根据企业主键ID获取企业资源模块module字段【url】集合
	 * @param companyId
	 * @return
	 */
	Set<String> listModulesByCompanyId(Integer companyId);
	
	
}
