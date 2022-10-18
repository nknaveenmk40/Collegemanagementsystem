package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.ClassRoomService;
import com.cms.app.Collagemanagementsystem.Service.dto.classRoomRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.classRoomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClassRoomController {

    @Autowired
    ClassRoomService classRoomService;
    @PostMapping(path = "/classroom",consumes = "application/json",produces = "application/json")
    public String createNewClassRoom(@RequestBody classRoomRequest classRoom){
        classRoomService.persistClassRoom(classRoom);
        return "accepted";
    }
    @GetMapping(path = "/classroom",produces = "application/json")
    public classRoomResponse getClassRoomInfo(@RequestParam String classId){

        return classRoomService.getClassRoomInfo(classId);
    }
}
