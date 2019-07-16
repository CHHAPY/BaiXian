package com.zl.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.dao.ProductClassPojoMapper;
import com.zl.pojo.ProductClassPojo;
import com.zl.pojo.ProductPojo;
import com.zl.service.ResourceService;

@Controller
public class ResourceController {

	@Autowired
	 ResourceService rs;
	
	@RequestMapping("/selProc")
	@ResponseBody
	public List<ProductClassPojo> selectProc() {
		return rs.selectProc();
	}
	
	@RequestMapping("/addPro")
	@ResponseBody
	public int addPro(ProductPojo pro,String explains){
		Date date=rs.addSource(explains);
		return rs.addPro(pro,date);
		
	}
	
}
