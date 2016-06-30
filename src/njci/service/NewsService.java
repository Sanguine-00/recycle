package njci.service;

import java.util.List;

import njci.bean.News;

public interface NewsService {
	public Integer save(News news);

	public News update(News news);

	public void delete(News news);

	public News getNewsByName(String name);

	public News getNewsById(Integer id);

	public List<News> findAllNews();
	
	public List<News> findByTypeId(Integer id);
}
