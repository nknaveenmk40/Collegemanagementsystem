package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.StaffRepository;
import com.cms.app.Collagemanagementsystem.entities.StaffEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;
    @Transactional
    public void persistStaffEntity(StaffEntity staff){
        staffRepository.save(staff);
    }
    public StaffEntity getStaffInfo(String staffId){
        return staffRepository.findById(staffId).get();
    }
}
