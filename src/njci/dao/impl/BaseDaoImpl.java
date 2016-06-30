package njci.dao.impl;

import java.util.List;

import njci.dao.BaseDao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class BaseDaoImpl extends HibernateDaoSupport implements
		BaseDao {

	public void delete(Object object) {
		getHibernateTemplate().delete(object);

	}
	
//	public abstract Class getEntity();

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
		getHibernateTemplate().save(object);
		return null;
	}

	public Object update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
