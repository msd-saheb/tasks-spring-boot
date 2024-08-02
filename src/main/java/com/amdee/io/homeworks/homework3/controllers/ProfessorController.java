package com.amdee.io.homeworks.homework3.controllers;

import com.amdee.io.homeworks.homework3.entities.Professor;
import com.amdee.io.homeworks.homework3.entities.Student;
import com.amdee.io.homeworks.homework3.entities.Subject;
import com.amdee.io.homeworks.homework3.respositories.ProfessorRepository;
import com.amdee.io.homeworks.homework3.respositories.StudentRepository;
import com.amdee.io.homeworks.homework3.respositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorRepository professorRepository;

    private final SubjectRepository subjectRepository;

    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<Professor> create(@RequestBody Professor professor) {
        return ResponseEntity.ok(professorRepository.save(professor));
    }

    @GetMapping("/{professorId}")
    public ResponseEntity<Professor> retrieve(@PathVariable Long professorId) {
        return ResponseEntity.ok(professorRepository.findById(professorId).get());
    }

    @PutMapping("/{professorId}/subject/{subjectId}")
    public ResponseEntity<Subject> assignSubjectToProfessor(@PathVariable Long professorId, @PathVariable Long subjectId) {
        Professor professor = professorRepository.findById(professorId).get();
        Subject subject = subjectRepository.findById(subjectId).get();

        subject.setProfessor(professor);
        subjectRepository.save(subject);

        return ResponseEntity.ok(subject);
    }

    @PutMapping("/{professorId}/student/{studentId}")
    public ResponseEntity<Student> assignStudentToProfessor(@PathVariable Long professorId, @PathVariable Long studentId) {
        Professor professor = professorRepository.findById(professorId).get();
        Student student = studentRepository.findById(studentId).get();

        student.getProfessorList().add(professor);
           studentRepository.save(student);

        return ResponseEntity.ok(student);
    }
}
