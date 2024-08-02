package com.amdee.io.homeworks.homework3.controllers;

import com.amdee.io.homeworks.homework3.entities.Professor;
import com.amdee.io.homeworks.homework3.entities.Student;
import com.amdee.io.homeworks.homework3.entities.Subject;
import com.amdee.io.homeworks.homework3.respositories.AdmissionRecordRepository;
import com.amdee.io.homeworks.homework3.respositories.StudentRepository;
import com.amdee.io.homeworks.homework3.respositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;

    private final SubjectRepository subjectRepository;

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        return ResponseEntity.ok(studentRepository.save(student));
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> retrieve(@PathVariable Long studentId) {
        return ResponseEntity.ok(studentRepository.findById(studentId).get());
    }

    @PutMapping("/{studentId}/subject/{subjectId}")
    public ResponseEntity<Student> assignStudentToProfessor(@PathVariable Long studentId, @PathVariable Long subjectId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();

        student.getSubjectSet().add(subject);
        studentRepository.save(student);

        return ResponseEntity.ok(student);
    }

}
