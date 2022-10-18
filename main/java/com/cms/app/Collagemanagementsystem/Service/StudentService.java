package com.cms.app.Collagemanagementsystem.Service;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.StudentResponse;
import com.cms.app.Collagemanagementsystem.entities.StudentEntity;
import com.cms.app.Collagemanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Transactional
    public void persistStudent(StudentRequest studentInfo) {
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setStudentId(studentInfo.getStudentId());
        studentEntity.setStudentName(studentInfo.getStudentName());
        studentEntity.setGender(studentInfo.getGender());
        studentEntity.setClassId(studentInfo.getClassId());
        studentEntity.setYear(studentInfo.getYear());
        studentRepository.save(studentEntity);
    }
    public StudentResponse getStudentInfo(int studentId) {
        StudentEntity studentEntity = studentRepository.findById(studentId).get();
        StudentResponse studentResponse=new StudentResponse();
        studentResponse.setStudentName(studentEntity.getStudentName());
        studentResponse.setGender(studentEntity.getGender());
        studentResponse.setClassId(studentEntity.getClassId());
        studentResponse.setYear(studentEntity.getYear());
       return studentResponse;
    }
    public StudentEntity updateStudentInfo(int studentId, StudentEntity updatedStudentInfo) {
        StudentEntity existingStudentInfo = studentRepository.findById(studentId).get();
        if (existingStudentInfo == null) {
            // tell user id is not exist
            System.out.println("user id is invalid");
        } else {
            existingStudentInfo.setStudentName(updatedStudentInfo.getStudentName());
            existingStudentInfo.setGender(updatedStudentInfo.getGender());
            studentRepository.save(existingStudentInfo);
        }
        return existingStudentInfo;
    }
    public StudentEntity deleteStudentInfo(int studentId) {
        StudentEntity existingStudentInfo = studentRepository.findById(studentId).get();
        if (existingStudentInfo == null) {
            System.out.println("user id is invalid");
        } else {
            studentRepository.delete(existingStudentInfo);
        }
        return existingStudentInfo;
    }
}