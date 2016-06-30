package njci.dao.impl;

import java.util.List;

import njci.bean.UserInfo;
import njci.dao.UserInfoDao;
import njci.util.EncryptUtil;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao {

	@SuppressWarnings("unchecked")
	public UserInfo getUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		String hql = "from UserInfo u where u.name = :name and u.password = :pwd";
		String[] params = { "name", "pwd" };
		Object[] values = { name, EncryptUtil.md5Crypt(pwd) };
		List<UserInfo> list = getHibernateTemplate().findByNamedParam(hql,
				params, values);
		UserInfo user = null;
		if (list != null && list.size() >= 0) {
			user = list.get(0);
			System.out.println(user.getName());
		}

		return user;
	}

	public Integer save(UserInfo user) {
		getHibernateTemplate().save(user);
		return user.getId();
	}

	public UserInfo update(UserInfo userInfo) {
		getHibernateTemplate().update(userInfo);
		return userInfo;
	}

	@SuppressWarnings("unchecked")
	public UserInfo getUserByName(String name) {
		List<UserInfo> list = getHibernateTemplate().findByNamedParam(
				"from UserInfo u where u.name=:name", "name", name);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<UserInfo> findAllUsers() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from UserInfo");
	}

	public UserInfo getUserById(Integer id) {
		// TODO Auto-generated method stub
		return (UserInfo) getHibernateTemplate().get(UserInfo.class, id);
	}

	public void delete(UserInfo userInfo) {
		getHibernateTemplate().delete(userInfo);

	}

}
