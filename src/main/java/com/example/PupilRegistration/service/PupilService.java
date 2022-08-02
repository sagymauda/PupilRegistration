package com.example.PupilRegistration.service;


import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.dto.PupilDto;
import com.example.PupilRegistration.mapper.PupilMapper;
import com.example.PupilRegistration.repository.PupilRepository;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class PupilService {

    @Autowired
    PupilMapper mapper;

    @Autowired
    PupilRepository pupilRepository;

    public Pupil addPupil(PupilDto pupilDto ){

        try {
            return pupilRepository.save(mapper.pupilDtoToPupil(pupilDto));
        } catch (Exception e) {
            log.error("Cannot save pupil : {}",e.getMessage());
        }
        return null;
    }
    @SneakyThrows
    public Boolean setFriendShip(Long pupilA, Long pupilB) {
       Optional<Pupil> askingPupil = pupilRepository.findById(pupilA);
       if(askingPupil.isEmpty()){
           throw  new Exception("the pupil is not to be found");
       }
       Optional<Pupil> receivePupil = pupilRepository.findById(pupilB);
        if(receivePupil.isEmpty()){
            throw  new Exception("the pupil is not to be found");
        }

        if (setFriendShipHelper(askingPupil.get(), receivePupil.get())) {
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
