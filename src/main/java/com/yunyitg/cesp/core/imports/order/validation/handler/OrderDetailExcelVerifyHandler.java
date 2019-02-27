package com.yunyitg.cesp.core.imports.order.validation.handler;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yunyitg.cesp.core.imports.order.dto.OrderDetailPoiEntity;

import cn.afterturn.easypoi.excel.entity.result.ExcelVerifyHandlerResult;
import cn.afterturn.easypoi.handler.inter.IExcelVerifyHandler;

public class OrderDetailExcelVerifyHandler implements IExcelVerifyHandler<OrderDetailPoiEntity> {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	private Set<String> entOrderNoSet = new HashSet<String>();
	
	@Override
	public ExcelVerifyHandlerResult verifyHandler(OrderDetailPoiEntity entity) {
		StringBuilder msg = new StringBuilder();
		// 订单重复校验 （excel内重复）
		if (entOrderNoSet.contains(entity.getEntOrderNo())) {
			msg.append("电子订单编号【"+ entity.getEntOrderNo() + "】重复导入,");
		} else {
			entOrderNoSet.add(entity.getEntOrderNo());
		}
		
		
		//实际支付金额=货款+运费+税款-优惠金额
		BigDecimal computingActualPaid = entity.getOrderGoodTotal().add(entity.getFreight()).add(entity.getTax()).subtract(entity.getOtherPayment());
		if(computingActualPaid.compareTo(entity.getActualAmountPaid()) != 0) {
			msg.append("电子订单【" + entity.getEntOrderNo() + "】的 货款【" + entity.getOrderGoodTotal().toString() + 
					"】加运费【" + entity.getFreight().toString() +"】加税款【" + entity.getTax().toString() + 
					"】减去优惠金额【" + entity.getOtherPayment() + "】等于 " + computingActualPaid.toString() + 
					"与实际支付金额【" + entity.getActualAmountPaid() + "】不符");
		}
		
		if (msg.toString().length() > 5) {
			return new ExcelVerifyHandlerResult(false, msg.toString());
		}
		return new ExcelVerifyHandlerResult(true);
	}

}
