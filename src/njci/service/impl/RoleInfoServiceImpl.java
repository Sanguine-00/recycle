package njci.service.impl;

import njci.bean.RoleInfo;
import njci.dao.RoleInfoDao;
import njci.service.RoleInfoService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class RoleInfoServiceImpl extends HibernateDaoSupport implements
		RoleInfoService {
	
	private RoleInfoDao roleInfoDao;
	
	

	public void setRoleInfoDao(RoleInfoDao roleInfoDao) {
		this.roleInfoDao = roleInfoDao;
	}



	public RoleInfo getById(Integer id) {
		// TODO Auto-generated method stub
		return roleInfoDao.getById(id);
	}

}
