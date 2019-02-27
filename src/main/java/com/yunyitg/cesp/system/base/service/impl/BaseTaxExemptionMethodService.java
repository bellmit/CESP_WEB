package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseTaxExemptionMethodMapper;
import com.yunyitg.cesp.system.base.entity.BaseTaxExemptionMethod;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseTaxExemptionMethodService implements BaseInfoService<BaseTaxExemptionMethod> {

	@Autowired
	private BaseTaxExemptionMethodMapper baseTaxExemptionMethodMapper;
	
	/**
	 * 获取所有基础 减征免税方式 信息/记录
	 * @return
	 */
	@Override
	public List<BaseTaxExemptionMethod> listAll() {
		return baseTaxExemptionMethodMapper.selectAll();
	}
	
	/**
	 * 获取  减征免税方式代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseTaxExemptionMethod method : listAll()) {
			codeMapName.put(method.getCode(), method.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取 减征免税方式名称name与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseTaxExemptionMethod method : listAll()) {
			nameMapCode.put(method.getName(), method.getCode());
		}
		return nameMapCode;
	}

	
		
}
