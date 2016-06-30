package njci.service;

import java.util.List;

public interface BaseService {
	Integer save(Object object);

	Object update(Object object);

	void delete(Object object);

	Object getNewsTypeByName(String name);

	Object getUserById(Integer id);

	@SuppressWarnings("unchecked")
	List findAllNewsType();
}
