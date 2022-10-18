package com.cms.app.Collagemanagementsystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class StudentEntity {

    @Id
    @Column(name = "Student_id")
    private int studentId;

    @Column(name = "Student_name")
    private String studentName;

    @Column(name = "Gender")
    private char gender;

    @Column(name ="Year")
    private int year;

    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    @Column(name = "Class_id")
    private String classId;

    public ClassRoomEntity getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoomEntity classRoom) {
        this.classRoom = classRoom;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private DepartmentEntity department;

    @ManyToOne(cascade = CascadeType.ALL)
    private ClassRoomEntity classRoom;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
