package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.BaseCurrency;
import com.yunyitg.cesp.system.base.service.impl.BaseCurrencyInfoService;

public class BaseCurrencyValidator implements ConstraintValidator<BaseCurrency, String> {

	final static BaseCurrencyInfoService baseCurrencyInfoService = 
			SpringContextUtil.getBean("baseCurrencyInfoService", BaseCurrencyInfoService.class);
	
	private Map<String, String> map;
	
	@Override
	public void initialize(BaseCurrency constraintAnnotation) {
		map = baseCurrencyInfoService.getCodeMapName();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
