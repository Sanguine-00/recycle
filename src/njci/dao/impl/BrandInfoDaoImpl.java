package njci.dao.impl;

import java.util.List;

import njci.bean.BrandInfo;
import njci.dao.BrandInfoDao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BrandInfoDaoImpl extends HibernateDaoSupport implements
		BrandInfoDao {

	public void delete(BrandInfo brandInfo) {
		getHibernateTemplate().delete(brandInfo);

	}

	@SuppressWarnings("unchecked")
	public List<BrandInfo> findAllNews() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from BrandInfo");
	}

	@SuppressWarnings("unchecked")
	public BrandInfo getBrandInfoById(Integer id) {
		List<BrandInfo> list = getHibernateTemplate().findByNamedParam(
				"from BrandInfo b where b.id=:id", "id", id);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<BrandInfo> getByTypeInfoId(Integer id) {
		List<BrandInfo> list = getHibernateTemplate().findByNamedParam(
				"from BrandInfo b where b.typeInfo.id=:id", "id", id);
		
		return list;
	}

	public Integer save(BrandInfo brandInfo) {
		getHibernateTemplate().save(brandInfo);
		return brandInfo.getId();
	}

	public BrandInfo update(BrandInfo brandInfo) {
		getHibernateTemplate().update(brandInfo);
		return brandInfo;
	}

}
