package com.yunyitg.cesp.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.yunyitg.cesp.common.dto.BaseResult;


/**
 * @author yangyuantao
 *
 * 采用AOP的方式处理参数问题。
 */
@Component
@Aspect
public class BindingResultAop {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Pointcut("execution(* com.yunyitg.cesp..*Controller.*Validly(..))")
	public void aopMethod(){}

	@Around("aopMethod()")
	public Object  around(ProceedingJoinPoint joinPoint) throws Throwable{
		LOG.info("invoking valid method!");
		BindingResult bindingResult = null;
		for(Object arg:joinPoint.getArgs()){
			if(arg instanceof BindingResult){
				bindingResult = (BindingResult) arg;
			}
		}
		if(bindingResult != null){
			if(bindingResult.hasErrors()) {
			StringBuffer sb = new StringBuffer();
			for(ObjectError objectError : bindingResult.getAllErrors()){
                sb.append(objectError.getDefaultMessage() + ";");
            }
			return new BaseResult<Object>(false, sb.deleteCharAt(sb.length() - 1).toString());
		}
//			if(bindingResult.hasErrors()){
//				String errorInfo="["+bindingResult.getFieldError().getField()+"]"+bindingResult.getFieldError().getDefaultMessage();
//				return new BaseResult<Object>(false, errorInfo);
//			}
		}
		return joinPoint.proceed();
	}
}
