package com.camp.campingapp_backend.service;
import com.camp.campingapp_backend.entity.TourEntity;

import java.util.List;


public interface TourService {




    public List<TourEntity> getAllTourList();
    public TourEntity getTour(int tourid);



}