package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.BasePackage;
import com.yunyitg.cesp.system.base.service.impl.BasePackageInfoService;

public class BasePackageValidator implements ConstraintValidator<BasePackage, String> {

	final static BasePackageInfoService basePackageInfoService = 
			SpringContextUtil.getBean("basePackageInfoService", BasePackageInfoService.class);
	
	private Map<String, String> map;
	
	@Override
	public void initialize(BasePackage constraintAnnotation) {
		map = basePackageInfoService.getCodeMapName();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
