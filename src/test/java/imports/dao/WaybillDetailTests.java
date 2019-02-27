package imports.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.core.imports.waybill.dao.WaybillDetailMapper;
import com.yunyitg.cesp.core.imports.waybill.entity.WaybillDetail;

import base.BaseTest;

public class WaybillDetailTests extends BaseTest {

	
	@Autowired
	private WaybillDetailMapper waybillDetailMapper;
	
	@Test
	public void testFindByEhsEntIdAndEntWaybillNoSet() {
		Integer ehsEntId = 2;
		Set<String> entWaybillNoSet = new HashSet<String>();
		entWaybillNoSet.add("sss");
		List<WaybillDetail> l = waybillDetailMapper.findByEhsEntIdAndEntWaybillNoSet(ehsEntId, entWaybillNoSet);
		System.out.println(l.size());
		
	}
}
