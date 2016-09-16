package njci.service.test;

import junit.framework.Assert;
import njci.bean.UserInfo;
import njci.service.UserInfoService;
import njci.util.EncryptUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserInfoServiceImplTest {

	@Autowired
	private UserInfoService userInfoService;

//	@Autowired
//	private RoleInfoService roleInfoService;

	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("孙琦");
		userInfo.setLoginId("0000124");
		userInfo.setPassword(EncryptUtil.md5Crypt("111111"));
		userInfo.setLogo("images/孙琦.jpg");
		userInfo.setPhone("15951712380");
		userInfo.setAddress("连云港东海");
//		RoleInfo roleInfo = roleInfoService.getById(1);// 2--管理员 1--普通用户
		userInfo.setRole(2);
		Integer actual = userInfoService.save(userInfo);
//		Integer expected = 3;
//		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testAppLogin(){
		userInfoService.appLogin("0000125", "111111");
	}

}
