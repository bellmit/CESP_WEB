package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.validation.constraints.PayStatus;

public class PayStatusValidator implements ConstraintValidator<PayStatus, String> {

	private Map<String, String> map;
	
	@Override
	public void initialize(PayStatus constraintAnnotation) {
		map = new HashMap<String, String>();
		map.put("0", "已付款");
		map.put("1", "未付款");
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
