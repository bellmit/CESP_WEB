package com.yunyitg.cesp.core.imports.waybill.service;

import org.springframework.web.multipart.MultipartFile;

import com.yunyitg.cesp.common.dto.BaseResult;

public interface WaybillService {

	/**
	 * 通过excel文件批量导入运单记录
	 * @param file
	 * @return
	 */
	public BaseResult<Object> importWaybillByExcel(MultipartFile file);
		
		

}
