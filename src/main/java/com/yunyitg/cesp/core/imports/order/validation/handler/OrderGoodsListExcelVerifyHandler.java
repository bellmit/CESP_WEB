package com.yunyitg.cesp.core.imports.order.validation.handler;

import java.math.BigDecimal;

import com.yunyitg.cesp.core.imports.order.dto.OrderGoodsListPoiEntity;

import cn.afterturn.easypoi.excel.entity.result.ExcelVerifyHandlerResult;
import cn.afterturn.easypoi.handler.inter.IExcelVerifyHandler;

public class OrderGoodsListExcelVerifyHandler implements IExcelVerifyHandler<OrderGoodsListPoiEntity> {

	
	
	@Override
	public ExcelVerifyHandlerResult verifyHandler(OrderGoodsListPoiEntity entity) {
		StringBuilder msg = new StringBuilder();
		// 判断订单商品 单价X数量是否等于总价
		BigDecimal computingTotal = entity.getPrice().multiply(entity.getQty());
		if(computingTotal.compareTo(entity.getTotal()) != 0) {
			msg.append("电子订单【" + entity.getEntOrderNo() + "】下商品【"+ entity.getGoodsName() + 
							"】单价【"+ entity.getPrice() + "】乘以数量【" + entity.getQty() + 
							"】等于" + computingTotal.toString() + "与总价【" + entity.getTotal() + "】不符");
		}
		
		
		if (msg.toString().length() > 5) {
			return new ExcelVerifyHandlerResult(false, msg.toString());
		}
		return new ExcelVerifyHandlerResult(true);
	}

}
