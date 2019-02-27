package com.yunyitg.cesp.system.user.service;

import com.yunyitg.cesp.system.user.entity.SystemConfig;

public interface SystemConfigService {

	
	SystemConfig selectByPrimaryKey(String key);
	
	void insert(SystemConfig systemConfig);
}
