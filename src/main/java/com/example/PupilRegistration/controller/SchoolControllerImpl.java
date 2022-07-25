package com.example.PupilRegistration.controller;

import com.example.PupilRegistration.data.School;
import com.example.PupilRegistration.service.SchoolService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SchoolControllerImpl{

    @Autowired
    SchoolService schoolService;

    @PostMapping(value = "/school")
    public ResponseEntity<School> createSchool(School school) {
        return ResponseEntity.ok(schoolService.createSchool(school));
    }
}
