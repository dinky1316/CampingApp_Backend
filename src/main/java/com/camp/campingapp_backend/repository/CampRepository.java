package com.camp.campingapp_backend.repository;

import com.camp.campingapp_backend.dto.CampDto;
import com.camp.campingapp_backend.entity.Camp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampRepository extends JpaRepository<Camp, Integer> {

    List<Camp> findByDoNm(String DoNm);

    List<Camp> findByAnimalNotContains(String animal);

    List<Camp> findByIndutyContains(String induty);

    // 종류 + 검색
    List<Camp> findByIndutyContainsAndFacltNmContains(String induty, String facltNm);

    // 종류별 + 지역
    List<Camp> findByIndutyContainsAndDoNmAndSigunguNm(String induty,String donm, String sigunguNm);

    // 동물가능 + 지역
    List<Camp> findByAnimalNotContainsAndDoNmAndSigunguNm(String animal,String donm, String sigunguNm);
}
