package njci.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import njci.bean.BrandInfo;
import njci.bean.ProductInfo;
import njci.bean.UserInfo;
import njci.service.BrandInfoService;
import njci.service.ProductInfoService;
import njci.service.UserInfoService;
import njci.util.JsonUtil;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProductInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8275546792632971285L;
	private Log logger = LogFactory.getLog(ProductInfoAction.class);

	private Integer id;

	// ��Ʒ������
	private UserInfo userInfo;

	// ��Ʒ����Ʒ��
	private BrandInfo brandInfo;

	// ��Ʒlogo
	private String logoUrl;

	// ��Ʒ���
	private String name;
	private String descpt;

	// ��Ʒ�۸�
	private Float price;
	private Integer brandInfoId;
	private Integer userInfoId;

	private List<ProductInfo> productInfoList;
	private List<BrandInfo> brandInfoList;
	private List<UserInfo> userInfoList;

	private ProductInfoService productInfoService;
	private BrandInfoService brandInfoService;
	private UserInfoService userInfoService;

	private final static String UPLOADDIR = "/upload/";
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public BrandInfo getBrandInfo() {
		return brandInfo;
	}

	public void setBrandInfo(BrandInfo brandInfo) {
		this.brandInfo = brandInfo;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescpt() {
		return descpt;
	}

	public void setDescpt(String descpt) {
		this.descpt = descpt;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public List<ProductInfo> getProductInfoList() {
		return productInfoList;
	}

	public void setProductInfoList(List<ProductInfo> productInfoList) {
		this.productInfoList = productInfoList;
	}

	public List<BrandInfo> getBrandInfoList() {
		return brandInfoList;
	}

	public void setBrandInfoList(List<BrandInfo> brandInfoList) {
		this.brandInfoList = brandInfoList;
	}

	public void setProductInfoService(ProductInfoService productInfoService) {
		this.productInfoService = productInfoService;
	}

	public void setBrandInfoService(BrandInfoService brandInfoService) {
		this.brandInfoService = brandInfoService;
	}

	public Integer getBrandInfoId() {
		return brandInfoId;
	}

	public void setBrandInfoId(Integer brandInfoId) {
		this.brandInfoId = brandInfoId;
	}

	public Integer getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public List<UserInfo> getUserInfoList() {
		return userInfoList;
	}

	public void setUserInfoList(List<UserInfo> userInfoList) {
		this.userInfoList = userInfoList;
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	public String findAllProductInfo() {
		brandInfoList = brandInfoService.findAllNews();
		productInfoList = productInfoService.findAllNews();
		userInfoList = userInfoService.findAllUsers();
		return SUCCESS;
	}

	public String findAllBrandInfo() {
		brandInfoList = brandInfoService.findAllNews();
		try {
			JsonUtil.jsonFromList(brandInfoList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public String findAllUserInfo() {
		userInfoList = userInfoService.findAllUsers();
		try {
			JsonUtil.jsonFromList(userInfoList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public String editProductById() {

		if (id != null && id > 0) {
			ProductInfo productInfo = productInfoService.getProductInfoById(id);
			this.name = productInfo.getName();
			this.logoUrl = productInfo.getLogoUrl();
			this.price = productInfo.getPrice();
			this.descpt = productInfo.getDescpt();
			this.brandInfo = productInfo.getBrandInfo();
			this.brandInfoId = productInfo.getBrandInfo().getId();
			this.userInfo = productInfo.getUserInfo();
			this.userInfoId = productInfo.getUserInfo().getId();
		}
		return SUCCESS;
	}

	public String saveUpdatedProductInfo() {
		if (id != null && id > 0) {
			updateProductInfo();
		} else {
			savaProductInfo();
		}

		return SUCCESS;
	}

	private void savaProductInfo() {
		ProductInfo productInfo = new ProductInfo();
		uploadFile();
		productInfo.setName(name);
		productInfo.setDescpt(descpt);
		productInfo.setLogoUrl(logoUrl);
		productInfo.setPrice(price);
		productInfo.setUserInfo(userInfoService.getUserById(userInfoId));
		productInfo
				.setBrandInfo(brandInfoService.getBrandInfoById(brandInfoId));
		productInfoService.save(productInfo);

	}

	public String deleteProductInfoById() {
		productInfoService.delete(productInfoService.getProductInfoById(id));
		return SUCCESS;
	}

	private void updateProductInfo() {
		ProductInfo productInfo = productInfoService.getProductInfoById(id);
		changeFile();
		productInfo.setName(name);
		productInfo.setDescpt(descpt);
		productInfo.setLogoUrl(logoUrl);
		productInfo.setPrice(price);
		productInfo.setUserInfo(userInfoService.getUserById(userInfoId));
		productInfo
				.setBrandInfo(brandInfoService.getBrandInfoById(brandInfoId));
		productInfoService.update(productInfo);
	}

	public String findByUserInfoIdAndBrandInfoId() {
		productInfoList = productInfoService.findByUserInfoIdAndBrandInfoId(
				userInfoId, brandInfoId);
		return SUCCESS;
	}

	@SuppressWarnings("deprecation")
	private void uploadFile() {
		try {
			String dir = ServletActionContext.getRequest().getRealPath(
					UPLOADDIR);
			System.out.println("\n\n\n\n" + file.getAbsoluteFile().getName());
			logger.debug("\n\n\n\n" + file.getAbsoluteFile().getName());
			InputStream in = new FileInputStream(file);
			File fileLocation = new File(dir);
			// 此处也可以在应用根目录手动建立目标上传目录
			if (!fileLocation.exists()) {
				boolean isCreated = fileLocation.mkdirs();
				if (!isCreated) {
					// 目标上传目录创建失败,可做其他处理,例如抛出自定义异常等,一般应该不会出现这种情况。
					return;
				}
			}
			File uploadFile = new File(dir, logoUrl);
			System.out.println(uploadFile.getAbsolutePath());
			logger.debug(uploadFile.getAbsolutePath());
			if (!uploadFile.getParentFile().exists()) {
				uploadFile.getParentFile().mkdirs();
			}
			if (!uploadFile.exists()) {
				uploadFile.createNewFile();
			}
			OutputStream out = new FileOutputStream(uploadFile);
			byte[] buffer = new byte[1024 * 1024];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException ex) {
			System.out.println("上传失败!");
			logger.debug("上传失败!");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("上传失败!");
			logger.debug("上传失败!");
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	private void changeFile() {
		String dir = ServletActionContext.getRequest().getRealPath(UPLOADDIR);
		logger.debug(dir);
		File file = new File(dir, productInfoService.getProductInfoById(id)
				.getLogoUrl());
		if (file.exists()
				&& !logoUrl.equals(productInfoService.getProductInfoById(id)
						.getLogoUrl())) {
			file.delete();
			uploadFile();
		}

	}

}
