package com.example.PupilRegistration.dto;

import com.example.PupilRegistration.data.Grade;
import com.example.PupilRegistration.data.Pupil;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class PupilDto implements Serializable {

    @Null
    private Long id;

    @NotNull
    private double lat;

    @NotNull
    private double lon;

    @NotNull
    private Boolean enrolled;

    @NotNull
    private int gpa;

    @NotNull
    private String name;


    private List<Grade> grades;


    private List<Pupil> friends = new ArrayList<>();

}
