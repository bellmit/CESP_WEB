package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.BaseUnit;
import com.yunyitg.cesp.system.base.service.impl.BaseUnitInfoService;

public class BaseUnitValidator implements ConstraintValidator<BaseUnit, String> {
	
	final static BaseUnitInfoService baseUnitInfoService = 
			SpringContextUtil.getBean("baseUnitInfoService", BaseUnitInfoService.class);
	
	private Map<String, String> map;

	@Override
	public void initialize(BaseUnit constraintAnnotation) {
		map = baseUnitInfoService.getCodeMapName();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		} 
		return false;
	}

}
