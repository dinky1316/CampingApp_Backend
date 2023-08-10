package com.camp.campingapp_backend.repository;

import com.camp.campingapp_backend.entity.FesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FesRepository extends JpaRepository<FesEntity,Integer> {
}
