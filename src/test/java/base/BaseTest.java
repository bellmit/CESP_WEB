package base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring.xml"/*, "classpath:spring/spring-mvc.xml" */})
public class BaseTest {
	
//	@Test
//	public void test() {
//		System.out.println("测试启动配置文件！");
//	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
		String name = "userService";
		try {
			ac.getBean(name);
		} catch (Exception e) {
			throw new RuntimeException("获取的Bean不存在！");
		}
	}
}