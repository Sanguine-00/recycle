package njci.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import njci.bean.RoleInfo;
import njci.dao.RoleInfoDao;

public class RoleInfoDaoImpl extends HibernateDaoSupport implements RoleInfoDao {

	public RoleInfo getById(Integer id) {
		// TODO Auto-generated method stub
		return (RoleInfo) getHibernateTemplate().get(RoleInfo.class, id);
	}

}
