package com.zl.pojo;

public class UserPojo {
    private Integer id;

    private String name;

    private String pad;

    private String tel;

    private Integer statusFlag;

    private Integer supFlag;

    private Integer purFlag;

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

    public String getPad() {
        return pad;
    }

    public void setPad(String pad) {
        this.pad = pad == null ? null : pad.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Integer getSupFlag() {
        return supFlag;
    }

    public void setSupFlag(Integer supFlag) {
        this.supFlag = supFlag;
    }

    public Integer getPurFlag() {
        return purFlag;
    }

    public void setPurFlag(Integer purFlag) {
        this.purFlag = purFlag;
    }
}