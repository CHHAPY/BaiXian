package com.zl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.pojo.ShopType;
import com.zl.service.ShopTypeService;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/shop")
public class ShopController {

    @Resource
    private ShopTypeService shopTypeService;

    @RequestMapping("/gotoshop")
    public String goToShop(Model model) {
        //  查询出所有的采购清单
        List<ShopType> shopTypes = shopTypeService.findAllShopType();
        model.addAttribute("shopTypes", shopTypes);
        //测试传输数据
       // System.out.println("========================"+shopTypes);

        return "purchase";
    }

    @RequestMapping("/gotoshoptype")
    public String goToShoptype() {
        return "purchasePubList";
    }

    @RequestMapping("/ShopType")
    public String addShopType(ShopType shopType, Model model) {


        boolean flag = shopTypeService.addShopType(shopType);
        if (!flag) {

            model.addAttribute("msg", "添加失败请重新添加");
            return "forward:/gotoshoptype";
        }
        return "forward:/gotoshop";
    }

   @RequestMapping("/shopType/{id}")
    public String goToShopType(@PathVariable Integer id,Model model){

      ShopType shopType= shopTypeService.findShopTypeById(id);
      model.addAttribute("shoptype",shopType);

       return "purchaseDetails";
   }
    

}
