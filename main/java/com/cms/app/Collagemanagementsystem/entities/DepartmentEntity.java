package com.cms.app.Collagemanagementsystem.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class DepartmentEntity {


    @Column(name = "department_name")
    private String departmentName;

    @Id
    @Column(name = "department_id")
    private String departmentId;

    @Column(name = "hod_name")
    private String hodName;

    @Column(name = "total_staff")
    private int totalStaff;

    @Column(name = "total_students")
    private int totalStudents;

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)

    List<StudentEntity> students;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
}
