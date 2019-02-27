package com.yunyitg.cesp.common.validation.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = {  })
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR, ElementType.PARAMETER })
public @interface Numberic {

	String message() default "该数值取值不合法";
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
