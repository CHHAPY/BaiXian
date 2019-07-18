package com.zl.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PurchasePojo {
    private Integer id;
//采购单号生成规则：cg+年月日时分秒毫秒
    private String purchaseid;
//    采购单名称
    private String pucname;
//采购物品
    private String products;
//产地要求
    private String area;
//规格型号
    private String type;
//级别要求
    private String rank;
//仓库要求
    private String warehouse;
//    期/现货
    private Integer prostatus;
//价格要求
    private BigDecimal price;
//采购说明
    private String explains;
//付款方式
    private String paymethod;

    private Integer invoicetype;

    private String adress;

    private Date deadline;

    private String linkname;

    private String comname;

    private String linktel;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(String purchaseid) {
        this.purchaseid = purchaseid == null ? null : purchaseid.trim();
    }

    public String getPucname() {
        return pucname;
    }

    public void setPucname(String pucname) {
        this.pucname = pucname == null ? null : pucname.trim();
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products == null ? null : products.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public Integer getProstatus() {
        return prostatus;
    }

    public void setProstatus(Integer prostatus) {
        this.prostatus = prostatus;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains == null ? null : explains.trim();
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod == null ? null : paymethod.trim();
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    public String getLinktel() {
        return linktel;
    }

    public void setLinktel(String linktel) {
        this.linktel = linktel == null ? null : linktel.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}