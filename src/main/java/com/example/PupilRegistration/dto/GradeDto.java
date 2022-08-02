package com.example.PupilRegistration.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class GradeDto implements Serializable {

    @Null
    private Long id;
    @NotNull
    private String courseName;
    @NotNull
    private int grade;
}
