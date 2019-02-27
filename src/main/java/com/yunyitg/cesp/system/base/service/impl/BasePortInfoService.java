package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BasePortInfoMapper;
import com.yunyitg.cesp.system.base.entity.BasePortInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BasePortInfoService implements BaseInfoService<BasePortInfo> {

	@Autowired
	private BasePortInfoMapper basePortInfoMapper;
	
	/**
	 * 获取所有基础港口信息记录
	 * @return
	 */
	@Override
	public List<BasePortInfo> listAll() {
		return basePortInfoMapper.selectAll();
	}
	
	/**
	 * 获取港口代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BasePortInfo port : listAll()) {
			codeMapName.put(port.getCode(), port.getcName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取港口名称name与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BasePortInfo port : listAll()) {
			nameMapCode.put(port.getcName(), port.getCode());
		}
		return nameMapCode;
	}
}
