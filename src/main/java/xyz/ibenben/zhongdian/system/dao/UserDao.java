package xyz.ibenben.zhongdian.system.dao;


import java.util.List;

import org.apache.ibatis.annotations.Select;

import xyz.ibenben.zhongdian.common.BaseDao;
import xyz.ibenben.zhongdian.system.entity.User;

public interface UserDao extends BaseDao<User>{
	
	@Select("select * from user where state = #{state}")
	public List<User> selectByState(Integer state);
	
	@Select("select * from user where username = #{username}")
	public List<User> selectByusername(String username);
	
	@Select("select username from user where username = #{username}")
	public List<String> selectByusername1(String username);
	
	
}
