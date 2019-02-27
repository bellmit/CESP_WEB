package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.BaseCustoms;
import com.yunyitg.cesp.system.base.service.impl.BaseCustomsInfoService;

public class BaseCustomsValidator implements ConstraintValidator<BaseCustoms, String> {

	final static BaseCustomsInfoService baseCustomsInfoService = 
			SpringContextUtil.getBean("baseCustomsInfoService", BaseCustomsInfoService.class);
	
	private Map<String, String> map;
	
	@Override
	public void initialize(BaseCustoms constraintAnnotation) {
		map = baseCustomsInfoService.getCodeMapName();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
