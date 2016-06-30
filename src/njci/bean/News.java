package njci.bean;


/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3610220459835160724L;
	private Integer id;
	private UserInfo userInfo;
	private NewsType newsType;
	private String title;
	private String content;
	private String time;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(UserInfo userInfo, NewsType newsType, String title,
			String content) {
		this.userInfo = userInfo;
		this.newsType = newsType;
		this.title = title;
		this.content = content;
	}

	/** full constructor */
	public News(UserInfo userInfo, NewsType newsType, String title,
			String content, String time) {
		this.userInfo = userInfo;
		this.newsType = newsType;
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

	public NewsType getNewsType() {
		return this.newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
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

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}