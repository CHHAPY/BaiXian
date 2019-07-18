package com.zl.controller;


import com.zl.pojo.FenYe;
import com.zl.pojo.ShopType;
import com.zl.service.ShopTypeService;

import groovyjarjarasm.asm.commons.Method;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class ShopController {

    @Resource
    private ShopTypeService shopTypeService;

//    @GetMapping("/gotoshop")
    @RequestMapping(value="/gotoshop",method=RequestMethod.GET)
    public String goToShop(Model model, FenYe fy) {
//    	System.out.println("---------------"+fy+"--------------");
//          查询出所有的采购清单;
        List<ShopType> shopTypes = shopTypeService.findAllShopType(fy);
        List<ShopType> allshopTypes=shopTypeService.findAllShopTypes();
        
//        System.out.println("--------shopTypes-------"+shopTypes+"--------------");
        model.addAttribute("shopTypes", shopTypes);
        model.addAttribute("allshopTypes", allshopTypes);

        return "shop";
    }

//    @GetMapping("/gotoshoptype")
    @RequestMapping(value="/gotoshoptype",method=RequestMethod.GET)
    public String goToShoptype() {
        return "shoptype";
    }

//    @PostMapping("/shoptype")
    @RequestMapping(value="/shoptype",method=RequestMethod.POST)
    public String addShopType(ShopType shopType, Model model) {
    	
    	System.out.println("=====shopType="+shopType);
        boolean flag = shopTypeService.addShopType(shopType);
        if (!flag) {
            model.addAttribute("msg", "添加失败请重新添加");
            return "redirect:/gotoshoptype";
        }
        return "redirect:/gotoshop";
    }

//   @GetMapping("/shopType/{id}")
   @RequestMapping(value="/shopType/{id}",method=RequestMethod.GET)
    public String goToShopType(@PathVariable Integer id,Model model){

      ShopType shopType= shopTypeService.findShopTypeById(id);
      model.addAttribute("shoptype",shopType);

      if(shopType.getStstate()==0){
          return "shopnow";
      }
       return "shopend";
   }
    


}
