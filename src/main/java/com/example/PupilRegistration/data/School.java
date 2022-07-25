package com.example.PupilRegistration.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "schools")
@NoArgsConstructor
public class School implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private double lat;
    private double lon;
    private int minimumGpa;
    private int maxNumberOfPupils;

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public int getMinimumGpa() {
        return minimumGpa;
    }

    public int getMaxNumberOfPupils() {
        return maxNumberOfPupils;
    }
}

