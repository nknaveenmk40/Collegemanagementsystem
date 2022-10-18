package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.BusRepository;
import com.cms.app.Collagemanagementsystem.entities.BusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BusService {
    @Autowired
    BusRepository busRepository;

    @Transactional
    public void persistBusEntity(BusEntity bus){
        busRepository.save(bus);
    }
    public BusEntity getBusInfo(String busId){
        return busRepository.findById(busId).get();
    }
}
