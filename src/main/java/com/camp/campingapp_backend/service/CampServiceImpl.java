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
    public List<Camp> getAllCampList() {
        List<Camp> campList = campRepository.findAll();
        for (int i = 1; i < campList.size(); i++) {

            System.out.println("Service camp facltNm: " + campList.get(i));
        }
        return campList;
    }

    @Override
    public List<Camp> getDoNmCampList(String DoNm) {
        List<Camp> campList = campRepository.findByDoNm(DoNm);
        for (int i = 1; i < campList.size(); i++) {
            System.out.println("Service camp facltNm: " + campList.get(i));
        }
        return campList;
    }

}
