package xyz.ibenben.zhongdian.system.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xyz.ibenben.zhongdian.system.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;



	
	@RequestMapping("/login")
	public ModelAndView  login( HttpServletRequest rs){
		
		Map<String, String[]> parameterMap = rs.getParameterMap();
		
		String[] strings = parameterMap.get("username");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		String username = rs.getParameter("username");
		String password = rs.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		ModelAndView ms= new ModelAndView();
		ms.setViewName("iframe/main");
		ms.addObject("username", username);
		int checkeuser = userService.checkeuser(username, password);
		System.out.println(checkeuser);
		

		return ms;
		}
	


	
	

	@RequestMapping("/loginone")

	public String loginone() {
		return "iframe/main";
	}
	
	
	@RequestMapping("/top")

	public String top() {
		return "iframe/top";
	}
	@RequestMapping("/center")

	public String center() {
		return "iframe/center";
	}
	
	@RequestMapping("/main")

	public String main() {
		return "iframe/main";
	}
	
	
	@RequestMapping("/left")

	public String left() {
		return "iframe/left";
	}
	@RequestMapping("/right")
	public String right() {
		return "iframe/right";
	}
	
	
	@RequestMapping("/login1")
	public String  login1( HttpServletRequest rs){
		
		return "zhuce";
	}
	
	
	@RequestMapping("/regiester/{name}")
	public String regiester11(Map<String, Object> model ,@PathVariable String name){
		
		List<String> getusername = userService.getusername(name);
		
		
		model.put("msg", getusername);		
		return "regiester";
		
	
		
	}
	
	
	
	
}
