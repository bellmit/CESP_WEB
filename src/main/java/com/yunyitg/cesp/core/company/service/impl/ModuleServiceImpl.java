package com.yunyitg.cesp.core.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.core.company.dao.ModuleMapper;
import com.yunyitg.cesp.core.company.entity.Module;
import com.yunyitg.cesp.core.company.service.ModuleService;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleMapper moduleMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return moduleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Module insert(Module record) {
		moduleMapper.insert(record);
		return record;
	}

	@Override
	public Module insertSelective(Module record) {
		moduleMapper.insertSelective(record);
		return record;
	}

	@Override
	public Module selectByPrimaryKey(Integer id) {
		return moduleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Module record) {
		return moduleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Module record) {
		return moduleMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<Module> listAllModule() {
		return moduleMapper.selectAll();
	}
	
	@Override
	public List<Module> listAvailableModule() {
		return moduleMapper.selectByEnableMark(1);
	}
	
	@Override
	public List<Module> listModuleByCompanyId(Integer companyId) {
		return moduleMapper.listModuleByCompanyId(companyId);
	}

	

	

}
