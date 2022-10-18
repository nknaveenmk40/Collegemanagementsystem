/*package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CollegeManagementServices {

    //*******Student controller******
    @Autowired
    /*StudentRepository studentRepository;
    @PostMapping(path = "/student", consumes = "application/json")
    public String createNewStudent(@RequestBody StudentEntity student){
        studentRepository.save(student);
        return "Accepted";
    }*/
    /*StudentService studentService;
    @PostMapping(path = "/student", consumes = "application/json")
    public String createNewStudent(@RequestBody StudentEntity student){
        studentService.persistStudent(student);
        return "Accepted";
    }
    @GetMapping(path = "/student")
    public StudentEntity getStudentInfo(@RequestParam int studentId){

        return studentService.getStudentInfo(studentId);
    }
    @PutMapping(path = "/student", consumes = "application/json")
    public StudentEntity updateStudentInfo(@RequestParam int id, @RequestBody StudentEntity student) {
        return studentService.updateStudentInfo(id, student);
    }

    @DeleteMapping(path = "/student")
    public StudentEntity deleteStudentInfo(@RequestParam int id) {
        return studentService.deleteStudentInfo(id);
    }


    //*******Department controller******
    @Autowired
    DepartmentService departmentService;
    @PostMapping(path = "/department",consumes = "application/json")
    public String createNewDepartment(@RequestBody DepartmentEntity department){
        departmentService.persistDepartmentEntity(department);
        return "Accepted";
    }

    @GetMapping(path = "/department")
    public DepartmentEntity getDepartmentInfo(@RequestParam String  departmentId){

        return departmentService.getDepartmentInfo(departmentId);
    }
    //******Hostel controller*****

    @Autowired
    HostelService hostelService;
    @PostMapping(path = "/hostel",consumes = "application/json")
    public String createNewHostel(@RequestBody HostelEntity hostel){
        hostelService.persistHostelEntity(hostel);
        return "Accepted";
    }
    @GetMapping(path = "/hostel")
    public HostelEntity getHostelInfo(@RequestParam String studentId){
        return hostelService.getHostelInfo(studentId);
    }

    //******Classroom controller*****
    @Autowired
    ClassRoomService classRoomService;
    @PostMapping(path = "/classroom",consumes = "application/json")
    public String createNewClassRoom(@RequestBody ClassRoomEntity classRoom){
        classRoomService.persistClassRoomEntity(classRoom);
        return "accepted";
    }
    @GetMapping(path = "/classroom")
    public ClassRoomEntity getClassRoomInfo(@RequestParam String classId){
        return classRoomService.getClassRoomInfo(classId);
    }
    //*******Auditorium controller*****

    @Autowired
    AuditoriumService auditoriumService;
    @PostMapping(path = "/auditorium",consumes = "application/json")
    public String createNewAuditorium(@RequestBody AuditoriumEntity auditorium){
        auditoriumService.persistAuditoriumEntity(auditorium);
        return "accepted";
    }
    @GetMapping(path = "/auditorium")
    public AuditoriumEntity getAuditoriumInfo(@RequestParam String eventList){
        return auditoriumService.getAuditoriumInfo(eventList);
    }


    //*******Canteen controller******
    @Autowired
    CanteenService canteenService;
    @PostMapping(path = "/canteen",consumes = "application/json")
    public String createNewCanteen(@RequestBody CanteenEntity canteen){
        canteenService.persistCanteenEntity(canteen);
        return "accepted";
    }
    @GetMapping(path = "/canteen")
    public CanteenEntity getCanteenInfo(@RequestParam String availableList){
        return canteenService.getCanteenInfo(availableList);
    }


    //*******Parking controller******
    @Autowired
    ParkingService parkingService;
    @PostMapping(path = "/parking",consumes = "application/json")
    public String createNewParking(@RequestBody ParkingEntity parking){
        parkingService.persistParkingEntity(parking);
        return "accepted";
    }
    @GetMapping(path = "/parking")
    public ParkingEntity getParkingInfo(@RequestParam String parking){
        return parkingService.getParkingInfo(parking);
    }


    //*******Library controller******
    @Autowired
    LibraryService libraryService;
    @PostMapping(path = "/library",consumes = "application/json")
    public String createNewLibrary(@RequestBody LibraryEntity library){
        libraryService.persistLibraryEntity(library);
        return "accepted";
    }
    @GetMapping(path = "/library")
    public LibraryEntity getLibraryInfo(@RequestParam String library){
        return libraryService.getLibraryInfo(library);
    }



    //*******Bus controller******
    @Autowired
    BusService busService;
    @PostMapping(path = "/bus",consumes = "application/json")
    public String createNewBus(@RequestBody BusEntity bus){
        busService.persistBusEntity(bus);
        return "accepted";
    }
    @GetMapping(path = "/bus")
    public BusEntity getBusInfo(@RequestParam String bus){
        return busService.getBusInfo(bus);
    }


    //*******Staff controller******
    @Autowired
    StaffService staffService;
    @PostMapping(path = "/staff",consumes = "application/json")
    public String createNewStaff(@RequestBody StaffEntity staff){
        staffService.persistStaffEntity(staff);
        return "accepted";
    }
    @GetMapping(path = "/staff")
    public StaffEntity getStaffInfo(@RequestParam String staff){
        return staffService.getStaffInfo(staff);
    }
}*/
