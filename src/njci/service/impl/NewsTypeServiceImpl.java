package njci.service.impl;

import java.util.List;

import njci.bean.NewsType;
import njci.dao.NewsTypeDao;
import njci.service.NewsTypeService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class NewsTypeServiceImpl extends HibernateDaoSupport implements
		NewsTypeService {

	private NewsTypeDao newsTypeDao;

	public void setNewsTypeDao(NewsTypeDao newsTypeDao) {
		this.newsTypeDao = newsTypeDao;
	}

	public void delete(NewsType newsType) {
		newsTypeDao.delete(newsType);

	}

	public List<NewsType> findAllNewsType() {
		// TODO Auto-generated method stub
		return newsTypeDao.findAllNewsType();
	}

	public NewsType getNewsTypeByName(String name) {
		// TODO Auto-generated method stub
		return newsTypeDao.getNewsTypeByName(name);
	}

	public NewsType getNewsTypeById(Integer id) {
		// TODO Auto-generated method stub
		return newsTypeDao.getUserById(id);
	}

	public Integer save(NewsType newsType) {
		// TODO Auto-generated method stub
		return newsTypeDao.save(newsType);
	}

	public NewsType update(NewsType newsType) {
		// TODO Auto-generated method stub
		return newsTypeDao.update(newsType);
	}


}
