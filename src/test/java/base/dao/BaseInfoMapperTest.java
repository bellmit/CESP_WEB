package base.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.yunyitg.cesp.system.base.dao.BaseCiqOrgInfoMapper;
import com.yunyitg.cesp.system.base.dao.BaseCountryInfoMapper;
import com.yunyitg.cesp.system.base.dao.BaseCurrencyInfoMapper;
import com.yunyitg.cesp.system.base.dao.BaseCustomsInfoMapper;
import com.yunyitg.cesp.system.base.dao.BasePackageInfoMapper;
import com.yunyitg.cesp.system.base.dao.BasePortInfoMapper;
import com.yunyitg.cesp.system.base.dao.BaseProvinceInfoMapper;
import com.yunyitg.cesp.system.base.dao.BaseRegulatoryLocationMapper;
import com.yunyitg.cesp.system.base.dao.BaseRegulatoryPlaceMapper;
import com.yunyitg.cesp.system.base.dao.BaseTaxExemptionMethodMapper;
import com.yunyitg.cesp.system.base.dao.BaseTradeModeMapper;
import com.yunyitg.cesp.system.base.dao.BaseTransactionModeMapper;
import com.yunyitg.cesp.system.base.dao.BaseTransportInfoMapper;
import com.yunyitg.cesp.system.base.dao.BaseUnitInfoMapper;
import com.yunyitg.cesp.system.base.dao.BaseUseInfoMapper;
import com.yunyitg.cesp.system.base.entity.BaseCountryInfo;

import base.BaseTest;
import tk.mybatis.mapper.entity.Example;

public class BaseInfoMapperTest extends BaseTest {

	@Autowired
	BaseCiqOrgInfoMapper baseCiqOrgInfoMapper;
	
	@Test
	public void testBaseCiqOrgInfoMapper() {
		System.out.println(baseCiqOrgInfoMapper.selectAll().size());
	}
	
	@Autowired
	BaseCountryInfoMapper baseCountryInfoMapper;
	
	@Test
	public void testBaseCountryInfoMapper() {
//		System.out.println(baseCountryInfoMapper.selectAll().size());
		PageHelper.startPage(1, 100);
//		PageHelper.offsetPage(1, 10);
		List<BaseCountryInfo> l = baseCountryInfoMapper.selectByExample(new Example(BaseCountryInfo.class));
		System.out.println(l.size());
		
	}
	
	@Autowired
	BaseCurrencyInfoMapper baseCurrencyInfoMapper;
	
	@Test
	public void testBaseCurrencyInfoMapper() {
		System.out.println(baseCurrencyInfoMapper.selectAll().size());
	}
	
	@Autowired
	BaseCustomsInfoMapper baseCustomsInfoMapper;
	
	@Test
	public void testBaseCustomsInfoMapper() {
		System.out.println(baseCustomsInfoMapper.selectAll().size());
	}
	
	@Autowired
	BasePackageInfoMapper basePackageInfoMapper;
	
	@Test
	public void testBasePackageInfoMapper() {
		System.out.println(basePackageInfoMapper.selectAll().size());
	}
	
	@Autowired
	BasePortInfoMapper basePortInfoMapper;
	
	@Test
	public void testBasePortInfoMapper() {
		System.out.println(basePortInfoMapper.selectAll().size());
	}
	
	@Autowired
	BaseProvinceInfoMapper baseProvinceInfoMapper;
	
	@Test
	public void testBaseProvinceInfoMapper() {
		System.out.println(baseProvinceInfoMapper.selectAll().size());
	}
	
	@Autowired
	BaseRegulatoryLocationMapper baseRegulatoryLocationMapper;
	
	@Test
	public void testBaseRegulatoryLocationMapper() {
		System.out.println(baseRegulatoryLocationMapper.selectAll().size());
	}
	
	@Autowired
	BaseRegulatoryPlaceMapper baseRegulatoryPlaceMapper;
	
	@Test
	public void testBaseRegulatoryPlaceMapper() {
		System.out.println(baseRegulatoryPlaceMapper.selectAll().size());
	}
	
	@Autowired
	BaseTaxExemptionMethodMapper baseTaxExemptionMethodMapper;
	
	@Test
	public void testBaseTaxExemptionMethodMapper() {
		System.out.println(baseTaxExemptionMethodMapper.selectAll().size());
	}
	
	@Autowired
	BaseTradeModeMapper baseTradeModeMapper;
	
	@Test
	public void testBaseTradeModeMapper() {
		System.out.println(baseTradeModeMapper.selectAll().size());
	}
	
	@Autowired
	BaseTransactionModeMapper baseTransactionModeMapper;
	
	@Test
	public void testBaseTransactionModeMapper() {
		System.out.println(baseTransactionModeMapper.selectAll().size());
	}
	
	@Autowired
	BaseTransportInfoMapper baseTransportInfoMapper;
	
	@Test
	public void testBaseTransportInfoMapper() {
		System.out.println(baseTransportInfoMapper.selectAll().size());
	}
	
	@Autowired
	BaseUnitInfoMapper baseUnitInfoMapper;
	
	@Test
	public void testBaseUnitInfoMapper() {
		System.out.println(baseUnitInfoMapper.selectAll().size());
	}
	
	@Autowired
	BaseUseInfoMapper baseUseInfoMapper;
	
	@Test
	public void testBaseUseInfoMapper() {
//		System.out.println(baseUseInfoMapper.selectAll().size());
		
		System.out.println(baseUseInfoMapper.selectByPrimaryKey(1).toString());
	}
}
