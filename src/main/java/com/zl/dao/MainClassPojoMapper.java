package com.zl.dao;

import java.util.List;

import com.zl.pojo.MainClassPojo;

public interface MainClassPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MainClassPojo record);

    int insertSelective(MainClassPojo record);

    MainClassPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MainClassPojo record);

    int updateByPrimaryKey(MainClassPojo record);
    
    List<MainClassPojo> selMClass();
}