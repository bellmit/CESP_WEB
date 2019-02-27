package com.yunyitg.cesp.core.imports.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.core.imports.order.dto.OrderDetailQueryDto;
import com.yunyitg.cesp.core.imports.order.dto.OrderHeadQueryDto;
import com.yunyitg.cesp.core.imports.order.service.OrderService;
import com.yunyitg.cesp.core.imports.order.vo.OrderContentVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderDetailListVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderHeadListVo;

@CrossOrigin
@RestController
@RequestMapping("/corp")
public class OrderController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/orderhead/import", method = RequestMethod.POST)
	public BaseResult<Object> importOrder(@RequestParam(value="file",required=true) MultipartFile file) {
		LOG.info("invoke----------/corp/orderhead/import");
		return orderService.importOrderByExcel(file);
	}
	
	@RequestMapping(value = "/orderhead/list", method = RequestMethod.POST)
	public BaseResult<Object> listOrderHead(OrderHeadQueryDto queryDto) {
		LOG.info("invoke----------/corp/orderhead/list");
		
		PageInfo<OrderHeadListVo> page = orderService.listOrderHeadByConditions(queryDto);
		return new BaseResult<Object>(true, page);
	}
	
	@RequestMapping(value = "/orderdetail/list", method = RequestMethod.POST)
	public BaseResult<Object> listOrderDetail(OrderDetailQueryDto queryDto) {
		LOG.info("invoke----------/corp/orderdetail/list");
		
		PageInfo<OrderDetailListVo> page = orderService.listOrderDetailByConditions(queryDto);
		return new BaseResult<Object>(true, page);
	}
	
	@RequestMapping(value = "/orderdetail/get", method = RequestMethod.POST)
	public BaseResult<Object> getOrderContentById(@RequestParam(value="id", required=true)Integer id) {
		
		OrderContentVo vo = orderService.findOrderContentVoById(id);
		return new BaseResult<Object>(true, vo);
	}
	
}
