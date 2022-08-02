package com.example.PupilRegistration.controller;

import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.dto.PupilDto;
import com.example.PupilRegistration.service.PupilService;
import com.sun.istack.NotNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class PupilControllerImpl {

    @Autowired
    PupilService pupilService;

    @PostMapping(value = "/pupil")
    public ResponseEntity<Pupil> createPupil(@RequestBody @NotNull PupilDto pupilDto) {
        return  ResponseEntity.ok(pupilService.addPupil(pupilDto));
    }

    @PostMapping(value = "/setFriendship/{pupilA}/{pupilB}")
    public Boolean setFriendShip(Long pupilA, Long pupilB) {
       return pupilService.setFriendShip(pupilA,pupilB);

    }

    @PostMapping(value = "/enroll/{pupilId}")
    public void enrollPupil(Long pupilId) {
      //  pupilService.enrollPupil(pupilId);

    }
}
