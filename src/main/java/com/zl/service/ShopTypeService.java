package com.zl.service;


import com.zl.dao.ShopTypeMapper;
import com.zl.pojo.FenYe;
import com.zl.pojo.ShopType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShopTypeService {

    @Autowired
    private ShopTypeMapper shopTypeMapper;

    //根据分页查询条件查询所有购物单
    public List<ShopType> findAllShopType(FenYe fy) {
        fy.setRowCount(shopTypeMapper.findCount(fy));

        // 逻辑校验如果是第一次访问，吧page设定为1
        if (fy.getPage() == null || "".equals(fy.getPage()) || fy.getPage() < 1) {
            fy.setPage(1);
        }

        if (fy.getPage() >= fy.getPageCount() && fy.getPageCount() > 0) {
            fy.setPage(fy.getPageCount());
        }


        return shopTypeMapper.findAllShopType(fy);
    }

    //查询所有的购物单用于回显
    public List<ShopType> findAllShopTypes() {
        return shopTypeMapper.findAllShopTypes();
    }

    //添加一个采购单
    public Boolean addShopType(ShopType shopType) {
        //设置订单状态为进行中
        shopType.setStstate(0);
        // 设置订单创建时间
        Date day = new Date();
        shopType.setSttime(day);

        int type = shopTypeMapper.addShopType(shopType);
        // 返回行数如果大于0表示添加成功
        if (type > 0) {
            return true;
        }
        return false;
    }

    public ShopType findShopTypeById(Integer id) {

        return shopTypeMapper.findShopTypeById(id);
    }

    public List<ShopType> findAllShopTypeLike(String value) {
      
        return shopTypeMapper.findAllShopTypeLike(value);
    }
}
