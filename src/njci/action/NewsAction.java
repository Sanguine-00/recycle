package njci.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import njci.bean.News;
import njci.bean.NewsType;
import njci.bean.UserInfo;
import njci.service.NewsService;
import njci.service.NewsTypeService;
import njci.service.UserInfoService;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8289940798350829948L;
	private Integer id;
	private UserInfo userInfo;
	private NewsType newsType;
	private Integer newsTypeId;
	private Integer userInfoId;
	private String title;
	private String content;
	private String time;
	private Map<String, Object> session;

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private List<News> newsList = new ArrayList<News>();;
	private List<NewsType> newsTypeList = new ArrayList<NewsType>();;

	private NewsService newsService;
	private NewsTypeService newsTypeService;
	private UserInfoService userInfoService;

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

	public List<NewsType> getNewsTypeList() {
		return newsTypeList;
	}

	public void setNewsTypeList(List<NewsType> newsTypeList) {
		this.newsTypeList = newsTypeList;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public void setNewsTypeService(NewsTypeService newsTypeService) {
		this.newsTypeService = newsTypeService;
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

	public NewsType getNewsType() {
		return newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getNewsTypeId() {
		return newsTypeId;
	}

	public void setNewsTypeId(Integer newsTypeId) {
		this.newsTypeId = newsTypeId;
	}

	public Integer getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String findAllNews() {
		newsList = newsService.findAllNews();
		newsTypeList = newsTypeService.findAllNewsType();
		return SUCCESS;
	}

	public String findNewsByTypeId() {
		newsList = newsService.findByTypeId(newsTypeId);
		newsTypeList = newsTypeService.findAllNewsType();
		return SUCCESS;
	}

	public String newsDetaile() {
		newsTypeList = newsTypeService.findAllNewsType();
		if (id != null && id > 0) {
			News news = newsService.getNewsById(id);
			this.title = news.getTitle();
			this.content = news.getContent();
			this.newsType = news.getNewsType();
			this.userInfo = news.getUserInfo();
			this.newsTypeId = news.getNewsType().getId();
			this.userInfoId = news.getUserInfo().getId();
		}
		return SUCCESS;
	}

	public String editNewsById() {

		newsTypeList = newsTypeService.findAllNewsType();
		if (id != null && id > 0) {
			News news = newsService.getNewsById(id);
			this.title = news.getTitle();
			this.content = news.getContent();
			this.newsType = news.getNewsType();
			this.userInfo = news.getUserInfo();
			this.newsTypeId = news.getNewsType().getId();
			this.userInfoId = news.getUserInfo().getId();
		} else {
			this.title = null;
			this.content = null;
			this.newsType = null;
			this.userInfo = null;
			this.newsTypeId = null;
			this.userInfoId = null;
		}
		return SUCCESS;
	}

	public String saveUpdatedNews() {
		if (id != null && id > 0) {
			updateNews();
		} else {
			savaNews();
		}

		return SUCCESS;
	}

	public String deleteNewsById() {
		newsService.delete(newsService.getNewsById(id));
		return SUCCESS;
	}

	private void updateNews() {
		News news = newsService.getNewsById(id);
		news.setContent(content);
		news.setNewsType(newsTypeService.getNewsTypeById(newsTypeId));
		UserInfo userInfo = (UserInfo) ActionContext.getContext().getSession()
				.get("login");
		news.setUserInfo(userInfo);
		news.setTime(format.format(new Date()));
		news.setTitle(title);
		newsService.update(news);
	}

	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	private void savaNews() {
		News news = new News();
		news.setContent(content);
		news.setNewsType(newsTypeService.getNewsTypeById(newsTypeId));
		UserInfo userInfo = (UserInfo) ActionContext.getContext().getSession()
				.get("login");
		news.setUserInfo(userInfo);
		news.setTime(format.format(new Date()));
		news.setTitle(title);
		newsService.save(news);
	}

}
