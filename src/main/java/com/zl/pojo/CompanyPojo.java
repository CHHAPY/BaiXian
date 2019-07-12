package com.zl.pojo;

public class CompanyPojo {
    private Integer id;

    private String name;

    private String localtion;

    private String adress;

    private String legalpersonname;

    private String makername;

    private String makertel;

    private String makerpost;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion == null ? null : localtion.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getLegalpersonname() {
        return legalpersonname;
    }

    public void setLegalpersonname(String legalpersonname) {
        this.legalpersonname = legalpersonname == null ? null : legalpersonname.trim();
    }

    public String getMakername() {
        return makername;
    }

    public void setMakername(String makername) {
        this.makername = makername == null ? null : makername.trim();
    }

    public String getMakertel() {
        return makertel;
    }

    public void setMakertel(String makertel) {
        this.makertel = makertel == null ? null : makertel.trim();
    }

    public String getMakerpost() {
        return makerpost;
    }

    public void setMakerpost(String makerpost) {
        this.makerpost = makerpost == null ? null : makerpost.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}