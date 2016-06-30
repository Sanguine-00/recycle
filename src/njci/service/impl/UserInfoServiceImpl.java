package njci.service.impl;

import java.util.List;

import njci.bean.UserInfo;
import njci.dao.UserInfoDao;
import njci.service.UserInfoService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserInfoServiceImpl extends HibernateDaoSupport implements
		UserInfoService {

	private UserInfoDao userInfoDao;

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public UserInfo getUserByName(String name) {
		return userInfoDao.getUserByName(name);
	}

	public UserInfo getUserByNameAndPwd(String name, String pwd) {
		return userInfoDao.getUserByNameAndPwd(name, pwd);
	}

	public UserInfo login(String name, String pwd) {
		return userInfoDao.getUserByNameAndPwd(name, pwd);
	}

	public Integer save(UserInfo user) {

		return userInfoDao.save(user);
	}

	public UserInfo update(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.update(userInfo);
	}

	public List<UserInfo> findAllUsers() {
		// TODO Auto-generated method stub
		return userInfoDao.findAllUsers();
	}

	public UserInfo getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userInfoDao.getUserById(id);
	}

	public void delete(UserInfo userInfo) {
		userInfoDao.delete(userInfo);
		
	}

}
