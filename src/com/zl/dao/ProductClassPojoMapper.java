package com.zl.dao;

import com.zl.pojo.ProductClassPojo;

public interface ProductClassPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductClassPojo record);

    int insertSelective(ProductClassPojo record);

    ProductClassPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductClassPojo record);

    int updateByPrimaryKey(ProductClassPojo record);
}