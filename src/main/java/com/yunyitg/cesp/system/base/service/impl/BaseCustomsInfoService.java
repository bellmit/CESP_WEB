package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseCustomsInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseCountryInfo;
import com.yunyitg.cesp.system.base.entity.BaseCustomsInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseCustomsInfoService implements BaseInfoService<BaseCustomsInfo> {

	@Autowired
	private BaseCustomsInfoMapper baseCustomsInfoMapper;
	
	/**
	 * 获取所有基础海关关区信息记录
	 * @return
	 */
	@Override
	public List<BaseCustomsInfo> listAll() {
		return baseCustomsInfoMapper.selectAll();
	}
	
	/**
	 * 获取海关关区代码与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseCustomsInfo customs : listAll()) {
			codeMapName.put(customs.getCode(), customs.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取海关关区名称name与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseCustomsInfo customs : listAll()) {
			nameMapCode.put(customs.getName(), customs.getCode());
		}
		return nameMapCode;
	}
	
}
