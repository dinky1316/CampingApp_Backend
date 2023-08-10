package com.camp.campingapp_backend.service;

import com.camp.campingapp_backend.dto.CampDto;
import com.camp.campingapp_backend.entity.Camp;
import com.camp.campingapp_backend.repository.CampRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CampService {

    public List<Camp> getAllCampList();

    public List<Camp> getDoNmCampList(String DoNm);

//    private final CampRepository campRepository;
//    public List<Camp> getCampList(String DoNm) {
//        return campRepository.findByDoNm(DoNm);
//    }
//    public  Camp getOne() {
//        String Addr1 = "전남 담양군 봉산면 탄금길 9-26";
//        Camp camp = campRepository.findByAddr1(Addr1);
//        return  camp;
//    }


//    public Optional<Camp> getOneCamp() {
////        Camp camp = new Camp();
//        Optional<Camp> camp = campRepository.findById(4);
////        Camp camp = campRepository.findById(4);
//        return camp;
//    }

}
