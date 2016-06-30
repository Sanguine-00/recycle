package njci.service.impl;

import java.util.List;

import njci.bean.TypeInfo;
import njci.dao.TypeInfoDao;
import njci.service.TypeInfoService;

public class TypeInfoServiceImpl implements TypeInfoService {

	private TypeInfoDao typeInfoDao;

	public void setTypeInfoDao(TypeInfoDao typeInfoDao) {
		this.typeInfoDao = typeInfoDao;
	}

	public void delete(TypeInfo typeInfo) {
		// TODO Auto-generated method stub
		typeInfoDao.delete(typeInfo);
	}

	public List<TypeInfo> findAllNews() {
		// TODO Auto-generated method stub
		return typeInfoDao.findAllNews();
	}

	public TypeInfo getTypeInfoById(Integer id) {
		// TODO Auto-generated method stub
		return typeInfoDao.getTypeInfoById(id);
	}

	public TypeInfo getTypeInfoByName(String name) {
		// TODO Auto-generated method stub
		return typeInfoDao.getTypeInfoByName(name);
	}

	public Integer save(TypeInfo typeInfo) {
		// TODO Auto-generated method stub
		return typeInfoDao.save(typeInfo);
	}

	public TypeInfo update(TypeInfo typeInfo) {
		// TODO Auto-generated method stub
		return typeInfoDao.update(typeInfo);
	}

}
