package com.example.PupilRegistration.repository;

import com.example.PupilRegistration.data.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade,Long> {
}
