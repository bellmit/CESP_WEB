package com.yunyitg.cesp.core.imports.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yunyitg.cesp.common.mapper.MyMapper;
import com.yunyitg.cesp.core.imports.order.entity.OrderGoodsList;

public interface OrderGoodsListMapper extends MyMapper<OrderGoodsList> {

	/**
	 * 根据订单明细 id 查找订单商品项
	 * @param orderDetailId
	 * @return
	 */
	@Select("select * from order_goods_list where order_detail_id = #{orderDetailId}")
	List<OrderGoodsList> findByOrderDetailId(Integer orderDetailId);
}