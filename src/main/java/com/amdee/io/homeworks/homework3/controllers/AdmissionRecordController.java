package com.amdee.io.homeworks.homework3.controllers;

import com.amdee.io.homeworks.homework3.entities.AdmissionRecord;
import com.amdee.io.homeworks.homework3.entities.Professor;
import com.amdee.io.homeworks.homework3.entities.Student;
import com.amdee.io.homeworks.homework3.entities.Subject;
import com.amdee.io.homeworks.homework3.respositories.AdmissionRecordRepository;
import com.amdee.io.homeworks.homework3.respositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admission")
public class AdmissionRecordController {


    private final AdmissionRecordRepository admissionRecordRepository;

    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<AdmissionRecord> create(@RequestBody AdmissionRecord admissionRecord) {
        return ResponseEntity.ok(admissionRecordRepository.save(admissionRecord));
    }

    @GetMapping("/{admissionId}")
    public ResponseEntity<AdmissionRecord> retrieve(@PathVariable Long admissionId) {
        return ResponseEntity.ok(admissionRecordRepository.findById(admissionId).get());
    }

    @PutMapping("/{admissionId}/student/{studentId}")
    public ResponseEntity<AdmissionRecord> retrieve(@PathVariable Long admissionId, @PathVariable Long studentId) {

      AdmissionRecord admissionRecord =  admissionRecordRepository.findById(admissionId).get();
      Student student = studentRepository.findById(studentId).get();

      admissionRecord.setStudent(student);

        return ResponseEntity.ok(admissionRecordRepository.save(admissionRecord));
    }

}
