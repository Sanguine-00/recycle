package njci.bean;


/**
 * TypeInfo entity. @author MyEclipse Persistence Tools
 * ������
 */

public class TypeInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8174602082492509951L;
	private Integer id;
	private String type;
	private String logo;

	// Constructors

	/** default constructor */
	public TypeInfo() {
	}

	/** full constructor */
	public TypeInfo(String type, String logo) {
		this.type = type;
		this.logo = logo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}


}