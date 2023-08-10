package com.camp.campingapp_backend.repository;

import com.camp.campingapp_backend.entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<TourEntity,Integer> {
//    @Query("select m.name from TourEntity m")
//    List<String> findNameList();

}
