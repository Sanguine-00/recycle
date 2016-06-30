package njci.service;

import java.util.List;

import njci.bean.TypeInfo;

public interface TypeInfoService {
	public Integer save(TypeInfo typeInfo);

	public TypeInfo update(TypeInfo typeInfo);

	public void delete(TypeInfo typeInfo);

	public TypeInfo getTypeInfoByName(String name);

	public TypeInfo getTypeInfoById(Integer id);

	public List<TypeInfo> findAllNews();
}
