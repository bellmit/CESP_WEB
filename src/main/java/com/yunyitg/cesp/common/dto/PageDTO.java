package com.yunyitg.cesp.common.dto;

import java.io.Serializable;

public class PageDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 当前页数
	 */
	private Integer pageNum;
	/**
	 * 每页的数量
	 */
	private Integer pageSize;
	
	public PageDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getPageNum() {
		return pageNum;
	}
	
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
