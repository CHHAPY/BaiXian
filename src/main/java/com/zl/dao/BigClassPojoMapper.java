package com.zl.dao;

import com.zl.pojo.BigClassPojo;

public interface BigClassPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BigClassPojo record);

    int insertSelective(BigClassPojo record);

    BigClassPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BigClassPojo record);

    int updateByPrimaryKey(BigClassPojo record);
}