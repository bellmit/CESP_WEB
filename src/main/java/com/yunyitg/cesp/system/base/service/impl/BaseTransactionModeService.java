package com.yunyitg.cesp.system.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.system.base.dao.BaseTradeModeMapper;
import com.yunyitg.cesp.system.base.dao.BaseTransactionModeMapper;
import com.yunyitg.cesp.system.base.entity.BaseCountryInfo;
import com.yunyitg.cesp.system.base.entity.BaseTradeMode;
import com.yunyitg.cesp.system.base.entity.BaseTransactionMode;
import com.yunyitg.cesp.system.base.service.BaseInfoService;

@Service
public class BaseTransactionModeService implements BaseInfoService<BaseTransactionMode> {

	@Autowired
	private BaseTransactionModeMapper baseTransactionModeMapper;
	
	/**
	 * 获取所有基础 成交方式 信息/记录
	 * @return
	 */
	@Override
	public List<BaseTransactionMode> listAll() {
		return baseTransactionModeMapper.selectAll();
	}
	
	/**
	 * 获取成交方式代码code与名称name的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getCodeMapName() {
		Map<String, String> codeMapName = new HashMap<String, String>();
		for (BaseTransactionMode mode : listAll()) {
			codeMapName.put(mode.getCode(), mode.getName());
		}
		return codeMapName;
	}
	
	/**
	 * 获取成交方式名称name与代码code 的对应map
	 * @return
	 */
	@Override
	public Map<String, String> getNameMapCode() {
		Map<String, String> nameMapCode = new HashMap<String, String>();
		for (BaseTransactionMode mode : listAll()) {
			nameMapCode.put(mode.getName(), mode.getCode());
		}
		return nameMapCode;
	}
}
