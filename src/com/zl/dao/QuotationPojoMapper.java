package com.zl.dao;

import com.zl.pojo.QuotationPojo;

public interface QuotationPojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuotationPojo record);

    int insertSelective(QuotationPojo record);

    QuotationPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuotationPojo record);

    int updateByPrimaryKey(QuotationPojo record);
}