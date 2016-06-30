package njci.service;

import java.util.List;

import njci.bean.BrandInfo;

public interface BrandInfoService {
	public Integer save(BrandInfo brandInfo);

	public BrandInfo update(BrandInfo brandInfo);

	public void delete(BrandInfo brandInfo);

	public List<BrandInfo> getByTypeInfoId(Integer id);

	public BrandInfo getBrandInfoById(Integer id);

	public List<BrandInfo> findAllNews();
}
