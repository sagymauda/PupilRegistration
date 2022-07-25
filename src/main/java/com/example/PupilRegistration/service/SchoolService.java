package com.example.PupilRegistration.service;


import com.example.PupilRegistration.data.School;
import com.example.PupilRegistration.repository.SchoolRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    public School createSchool(School school) {

        try {
            return schoolRepository.save(school);

        } catch (Exception e) {
            log.error("can not create school " + e.getMessage());
        }
        return null;
    }
}
