package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.AuditoriumService;
import com.cms.app.Collagemanagementsystem.entities.AuditoriumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuditoriumController {

    @Autowired
    AuditoriumService auditoriumService;
    @PostMapping(path = "/auditorium",consumes = "application/json")
    public String createNewAuditorium(@RequestBody AuditoriumEntity auditorium){
        auditoriumService.persistAuditoriumEntity(auditorium);
        return "accepted";
    }
    @GetMapping(path = "/auditorium")
    public AuditoriumEntity getAuditoriumInfo(@RequestParam String eventList){
        return auditoriumService.getAuditoriumInfo(eventList);
    }
}
