package com.yunyitg.cesp.common.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BaseQueryDTO extends PageDTO {

	private static final long serialVersionUID = 1L;

	/**
	 * 入库时间起始
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startAt;
	
	/**
	 * 入库时间结束
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endAt;
	
	public BaseQueryDTO() {
		super();
	}

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}
}
