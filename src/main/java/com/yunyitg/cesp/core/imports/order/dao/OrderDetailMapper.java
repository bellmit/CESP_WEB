package com.yunyitg.cesp.core.imports.order.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yunyitg.cesp.common.mapper.MyMapper;
import com.yunyitg.cesp.core.imports.order.entity.OrderDetail;

public interface OrderDetailMapper extends MyMapper<OrderDetail> {
	
	/**
	 * 根据电商企业id【eBEntId】 和 企业电子订单编号集合【entOrderNoSet】查找  电子订单详情集合
	 * @param ebEntId
	 * @param entOrderNoSet
	 * @return
	 */
	List<OrderDetail> findByEbEntIdAndEntOrderNoSet(@Param("ebEntId")Integer ebEntId, 
			@Param("entOrderNoSet")Set<String> entOrderNoSet);
	
	/**
	 * 根据电子订单申报头id 查找订单明细
	 * @param orderHeadId
	 * @return
	 */
	List<OrderDetail> findByOrderHeadId(Integer orderHeadId);
	
	/**
	 * 根据电子订单申报头id和业务类型  更新电子订单明细 申报状态(messageStatus(海关/国检))
	 * @param headId
	 * @param functionCode
	 * @param messageStatus
	 */
//	@Update("update order_detail <set><if test='functionCode == 'CUS' || functionCode == 'BOTH''>cus_message_status_order = #{messageStatus,jdbcType=VARCHAR}</if>"
//			+ " where order_head_id = #{headId,jdbcType=INTEGER}")
	@Update("update order_detail set cus_message_status_order = case when #{functionCode} = 'BOTH' or #{functionCode} = 'CUS' then #{messageStatus} else cus_message_status_order end,"
			+ "ciq_message_status_order = case when #{functionCode} = 'BOTH' or #{functionCode} = 'CIQ' then #{messageStatus} else ciq_message_status_order end"
			+ " where order_head_id = #{headId,jdbcType=INTEGER}")
	void updateMessageStatusByOrderHeadIdAndFunctionCode(@Param("headId")Integer headId, 
			@Param("functionCode")String functionCode, @Param("messageStatus")String messageStatus);
	
}