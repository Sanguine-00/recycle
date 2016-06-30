package njci.dao;

import java.util.List;

import njci.bean.ProductInfo;

public interface ProductInfoDao {
	public Integer save(ProductInfo productInfo);

	public ProductInfo update(ProductInfo productInfo);

	public void delete(ProductInfo productInfo);

	public ProductInfo getProductInfoByName(String name);

	public ProductInfo getProductInfoById(Integer id);

	public List<ProductInfo> findAllNews();

	public List<ProductInfo> findByUserInfoId(Integer userInfoId);

	public List<ProductInfo> findByBrandInfoId(Integer brandInfoId);

	public List<ProductInfo> findByUserInfoIdAndBrandInfoId(Integer userInfoId,
			Integer brandInfoId);
}
