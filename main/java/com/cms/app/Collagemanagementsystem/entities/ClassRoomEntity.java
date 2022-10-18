package com.cms.app.Collagemanagementsystem.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "class_room")
public class ClassRoomEntity {
    @Id
    @Column(name = "classId")
    private String ClassId;

    @Column(name = "section")
    private char Section;

    @Column(name = "departmentId")
    private String DepartmentId;

    @OneToMany(mappedBy = "classRoom", cascade = CascadeType.ALL)

    List<StudentEntity> students;

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public String getClassId() {
        return ClassId;
    }

    public void setClassId(String classId) {
        ClassId = classId;
    }

    public char getSection() {
        return Section;
    }

    public void setSection(char section) {
        Section = section;
    }

    public String getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(String departmentId) {
        DepartmentId = departmentId;
    }
}
