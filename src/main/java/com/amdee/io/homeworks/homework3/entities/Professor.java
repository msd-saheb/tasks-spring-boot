package com.amdee.io.homeworks.homework3.entities;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "PROFESSOR_TBL")
@Getter
@Setter
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "professor")
    private Set<Subject> subjects;


    @ManyToMany(mappedBy = "professorList" )
    private Set<Student> students;


}
