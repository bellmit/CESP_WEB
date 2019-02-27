package company.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.core.company.dao.ModuleMapper;
import com.yunyitg.cesp.core.company.entity.Module;

import base.BaseTest;

public class ModuleMapperTests extends BaseTest{

	@Autowired
	private ModuleMapper moduleMapper;
	
	@Test
	public void testListModuleByCompanyId() {
		List<Module> list = moduleMapper.listModuleByCompanyId(2);
		
		for (Module m : list) {
			System.out.println(m.getName());
		}
	}
	
	@Test
	public void testSelectAll() {
		List<Module> list = moduleMapper.selectAll();
		
		System.out.println(list.size());
	}
}
