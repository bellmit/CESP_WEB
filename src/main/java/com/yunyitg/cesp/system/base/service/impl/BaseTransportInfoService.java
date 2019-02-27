package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseTransportInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseTransportInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseTransportInfoService implements BaseInfoService<BaseTransportInfo> {

	@Autowired
	private BaseTransportInfoMapper baseTransportInfoMapper;
	
	/**
	 * 获取所有基础 运输方式 信息/记录
	 * @return
	 */
	@Override
	public List<BaseTransportInfo> listAll() {
		return baseTransportInfoMapper.selectAll();
	}
	
	/**
	 * 获取 运输方式代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseTransportInfo transport : listAll()) {
			codeMapName.put(transport.getCode(), transport.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取运输方式名称name与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseTransportInfo transport : listAll()) {
			nameMapCode.put(transport.getName(), transport.getCode());
		}
		return nameMapCode;
	}
}
