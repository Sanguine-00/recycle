package njci.dao.impl;

import java.util.List;

import njci.bean.News;
import njci.dao.NewsDao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class NewsDaoImpl extends HibernateDaoSupport implements NewsDao {

	public void delete(News news) {
		getHibernateTemplate().delete(news);

	}

	@SuppressWarnings("unchecked")
	public List<News> findAllNews() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from News");
	}

	@SuppressWarnings("unchecked")
	public News getNewsById(Integer id) {
		List<News> list = getHibernateTemplate().findByNamedParam(
				"from News n where n.id=:id", "id", id);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public News getNewsByName(String name) {
		List<News> list = getHibernateTemplate().findByNamedParam(
				"from News n where n.title=:name", "name", name);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public Integer save(News news) {
		getHibernateTemplate().save(news);
		return news.getId();
	}

	public News update(News news) {
		getHibernateTemplate().update(news);
		return news;
	}

	@SuppressWarnings("unchecked")
	public List<News> findByTypeId(Integer id) {
		return getHibernateTemplate().findByNamedParam(
				"from News n where n.newsType.id=:id", "id", id);
	}

}
