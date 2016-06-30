package njci.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import njci.bean.NewsType;
import njci.dao.NewsTypeDao;

public class NewsTypeDaoImpl extends HibernateDaoSupport implements NewsTypeDao {

	public void delete(NewsType newsType) {
		getHibernateTemplate().delete(newsType);

	}

	@SuppressWarnings("unchecked")
	public List<NewsType> findAllNewsType() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from NewsType");
	}

	public NewsType getUserById(Integer id) {
		// TODO Auto-generated method stub
		return (NewsType) getHibernateTemplate().get(NewsType.class, id);
	}

	@SuppressWarnings("unchecked")
	public NewsType getNewsTypeByName(String name) {
		// TODO Auto-generated method stub
		List<NewsType> list = getHibernateTemplate().findByNamedParam(
				"from NewsType n where n.name=:name", "name", name);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public Integer save(NewsType newsType) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(newsType);
		return newsType.getId();
	}

	public NewsType update(NewsType newsType) {
		getHibernateTemplate().update(newsType);
		return newsType;
	}

}
