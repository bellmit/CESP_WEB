package base.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.system.base.entity.BaseCountryInfo;
import com.yunyitg.cesp.system.base.service.impl.BaseCountryInfoService;

import base.BaseTest;

public class BaseInfoServiceTests extends BaseTest {

//	@Autowired
//	private BaseCountryInfoService baseCountryInfoService;
	
	@Test
	public void testBaseCountryInfoService() {
//		BaseCountryInfoService baseCountryInfoService = SpringContextUtil.getBean("baseCountryInfoService", BaseCountryInfoService.class);
		System.out.println(SpringContextUtil.containsBean("baseCountryInfoService"));
	}
}
