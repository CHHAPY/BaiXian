package com.zl.dao;

import com.zl.pojo.MainClassPojo;

public interface MainClassPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MainClassPojo record);

    int insertSelective(MainClassPojo record);

    MainClassPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MainClassPojo record);

    int updateByPrimaryKey(MainClassPojo record);
}