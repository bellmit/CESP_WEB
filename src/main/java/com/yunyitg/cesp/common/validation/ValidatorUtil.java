package com.yunyitg.cesp.common.validation;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 * 简易的对象字段校验器
 * @author yangyuantao
 *
 */
public class ValidatorUtil {

	public static <T> ValidateResult validate(T t) {
		ValidateResult result = new ValidateResult();
		StringBuilder builder = new StringBuilder("");
		boolean flag = true;
		
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
		
		Iterator<ConstraintViolation<T>> iter = constraintViolations.iterator();
		
		while(iter.hasNext()) {
			flag = false;
			String message = iter.next().getMessage();
			builder.append(message +";");
		}
		if(!flag) {
			result.setMessage(builder.toString());
		}
		return result;
	}
}
