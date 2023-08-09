package com.camp.campingapp_backend.service;

import com.camp.campingapp_backend.entity.ShopEntity;
import com.camp.campingapp_backend.repository.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepo shopRepo;


    @Override
    public List<ShopEntity> getAllShopList() {
        List<ShopEntity> shopList = shopRepo.findAll();
        for (int i = 1; i < shopList.size(); i++) {

            System.out.println("Service camp facltNm: " + shopList.get(i));
        }
        return shopList;
    }

    @Override
    public ShopEntity getshop(int shopid) {
        return null;
    }
}

