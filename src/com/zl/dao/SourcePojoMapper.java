package com.zl.dao;

import com.zl.pojo.SourcePojo;

public interface SourcePojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SourcePojo record);

    int insertSelective(SourcePojo record);

    SourcePojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SourcePojo record);

    int updateByPrimaryKeyWithBLOBs(SourcePojo record);

    int updateByPrimaryKey(SourcePojo record);
}