package njci.bean;


/**
 * RoleInfo entity. @author MyEclipse Persistence Tools
 * ��ɫ��
 */

public class RoleInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1623443138678422897L;
	private Integer id;
	private String name;

	// Constructors

	/** default constructor */
	public RoleInfo() {
	}

	/** minimal constructor */
	public RoleInfo(String name) {
		this.name = name;
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


}