package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.Country;
import com.yunyitg.cesp.system.base.service.impl.BaseCountryInfoService;

public class CountryValidator implements ConstraintValidator<Country, String> {

	final static BaseCountryInfoService baseCountryInfoService = 
			SpringContextUtil.getBean("baseCountryInfoService", BaseCountryInfoService.class);
	
	private Map<String, String> codeMapName;
	
	private Map<String, String> nameMapCode;
	
	@Override
	public void initialize(Country constraintAnnotation) {
		codeMapName = baseCountryInfoService.getCodeMapName();
		nameMapCode = baseCountryInfoService.getNameMapCode();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (codeMapName != null) {
			return codeMapName.get(value) == null ? false : true;
		}
		if (nameMapCode != null) {
			return nameMapCode.get(value) == null ? false : true;
		}
		return false;
	}
}
