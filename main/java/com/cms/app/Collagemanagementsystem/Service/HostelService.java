package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.HostelRepository;
import com.cms.app.Collagemanagementsystem.Service.dto.HostelRequest;
import com.cms.app.Collagemanagementsystem.Service.dto.HostelResponse;
import com.cms.app.Collagemanagementsystem.entities.HostelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
@Service
public class HostelService {
    @Autowired
    HostelRepository hostelRepository;
    @Transactional
    public void persistHostel(HostelRequest hostelInfo) {
        HostelEntity hostelEntity=new HostelEntity();
        hostelEntity.setStudentId(hostelInfo.getStdId());
        hostelEntity.setBlockNumber(hostelInfo.getBlockNumber());
        hostelEntity.setRoomNumber(hostelInfo.getRoomNumber());
        hostelRepository.save(hostelEntity);

    }

    public HostelResponse getHostelInfo(String studentId) {
        HostelEntity hostelEntity = hostelRepository.findById(studentId).get();

        HostelResponse hostelResponse=new HostelResponse();

        hostelResponse.setBlockNumber(hostelEntity.getBlockNumber());
        hostelResponse.setRoomNumber(hostelEntity.getRoomNumber());

        return hostelResponse;

    }
}