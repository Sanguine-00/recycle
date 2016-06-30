package njci.service.impl;

import java.util.List;

import njci.service.BaseService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class BaseServiceImpl extends HibernateDaoSupport implements
		BaseService {

	public void delete(Object object) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	public List findAllNewsType() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNewsTypeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer save(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
