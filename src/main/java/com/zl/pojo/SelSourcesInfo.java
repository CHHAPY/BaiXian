package com.zl.pojo;

import java.util.List;

public class SelSourcesInfo {
	private String comName;
	private String productName;
	private String area;
	private List<Integer> mainClass;
	private int curPage;
	private int pageSize;
	
	
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public List<Integer> getMainClass() {
		return mainClass;
	}
	public void setMainClass(List<Integer> mainClass) {
		this.mainClass = mainClass;
	}
	
}
