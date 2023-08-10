
package com.camp.campingapp_backend.service;

import com.camp.campingapp_backend.entity.ShopEntity;

import java.util.List;


public interface ShopService {


    public List<ShopEntity> getAllShopList();
    public ShopEntity getshop (int shopid);
}
