package njci.bean;


/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 * �û���
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3424164389447787537L;
	private Integer id;
	private RoleInfo roleInfo;
	private String name;
	private String password;
	private String phone;
	private String logo;
	private String address;

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}

	/** full constructor */
	public UserInfo(RoleInfo roleInfo, String name, String password,
			String phone, String logo, String address) {
		this.roleInfo = roleInfo;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.logo = logo;
		this.address = address;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RoleInfo getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}