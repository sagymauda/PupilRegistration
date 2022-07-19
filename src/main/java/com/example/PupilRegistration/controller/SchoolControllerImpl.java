package com.example.PupilRegistration.controller;

import com.example.PupilRegistration.data.School;
import com.example.PupilRegistration.service.SchoolService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SchoolControllerImpl implements  SchoolController{

    @Autowired
    SchoolService schoolService;

    @Override
    public ResponseEntity<Long> createSchool(School school) {
        return ResponseEntity.ok(schoolService.createSchool(school));
    }
}
