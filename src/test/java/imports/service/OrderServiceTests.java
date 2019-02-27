package imports.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.management.Query;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunyitg.cesp.common.utils.FastJsonUtils;
import com.yunyitg.cesp.core.imports.order.dao.OrderDetailMapper;
import com.yunyitg.cesp.core.imports.order.dto.OrderDetailQueryDto;
import com.yunyitg.cesp.core.imports.order.dto.OrderHeadQueryDto;
import com.yunyitg.cesp.core.imports.order.entity.OrderDetail;
import com.yunyitg.cesp.core.imports.order.entity.OrderHead;
import com.yunyitg.cesp.core.imports.order.service.OrderService;
import com.yunyitg.cesp.core.imports.order.vo.OrderContentVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderDetailListVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderHeadListVo;

import base.BaseTest;

public class OrderServiceTests extends BaseTest {

	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void test() {
		Set<String> s = new HashSet<String>();
		s.add("AS1712612351130");
		s.add("AS1712612351132");
		s.add("AS1712612351131");
		
		List<OrderDetail> l = orderDetailMapper.findByEbEntIdAndEntOrderNoSet(2, s);
		for (OrderDetail o : l) {
			System.out.println(o.isCusOrderEditable());
			
		}
	}
	
	
//	@Test
//	public void testEvent() throws InterruptedException {
//		
//		try {
//			orderService.listByConditions(new OrderDetailQueryDto());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Thread.sleep(5000);
//		System.out.println("返回了");
//	}
	
	@Test
	public void testFindOrderContentVoById() {
		OrderContentVo vo = orderService.findOrderContentVoById(11);
		System.out.println(FastJsonUtils.toJSONString(vo));
	}
	
	@Test
	public void testListOrderHeadByConditions() {
		OrderHeadQueryDto queryDto = new OrderHeadQueryDto();
		queryDto.setDeclEntNo("C000101000669903");
		queryDto.setEbEntNo("C000101000669903");
		queryDto.setDeclMode("HTTPS");

		
		PageInfo<OrderHeadListVo> page = orderService.listOrderHeadByConditions(queryDto);
		
		System.out.println(FastJsonUtils.toJSONString(page));
	}
	
	@Test
	public void testListOrderDetailByConditions() {
		OrderDetailQueryDto queryDto = new OrderDetailQueryDto();
		queryDto.setDeclEntNo("C000101000669903");
		queryDto.setEbEntNo("C000101000669903");
		queryDto.setPageSize(5);
		
		PageInfo<OrderDetailListVo> page = orderService.listOrderDetailByConditions(queryDto);
		System.out.println(FastJsonUtils.toJSONString(page));
		
//		PageHelper.startPage(1, 4);
//		List<OrderDetail> orderDetailList = orderDetailMapper.selectAll();
//		System.out.println(orderDetailList.size());
		
	}
	
	
	
}
