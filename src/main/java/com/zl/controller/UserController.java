package com.zl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.UserPojo;
import com.zl.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping("/selTotal")
	@ResponseBody
	public int selTotal() {
		return us.selTotal();
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)//默认就是value,如果提交方式不是post就不用写value="/login"
	@ResponseBody
	public String loginUser(HttpSession session,UserPojo loginUser) {
		//System.out.println("-----------执行了controller--------");
		String result ="";
		loginUser=us.loginUser(loginUser);
		//System.out.println("-----------执行Service成功--------");
		if(loginUser!=null) {
			session.setAttribute("loginUser", loginUser);
			result="1";
		}else {
			result="0";
		}		
		return result;
	}
}
