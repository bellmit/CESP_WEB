package imports.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.core.imports.order.dao.OrderDetailMapper;
import com.yunyitg.cesp.core.imports.order.dao.OrderHeadMapper;
import com.yunyitg.cesp.core.imports.order.entity.OrderDetail;

import base.BaseTest;

public class OrderDetailTest extends BaseTest{

	@Autowired
	OrderDetailMapper orderDetailMapper;
	
	@Autowired
	OrderHeadMapper orderHeadMapper;
	
	
	@Test
	public void test() {
		OrderDetail detail = orderDetailMapper.selectByPrimaryKey(10);
		System.out.println(detail.toString());
	}
	
	
	@Test
	public void testFindByOrderHeadId() {
		List<OrderDetail> l = orderDetailMapper.findByOrderHeadId(3);
		System.out.println(l.size());
	}
	
	@Test
	public void testUpdateDeclStatusAndTimeById() {
		try {
			orderHeadMapper.updateDeclStatusAndTimeById(1, "2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUpdateMessageStatusByOrderHeadIdAndFunctionCode() {
		orderDetailMapper.updateMessageStatusByOrderHeadIdAndFunctionCode(1, "BOTH", "1");
	}
}
