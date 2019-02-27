package com.yunyitg.cesp.core.imports.waybill.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.core.imports.waybill.service.WaybillService;

@CrossOrigin
@RestController
@RequestMapping("/corp")
public class WaybillController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private WaybillService waybillService;
	
	@RequestMapping(value = "/waybillhead/import", method = RequestMethod.POST)
	public BaseResult<Object> importWaybill(@RequestParam(value="file",required=true) MultipartFile file) {
		LOG.info("invoke----------/corp/orderhead/import");
		return waybillService.importWaybillByExcel(file);
	}
}
