package com.zl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.ShopTypeMapper;
import com.zl.pojo.ShopType;

import java.util.Date;
import java.util.List;

@Service
public class ShopTypeService {

    @Autowired
    private ShopTypeMapper shopTypeDao;

    public List<ShopType> findAllShopType(){
      return   shopTypeDao.findAllShopType();
    }

    //添加一个采购单
    public Boolean addShopType(ShopType shopType) {
        //设置订单状态为进行中
        shopType.setStstate(0);
        // 设置订单创建时间
        Date day = new Date();
        shopType.setSttime(day);

        int type = shopTypeDao.addShopType(shopType);
        // 返回行数如果大于0表示添加成功
        if (type > 0) {
            return true;
        }
        return false;
    }

    public ShopType findShopTypeById(Integer id){

        return shopTypeDao.findShopTypeById(id);
    }
}
