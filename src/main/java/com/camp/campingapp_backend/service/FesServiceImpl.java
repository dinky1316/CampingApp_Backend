package com.camp.campingapp_backend.service;

import com.camp.campingapp_backend.entity.FesEntity;
import com.camp.campingapp_backend.repository.FesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FesServiceImpl implements FesService{

    @Autowired
    private FesRepository fesRepository;


    @Override
    public List<FesEntity> getAllFesList() {
        List<FesEntity> fesList = fesRepository.findAll();
        for (int i = 1; i < fesList.size(); i++) {

            System.out.println("Service camp facltNm: " + fesList.get(i));
        }
        return fesList;
    }

    @Override
    public FesEntity getFes(int fesid) {
        return null;
    }


}

