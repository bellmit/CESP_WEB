package com.yunyitg.cesp.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yunyitg.cesp.common.dto.BaseResult;


public class ControllerAOP {

	private static final Logger logger = LoggerFactory.getLogger(ControllerAOP.class);

	  public Object handlerControllerMethod(ProceedingJoinPoint pjp) {
	    long startTime = System.currentTimeMillis();

	    BaseResult<?> result;

	    try {
	      result = (BaseResult<?>) pjp.proceed();
	      logger.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
	    } catch (Throwable e) {
	      result = handlerException(pjp, e);
	    }

	    return result;
	  }

	  private BaseResult<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
		  BaseResult<?> result = new BaseResult();

	    // 已知异常
	   /* if (e instanceof CheckException) {
	      result.setMsg(e.getLocalizedMessage());
	      result.setCode(ResultBean.FAIL);
	    } else {
	      logger.error(pjp.getSignature() + " error ", e);

	      result.setMsg(e.toString());
	      result.setCode(ResultBean.FAIL);

	     // 未知异常是应该重点关注的，这里可以做其他操作，如通知邮件，单独写到某个文件等等。
	    }
*/
	    return result;
	  }
}
