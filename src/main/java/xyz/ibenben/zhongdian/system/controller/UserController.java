package xyz.ibenben.zhongdian.system.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.minidev.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
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
		

		
		
		model.put("msg", "添加成功");		
		return "regiester";
		
	
		
	}
	
	
	
	@RequestMapping("/login")

	public String  login( HttpServletRequest rs){
		String username = rs.getParameter("username");
		String password = rs.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		
		int checkeuser = userService.checkeuser(username, password);
		System.out.println(checkeuser);
		return "ifrme/main";
//		if(checkeuser>0)
//		{
//		return "ifrme/main";
//		}
//		else
//		{
//			return null;
//
//		}
		}
	@RequestMapping("/xujian")
	public String main() {
		ModelAndView mv=new ModelAndView("xujian");
		mv.getView();
		return "ifrme/main";
	}
	@RequestMapping("/login1")
	public String  login1( HttpServletRequest rs){
		
		System.out.println("111");
		return "zhuce";
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
