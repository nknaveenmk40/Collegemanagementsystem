package com.cms.app.Collagemanagementsystem.Service.dto;

import java.util.List;

public class classRoomRequest {
public String clsId;
public char section;
public String deptId;

List<StudentRequest> students;

    public List<StudentRequest> getStudents() {
        return students;
    }

    public void setStudents(List<StudentRequest> students) {
        this.students = students;
    }

    public String getClsId() {
        return clsId;
    }

    public void setClsId(String clsId) {
        this.clsId = clsId;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}
