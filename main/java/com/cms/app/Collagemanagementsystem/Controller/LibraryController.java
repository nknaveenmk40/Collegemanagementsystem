package com.cms.app.Collagemanagementsystem.Controller;

import com.cms.app.Collagemanagementsystem.Service.LibraryService;
import com.cms.app.Collagemanagementsystem.entities.LibraryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {

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
}
