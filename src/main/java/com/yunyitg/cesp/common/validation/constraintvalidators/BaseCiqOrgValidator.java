package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.BaseCiqOrg;
import com.yunyitg.cesp.system.base.service.impl.BaseCiqOrgInfoService;

public class BaseCiqOrgValidator implements ConstraintValidator<BaseCiqOrg, String> {

	final static BaseCiqOrgInfoService baseCiqOrgInfoService = 
			SpringContextUtil.getBean("baseCiqOrgInfoService", BaseCiqOrgInfoService.class);
	
	private Map<String, String> map;
	
	@Override
	public void initialize(BaseCiqOrg constraintAnnotation) {
		map = baseCiqOrgInfoService.getCodeMapName();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
