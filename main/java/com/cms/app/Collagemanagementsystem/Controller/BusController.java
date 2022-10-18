package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.BusService;
import com.cms.app.Collagemanagementsystem.entities.BusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BusController {

    @Autowired
    BusService busService;
    @PostMapping(path = "/bus",consumes = "application/json")
    public String createNewBus(@RequestBody BusEntity bus){
        busService.persistBusEntity(bus);
        return "accepted";
    }
    @GetMapping(path = "/bus")
    public BusEntity getBusInfo(@RequestParam String busId){
        return busService.getBusInfo(busId);
    }
}
