package com.cms.app.Collagemanagementsystem.Service;

import com.cms.app.Collagemanagementsystem.Repository.LibraryRepository;
import com.cms.app.Collagemanagementsystem.entities.LibraryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository libraryRepository;
    @Transactional
    public void persistLibraryEntity (LibraryEntity library){
        libraryRepository.save(library);
    }
    public LibraryEntity getLibraryInfo(String libraryId){
        return libraryRepository.findById(libraryId).get();
    }

}
