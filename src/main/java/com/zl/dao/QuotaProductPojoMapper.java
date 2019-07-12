package com.zl.dao;

import com.zl.pojo.QuotaProductPojo;

public interface QuotaProductPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuotaProductPojo record);

    int insertSelective(QuotaProductPojo record);

    QuotaProductPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuotaProductPojo record);

    int updateByPrimaryKey(QuotaProductPojo record);
}