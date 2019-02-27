package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.validation.constraints.OrderStatus;

public class OrderStatusValidator implements ConstraintValidator<OrderStatus, String> {

	private  Map<String, String> map;
	
	
	@Override
	public void initialize(OrderStatus constraintAnnotation) {
		map = new HashMap<String, String>();
		map.put("0", "订单确认");
		map.put("1", "订单完全");
		map.put("2", "订单取消");
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (map != null) {
			return map.get(value) == null ? false : true;
		}
		return false;
	}

}
