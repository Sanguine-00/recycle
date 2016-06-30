package njci.dao;

import java.util.List;

public interface BaseDao {
	public Integer save(Object object);

	public Object update(Object object);

	public void delete(Object object);

	public Object getById(Integer id);

	@SuppressWarnings("unchecked")
	public List findAll();
}
