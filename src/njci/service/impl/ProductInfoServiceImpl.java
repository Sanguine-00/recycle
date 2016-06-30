package njci.service.impl;

import java.util.List;

import njci.bean.ProductInfo;
import njci.dao.ProductInfoDao;
import njci.service.ProductInfoService;

public class ProductInfoServiceImpl implements ProductInfoService {

	private ProductInfoDao productInfoDao;

	public void setProductInfoDao(ProductInfoDao productInfoDao) {
		this.productInfoDao = productInfoDao;
	}

	public void delete(ProductInfo productInfo) {
		productInfoDao.delete(productInfo);
	}

	public List<ProductInfo> findAllNews() {
		// TODO Auto-generated method stub
		return productInfoDao.findAllNews();
	}

	public ProductInfo getProductInfoById(Integer id) {
		// TODO Auto-generated method stub
		return productInfoDao.getProductInfoById(id);
	}

	public ProductInfo getProductInfoByName(String name) {
		// TODO Auto-generated method stub
		return productInfoDao.getProductInfoByName(name);
	}

	public Integer save(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		return productInfoDao.save(productInfo);
	}

	public ProductInfo update(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		return productInfoDao.update(productInfo);
	}

	public List<ProductInfo> findByUserInfoIdAndBrandInfoId(Integer userInfoId,
			Integer brandInfoId) {
		if (userInfoId != null && userInfoId > 0 && brandInfoId != null
				&& brandInfoId > 0) {
			return productInfoDao.findByUserInfoIdAndBrandInfoId(userInfoId,
					brandInfoId);
		} else if (userInfoId != null && userInfoId > 0) {
			return productInfoDao.findByUserInfoId(userInfoId);

		} else if (brandInfoId != null && brandInfoId > 0) {
			return productInfoDao.findByBrandInfoId(brandInfoId);
		} else {
			return productInfoDao.findAllNews();
		}
	}

}
