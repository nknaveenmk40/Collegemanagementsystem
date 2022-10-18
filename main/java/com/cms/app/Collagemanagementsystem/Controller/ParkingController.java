package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.ParkingService;
import com.cms.app.Collagemanagementsystem.entities.ParkingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParkingController {

    @Autowired
    ParkingService parkingService;
    @PostMapping(path = "/parking",consumes = "application/json")
    public String createNewParking(@RequestBody ParkingEntity parking){
        parkingService.persistParkingEntity(parking);
        return "accepted";
    }
    @GetMapping(path = "/parking")
    public ParkingEntity getParkingInfo(@RequestParam String parking){
        return parkingService.getParkingInfo(parking);
    }
}
