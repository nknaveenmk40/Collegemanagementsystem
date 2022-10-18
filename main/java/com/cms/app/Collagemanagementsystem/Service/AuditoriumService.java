package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.AuditoriumRepository;
import com.cms.app.Collagemanagementsystem.entities.AuditoriumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuditoriumService {

    @Autowired
    AuditoriumRepository auditoriumRepository;

    @Transactional
    public void persistAuditoriumEntity(AuditoriumEntity auditorium) {
        auditoriumRepository.save(auditorium);

    }

    public AuditoriumEntity getAuditoriumInfo(String event_list) {
        return auditoriumRepository.findById(event_list).get();

    }
}
