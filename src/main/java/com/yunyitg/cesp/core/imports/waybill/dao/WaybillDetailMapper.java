package com.yunyitg.cesp.core.imports.waybill.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yunyitg.cesp.common.mapper.MyMapper;
import com.yunyitg.cesp.core.imports.waybill.entity.WaybillDetail;

public interface WaybillDetailMapper extends MyMapper<WaybillDetail> {
	
	
	/**
	 * 
	 * @param ehsEntId
	 * @param entWaybillNoSet
	 * @return
	 */
	@Select("<script>select * from waybill_detail where ehs_ent_id = #{ehsEntId,jdbcType=INTEGER} and "
			+ "ent_waybill_no IN "
			+ "<foreach collection=\"entWaybillNoSet\" item=\"item\" index=\"index\" open=\"(\" separator=\",\" close=\")\">#{item}</foreach></script>")
	List<WaybillDetail> findByEhsEntIdAndEntWaybillNoSet(@Param("ehsEntId")Integer ehsEntId,
			@Param("entWaybillNoSet")Set<String> entWaybillNoSet);
}