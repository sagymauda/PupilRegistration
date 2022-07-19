package com.example.PupilRegistration.service;


import com.example.PupilRegistration.data.School;
import com.example.PupilRegistration.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    public Long createSchool(School school) {

        return schoolRepository.save(school).getId();
    }
}
