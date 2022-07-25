package com.example.PupilRegistration.service;


import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.repository.PupilRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class PupilService {

    @Autowired
    PupilRepository pupilRepository;

    public Pupil addPupil(Pupil pupil) throws Exception {
        try {
            return pupilRepository.save(pupil);
        } catch (Exception e) {
            log.error("cannot save the pupil" + e.getMessage());
        }
        return null;
    }

    public Boolean setFriendShip(Long pupilA, Long pupilB) throws Exception {
        Optional<Pupil> askingPupil = pupilRepository.findById(pupilA);
        Optional<Pupil> receivePupil = pupilRepository.findById(pupilB);

        if (setFriendShipHelper(askingPupil.orElseThrow(Exception::new), receivePupil.orElseThrow(Exception::new))) {
            return true;
        }

        return false;
    }

    private Boolean setFriendShipHelper(Pupil pupilA, Pupil pupilB) {
        if (isFriend(pupilA,pupilB)) {
            pupilA.getFriends().add(pupilB);
            pupilRepository.save(pupilA);
            return true;
        }
        return false;
    }

    private Boolean isFriend(Pupil pupilA, Pupil pupilB){
        if (pupilB.getFriends().contains(pupilA)) {
            return true;
        }else{
            return false;
        }
    }
}
