package com.zl.dao;

import com.zl.pojo.SourceProductPojo;

public interface SourceProductPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SourceProductPojo record);

    int insertSelective(SourceProductPojo record);

    SourceProductPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SourceProductPojo record);

    int updateByPrimaryKey(SourceProductPojo record);
}