package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.HostelService;
import com.cms.app.Collagemanagementsystem.Service.dto.HostelRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.HostelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HostelController {
    @Autowired
    HostelService hostelService;
    @PostMapping(path = "/hostel",consumes = "application/json")
    public String createNewHostel(@RequestBody HostelRequest hostelInfo){
        hostelService.persistHostel(hostelInfo);
        return "Accepted";
    }
    @GetMapping(path = "/hostel")
    public HostelResponse getHostelInfo(@RequestParam String studentId){
        return hostelService.getHostelInfo(studentId);
    }
}
