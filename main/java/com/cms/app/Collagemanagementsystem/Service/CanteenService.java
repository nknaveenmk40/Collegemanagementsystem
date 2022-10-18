package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.CanteenRepository;
import com.cms.app.Collagemanagementsystem.entities.CanteenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CanteenService {
    @Autowired
    CanteenRepository canteenRepository;

    @Transactional
    public void persistCanteenEntity(CanteenEntity canteen){
        canteenRepository.save(canteen);
    }
    public CanteenEntity getCanteenInfo(String availableList){

        return canteenRepository.findById(availableList).get();
    }
}
