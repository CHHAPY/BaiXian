package com.zl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService uService;
	
	@RequestMapping("/selTotal")
	@ResponseBody
	public int selTotal() {
		return uService.selTotal();
	}
	
}
