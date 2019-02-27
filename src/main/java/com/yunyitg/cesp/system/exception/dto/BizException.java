package com.yunyitg.cesp.system.exception.dto;
/**
 * 自定义异常类 用于业务逻辑层
 * @author yangyuantao
 *
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable cause) {
        super(message,  cause);
    }
    
    

}
