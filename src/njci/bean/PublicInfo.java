package njci.bean;

import java.util.Date;

/**
 * PublicInfo entity. @author MyEclipse Persistence Tools
 * ������
 */

public class PublicInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 554635912195387898L;
	
	private Integer id;
	
	//���淢����
	private UserInfo userInfo;
	
	//�������
	private String title;
	
	//��������
	private String content;
	
	//���淢��ʱ��
	private Date time;

	// Constructors

	/** default constructor */
	public PublicInfo() {
	}

	/** minimal constructor */
	public PublicInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/** full constructor */
	public PublicInfo(UserInfo userInfo, String title, String content, Date time) {
		this.userInfo = userInfo;
		this.title = title;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}