package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.CanteenService;
import com.cms.app.Collagemanagementsystem.entities.CanteenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CanteenController {

    @Autowired
    CanteenService canteenService;
    @PostMapping(path = "/canteen",consumes = "application/json")
    public String createNewCanteen(@RequestBody CanteenEntity canteen){
        canteenService.persistCanteenEntity(canteen);
        return "accepted";
    }
    @GetMapping(path = "/canteen")
    public CanteenEntity getCanteenInfo(@RequestParam String availableList){
        return canteenService.getCanteenInfo(availableList);
    }
}
