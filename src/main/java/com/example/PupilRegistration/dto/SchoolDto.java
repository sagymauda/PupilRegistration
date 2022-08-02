package com.example.PupilRegistration.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class SchoolDto implements Serializable {

    @Null
    private Long id;

    @NotNull
    private double lat;
    @NotNull
    private double lon;
    @NotNull
    private int minimumGpa;
    @NotNull
    private int maxNumberOfPupils;

}
