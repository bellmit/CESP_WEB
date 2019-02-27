package com.yunyitg.cesp.system.base.service;

import java.util.List;
import java.util.Map;

public interface BaseInfoService<T> {

	List<T> listAll();
	
	Map<String, String> getCodeMapName();
	
	Map<String, String> getNameMapCode();
}
