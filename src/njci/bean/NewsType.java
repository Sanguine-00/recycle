package njci.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * NewsType entity. @author MyEclipse Persistence Tools
 */

public class NewsType implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8042847015799854695L;
	private Integer id;
	private String name;
	private String eName;
	private String descpt;
	private Set<News> newses = new HashSet<News>(0);

	// Constructors

	/** default constructor */
	public NewsType() {
	}

	/** full constructor */
	public NewsType(String name, Set<News> newses) {
		this.name = name;
		this.newses = newses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<News> getNewses() {
		return this.newses;
	}

	public void setNewses(Set<News> newses) {
		this.newses = newses;
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


	
	

}