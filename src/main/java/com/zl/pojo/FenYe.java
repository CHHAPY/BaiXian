package com.zl.pojo;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.management.Query;

@Component
@Scope("prototype")
public class FenYe {
    // 当前请求的页码
    private Integer page;
    // 每一页显示多少条
    private Integer rows = 5;
    // 符合要求的记录总数
    private Integer rowCount;
    // 一共分多少页
    private Integer pageCount;//
    // 开始条数
    private Integer startRow;

    //	回显条件
    private String valuelike;
    // 封装查询条件
    private String valuelikelook;


    @Override
    public String toString() {
        return "FenYe{" +
                "page=" + page +
                ", rows=" + rows +
                ", rowCount=" + rowCount +
                ", pageCount=" + pageCount +
                ", startRow=" + startRow +
                ", valuelike='" + valuelike + '\'' +
                ", valuelikelook='" + valuelikelook + '\'' +
                '}';
    }

    public String getValuelikelook() {
        return valuelikelook;
    }

    public void setValuelikelook(String valuelikelook) {
        this.valuelikelook = valuelikelook;
    }

    public String getValuelike() {
        return valuelike;
    }

    public void setValuelike(String valuelike) {
        this.valuelike = valuelike;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getStartRow() {
        startRow = (getPage() - 1) * getRows();
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }


    public Integer getPageCount() {
        if (getRowCount() % getRows() == 0) {

            pageCount = getRowCount() / getRows();
            System.out.println("===========================" + getRowCount());
        } else {
            pageCount = getRowCount() / getRows() + 1;
        }
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }


}
