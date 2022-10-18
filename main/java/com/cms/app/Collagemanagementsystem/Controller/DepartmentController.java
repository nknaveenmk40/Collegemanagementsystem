package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.DepartmentService;
import com.cms.app.Collagemanagementsystem.Service.dto.DepartmentRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.DepartmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @PostMapping(path = "/department",consumes = "application/json",produces = "application/json")
    public String createNewDepartment(@RequestBody DepartmentRequest departmentRequest){
        departmentService.persistDepartment(departmentRequest);
        return "Accepted";
    }

    @GetMapping(path = "/department", produces = "application/json")
   public DepartmentResponse getDepartmentInfo(@RequestParam String  departmentId) {

        return departmentService.getDepartmentInfo(departmentId);

   }
}
