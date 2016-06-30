package njci.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import njci.bean.TypeInfo;
import njci.service.TypeInfoService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SuppressWarnings("deprecation")
public class TypeInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private final static String UPLOADDIR = "/upload/";

	private static final long serialVersionUID = 8945663269298367494L;
	private Log logger = LogFactory.getLog(TypeInfoAction.class);

	private Integer id;
	private String type;
	private String logo;
	private List<TypeInfo> typeInfoList;

	private TypeInfoService typeInfoService;

	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public List<TypeInfo> getTypeInfoList() {
		return typeInfoList;
	}

	public void setTypeInfoList(List<TypeInfo> typeInfoList) {
		this.typeInfoList = typeInfoList;
	}

	public void setTypeInfoService(TypeInfoService typeInfoService) {
		this.typeInfoService = typeInfoService;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String findAllTypeInfo() {
		typeInfoList = typeInfoService.findAllNews();
		return SUCCESS;
	}

	public String editTypeInfoById() {
		if (id != null && id > 0) {
			TypeInfo typeInfo = typeInfoService.getTypeInfoById(id);
			this.logo = typeInfo.getLogo();
			this.type = typeInfo.getType();
		}
		return SUCCESS;
	}

	public String saveUpdatedTypeInfo() {
		if (id != null && id > 0) {
			updateTypeInfo();
		} else {
			savaTypeInfo();
		}

		return SUCCESS;
	}

	private void savaTypeInfo() {
		TypeInfo typeInfo = new TypeInfo();
		uploadFile();
		typeInfo.setLogo(logo);
		typeInfo.setType(type);
		typeInfoService.save(typeInfo);

	}

	public String deleteTypeInfoById() {
		typeInfoService.delete(typeInfoService.getTypeInfoById(id));
		return SUCCESS;
	}

	private void updateTypeInfo() {
		TypeInfo typeInfo = typeInfoService.getTypeInfoById(id);
		changeFile();
		typeInfo.setLogo(logo);
		typeInfo.setType(type);
		typeInfoService.update(typeInfo);
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
			logger.debug("上传失败");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("上传失败!");
			ex.printStackTrace();
		}
	}

	private void changeFile() {
		String dir = ServletActionContext.getRequest().getRealPath(UPLOADDIR);
		File file = new File(dir, typeInfoService.getTypeInfoById(id).getLogo());
		if (file.exists()
				&& !logo.equals(typeInfoService.getTypeInfoById(id).getLogo())) {
			file.delete();
			uploadFile();
		}
	}

}
