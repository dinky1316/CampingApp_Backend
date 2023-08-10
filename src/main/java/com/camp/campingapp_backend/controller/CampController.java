package com.camp.campingapp_backend.controller;

import com.camp.campingapp_backend.dto.CampDto;
import com.camp.campingapp_backend.entity.Camp;
import com.camp.campingapp_backend.service.CampService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/camp")
@RequiredArgsConstructor
public class CampController {


    @Autowired
    private CampService campService;

    // 전체 출력
    @GetMapping("/campAllList")
    public String CampList(Model model) {
        List<Camp> campList = campService.getAllCampList();
        System.out.println("camp facltNm: " + campList.get(4).toString());

        return campList.toString();
    }

    // 지역별 출력
    // /campList/지역코드
    @GetMapping("/campList/{DoNm}")
    public List<Camp> CampDONmList(@PathVariable("DoNm") int doNm) throws UnsupportedEncodingException {

        // 지역 코드
        String test = "";
        switch(doNm){
            case 1 : test = "강원도"; break;
            case 2 : test = "경기도"; break;
            case 3 : test = "경상남도"; break;
            case 4 : test = "경상북도"; break;
            case 5 : test = "대구시"; break;
            case 6 : test = "서울시"; break;
            case 7 : test = "인천시"; break;
            case 8 : test = "전라남도"; break;
            case 9 : test = "전라북도"; break;
            case 10 : test = "제주도"; break;
            case 11 : test = "충청남도"; break;
            case 12 : test = "충청북도"; break;
        }
        List<Camp> campList = campService.getDoNmCampList(test);
        return campList;
    }

}
