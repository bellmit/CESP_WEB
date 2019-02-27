package com.yunyitg.cesp.common.validation.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.yunyitg.cesp.common.validation.constraintvalidators.BasePackageValidator;


@Documented
@Constraint(validatedBy = { BasePackageValidator.class })
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface BasePackage {

	String message() default "不支持该选项";
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
