package com.zl.service;

import java.util.List;
import java.util.Map;
import java.util.Date;

import com.zl.pojo.MainClassPojo;
import com.zl.pojo.ProductPojo;
import com.zl.pojo.SelPartPojo;
import com.zl.pojo.SelSourcesInfo;
import com.zl.pojo.SourceInfo;
import com.zl.pojo.ProductClassPojo;

public interface ResourceService {
	/**
	 * 查询所有的主类，用于用户选择检索
	 * @return
	 */
	List<MainClassPojo> selMClass();
	/**
	 * 查询所有的资源单
	 * @return
	 */
	List<SourceInfo> selSources(SelSourcesInfo ssInfo);
	int selTotal(SelSourcesInfo ssInfo);	//条数
	
	/**
	 * 查询详情，加载
	 * @param id,资源单id
	 * @return
	 */
	Map<String,Object> showDetail(int id,int curPage,int pageSize);
	/**
	 * 
	 * @param id 资源单号
	 * @param pname 产品名称
	 * @param area 产品产地
	 * @return
	 */
	List<ProductPojo> selPart(SelPartPojo pojo);
	int selPartTotal(SelPartPojo pojo);
	
	public List<ProductClassPojo> selectProc();
	public int addPro(ProductPojo pro,Date date);
	public Date addSource(String explains,int id);

}
