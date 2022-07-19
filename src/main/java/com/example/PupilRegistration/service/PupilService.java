package com.example.PupilRegistration.service;


import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.repository.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PupilService {

    @Autowired
    PupilRepository pupilRepository;

    public Long addPupil(Pupil pupil) {

       return pupilRepository.save(pupil).getId();
    }

    public void setFriendShip(Long pupilA, Long pupilB) {
        Optional<Pupil> askingFriendShipPupilA = pupilRepository.findById(pupilA);
        Optional<Pupil> receivingFriendShipRequestPupilB = pupilRepository.findById(pupilB);

        setFriendShipHelper(askingFriendShipPupilA.get(),receivingFriendShipRequestPupilB.get());


    }

    private void setFriendShipHelper(Pupil askingFriendShipPupilA, Pupil receivingFriendShipRequestPupilB) {
        if(receivingFriendShipRequestPupilB.getFriends().contains(askingFriendShipPupilA)){
            askingFriendShipPupilA.getFriends().add(receivingFriendShipRequestPupilB);
            pupilRepository.save(askingFriendShipPupilA);
        }
    }


}
