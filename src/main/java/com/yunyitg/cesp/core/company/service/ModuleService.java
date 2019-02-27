package com.yunyitg.cesp.core.company.service;

import java.util.List;

import com.yunyitg.cesp.core.company.entity.Module;

public interface ModuleService {
	
	int deleteByPrimaryKey(Integer id);
	
	Module insert(Module record);

	Module insertSelective(Module record);
	
	Module selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(Module record);
	
	int updateByPrimaryKey(Module record);
	
	/**
	 * 查询所有系统资源模块
	 * @return
	 */
	List<Module> listAllModule();
	
	/**
	 * 查询所有可用系统资源模块
	 * @return
	 */
	List<Module> listAvailableModule();
	
	/**
	 * 根据企业主键ID获取主键所拥有的系统资源模块
	 * @param companyId
	 * @return
	 */
	List<Module> listModuleByCompanyId(Integer companyId);
}
