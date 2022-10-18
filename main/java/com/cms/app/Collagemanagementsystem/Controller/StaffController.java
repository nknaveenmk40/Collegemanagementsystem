package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.StaffService;
import com.cms.app.Collagemanagementsystem.entities.StaffEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StaffController {

    @Autowired
    StaffService staffService;
    @PostMapping(path = "/staff",consumes = "application/json")
    public String createNewStaff(@RequestBody StaffEntity staff){
        staffService.persistStaffEntity(staff);
        return "accepted";
    }
    @GetMapping(path = "/staff")
    public StaffEntity getStaffInfo(@RequestParam String staff){
        return staffService.getStaffInfo(staff);
    }
}
