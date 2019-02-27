package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.validation.constraints.WaybillStatus;

public class WaybillStatusValidator implements ConstraintValidator<WaybillStatus, String> {

	private Map<String, String> map;
	
	@Override
	public void initialize(WaybillStatus constraintAnnotation) {
		map = new HashMap<String, String>();
		map.put("A", "承运发货");
		map.put("R", "运抵(海关监管区)");
		map.put("L", "出口离境");
		map.put("S", "用户签收");
		map.put("C", "退货");
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false :true;
		}
		return false;
	}

}
