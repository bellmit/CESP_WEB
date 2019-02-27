package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.BasePort;
import com.yunyitg.cesp.system.base.service.impl.BasePortInfoService;

public class BasePortValidator implements ConstraintValidator<BasePort, String> {

	final static BasePortInfoService basePortService = 
			SpringContextUtil.getBean("basePortService", BasePortInfoService.class);
	
	private Map<String, String> map;
	
	@Override
	public void initialize(BasePort constraintAnnotation) {
		map = basePortService.getCodeMapName();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
