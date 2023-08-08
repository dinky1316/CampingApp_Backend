package com.camp.campingapp_backend.controller;

import com.camp.campingapp_backend.entity.TourEntity;
import com.camp.campingapp_backend.service.TourService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Log4j2
@RestController
@RequestMapping("/camping")
public class TourController {

    @Autowired
     TourService tourService;

//    @GetMapping("/allTourList")
//    public void getAllTourList(Model model){
//        model.addAttribute("tourlist",tourService.getAllTourList());
//
//
//    }
//    @GetMapping("/tourRead")
//    public void getTour(int tourid, Model model){
//        model.addAttribute("tourRead",tourService.getTour(tourid));
//    }

    @GetMapping("/tourAllList")
    public List<TourEntity> TourList() {
        List<TourEntity> tourList = tourService.getAllTourList();
        return tourList;
    }

}
