package com.zl.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.MainClassPojoMapper;
import com.zl.dao.SourcePojoMapper;
import com.zl.pojo.CompanyPojo;
import com.zl.pojo.MainClassPojo;
import com.zl.pojo.ProductPojo;
import com.zl.pojo.SelPartPojo;
import com.zl.pojo.SelSourcesInfo;
import com.zl.pojo.SourceInfo;

@Service
public class ResourceServiceImpl implements ResourceService{
	@Autowired
	private MainClassPojoMapper mcmapper;
	@Autowired
	private SourcePojoMapper smapper;
	
	@Override
	public List<MainClassPojo> selMClass() {
		return mcmapper.selMClass();
	}

	@Override
	public List<SourceInfo> selSources(SelSourcesInfo ssInfo) {
		ssInfo.setCurPage((ssInfo.getCurPage()-1)*ssInfo.getPageSize());
		//1.先查询出资源单，资源说明，资源日期
		List<SourceInfo> sources = smapper.selSources(ssInfo);
		//2.再根据资源单号关联查询出公司名，大类，主营
		selOthers(sources);
		return sources;
	}
	@Override
	public int selTotal(SelSourcesInfo ssInfo) {
		return smapper.selTotal(ssInfo);
	}
	
	
	//查询资源单的公司名，大类，主营
	public void selOthers(List<SourceInfo> sources) {
		//开启单线程查询公司名字
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<sources.size();i++) {
					SourceInfo temp = sources.get(i);
					temp.setComName(smapper.selComName(temp.getId()));
				}
			}
		};
		//开启单线程查询大类集合
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0;i<sources.size();i++) {
					SourceInfo temp = sources.get(i);
					temp.setBcName(smapper.selBCName(temp.getId()));
				}
			}
		};
		//开启单线程查询主营集合
		Thread t3 = new Thread() {
			public void run() {
				for(int i=0;i<sources.size();i++) {
					SourceInfo temp = sources.get(i);
					temp.setProName(smapper.selProName(temp.getId()));
				}
			}
		};
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	@Override
	public Map<String, Object> showDetail(int id,int curPage,int pageSize) {		//查询资源单下的详情
		
		//开启两个线程,查询公司，和对应的所有的产品表,资源单说明
		Callable<List<ProductPojo>> query1 = new Callable<List<ProductPojo>>() {
			@Override
			public List<ProductPojo> call() throws Exception {
				return smapper.selProBySID(id,curPage,pageSize);
			}
		}; 
		Callable<CompanyPojo> query2 = new Callable<CompanyPojo>() {
			@Override
			public CompanyPojo call() throws Exception {
				return smapper.selCom(id);
			}
		};
		Callable<String> query3 = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return smapper.selExplains(id);
			}
		};
		FutureTask<List<ProductPojo>> query1Task = new FutureTask<>(query1);
		FutureTask<CompanyPojo> query2Task = new FutureTask<>(query2);
		FutureTask<String> query3Task = new FutureTask<>(query3);
		new Thread(query1Task).start();
		new Thread(query2Task).start();
		new Thread(query3Task).start();
		
		Map<String, Object> map = new HashMap<>();
		try {
			map.put("productList", query1Task.get());
			map.put("company", query2Task.get());
			map.put("explains", query3Task.get());
			
		}catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return map;
	}

	@Override
	public List<ProductPojo> selPart(SelPartPojo pojo) {
		pojo.setCurPage((pojo.getCurPage()-1)*pojo.getPageSize());
		return smapper.selPart(pojo);
	}

	@Override
	public int selPartTotal(SelPartPojo pojo) {
		return smapper.selPartTotal(pojo);
	}


}



















