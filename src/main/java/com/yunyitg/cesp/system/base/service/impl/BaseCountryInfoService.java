package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseCountryInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseCountryInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseCountryInfoService implements BaseInfoService<BaseCountryInfo> {

	@Autowired
	private BaseCountryInfoMapper baseCountryInfoMapper;
	
	/**
	 * 获取所有基础国家（地区）信息记录
	 * @return
	 */
	@Override
	public List<BaseCountryInfo> listAll() {
		return baseCountryInfoMapper.selectAll();
	}
	
	/**
	 * 获取国家（地区）代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseCountryInfo country : listAll()) {
			codeMapName.put(country.getCode(), country.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取国家（地区）名称name与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseCountryInfo country : listAll()) {
			nameMapCode.put(country.getName(), country.getCode());
		}
		return nameMapCode;
	}
}
