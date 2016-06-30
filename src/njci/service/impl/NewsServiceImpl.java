package njci.service.impl;

import java.util.List;

import njci.bean.News;
import njci.dao.NewsDao;
import njci.service.NewsService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class NewsServiceImpl extends HibernateDaoSupport implements NewsService {

	private NewsDao newsDao;

	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public void delete(News news) {
		newsDao.delete(news);
	}

	public List<News> findAllNews() {
		// TODO Auto-generated method stub
		return newsDao.findAllNews();
	}

	public News getNewsById(Integer id) {
		// TODO Auto-generated method stub
		return newsDao.getNewsById(id);
	}

	public News getNewsByName(String name) {
		// TODO Auto-generated method stub
		return newsDao.getNewsByName(name);
	}

	public Integer save(News news) {
		// TODO Auto-generated method stub
		return newsDao.save(news);
	}

	public News update(News news) {
		// TODO Auto-generated method stub
		return newsDao.update(news);
	}

	public List<News> findByTypeId(Integer id) {
		// TODO Auto-generated method stub
		return newsDao.findByTypeId(id);
	}

}
