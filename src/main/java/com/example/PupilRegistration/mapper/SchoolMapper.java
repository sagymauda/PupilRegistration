package com.example.PupilRegistration.mapper;

import com.example.PupilRegistration.data.School;
import com.example.PupilRegistration.dto.SchoolDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolMapper {

    @Autowired
    ModelMapper mapper;


    public School pupilDtoToPupil(SchoolDto schoolDto) {
       return mapper.map(schoolDto,School.class);
    }
}

