package imports.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.core.imports.list.dao.ElistHeadMapper;
import com.yunyitg.cesp.core.imports.list.entity.ElistHead;

import base.BaseTest;

public class EListHeadTests extends BaseTest {
	
	@Autowired
	ElistHeadMapper mapper;

	@Test
	public void test() {
		ElistHead head = mapper.selectByPrimaryKey(1);
		System.out.println(head.toString());
	}
}
