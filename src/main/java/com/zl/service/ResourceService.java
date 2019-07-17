package com.zl.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.zl.pojo.ProductClassPojo;
import com.zl.pojo.ProductPojo;

@Service
public interface ResourceService {
	public List<ProductClassPojo> selectProc();
	public int addPro(ProductPojo pro,Date date);
	public Date addSource(String explains,int id);
}
