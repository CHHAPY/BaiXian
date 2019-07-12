package com.zl.dao;

import com.zl.pojo.CompanyPojo;

public interface CompanyPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyPojo record);

    int insertSelective(CompanyPojo record);

    CompanyPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyPojo record);

    int updateByPrimaryKey(CompanyPojo record);
}