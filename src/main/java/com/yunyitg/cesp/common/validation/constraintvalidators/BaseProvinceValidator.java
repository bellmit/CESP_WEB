package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.BaseProvince;
import com.yunyitg.cesp.system.base.service.impl.BaseProvinceInfoService;

public class BaseProvinceValidator implements ConstraintValidator<BaseProvince, String> {

	final static BaseProvinceInfoService baseProvinceInfoService = 
			SpringContextUtil.getBean("baseProvinceInfoService", BaseProvinceInfoService.class);
	
	private Map<String, String> map;
	
	@Override
	public void initialize(BaseProvince constraintAnnotation) {
		map = baseProvinceInfoService.getCodeMapName();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
