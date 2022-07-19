package com.example.PupilRegistration.controller;

import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.service.PupilService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class PupilControllerImpl implements PupilController {

    @Autowired
    PupilService pupilService;

    @Override
    public ResponseEntity<Long> createPupil(Pupil pupil) {
        return ResponseEntity.ok(pupilService.addPupil(pupil));
    }

    @Override
    public void setFriendShip(Long pupilA, Long pupilB) {
        pupilService.setFriendShip(pupilA,pupilB);

    }

    @Override
    public void enrollPupil(Long pupilId) {
      //  pupilService.enrollPupil(pupilId);

    }
}
