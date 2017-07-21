package xyz.ibenben.zhongdian.system.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.ibenben.zhongdian.common.BaseDao;
import xyz.ibenben.zhongdian.system.dao.TaskDao;
import xyz.ibenben.zhongdian.system.dao.UserDao;
import xyz.ibenben.zhongdian.system.entity.Task;
import xyz.ibenben.zhongdian.system.entity.User;
import xyz.ibenben.zhongdian.system.service.UserService;


@Service
public class UserServiceImpl   implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private TaskDao taskDao;
	
	@Transactional
	public void saveUser(User user){
	
	userDao.insertSelective(user);
	userDao.selectByusername(user.getUsername());

	

	}

	
	public List<String> getusername(String name) {

		
		List<String> selectByusername1 = userDao.selectByusername1(name);
		return selectByusername1;
	}


	public int Update(String name) {
		
		int updatebyname = userDao.updatebyname(name);
		return updatebyname;
	}




}
