package com.example.PupilRegistration.controller;


import com.example.PupilRegistration.data.Pupil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


public interface PupilController {

    @PostMapping(value = "/pupil")
    ResponseEntity<Long> createPupil(@RequestBody Pupil pupil);

    @PostMapping(value = "/setFriendship/{pupilA}/{pupilB}")
    void setFriendShip(@PathVariable Long pupilA, @PathVariable Long pupilB);

    @PostMapping(value = "/enroll/{pupilId}")
    void enrollPupil(@PathVariable Long pupilId);
}
