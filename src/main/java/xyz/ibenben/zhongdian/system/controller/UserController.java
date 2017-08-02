package xyz.ibenben.zhongdian.system.controller;

import java.util.List;
import java.util.Map;

import net.minidev.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xyz.ibenben.zhongdian.system.dao.UserDao;
import xyz.ibenben.zhongdian.system.entity.User;
import xyz.ibenben.zhongdian.system.service.UserService;

@Controller
@RequestMapping("/system/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired


	@RequestMapping("/regiester")
	public String regiester1(Map<String, Object> model){
		
//		User user = new User();
//		user.setUsername("xujian");
//		user.setPassword("123456");
//		user.setState(0);
////		List<User> selectByusername = userDao.selectByusername("xujian");
////		for (User user2 : selectByusername) {
////			 if (user2.getUsername().equals(user.getUsername()))
////			{
////				model.put("msg", "插入失败用户名已经存在");	
////				return "regiester";
////			}
////		}
////		if(model.get("msg")==null)
////		{
////			userService.saveUser(user);
////			List<User> selectByusername2 = userDao.selectByusername(user.getUsername());
////			
////			model.put("msg", "添加成功");		
////			return "regiester";
////		}
////		
//		userService.saveUser(user);
		
		
		
		model.put("msg", "添加成功");		
		return "regiester";
		
	
		
	}
	
	
	
	@RequestMapping("/login")
	public String  login(Map<String, Object> model){
		model.put("he", "123");
		return "1";
	}
	
	
	
	@RequestMapping("/regiester/{name}")
	public String regiester11(Map<String, Object> model ,@PathVariable String name){
		
		List<String> getusername = userService.getusername(name);
		
		
		model.put("msg", getusername);		
		return "regiester";
		
	
		
	}
	@RequestMapping("/update/{name}")
	public String update(Map<String, Object> model ,@PathVariable String name){
		
		int update = userService.Update(name);
		
		
		model.put("msg", update+"个已经被更新");		
		return "regiester";
		
	
		
	}
	
	
	
}
