package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.ParkingRepository;
import com.cms.app.Collagemanagementsystem.entities.ParkingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingService {

    @Autowired
    ParkingRepository parkingRepository;

    @Transactional
    public void persistParkingEntity(ParkingEntity parking){
        parkingRepository.save(parking);
    }
    public ParkingEntity getParkingInfo(String slotId){
        return parkingRepository.findById(slotId).get();
    }
}
