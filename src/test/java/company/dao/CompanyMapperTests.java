package company.dao;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.core.company.dao.CompanyMapper;
import com.yunyitg.cesp.core.company.entity.Company;

import base.BaseTest;

public class CompanyMapperTests extends BaseTest {

	@Autowired
	private CompanyMapper companyMapper;
	
	@Test
	public void test() {
		Company company = companyMapper.selectByPrimaryKey(1);
//		company.setGzeportCode("CO256745451");
		company.setName("name");
		companyMapper.updateByPrimaryKey(company);
	}
	
	@Test
	public void testInsert() {
		
		companyMapper.insert(new Company());
	}
	
	@Test
	public void testSelectAll() {
		List<Company> l = companyMapper.selectAll();
		System.out.println(l.size());
	}
	
	
}
