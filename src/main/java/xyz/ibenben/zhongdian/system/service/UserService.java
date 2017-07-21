package xyz.ibenben.zhongdian.system.service;

import java.util.List;

import xyz.ibenben.zhongdian.system.entity.User;

public interface UserService {
	public void saveUser(User user);
	
	public List<String> getusername(String name);
	
	
	public int Update(String name);
}
