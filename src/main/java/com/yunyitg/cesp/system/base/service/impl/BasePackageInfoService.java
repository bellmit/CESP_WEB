package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BasePackageInfoMapper;
import com.yunyitg.cesp.system.base.entity.BasePackageInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BasePackageInfoService implements BaseInfoService<BasePackageInfo> {

	@Autowired
	private BasePackageInfoMapper basePackageInfoMapper;
	
	/**
	 * 获取所有基础包装类型 信息记录
	 * @return
	 */
	@Override
	public List<BasePackageInfo> listAll() {
		return basePackageInfoMapper.selectAll();
	}
	
	/**
	 * 获取包装类型代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BasePackageInfo p : listAll()) {
			codeMapName.put(p.getCode(), p.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取包装类型名称name与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BasePackageInfo p : listAll()) {
			nameMapCode.put(p.getName(), p.getCode());
		}
		return nameMapCode;
	}
}
