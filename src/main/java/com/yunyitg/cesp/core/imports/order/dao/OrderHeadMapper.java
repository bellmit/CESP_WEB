package com.yunyitg.cesp.core.imports.order.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.yunyitg.cesp.common.mapper.MyMapper;
import com.yunyitg.cesp.core.imports.order.entity.OrderHead;

public interface OrderHeadMapper extends MyMapper<OrderHead> {
	
	/**
	 * 更新 电子订单申报头 申报信息
	 * @param id
	 * @param declStatus
	 */
	@Update(value = "update order_head set decl_status = #{declStatus,jdbcType=VARCHAR},"
			+ "decl_time = NOW() where id = #{id,jdbcType=INTEGER}")
	void updateDeclStatusAndTimeById(@Param("id")Integer id, @Param("declStatus")String declStatus);
}