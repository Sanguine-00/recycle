package njci.bean;


/**
 * ProductInfo entity. @author MyEclipse Persistence Tools
 * ��Ʒ��
 */

public class ProductInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -6707015282146150691L;
	private Integer id;
	
	//��Ʒ������
	private UserInfo userInfo;
	
	//��Ʒ����Ʒ��
	private BrandInfo brandInfo;
	
	//��Ʒlogo
	private String logoUrl;
	
	//��Ʒ���
	private String name;
	private String descpt;
	
	//��Ʒ�۸�
	private Float price;

	// Constructors

	/** default constructor */
	public ProductInfo() {
	}

	/** minimal constructor */
	public ProductInfo(UserInfo userInfo, BrandInfo brandInfo) {
		this.userInfo = userInfo;
		this.brandInfo = brandInfo;
	}

	/** full constructor */
	public ProductInfo(UserInfo userInfo, BrandInfo brandInfo, String logoUrl,
			String name, Float price) {
		this.userInfo = userInfo;
		this.brandInfo = brandInfo;
		this.logoUrl = logoUrl;
		this.name = name;
		this.price = price;
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

	public BrandInfo getBrandInfo() {
		return this.brandInfo;
	}

	public void setBrandInfo(BrandInfo brandInfo) {
		this.brandInfo = brandInfo;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescpt() {
		return descpt;
	}

	public void setDescpt(String descpt) {
		this.descpt = descpt;
	}
	
	


}