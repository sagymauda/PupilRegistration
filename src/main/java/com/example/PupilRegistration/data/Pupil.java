package com.example.PupilRegistration.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Data
@Entity
@Table(name = "pupil")
@NoArgsConstructor
@AllArgsConstructor
public class Pupil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private double lat;
    private double lon;
    private Boolean enrolled;
    private int gpa;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pupil_id", referencedColumnName = "id")
    private List<Grade> grades;

    @OneToMany
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinTable(name="user_friends",
            joinColumns={@JoinColumn(name="pupil_id")},
            inverseJoinColumns={@JoinColumn(name="friend_id")})
    private List<Pupil> friends = new ArrayList<>();

}






