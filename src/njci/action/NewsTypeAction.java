package njci.action;

import java.util.List;

import njci.bean.NewsType;
import njci.service.NewsTypeService;

import com.opensymphony.xwork2.ActionSupport;

public class NewsTypeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6766952487769374605L;

	private NewsTypeService newsTypeService;

	private Integer id;
	private String name;
	private String eName;
	private String descpt;

	private List<NewsType> list;

	public List<NewsType> getList() {
		return list;
	}

	public void setList(List<NewsType> list) {
		this.list = list;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}


	public String getDescpt() {
		return descpt;
	}

	public void setDescpt(String descpt) {
		this.descpt = descpt;
	}

	public String add() {
		NewsType newsType = new NewsType();
		newsType.setDescpt(descpt);
		newsType.seteName(eName);
		newsType.setName(name);
		newsTypeService.save(newsType);
		return SUCCESS;
	}

	public String deleteByUserId() {
		newsTypeService.delete(newsTypeService.getNewsTypeById(id));
		return SUCCESS;
	}

	public String editUserInfo() {
		if (id > 0) {
			NewsType newsType = newsTypeService.getNewsTypeById(id);
			descpt = newsType.getDescpt();
			name = newsType.getName();
			eName = newsType.geteName();
		} else {
			descpt = null;
			name = null;
			eName = null;
		}
		return SUCCESS;
	}

	public String save() {
		try {
			NewsType newsType = null;
			if (id > 0) {
				newsType = newsTypeService.getNewsTypeById(id);
				newsType.setName(name);
				newsType.setDescpt(descpt);
				newsType.seteName(eName);
				newsType.setName(name);
				newsTypeService.update(newsType);
			} else {
				newsType = new NewsType();
				newsType.setName(name);
				newsType.setDescpt(descpt);
				newsType.seteName(eName);
				newsTypeService.save(newsType);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	public String findAllNewsType() {
		list = newsTypeService.findAllNewsType();
		return SUCCESS;
	}

}
