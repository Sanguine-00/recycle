package njci.dao;

import java.util.List;

import njci.bean.NewsType;

public interface NewsTypeDao {
	public Integer save(NewsType newsType);


	public NewsType update(NewsType newsType);
	
	public void delete(NewsType newsType);

	public NewsType getNewsTypeByName(String name);
	
	public NewsType getUserById(Integer id);
	
	public List<NewsType> findAllNewsType();
}
