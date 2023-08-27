package com.camp.campingapp_backend.service;

import com.camp.campingapp_backend.entity.Camp;
import com.camp.campingapp_backend.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampServiceImpl implements CampService {

    @Autowired
    private CampRepository campRepository;

    @Override
    public List<Camp> getDoNmCampList(String DoNm) {
        List<Camp> campList = campRepository.findByDoNm(DoNm);
        for (int i = 1; i < campList.size(); i++) {
            System.out.println("Service camp facltNm: " + campList.get(i));
        }
        return campList;
    }

    @Override
    public List<Camp> getPetCampList(String Pet) {
        List<Camp> campList = campRepository.findByAnimalNotContains(Pet);
        return campList;
    }

    @Override
    public List<Camp> getCampListInduty(String induty) {
        List<Camp> campList = campRepository.findByIndutyContains(induty);
        return campList;
    }

    // 캠핑장 이름 검색
    @Override
    public List<Camp> getCampListSearch(String induty, String facltNm) {
        List<Camp> camplist = campRepository.findByIndutyContainsAndFacltNmContains(induty, facltNm);
        return camplist;
    }

    @Override
    public List<Camp> getcampListIndutyAndSig(String induty,String donm, String sigunguNm) {
        List<Camp> campList = campRepository.findByIndutyContainsAndDoNmAndSigunguNm(induty,donm, sigunguNm);
        return campList;
    }

    @Override
    public List<Camp> getcampListPetAndSig(String animal,String donm, String sigunguNm) {
        List<Camp> campList = campRepository.findByAnimalNotContainsAndDoNmAndSigunguNm(animal,donm, sigunguNm);
        return campList;
    }

}
