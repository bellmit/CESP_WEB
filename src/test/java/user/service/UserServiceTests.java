package user.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.system.user.entity.User;
import com.yunyitg.cesp.system.user.service.UserService;

import base.BaseTest;

public class UserServiceTests extends BaseTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		User user = userService.login("yanyuantao", "yangyuantao123");
		System.out.println(user.getNickname());
	}
}
