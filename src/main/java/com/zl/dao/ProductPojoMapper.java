package com.zl.dao;

import com.zl.pojo.ProductPojo;

public interface ProductPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductPojo record);

    int insertSelective(ProductPojo record);

    ProductPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductPojo record);

    int updateByPrimaryKey(ProductPojo record);
}