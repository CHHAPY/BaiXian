package com.zl.dao;

import com.zl.pojo.PurchasePojo;

public interface PurchasePojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PurchasePojo record);

    int insertSelective(PurchasePojo record);

    PurchasePojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PurchasePojo record);

    int updateByPrimaryKey(PurchasePojo record);
}