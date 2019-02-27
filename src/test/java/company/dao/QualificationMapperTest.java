package company.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.core.company.dao.QualificationMapper;
import com.yunyitg.cesp.core.company.entity.Qualification;

import base.BaseTest;

public class QualificationMapperTest extends BaseTest {

	
	@Autowired
	QualificationMapper qualificationMapper;
	
	@Test
	public void test() {
		List<Qualification> list = qualificationMapper.listByCompanyId(1);
		for (Qualification q : list) {
			System.out.print(q.getName() + "  ");
		}
	}
}
