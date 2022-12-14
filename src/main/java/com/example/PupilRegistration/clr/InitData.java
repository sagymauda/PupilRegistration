package com.example.PupilRegistration.clr;

import com.example.PupilRegistration.data.Grade;
import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.repository.PupilRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData implements CommandLineRunner {

    @Autowired
    private PupilRepository pupilRepository;

    @Override
    public void run(String... args) throws Exception {

        Grade grade1 = new Grade();
        grade1.setCourseName("algebra");
        grade1.setGrade(90);
        Grade grade2 = new Grade();
        grade2.setCourseName("math");
        grade2.setGrade(45);
        Grade grade3 = new Grade();
        grade3.setCourseName("english");
        grade3.setGrade(100);
        Grade grade4 = new Grade();
        grade4.setCourseName("sicence");
        grade4.setGrade(90);
        Grade grade5 = new Grade();
        grade5.setCourseName("freecourse");
        grade5.setGrade(80);

        List<Grade> gradesSagi = new ArrayList<>();
        List<Grade> gradesShahaf = new ArrayList<>();
        List<Grade> gradesGal = new ArrayList<>();

        gradesGal.add(grade5);
        gradesShahaf.addAll(Arrays.asList(grade3,grade4));
        gradesSagi.addAll(Arrays.asList(grade1,grade2));


        Pupil sagi = new Pupil();
        sagi.setGpa(500);
        sagi.setName("sagi");
        sagi.setGrades(gradesSagi);
        Pupil shahaf = new Pupil();
        shahaf.setGpa(400);
        shahaf.setName("shahf");
        shahaf.setGrades(gradesShahaf);
        Pupil gal = new Pupil();
        gal.setName("gal");
        gal.setGpa(300);
        gal.setGrades(gradesGal);

        List<Pupil> pupils = new ArrayList<>();
        pupils.addAll(Arrays.asList(sagi, gal, shahaf));

        pupilRepository.saveAll(pupils);

        List<Pupil> friendsOfSagi = new ArrayList<>();
        friendsOfSagi.addAll(Arrays.asList(gal, shahaf));
        sagi.setFriends(friendsOfSagi);

        pupilRepository.save(sagi);
    }
}