package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.StudentService;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(path = "/student", consumes = "application/json")
    public String createNewStudent(@RequestBody StudentRequest studentInfo){
        studentService.persistStudent(studentInfo);
        return "Accepted";
    }
    @GetMapping(path = "/student")
    public StudentResponse getStudentInfo(@RequestParam int studentId){

        return studentService.getStudentInfo(studentId);
    }
    /*@PutMapping(path = "/student", consumes = "application/json")
    public StudentResponse updateStudentInfo(@RequestParam int id, @RequestBody StudentRequest student) {
        return studentService.updateStudentInfo(id, student);
    }

    @DeleteMapping(path = "/student")
    public StudentEntity deleteStudentInfo(@RequestParam int id) {
        return studentService.deleteStudentInfo(id);
    }*/
}
