package com.zl.dao;

import com.zl.pojo.PersonalPojo;

public interface PersonalPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PersonalPojo record);

    int insertSelective(PersonalPojo record);

    PersonalPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PersonalPojo record);

    int updateByPrimaryKey(PersonalPojo record);
}