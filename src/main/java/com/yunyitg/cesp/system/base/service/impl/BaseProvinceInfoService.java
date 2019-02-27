package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseProvinceInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseProvinceInfo;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseProvinceInfoService implements BaseInfoService<BaseProvinceInfo> {

	@Autowired
	private BaseProvinceInfoMapper baseProvinceInfoMapper;
	
	/**
	 * 获取所有基础行政区域信息记录
	 * @return
	 */
	@Override
	public List<BaseProvinceInfo> listAll() {
		return baseProvinceInfoMapper.selectAll();
	}
	
	/**
	 * 获取行政区域代码
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseProvinceInfo province : listAll()) {
			codeMapName.put(province.getCode(), province.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取行政区域名称name与代码code的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseProvinceInfo province : listAll()) {
			nameMapCode.put(province.getName(), province.getCode());
		}
		return nameMapCode;
	}
}
