package njci.service.impl;

import java.util.List;

import njci.bean.BrandInfo;
import njci.dao.BrandInfoDao;
import njci.service.BrandInfoService;

public class BrandInfoServiceImpl implements BrandInfoService {

	private BrandInfoDao brandInfoDao;

	public void setBrandInfoDao(BrandInfoDao brandInfoDao) {
		this.brandInfoDao = brandInfoDao;
	}

	public void delete(BrandInfo brandInfo) {
		// TODO Auto-generated method stub
		brandInfoDao.delete(brandInfo);
	}

	public List<BrandInfo> findAllNews() {
		// TODO Auto-generated method stub
		return brandInfoDao.findAllNews();
	}

	public BrandInfo getBrandInfoById(Integer id) {
		// TODO Auto-generated method stub
		return brandInfoDao.getBrandInfoById(id);
	}

	public List<BrandInfo> getByTypeInfoId(Integer id) {
		// TODO Auto-generated method stub
		if (id != null && id > 0) {
			return brandInfoDao.getByTypeInfoId(id);
		} else {
			return brandInfoDao.findAllNews();
		}
	}

	public Integer save(BrandInfo brandInfo) {
		// TODO Auto-generated method stub
		return brandInfoDao.save(brandInfo);
	}

	public BrandInfo update(BrandInfo brandInfo) {
		// TODO Auto-generated method stub
		return brandInfoDao.update(brandInfo);
	}

}
