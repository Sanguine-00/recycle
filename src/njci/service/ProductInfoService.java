package njci.service;

import java.util.List;

import njci.bean.ProductInfo;

public interface ProductInfoService {
	public Integer save(ProductInfo productInfo);

	public ProductInfo update(ProductInfo productInfo);

	public void delete(ProductInfo productInfo);

	public ProductInfo getProductInfoByName(String name);

	public ProductInfo getProductInfoById(Integer id);

	public List<ProductInfo> findAllNews();
	
	public List<ProductInfo> findByUserInfoIdAndBrandInfoId(Integer userInfoId,
			Integer brandInfoId);
}
