package com.cms.app.Collagemanagementsystem.Service.dto;

import java.util.List;

public class classRoomResponse {
    public String classId;
    public char section;

    List<StudentResponse> students;

    public List<StudentResponse> getStudents() {
        return students;
    }

    public void setStudents(List<StudentResponse> students) {
        this.students = students;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
