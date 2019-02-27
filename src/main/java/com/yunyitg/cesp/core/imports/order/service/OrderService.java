package com.yunyitg.cesp.core.imports.order.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.core.imports.order.dto.OrderDetailQueryDto;
import com.yunyitg.cesp.core.imports.order.dto.OrderHeadQueryDto;
import com.yunyitg.cesp.core.imports.order.entity.OrderDetail;
import com.yunyitg.cesp.core.imports.order.entity.OrderHead;
import com.yunyitg.cesp.core.imports.order.vo.OrderContentVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderDetailListVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderHeadListVo;

public interface OrderService {
	
	/**
	 * 多条件分页获取订单申报头 信息记录
	 * @param queryDto
	 * @return
	 */
	PageInfo<OrderHeadListVo> listOrderHeadByConditions(OrderHeadQueryDto queryDto);

	/**
	 * 根据 订单详情信息主键id 查找电子订单详情
	 * @param orderDetailId
	 * @return
	 */
	OrderDetail findOrderDetailById(Integer orderDetailId);
	
	/**
	 * 根据电子订单详情主键id 查找一份订单内容
	 * @param id
	 * @return
	 */
	OrderContentVo findOrderContentVoById(Integer id);
	
	/**
	 * 多条件分页获取订单 记录
	 * @param queryDto
	 * @return
	 */
	PageInfo<OrderDetailListVo> listOrderDetailByConditions(OrderDetailQueryDto queryDto);
	

	/**
	 * 通过excel文件批量导入订单记录
	 * @param file
	 * @return
	 */
	BaseResult<Object> importOrderByExcel(MultipartFile file);
		
	
}
