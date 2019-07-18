package com.zl.dao;


 import org.springframework.stereotype.Repository;

import com.zl.pojo.FenYe;
import com.zl.pojo.ShopType;

import java.util.List;


public interface ShopTypeMapper {


//  @Insert("INSERT into`shoptype` VALUES(DEFAULT,#{stname},#{stdress},#{stmodel},#{stlevel},#{stdepository},#{stprice},#{stshow},#{staddress},#{stdate},#{stuname},#{stuphone},#{stcompany},#{stypename},#{ststate},#{sttime})")
  public int addShopType(ShopType shopType);

  //    @Select("select * from shoptype")
//  @SelectProvider(type = ShopSelect.class, method = "findAllShopType")
  public List<ShopType> findAllShopType(FenYe fy);

//  @Select("select * from shoptype where stid=#{id}")
  public ShopType findShopTypeById(Integer id);

//  @Select("select * from shoptype where stypename like #{value}")
  public List<ShopType> findAllShopTypeLike(String value);

//  @SelectProvider(type = ShopSelect.class, method = "findCount")
  public int findCount(FenYe fy);

//  @Select("select * from shoptype ")
  public List<ShopType> findAllShopTypes();



}
