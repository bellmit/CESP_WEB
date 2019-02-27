package com.yunyitg.cesp.common.validation.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.yunyitg.cesp.common.validation.constraintvalidators.RangeOfStringValidator;



/**
 * 验证注释的字符串取值必须在指定的范围
 * @author yangyuantao
 *
 */

@Documented
@Constraint(validatedBy = { RangeOfStringValidator.class })
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface RangeOfString {
	String message() default "该属性值不合法";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] between();
}