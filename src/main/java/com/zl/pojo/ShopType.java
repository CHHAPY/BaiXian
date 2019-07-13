package com.zl.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

/*

	(`stid`,
	`stname`,
	`stdress`,
	`stmodel`,
	`stlevel`,
	`stdepository`,
	`stprice`,
	`stshow`,
	`staddress`,
	`stdate`,
	`stuname`,
	`stuphone`,
	`stcompany`,
	`stypename`

 */
//采购单模型
@Repository
public class ShopType {
    private Integer stid; //购物表单编号
    private String stname; //采购物品名称
    private String stdress; //产地要求
    private String stmodel; //规格型号
    private String stlevel; //级别要求
    private String stdepository; //仓库要求
    private Integer stprice; //价格要求
    private String stshow; //采购说明
    private String staddress; //收货地址

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stdate; //采购截止时间

    private String stuname; //联系人
    private String stuphone; //手机号
    private String stcompany; //公司名称
    private String stypename; //采购单名称
    private Integer ststate; //采购单状态 0是正在进行的采购订单 1是已经完成的采购订单

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sttime; //订单创建时间


    final String STSTATE_ZERO = "进行中";
    final String STSTATE_ONE = "以完成";

    public String getStStateName(Integer ststate) {
        if ("0".equals(ststate)) {
            return STSTATE_ZERO;
        }
        if ("1".equals(ststate)) {
            return STSTATE_ONE;
        }
        return null;
    }

    @Override
    public String toString() {
        return "ShopType{" +
                "stid=" + stid +
                ", stname='" + stname + '\'' +
                ", stdress='" + stdress + '\'' +
                ", stmodel='" + stmodel + '\'' +
                ", stlevel='" + stlevel + '\'' +
                ", stdepository='" + stdepository + '\'' +
                ", stprice=" + stprice +
                ", stshow='" + stshow + '\'' +
                ", staddress='" + staddress + '\'' +
                ", stdate=" + stdate +
                ", stuname='" + stuname + '\'' +
                ", stuphone='" + stuphone + '\'' +
                ", stcompany='" + stcompany + '\'' +
                ", stypename='" + stypename + '\'' +
                ", ststate=" + ststate +
                ", sttime=" + sttime +
                '}';
    }


    public Date getSttime() {
        return sttime;
    }

    public void setSttime(Date sttime) {
        this.sttime = sttime;
    }

    public Integer getStstate() {
        return ststate;
    }

    public void setStstate(Integer ststate) {
        this.ststate = ststate;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public String getStdress() {
        return stdress;
    }

    public void setStdress(String stdress) {
        this.stdress = stdress;
    }

    public String getStmodel() {
        return stmodel;
    }

    public void setStmodel(String stmodel) {
        this.stmodel = stmodel;
    }

    public String getStlevel() {
        return stlevel;
    }

    public void setStlevel(String stlevel) {
        this.stlevel = stlevel;
    }

    public String getStdepository() {
        return stdepository;
    }

    public void setStdepository(String stdepository) {
        this.stdepository = stdepository;
    }

    public Integer getStprice() {
        return stprice;
    }

    public void setStprice(Integer stprice) {
        this.stprice = stprice;
    }

    public String getStshow() {
        return stshow;
    }

    public void setStshow(String stshow) {
        this.stshow = stshow;
    }

    public String getStaddress() {
        return staddress;
    }

    public void setStaddress(String staddress) {
        this.staddress = staddress;
    }

    public Date getStdate() {
        return stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone;
    }

    public String getStcompany() {
        return stcompany;
    }

    public void setStcompany(String stcompany) {
        this.stcompany = stcompany;
    }

    public String getStypename() {
        return stypename;
    }

    public void setStypename(String stypename) {
        this.stypename = stypename;
    }
}
