package com.zl.dao;


 import org.springframework.stereotype.Repository;

import com.zl.pojo.ShopType;

import java.util.List;


public interface ShopTypeMapper {

/**
 * 添加采购单方法
 * @param 传入一个采购单
 * @return 返回一个添加行数
 */
   public int addShopType(ShopType shopType);
   /**
    * 查询所有采购单方法
    *
    * @return 返回一个list集合
    */
   public List<ShopType> findAllShopType();
   /**
    * 查询一个采购单方法
    * @param 传入采购单id
    * @return 返回一个采购单
    */
   public ShopType findShopTypeById(Integer id);



}
