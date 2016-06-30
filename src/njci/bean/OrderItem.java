package njci.bean;

/**
 * OrderItem entity. @author MyEclipse Persistence Tools
 * 订单项类
 */

public class OrderItem implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8078323351436840228L;
	private Integer id;
	
	
	//所属订单
	private OrderInfo orderInfo;
	
	//订单产品
	private ProductInfo productInfo;
	
	//数量
	private Integer number;
	
	//单项订单的价格
	private Float price;

	// Constructors

	/** default constructor */
	public OrderItem() {
	}

	/** minimal constructor */
	public OrderItem(OrderInfo orderInfo, ProductInfo productInfo) {
		this.orderInfo = orderInfo;
		this.productInfo = productInfo;
	}

	/** full constructor */
	public OrderItem(OrderInfo orderInfo, ProductInfo productInfo,
			Integer number, Float price) {
		this.orderInfo = orderInfo;
		this.productInfo = productInfo;
		this.number = number;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrderInfo getOrderInfo() {
		return this.orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public ProductInfo getProductInfo() {
		return this.productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}