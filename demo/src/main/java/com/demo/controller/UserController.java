package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.demo.bean.User;
import com.demo.service.UserService;

@Controller
public class UserController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String HelloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/index")	
	public String index(Model model) {
		model.addAttribute("name","jack");
		model.addAttribute("age", 21);
		model.addAttribute("info", "我爱学习");
		return "index";		
	}
	
	@Autowired
	private UserService userService;
	@RequestMapping("/save")
	@ResponseBody
	public String save(User user) {
		userService.save(user);
		return "save success !";
	}
	
	@RequestMapping("/userList")
	public String userList(Model model) {
	    List<User> userList = userService.getUserList();
	    model.addAttribute("userList", userList);
	    return "list";
	}

}
