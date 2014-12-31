package com.iotu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotu.model.User;
import com.iotu.service.IUserSerivce;
import com.iotu.util.SystemConstant;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource(name="userService")
	private IUserSerivce userSerivce;
	
	@RequestMapping("/login")
	public String show(ModelMap modelMap){
		
		return "login";
	}
	
	@RequestMapping("/in")
	public String in(ModelMap modelMap,User user,HttpSession session) throws Exception{
		user = userSerivce.login(user);
		if (user != null && user.getUserId() > 0) {
			session.setAttribute(SystemConstant.LOGIN_USER, user);
			return "redirect:/blog";
		}else{
			
			modelMap.addAttribute("msg", "用户名或密码错误");
			return "login";
		}
	}
}
