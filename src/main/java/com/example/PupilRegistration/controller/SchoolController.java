package com.example.PupilRegistration.controller;


import com.example.PupilRegistration.data.School;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public interface SchoolController {

    @PostMapping(value = "/school")
    ResponseEntity<Long> createSchool(@RequestBody School school);
}
