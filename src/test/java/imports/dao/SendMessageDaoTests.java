package imports.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.core.imports.message.dao.SendMessageMapper;
import com.yunyitg.cesp.core.imports.message.entity.SendMessage;

import base.BaseTest;

public class SendMessageDaoTests extends BaseTest {

	@Autowired
	SendMessageMapper sendMessageMapper;
	
	@Test
	public void test() {
		List<SendMessage> l = sendMessageMapper.selectAll();
//		System.out.println(l.size());
		Assert.assertEquals(l.size(),3);
		
	}
}
