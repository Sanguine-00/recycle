package njci.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * OrderInfo entity. @author MyEclipse Persistence Tools
 * ������
 */

public class OrderInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8336537938776848251L;
	private Integer id;
	
	//�¶�������
	private UserInfo userInfo;
	
	//������
	private String orderNum;
	
	//�����ܼ�
	private Float price;
	
	//�µ�ʱ��
	private String time;
	
	//�ջ���ַ
	private String address;
	private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

	// Constructors

	/** default constructor */
	public OrderInfo() {
	}

	/** minimal constructor */
	public OrderInfo(UserInfo userInfo, String orderNum, Float price) {
		this.userInfo = userInfo;
		this.orderNum = orderNum;
		this.price = price;
	}

	/** full constructor */
	public OrderInfo(UserInfo userInfo, String orderNum, Float price,
			String time, String address, Set<OrderItem> orderItems) {
		this.userInfo = userInfo;
		this.orderNum = orderNum;
		this.price = price;
		this.time = time;
		this.address = address;
		this.orderItems = orderItems;
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

	public String getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}