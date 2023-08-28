package com.camp.campingapp_backend.controller;

import com.camp.campingapp_backend.entity.Camp;
import com.camp.campingapp_backend.service.CampService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/camp")
@RequiredArgsConstructor
public class CampController {

    @Autowired
    private CampService campService;

    // 지역별 출력
    @GetMapping("/campList/{DoNm}")
    public List<Camp> CampDONmList(@PathVariable("DoNm") int doNm) {

        // 지역 코드
        String doName = "";
        switch(doNm){
            case 1 : doName = "강원도"; break;
            case 2 : doName = "경기도"; break;
            case 3 : doName = "경상남도"; break;
            case 4 : doName = "경상북도"; break;
            case 5 : doName = "대구시"; break;
            case 6 : doName = "서울시"; break;
            case 7 : doName = "인천시"; break;
            case 8 : doName = "전라남도"; break;
            case 9 : doName = "전라북도"; break;
            case 10 : doName = "제주도"; break;
            case 11 : doName = "충청남도"; break;
            case 12 : doName = "충청북도"; break;
            case 13 : doName = "광주시"; break;
            case 14 : doName = "세종시"; break;
            case 15 : doName = "대구시"; break;
            case 16 : doName = "대전시"; break;
            case 17 : doName = "울산시"; break;
        }
        List<Camp> campList = campService.getDoNmCampList(doName);
        return campList;
    }

    // 동물 가능
    @GetMapping("/campPetList")
    public String CampPetList() {
        List<Camp> campList = campService.getPetCampList("불");
        return campList.toString();
    }

    // 캠핑 종류별
    @GetMapping("/campIndutyList/{induty}")
    public String CampIndutyList(@PathVariable("induty")int induty) {
        String camp = "";
        switch(induty){
            case 1 : camp = "글램핑"; break;
            case 2 : camp = "일반야영장"; break;
            case 3 : camp = "자동차야영장"; break;
            case 4 : camp = "카라반"; break;
        }
        List<Camp> campList = campService.getCampListInduty(camp);
        return campList.toString();
    }

    // 캠핑 종류별 + 검색
    @GetMapping("/searchCamp/{induty}/{facltNm}")
    public String searchCamp(@PathVariable("induty")int induty,@PathVariable("facltNm")String facltNm) {
        String camp = "";
        switch(induty){
            case 1 : camp = "글램핑"; break;
            case 2 : camp = "일반야영장"; break;
            case 3 : camp = "자동차야영장"; break;
            case 4 : camp = "카라반"; break;
        }
        List<Camp> campList = campService.getCampListSearch(camp,facltNm);
        return campList.toString();
    }
    
    // 캠핑 종류별 + 지역별
    @GetMapping("/campIndSig/{induty}/{donm}/{sigunguNm}")
    public String CampIndutySigList(@PathVariable("induty")int induty, @PathVariable("donm") int donm, @PathVariable("sigunguNm")String sigunguNm) {

        String camp = "";

        switch(induty){
            case 1 : camp = "글램핑"; break;
            case 2 : camp = "일반야영장"; break;
            case 3 : camp = "자동차야영장"; break;
            case 4 : camp = "카라반"; break;
        }

        // 지역 코드
        String doName = "";
        switch(donm){
            case 1 : doName = "강원도"; break;
            case 2 : doName = "경기도"; break;
            case 3 : doName = "경상남도"; break;
            case 4 : doName = "경상북도"; break;
            case 5 : doName = "대구시"; break;
            case 6 : doName = "서울시"; break;
            case 7 : doName = "인천시"; break;
            case 8 : doName = "전라남도"; break;
            case 9 : doName = "전라북도"; break;
            case 10 : doName = "제주도"; break;
            case 11 : doName = "충청남도"; break;
            case 12 : doName = "충청북도"; break;
            case 13 : doName = "광주시"; break;
            case 14 : doName = "세종시"; break;
            case 15 : doName = "대구시"; break;
            case 16 : doName = "대전시"; break;
            case 17 : doName = "울산시"; break;
        }

        List<Camp> campList = campService.getcampListIndutyAndSig(camp,doName,sigunguNm);
        return campList.toString();
    }

    // 애완동물 가능 + 지역별 + 세부 지역별
    @GetMapping("/campPetSig/{donm}/{sigunguNm}")
//    public String CampPetSigList(@PathVariable("donm") int donm, @PathVariable("sigunguNm") int sigunguNm) {
        public ResponseEntity<List<Camp>> CampPetSigList(@PathVariable("donm") int donm, @PathVariable("sigunguNm") String sigunguNm) {

        // 지역 코드
        String doName = "";
        switch(donm){
            case 1 : doName = "강원도"; break;
            case 2 : doName = "경기도"; break;
            case 3 : doName = "경상남도"; break;
            case 4 : doName = "경상북도"; break;
            case 5 : doName = "대구시"; break;
            case 6 : doName = "서울시"; break;
            case 7 : doName = "인천시"; break;
            case 8 : doName = "전라남도"; break;
            case 9 : doName = "전라북도"; break;
            case 10 : doName = "제주도"; break;
            case 11 : doName = "충청남도"; break;
            case 12 : doName = "충청북도"; break;
            case 13 : doName = "광주시"; break;
            case 14 : doName = "세종시"; break;
            case 15 : doName = "대구시"; break;
            case 16 : doName = "대전시"; break;
            case 17 : doName = "울산시"; break;
        }

        List<Camp> campList = campService.getcampListPetAndSig("불",doName,sigunguNm);
        System.out.println("테스트 campList : "+ campList.toString());
        return  ResponseEntity.ok(campList);
//        return campList.toString();
    }

}
