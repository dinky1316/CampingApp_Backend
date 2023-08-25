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

    public List<Camp> getDoNmCampList(String DoNm);

    public List<Camp> getPetCampList(String Pet);

    public List<Camp> getCampListInduty(String induty);

    public List<Camp> getCampListSearch(String induty, String facltNm);

    public List<Camp> getcampListIndutyAndSig(String induty, String sigunguNm);

    public List<Camp> getcampListPetAndSig(String animal, String sigunguNm);

}
