package com.amdee.io.homeworks.homework3.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "STUDENT_TBL")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "student")
    @JsonIgnore
    private AdmissionRecord admissionRecord;

    @ManyToMany
    @JoinTable(
            name = "student_professor_mapping",
            joinColumns = @JoinColumn(name = "student_professor_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_student_id")
    )
    @JsonIgnore
    private Set<Professor> professorList;

    @ManyToMany
    @JoinTable(
            name = "student_subject_mapping",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    @JsonIgnore
    private Set<Subject> subjectSet;
}
