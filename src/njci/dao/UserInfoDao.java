package njci.dao;

import java.util.List;

import njci.bean.UserInfo;

public interface UserInfoDao {
	public Integer save(UserInfo user);

	public UserInfo getUserByNameAndPwd(String name, String pwd);
	
	public UserInfo getUserByLoginIdAndPwd(String loginId, String pwd);

	public UserInfo update(UserInfo userInfo);
	
	public void delete(UserInfo userInfo);

	public UserInfo getUserByName(String name);
	
	public UserInfo getUserById(Integer id);
	
	public UserInfo getUserByLoginId(String loginId);
	
	public List<UserInfo> findAllUsers();
}
