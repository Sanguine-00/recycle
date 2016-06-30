package njci.service;

import java.util.List;

import njci.bean.UserInfo;

public interface UserInfoService {

	public UserInfo login(String name, String pwd);

	// ע��
	public Integer save(UserInfo user);

	// ��½
	public UserInfo getUserByNameAndPwd(String name, String pwd);

	public UserInfo update(UserInfo userInfo);

	public UserInfo getUserByName(String name);

	public List<UserInfo> findAllUsers();

	public UserInfo getUserById(Integer id);

	public void delete(UserInfo userInfo);

}
