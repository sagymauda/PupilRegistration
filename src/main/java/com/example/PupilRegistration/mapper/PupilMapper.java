package com.example.PupilRegistration.mapper;


import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.dto.PupilDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PupilMapper {

    @Autowired
    private ModelMapper mapper;

    public Pupil pupilDtoToPupil(PupilDto pupilDto) {

        return mapper.map(pupilDto, Pupil.class);
    }
}
