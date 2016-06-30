package njci.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import njci.bean.MessageBean;
import njci.util.JsonUtil;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	/**
	 * 
	 */

	private String logo;

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	private static final long serialVersionUID = -6448504717157483720L;
	// 上传文件存放路径
	private final static String UPLOADDIR = "/upload/images/";
	// 上传文件集合
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String uploadPic() {
		try {
			// 循环上传每个文件
			uploadFile();
			logo = UPLOADDIR + file.getName();
			JsonUtil.jsonArrayFromObject(new MessageBean(SUCCESS));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 执行上传功能
	@SuppressWarnings("deprecation")
	private void uploadFile() throws FileNotFoundException, IOException {
		try {
			InputStream in = new FileInputStream(file);
			String dir = ServletActionContext.getRequest().getRealPath(
					UPLOADDIR);
			File fileLocation = new File(dir);
			// 此处也可以在应用根目录手动建立目标上传目录
			if (!fileLocation.exists()) {
				boolean isCreated = fileLocation.mkdir();
				if (!isCreated) {
					// 目标上传目录创建失败,可做其他处理,例如抛出自定义异常等,一般应该不会出现这种情况。
					return;
				}
			}
			File uploadFile = new File(dir, file.getName());
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
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("上传失败!");
			ex.printStackTrace();
		}
	}
}