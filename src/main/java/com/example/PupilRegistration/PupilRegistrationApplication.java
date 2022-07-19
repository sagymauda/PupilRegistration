package com.example.PupilRegistration;

import com.example.PupilRegistration.data.Grade;
import com.example.PupilRegistration.data.Pupil;
import com.example.PupilRegistration.repository.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class PupilRegistrationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PupilRegistrationApplication.class, args);
	}



	@Autowired
	PupilRepository pupilRepository;

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

		gradesShahaf.add(grade3);
		gradesShahaf.add(grade4);

		gradesSagi.add(grade1);
		gradesSagi.add(grade2);



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

		pupilRepository.save(sagi);
		pupilRepository.save(shahaf);
		pupilRepository.save(gal);


		List<Pupil> friendsOfSagi = new ArrayList<>();
		friendsOfSagi.add(shahaf);
		friendsOfSagi.add(gal);
		sagi.setFriends(friendsOfSagi);



		pupilRepository.save(sagi);






	}
}
