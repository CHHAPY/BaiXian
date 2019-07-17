package com.zl.pojo;

import java.util.Date;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SourceInfo {
	private int id;
	private String comName;
	private Set<String> bcName;
	private Set<String> proName;
	private String explains;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public Set<String> getBcName() {
		return bcName;
	}
	public void setBcName(Set<String> bcName) {
		this.bcName = bcName;
	}
	public Set<String> getProName() {
		return proName;
	}
	public void setProName(Set<String> proName) {
		this.proName = proName;
	}
	public String getExplains() {
		return explains;
	}
	public void setExplains(String explains) {
		this.explains = explains;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
