package com.yunyitg.cesp.common.validation.constraintvalidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.validation.constraints.RangeOfString;



public class RangeOfStringValidator implements ConstraintValidator<RangeOfString, String>{

	String[] range;
	
	@Override
	public void initialize(RangeOfString arg0) {
		range = arg0.between();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		if(value != null) {
			for(String str : range) {
				if(str.equals(value))
					return true;
			}
			return false;
		}
		return false;
	}

}
