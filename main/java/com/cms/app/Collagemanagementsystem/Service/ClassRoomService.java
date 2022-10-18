package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.ClassRoomRepository;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentResponse;
import com.cms.app.Collagemanagementsystem.Service.dto.classRoomRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.classRoomResponse;
import com.cms.app.Collagemanagementsystem.entities.ClassRoomEntity;
import com.cms.app.Collagemanagementsystem.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassRoomService {

    @Autowired
    ClassRoomRepository classRoomRepository;
    public void persistClassRoom(classRoomRequest classRoomRequest) {
        List<StudentRequest> studentsRequest = classRoomRequest.getStudents();
        List<StudentEntity> studentEntities = new ArrayList<>();
        ClassRoomEntity classRoomEntity = new ClassRoomEntity();
        for (int i = 0; i < studentsRequest.size(); i++) {

            StudentRequest student = studentsRequest.get(i);
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setStudentName(student.getStudentName());
            studentEntity.setStudentId(student.getStudentId());
            studentEntity.setClassId(student.getClassId());
            studentEntity.setClassRoom(classRoomEntity);
            studentEntities.add(studentEntity);

        }
        classRoomEntity.setClassId(classRoomRequest.getClsId());
        classRoomEntity.setSection(classRoomRequest.getSection());
        classRoomEntity.setStudents(studentEntities);
        classRoomRepository.save(classRoomEntity);
    }

    public classRoomResponse getClassRoomInfo(String classId) {
        classRoomResponse classRoomResponse=new classRoomResponse();
        ClassRoomEntity entity=classRoomRepository.findById(classId).get();
        classRoomResponse.setClassId(entity.getClassId());
        classRoomResponse.setSection(entity.getSection());
        List<StudentEntity> studentEntities = entity.getStudents();
        List<StudentResponse> studentResponses = new ArrayList<>();
        for (int i = 0; i < studentEntities.size(); i++) {

            StudentEntity studentEntity = studentEntities.get(i);
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setGender(studentEntity.getGender());
            studentResponse.setStudentName(studentEntity.getStudentName());
            studentResponses.add(studentResponse);
        }

        classRoomResponse.setStudents(studentResponses);
        return classRoomResponse;
    }}
