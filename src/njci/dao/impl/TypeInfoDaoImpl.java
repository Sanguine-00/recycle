package njci.dao.impl;

import java.util.List;

import njci.bean.TypeInfo;
import njci.dao.TypeInfoDao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TypeInfoDaoImpl extends HibernateDaoSupport implements TypeInfoDao {

	public void delete(TypeInfo typeInfo) {
		getHibernateTemplate().delete(typeInfo);

	}

	@SuppressWarnings("unchecked")
	public List<TypeInfo> findAllNews() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from TypeInfo");
	}

	@SuppressWarnings("unchecked")
	public TypeInfo getTypeInfoById(Integer id) {
		List<TypeInfo> list = getHibernateTemplate().findByNamedParam(
				"from TypeInfo t where t.id=:id", "id", id);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public TypeInfo getTypeInfoByName(String name) {
		List<TypeInfo> list = getHibernateTemplate().findByNamedParam(
				"from TypeInfo t where t.name=:name", "name", name);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public Integer save(TypeInfo typeInfo) {
		getHibernateTemplate().save(typeInfo);
		return typeInfo.getId();
	}

	public TypeInfo update(TypeInfo typeInfo) {
		getHibernateTemplate().update(typeInfo);
		return typeInfo;
	}

}
