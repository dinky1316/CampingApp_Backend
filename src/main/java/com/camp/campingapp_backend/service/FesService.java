package com.camp.campingapp_backend.service;

import com.camp.campingapp_backend.entity.FesEntity;


import java.util.List;

public interface FesService {
    public List<FesEntity> getAllFesList();
    public FesEntity getFes (int Fesid);
}


