package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.validation.constraints.FeeMark;

public class FeeMarkValidator implements ConstraintValidator<FeeMark, String> {

	private Map<String, String> map;
	
	@Override
	public void initialize(FeeMark constraintAnnotation) {
		map = new HashMap<String, String>();
		map.put("1", "率");
		map.put("2", "单价");
		map.put("3", "总价");
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			if (value == null) {
				return true;
			} else {
				return map.get(value) == null ? false : true;
			}
		}
		return true;
	}

}
