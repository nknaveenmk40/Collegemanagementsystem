package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.DepartmentRepository;
import com.cms.app.Collagemanagementsystem.Service.dto.DepartmentRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.DepartmentResponse;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentResponse;
import com.cms.app.Collagemanagementsystem.entities.DepartmentEntity;
import com.cms.app.Collagemanagementsystem.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    public void persistDepartment(DepartmentRequest departmentRequest) {
        List<StudentRequest> studentsRequest = departmentRequest.getStudents();
        List<StudentEntity> studentEntities = new ArrayList<>();
        DepartmentEntity departmentEntity = new DepartmentEntity();
        for (int i = 0; i < studentsRequest.size(); i++) {

            StudentRequest student = studentsRequest.get(i);
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setStudentName(student.getStudentName());
            studentEntity.setStudentId(student.getStudentId());
            studentEntity.setClassId(student.getClassId());
            studentEntity.setDepartment(departmentEntity);
            studentEntities.add(studentEntity);
        }
        departmentEntity.setDepartmentId(departmentRequest.getDeptId());
        departmentEntity.setDepartmentName(departmentRequest.getDeptName());
        departmentEntity.setStudents(studentEntities);
        departmentRepository.save(departmentEntity);

    }

    public DepartmentResponse getDepartmentInfo(String departmentId) {
    DepartmentResponse departmentResponse = new DepartmentResponse();
    DepartmentEntity entity= departmentRepository.findById(departmentId).get();
    departmentResponse.setDeptId(entity.getDepartmentId());
        departmentResponse.setDeptName(entity.getDepartmentName());
        List<StudentEntity> studentEntities = entity.getStudents();
        List<StudentResponse> studentResponses = new ArrayList<>();
        for (int i = 0; i < studentEntities.size(); i++) {

            StudentEntity studentEntity = studentEntities.get(i);
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setGender(studentEntity.getGender());
            studentResponse.setStudentName(studentEntity.getStudentName());
            studentResponses.add(studentResponse);
        }

        departmentResponse.setStudents(studentResponses);
        return departmentResponse;
    }}