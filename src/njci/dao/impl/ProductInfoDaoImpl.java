package njci.dao.impl;

import java.util.List;

import njci.bean.ProductInfo;
import njci.dao.ProductInfoDao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProductInfoDaoImpl extends HibernateDaoSupport implements
		ProductInfoDao {

	public void delete(ProductInfo productInfo) {
		getHibernateTemplate().delete(productInfo);

	}

	@SuppressWarnings("unchecked")
	public List<ProductInfo> findAllNews() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from ProductInfo");
	}

	@SuppressWarnings("unchecked")
	public ProductInfo getProductInfoById(Integer id) {
		List<ProductInfo> list = getHibernateTemplate().findByNamedParam(
				"from ProductInfo p where p.id=:id", "id", id);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ProductInfo getProductInfoByName(String name) {
		List<ProductInfo> list = getHibernateTemplate().findByNamedParam(
				"from ProductInfo p where p.name=:name", "name", name);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public Integer save(ProductInfo productInfo) {
		getHibernateTemplate().save(productInfo);
		return productInfo.getId();
	}

	public ProductInfo update(ProductInfo productInfo) {
		getHibernateTemplate().update(productInfo);
		return productInfo;
	}

	@SuppressWarnings("unchecked")
	public List<ProductInfo> findByBrandInfoId(Integer brandInfoId) {
		List<ProductInfo> list = getHibernateTemplate().findByNamedParam(
				"from ProductInfo p where p.brandInfo.id=:id", "id",
				brandInfoId);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<ProductInfo> findByUserInfoId(Integer userInfoId) {
		List<ProductInfo> list = getHibernateTemplate().findByNamedParam(
				"from ProductInfo p where p.userInfo.id=:id", "id", userInfoId);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<ProductInfo> findByUserInfoIdAndBrandInfoId(Integer userInfoId,
			Integer brandInfoId) {
		String hql = "from ProductInfo p where p.brandInfo.id=:brandInfoId and p.userInfo.id=:userInfoId";
		String[] params = { "brandInfoId", "userInfoId" };
		Object[] values = { brandInfoId, userInfoId };
		List<ProductInfo> list = getHibernateTemplate().findByNamedParam(hql,
				params, values);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

}
