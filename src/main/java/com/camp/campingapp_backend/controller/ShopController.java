package com.camp.campingapp_backend.controller;

import com.camp.campingapp_backend.entity.ShopEntity;
import com.camp.campingapp_backend.service.ShopService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/shop")
public class ShopController {

        @Autowired
        ShopService shopService;


//    @GetMapping("/allTourList")
//    public void getAllTourList(Model model){
//        model.addAttribute("tourlist",tourService.getAllTourList());
//
//
//    }
//    @GetMapping("/tourRead")
//    public void getTour(int tourid, Model model){
//        model.addAttribute("tourRead",tourService.getTour(tourid));
//    }

        @GetMapping("/shopAllList")
        public List<ShopEntity> ShopList() {
            List<ShopEntity> shopList = shopService.getAllShopList();
            return shopList;
        }

}


