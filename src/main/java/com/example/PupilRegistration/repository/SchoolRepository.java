package com.example.PupilRegistration.repository;

import com.example.PupilRegistration.data.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School,Long> {
}
