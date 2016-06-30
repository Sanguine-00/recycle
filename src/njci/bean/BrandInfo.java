package njci.bean;


/**
 * BrandInfo entity. @author MyEclipse Persistence Tools
 * ��ƷƷ����
 */

public class BrandInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7844046859741965704L;
	private Integer id;
	
	//Ʒ����������
	private TypeInfo typeInfo;
	
	//Ʒ�����
	private String name;
	
	//Ʒ��logo
	private String logo;

	// Constructors

	/** default constructor */
	public BrandInfo() {
	}

	/** minimal constructor */
	public BrandInfo(TypeInfo typeInfo) {
		this.typeInfo = typeInfo;
	}

	/** full constructor */
	public BrandInfo(TypeInfo typeInfo, String name, String logo
			) {
		this.typeInfo = typeInfo;
		this.name = name;
		this.logo = logo;
//		this.productInfos = productInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TypeInfo getTypeInfo() {
		return this.typeInfo;
	}

	public void setTypeInfo(TypeInfo typeInfo) {
		this.typeInfo = typeInfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}


}