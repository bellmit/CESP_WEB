package com.yunyitg.cesp.core.imports.goods.service;

import org.springframework.web.multipart.MultipartFile;

import com.yunyitg.cesp.common.dto.BaseResult;

public interface GoodsService {

	/**
	 * 通过excel批量导入  备案商品信息
	 * @param file
	 * @return
	 */
	BaseResult<Object>  importByExcel(MultipartFile file);
}
