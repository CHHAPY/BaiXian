package com.zl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.MainClassPojo;
import com.zl.pojo.ProductPojo;
import com.zl.pojo.SelPartPojo;
import com.zl.pojo.SelSourcesInfo;
import com.zl.pojo.SourceInfo;
import com.zl.service.ResourceService;

@Controller
@RequestMapping("/source")
public class ResourceController {
	@Autowired
	private ResourceService rs;
	
	@RequestMapping("/selMClass")
	@ResponseBody
	public List<MainClassPojo> selMClass(){
		return rs.selMClass();
	}
	
	@RequestMapping("/selSources")
	@ResponseBody
	public List<SourceInfo> selSources(SelSourcesInfo ssInfo){	//查询所有资源单
		return rs.selSources(ssInfo);
	}
	
	@RequestMapping("/selTotal")
	@ResponseBody
	public int selTotal(SelSourcesInfo ssInfo){	//查询所有资源单条数
		return rs.selTotal(ssInfo);
	}
	
	@RequestMapping("/showDetail")
	@ResponseBody
	public Map<String,Object> showDetail(int id,int curPage,int pageSize){
		curPage=((curPage-1)*pageSize);
		return rs.showDetail(id,curPage,pageSize);
	}
	
	@RequestMapping("/selPart")
	@ResponseBody
	public List<ProductPojo> selPart(SelPartPojo pojo){
		return rs.selPart(pojo);
	}
	
	@RequestMapping("/selPartTotal")
	@ResponseBody
	public int selPartTotal(SelPartPojo pojo){
		return rs.selPartTotal(pojo);
	}
	
	
}
