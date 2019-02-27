package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseUnitInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseCountryInfo;
import com.yunyitg.cesp.system.base.entity.BaseUnitInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseUnitInfoService implements BaseInfoService<BaseUnitInfo> {

	@Autowired
	private BaseUnitInfoMapper baseUnitInfoMapper;
	
	/**
	 * 获取所有基础 计量单位 信息/记录
	 */
	@Override
	public List<BaseUnitInfo> listAll() {
		return baseUnitInfoMapper.selectAll();
	}

	/**
	 * 获取计量单位代码code与名称name的对应map
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseUnitInfo unit : listAll()) {
			codeMapName.put(unit.getCode(), unit.getName());
		}
		return codeMapName;
	}

	/**
	 * 获取计量单位名称name与代码code的对应map
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseUnitInfo unit : listAll()) {
			nameMapCode.put(unit.getName(), unit.getCode());
		}
		return nameMapCode;
	}


	
	
}
