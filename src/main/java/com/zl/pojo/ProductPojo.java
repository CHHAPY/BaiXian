package com.zl.pojo;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class ProductPojo {
    private Integer id;

    private String name;

    private String area;

    private String type;

    private String rank;

    private Integer count;

    private BigDecimal price;

    private String currency;

    private String warehouse;

    private Integer proStatus;

    private String remark;

    private Integer classId;
    
    private Integer sourceId;
    
    

    public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}


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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

	public Integer getProStatus() {
		return proStatus;
	}

	public void setProStatus(Integer proStatus) {
		this.proStatus = proStatus;
	}

	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "ProductPojo [id=" + id + ", name=" + name + ", area=" + area + ", type=" + type + ", rank=" + rank
				+ ", count=" + count + ", price=" + price + ", currency=" + currency + ", warehouse=" + warehouse
				+ ", proStatus=" + proStatus + ", remark=" + remark + ", classId=" + classId + ", sourceId=" + sourceId
				+ "]";
	}


    
}