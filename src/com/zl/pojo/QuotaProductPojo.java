package com.zl.pojo;

public class QuotaProductPojo {
    private Integer id;

    private String quotationid;

    private Integer productid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuotationid() {
        return quotationid;
    }

    public void setQuotationid(String quotationid) {
        this.quotationid = quotationid == null ? null : quotationid.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }
}