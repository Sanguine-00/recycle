package njci.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import njci.bean.BrandInfo;
import njci.bean.TypeInfo;
import njci.service.BrandInfoService;
import njci.service.TypeInfoService;
import njci.util.JsonUtil;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SuppressWarnings("deprecation")
public class BrandInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8076588886183956748L;
	private Log logger = LogFactory.getLog(BrandInfoAction.class);
	
	// Ʒ����������
	private TypeInfo typeInfo;

	// Ʒ�����
	private String name;

	// Ʒ��logo
	private String logo;

	private Integer typeInfoId;
	private Integer id;

	private final static String UPLOADDIR = "/upload/";
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	private BrandInfoService brandInfoService;
	private TypeInfoService typeInfoService;

	private List<BrandInfo> brandInfoList;
	private List<TypeInfo> typeInfoList;

	public List<TypeInfo> getTypeInfoList() {
		return typeInfoList;
	}

	public void setTypeInfoList(List<TypeInfo> typeInfoList) {
		this.typeInfoList = typeInfoList;
	}

	public TypeInfo getTypeInfo() {
		return typeInfo;
	}

	public void setTypeInfo(TypeInfo typeInfo) {
		this.typeInfo = typeInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<BrandInfo> getBrandInfoList() {
		return brandInfoList;
	}

	public void setBrandInfoList(List<BrandInfo> brandInfoList) {
		this.brandInfoList = brandInfoList;
	}

	public void setBrandInfoService(BrandInfoService brandInfoService) {
		this.brandInfoService = brandInfoService;
	}

	public void setTypeInfoService(TypeInfoService typeInfoService) {
		this.typeInfoService = typeInfoService;
	}

	public Integer getTypeInfoId() {
		return typeInfoId;
	}

	public void setTypeInfoId(Integer typeInfoId) {
		this.typeInfoId = typeInfoId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String findAllBrandInfo() {
		brandInfoList = brandInfoService.findAllNews();
		typeInfoList = typeInfoService.findAllNews();
		return SUCCESS;
	}

	public String editNewsById() {

		if (id != null && id > 0) {
			BrandInfo brandInfo = brandInfoService.getBrandInfoById(id);
			this.logo = brandInfo.getLogo();
			this.name = brandInfo.getName();
			this.typeInfo = brandInfo.getTypeInfo();
			this.typeInfoId = brandInfo.getTypeInfo().getId();
		}
		return SUCCESS;
	}

	public String saveUpdatedBrandInfo() {
		if (id != null && id > 0) {
			updateBrandInfo();
		} else {
			savaBrandInfo();
		}

		return SUCCESS;
	}

	private void savaBrandInfo() {
		BrandInfo brandInfo = new BrandInfo();
		uploadFile();
		brandInfo.setLogo(logo);
		brandInfo.setName(name);
		brandInfo.setTypeInfo(typeInfoService.getTypeInfoById(typeInfoId));
		brandInfoService.save(brandInfo);

	}

	public String deleteBrandInfoById() {
		brandInfoService.delete(brandInfoService.getBrandInfoById(id));
		return SUCCESS;
	}

	private void updateBrandInfo() {
		BrandInfo brandInfo = brandInfoService.getBrandInfoById(id);
		changeFile();
		brandInfo.setLogo(logo);
		brandInfo.setName(name);
		brandInfo.setTypeInfo(typeInfoService.getTypeInfoById(typeInfoId));
		brandInfoService.update(brandInfo);
	}

	public String findByTypeInfoId() {
		if (typeInfoId != null && typeInfoId > 0) {
			brandInfoList = brandInfoService.getByTypeInfoId(typeInfoId);
		}
		if (brandInfoList == null || brandInfoList.size() < 1) {
			brandInfoList = brandInfoService.findAllNews();
		}
		return SUCCESS;
	}

	public String findAllTypeInfo() {
		typeInfoList = typeInfoService.findAllNews();
		try {
			JsonUtil.jsonFromList(typeInfoList, typeInfoList.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

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
			File uploadFile = new File(dir, logo);
			System.out.println(uploadFile.getAbsolutePath());
			logger.debug("uploadFile.getAbsolutePath()"+uploadFile.getAbsolutePath());
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

	private void changeFile() {
		String dir = ServletActionContext.getRequest().getRealPath(UPLOADDIR);
		File file = new File(dir, brandInfoService.getBrandInfoById(id)
				.getLogo());
		if (file.exists()
				&& !logo
						.equals(brandInfoService.getBrandInfoById(id).getLogo())) {
			file.delete();
			uploadFile();
		}

	}

}
