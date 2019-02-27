package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseTradeModeMapper;
import com.yunyitg.cesp.system.base.entity.BaseTradeMode;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseTradeModeService implements BaseInfoService<BaseTradeMode> {

	@Autowired
	private BaseTradeModeMapper baseTradeModeMapper;
	
	/**
	 * 获取所有基础 贸易类型 信息/记录
	 * @return
	 */
	@Override
	public List<BaseTradeMode> listAll() {
		return baseTradeModeMapper.selectAll();
	}
	
	/**
	 * 获取贸易类型代码code 与名称 name 的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseTradeMode tradeMode : listAll()) {
			codeMapName.put(tradeMode.getCode(), tradeMode.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取贸易类型名称name与代码code 的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseTradeMode tradeMode : listAll()) {
			nameMapCode.put(tradeMode.getName(), tradeMode.getCode());
		}
		return nameMapCode;
	}
}
