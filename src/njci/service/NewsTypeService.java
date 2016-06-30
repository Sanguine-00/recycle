package njci.service;

import java.util.List;

import njci.bean.NewsType;

public interface NewsTypeService {
	public Integer save(NewsType newsType);


	public NewsType update(NewsType newsType);
	
	public void delete(NewsType newsType);

	public NewsType getNewsTypeByName(String name);
	
	public NewsType getNewsTypeById(Integer id);
	
	public List<NewsType> findAllNewsType();
	
	

}
