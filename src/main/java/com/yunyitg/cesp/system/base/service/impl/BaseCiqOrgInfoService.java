package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.yunyitg.cesp.system.base.dao.BaseCiqOrgInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseCiqOrgInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseCiqOrgInfoService implements BaseInfoService<BaseCiqOrgInfo> {

	@Autowired
	private BaseCiqOrgInfoMapper baseCiqOrgInfoMapper;
	
	/**
	 * 获取所有基础 检验检疫机构代码信息
	 * @return
	 */
	@Override
	public List<BaseCiqOrgInfo> listAll() {
		return baseCiqOrgInfoMapper.selectAll();
	}
	
	/**
	 * 获取检验检疫机构 代码code与名称name的对应 map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseCiqOrgInfo ciqOrg : listAll()) {
			codeMapName.put(ciqOrg.getCode(), ciqOrg.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取检验检疫机构 名称name与代码code的对应 map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseCiqOrgInfo ciqOrg : listAll()) {
			nameMapCode.put(ciqOrg.getName(), ciqOrg.getCode());
		}
		return nameMapCode;
	}

	
}
