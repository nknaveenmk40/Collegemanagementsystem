package com.cms.app.Collagemanagementsystem.Service.dto;

public class StudentResponse {

    private String studentName;
    private char gender;
    private int year;
    private String classId;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYear(int year) {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getClassId(String classId) {
        return this.classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
