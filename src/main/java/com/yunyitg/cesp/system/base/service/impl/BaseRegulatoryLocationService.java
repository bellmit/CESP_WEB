package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseRegulatoryLocationMapper;
import com.yunyitg.cesp.system.base.entity.BaseCountryInfo;
import com.yunyitg.cesp.system.base.entity.BaseRegulatoryLocation;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseRegulatoryLocationService implements BaseInfoService<BaseRegulatoryLocation> {

	@Autowired
	private BaseRegulatoryLocationMapper baseRegulatoryLocationMapper;
	
	/**
	 * 获取所有基础 监管点 信息/记录
	 * @return
	 */
	@Override
	public List<BaseRegulatoryLocation> listAll() {
		return baseRegulatoryLocationMapper.selectAll();
	}
	
	/**
	 * 获取监管点 名称name与监管点代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseRegulatoryLocation location : listAll()) {
			codeMapName.put(location.getCode(), location.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取监管点 代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseRegulatoryLocation location : listAll()) {
			nameMapCode.put(location.getName(), location.getCode());
		}
		return nameMapCode;
	}
	
}