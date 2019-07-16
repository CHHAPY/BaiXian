package com.zl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.ProductClassPojoMapper;
import com.zl.dao.ProductPojoMapper;
import com.zl.dao.SourcePojoMapper;
import com.zl.pojo.ProductClassPojo;
import com.zl.pojo.ProductPojo;
import com.zl.pojo.SourcePojo;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	ProductClassPojoMapper pcm;
	
	@Autowired
	ProductPojoMapper pm;
	
	@Autowired
	SourcePojoMapper sm;
	
	@Override
	public List<ProductClassPojo> selectProc() {
		// TODO Auto-generated method stub
		List<ProductClassPojo> prcs=pcm.selectProc();
		return prcs;
	}

	@Override
	public int addPro(ProductPojo pro,Date date) {
		int sourceId=sm.selectId(date);
		pro.setSourceId(sourceId);
		return pm.insert(pro);
	}
	
	@Override
	public Date addSource(String explains) {
		SourcePojo s=new SourcePojo();
		Date date=new Date();
		s.setCreatedate(date);
		s.setComid(3);
		s.setExplains(explains);
		sm.insert(s);
		return date;
		
	}
	
}
