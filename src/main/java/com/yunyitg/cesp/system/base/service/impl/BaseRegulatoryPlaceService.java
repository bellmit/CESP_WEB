package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseRegulatoryPlaceMapper;
import com.yunyitg.cesp.system.base.entity.BaseRegulatoryPlace;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseRegulatoryPlaceService implements BaseInfoService<BaseRegulatoryPlace> {

	@Autowired
	private BaseRegulatoryPlaceMapper baseRegulatoryPlaceMapper;
	
	/**
	 * 获取所有基础 监管场所 信息/记录
	 * @return
	 */
	@Override
	public List<BaseRegulatoryPlace> listAll() {
		return baseRegulatoryPlaceMapper.selectAll();
	}
	
	/**
	 * 获取监管场所代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseRegulatoryPlace place : listAll()) {
			codeMapName.put(place.getCode(), place.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取监管场所名称name与代码code的对应map
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseRegulatoryPlace place : listAll()) {
			nameMapCode.put(place.getName(), place.getCode());
		}
		return nameMapCode;
	}
}
