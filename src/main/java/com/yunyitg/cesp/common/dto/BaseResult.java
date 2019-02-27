package com.yunyitg.cesp.common.dto;


import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @author yangyuantao
 *
 * ajax 请求的返回类型封装JSON结果
 */
public class BaseResult<T> implements Serializable {


	private static final long serialVersionUID = -4185151304730685014L;

	private boolean success = true;

    private T data;

    private String msg = "操作成功";
    
    public BaseResult() {
		super();
	}

    public BaseResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public BaseResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public BaseResult(boolean success, T data, String msg) {
        this.success = success;
        this.data = data;
        this.msg = msg;
    }
    
    public BaseResult(Throwable e) {
    	super();
    	this.msg = e.toString();
    	this.success = false;
    }
    
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
