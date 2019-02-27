package user.dao;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.system.user.dao.UserMapper;
import com.yunyitg.cesp.system.user.dao.UserRoleMapper;
import com.yunyitg.cesp.system.user.entity.User;
import com.yunyitg.cesp.system.user.entity.UserRole;

import base.BaseTest;

public class UserMapperTests extends BaseTest {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	UserRoleMapper userRoleMapper;
	
	@Test
	public void testSelectByPrimaryKey() {
		User u = userMapper.selectByPrimaryKey(1);
		System.out.println(u.getNickname());
	}
	
	@Test
	public void testDoLogin() {
		User u = userMapper.doLogin("admin", "admin123");
		System.out.println(u.getNickname());
	}
	
	@Test
	public void testFindPermissionByUserId() {
		Set<String> s = userMapper.findPermissionByUserId(1);
		System.out.println(s.toString());
	}
	
	@Test
	public void testUserRole() {
		UserRole ur = new UserRole();
		ur.setUid(1);
		ur.setRid(1);
		userRoleMapper.insert(ur);
//		UserRole ur = userRoleMapper.selectByPrimaryKey(1);
//		
//		Assert.assertNotNull(ur);
	}
	
	
	
}
