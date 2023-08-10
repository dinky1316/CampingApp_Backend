package com.camp.campingapp_backend.repository;

import com.camp.campingapp_backend.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<ShopEntity,Integer> {
}
