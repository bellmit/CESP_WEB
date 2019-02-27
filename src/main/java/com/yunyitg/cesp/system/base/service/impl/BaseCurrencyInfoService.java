package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseCurrencyInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseCurrencyInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseCurrencyInfoService implements BaseInfoService<BaseCurrencyInfo>{

	@Autowired
	private BaseCurrencyInfoMapper baseCurrencyInfoMapper;
	
	/**
	 * 获取所有基础 币制代码信息记录
	 * @return
	 */
	@Override
	public List<BaseCurrencyInfo> listAll() {
		return baseCurrencyInfoMapper.selectAll();
	}
	
	/**
	 * 获取 币制代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseCurrencyInfo currency : listAll()) {
			codeMapName.put(currency.getCode(), currency.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取 币制名称name 与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseCurrencyInfo currency : listAll()) {
			nameMapCode.put(currency.getName(), currency.getCode());
		}
		return nameMapCode;
	}
}
