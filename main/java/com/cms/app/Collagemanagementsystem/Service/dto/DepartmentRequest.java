package com.cms.app.Collagemanagementsystem.Service.dto;

import java.util.List;

public class DepartmentRequest {
    private String deptId;
    private String deptName;
    List<StudentRequest> students;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<StudentRequest> getStudents() {
        return students;
    }

    public void setStudents(List<StudentRequest> students) {
        this.students = students;
    }
}
