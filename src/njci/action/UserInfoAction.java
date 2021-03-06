package njci.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import njci.bean.RoleInfo;
import njci.bean.UserInfo;
import njci.service.RoleInfoService;
import njci.service.UserInfoService;
import njci.util.EncryptUtil;
import njci.util.JsonUtil;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoAction extends ActionSupport implements SessionAware {

	private RoleInfo roleInfo;
	private String name;
	private String loginId;
	private String password;
	private String phone;
	private String logo;
	private String address;
	private Integer id;
	private Integer roleInfoId;
	private Map<String, Object> session;

	public Integer getRoleInfoId() {
		return roleInfoId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void setRoleInfoId(Integer roleInfoId) {
		this.roleInfoId = roleInfoId;
	}

	private String password_confirm;

	public String getPassword_confirm() {
		return password_confirm;
	}

	public void setPassword_confirm(String passwordConfirm) {
		password_confirm = passwordConfirm;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private List<UserInfo> list;

	public List<UserInfo> getList() {
		return list;
	}

	public void setList(List<UserInfo> list) {
		this.list = list;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4028728064401420932L;

	private UserInfoService userInfoService;

	public void setRoleInfoService(RoleInfoService roleInfoService) {
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public RoleInfo getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String login() {
		System.out.println(name + "---" + password);
		UserInfo userInfo = userInfoService.login(name, password);
		if (userInfo != null) {
			ActionContext.getContext().getSession().put("login", userInfo);
			System.out.println("userInfo.getName()" + userInfo.getName());
			session.put("messageInLogin.html", null);
			return SUCCESS;
		} else {
			session.put("messageInLogin.html", "登陆失败！");
			return ERROR;
		}
	}

	Map<String, String> map = new HashMap<String, String>();

	public String appLogin() {
		if (userInfoService.getUserByLoginId(loginId) == null) {
			try {
				map.put("result", "error:user not exists");
				JsonUtil.jsonFromMapString(map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		UserInfo userInfo = null;
		try {
			userInfo = userInfoService.appLogin(loginId, password);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			map.put("result", "exception :");
			try {
				JsonUtil.jsonFromMapString(map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (userInfo != null) {
			try {
				JsonUtil.jsonFromObject(userInfo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try {
					map.put("result", "exception :");
					JsonUtil.jsonFromMapString(map);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} else {
			try {
				map.put("result", "error:password");
				JsonUtil.jsonFromMapString(map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;

	}

	public String appUpdate() {
		UserInfo userInfo = userInfoService.getUserByLoginId(getLoginId());
		System.out.println(name+"=name");
		System.out.println(phone+"=phone");
		try {
			if (getName() != null) {
				userInfo.setName(getName());
			}
			if (getPassword() != null) {
				userInfo.setPassword(EncryptUtil.md5Crypt(getPassword()));
			}
			if (getPhone() != null) {
				userInfo.setPhone(getPhone());
			}
			userInfoService.update(userInfo);
			map.put("result", "success :");
			JsonUtil.jsonFromMapString(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("result", "exception :");
			try {
				JsonUtil.jsonFromMapString(map);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return null;
	}

	public String logout() {
		session.put("login", null);
		session.put("messageInLogin.html", "退出成功！");
		return SUCCESS;
	}

	public String loginInAjax() {

		try {
			if (userInfoService.login(name, password) != null) {
				JsonUtil.jsonFromObject("欢迎您！" + name);
			} else {
				JsonUtil
						.jsonFromObject("用户名或者密码错误，请重试！<sx:a targets='login' href='div_login.jsp'>返回</sx:a>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String findAllUsers() {
		list = userInfoService.findAllUsers();
		return SUCCESS;
	}

	public String editUserInfo() {
		if (id != null && id > 0) {
			UserInfo user = userInfoService.getUserById(id);
			name = user.getName();
			logo = user.getLogo();
			phone = user.getPhone();
			address = user.getAddress();
			roleInfoId = user.getRole();
		} else {
			name = null;
			logo = null;
			phone = null;
			address = null;
			password = null;
			roleInfoId = null;
		}
		return SUCCESS;
	}

	public String deleteByUserId() {
		userInfoService.delete(userInfoService.getUserById(id));
		return SUCCESS;
	}

	public String editUserResult() {
		try {
			UserInfo userInfo = null;
			if (id != null && id > 0) {
				userInfo = userInfoService.getUserById(id);
				userInfo.setName(name);
				userInfo.setLogo(logo);
				userInfo.setAddress(address);
				userInfo.setPhone(phone);
				userInfo.setPassword(EncryptUtil.md5Crypt(password));
				userInfoService.update(userInfo);
			} else {
				userInfo = new UserInfo();
				userInfo.setName(name);
				userInfo.setLogo(logo);
				userInfo.setAddress(address);
				userInfo.setPhone(phone);
				userInfo.setPassword(EncryptUtil.md5Crypt(password));
				userInfo.setRole(2);
				userInfoService.save(userInfo);
				if (id == -2) {
					return LOGIN;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

}
