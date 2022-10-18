package com.cms.app.Collagemanagementsystem.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "Auditorium")
public class AuditoriumEntity {

    @Column(name = "Auditorium_name")
    private String auditoriumName;

    @Id
    @Column(name = "event_list")
    private String eventList;

    @Column(name = "date")
    private String Date;

    @Column(name = "time")
    private String Time;

    @Column(name = "total_seats")
    private int totalSeats;

    @Column(name = "department_ID")
    private String departmentId;

    public String getAuditoriumName() {
        return auditoriumName;
    }

    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }

    public String getEventList() {
        return eventList;
    }

    public void setEventList(String eventList) {
        this.eventList = eventList;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}

