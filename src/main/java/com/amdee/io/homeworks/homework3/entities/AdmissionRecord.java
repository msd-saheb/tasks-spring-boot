package com.amdee.io.homeworks.homework3.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ADMISSION_RECORD_TBL")
@Getter
@Setter
public class AdmissionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer fee;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;


}
