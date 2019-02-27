package user.dao;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yunyitg.cesp.system.user.dao.PermissionMapper;
import com.yunyitg.cesp.system.user.entity.Permission;

import base.BaseTest;

public class PermissionMapperTest extends BaseTest {

	@Autowired
	private PermissionMapper permissionMapper;
	
	@Test
	public void testListPermissionsByUserId() {
		List<Permission> s = permissionMapper.listPermissionByUserId(1);
		System.out.println(s.size());
	}
	
}
