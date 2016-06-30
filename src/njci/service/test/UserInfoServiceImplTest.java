package njci.service.test;

import junit.framework.Assert;
import njci.bean.RoleInfo;
import njci.bean.UserInfo;
import njci.service.RoleInfoService;
import njci.service.UserInfoService;
import njci.util.EncryptUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserInfoServiceImplTest {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private RoleInfoService roleInfoService;
	
	
	@Test
	public void testInsert(){
		UserInfo userInfo = new UserInfo();
		userInfo.setName("李四");
		userInfo.setPassword(EncryptUtil.md5Crypt("李四"));
		userInfo.setLogo("images/李四.jpg");
		userInfo.setPhone("12321324229");
		userInfo.setAddress("上海浦东");
		RoleInfo roleInfo = roleInfoService.getById(1);//2--管理员   1--普通用户
		userInfo.setRoleInfo(roleInfo);
		Integer actual = userInfoService.save(userInfo);
		Integer expected = 3;
		Assert.assertEquals(expected, actual);
	}

}
