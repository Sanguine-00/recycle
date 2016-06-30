package njci.dao;

import java.util.List;

import njci.bean.TypeInfo;

public interface TypeInfoDao {
	public Integer save(TypeInfo typeInfo);

	public TypeInfo update(TypeInfo typeInfo);

	public void delete(TypeInfo typeInfo);

	public TypeInfo getTypeInfoByName(String name);

	public TypeInfo getTypeInfoById(Integer id);

	public List<TypeInfo> findAllNews();
}
