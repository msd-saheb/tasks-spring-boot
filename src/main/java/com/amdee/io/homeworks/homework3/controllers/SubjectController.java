package com.amdee.io.homeworks.homework3.controllers;

import com.amdee.io.homeworks.homework3.entities.Professor;
import com.amdee.io.homeworks.homework3.entities.Subject;
import com.amdee.io.homeworks.homework3.respositories.ProfessorRepository;
import com.amdee.io.homeworks.homework3.respositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subject")
public class SubjectController {

    private final SubjectRepository repository;

    @PostMapping
    public ResponseEntity<Subject> create(@RequestBody Subject subject) {
        return ResponseEntity.ok(repository.save(subject));
    }

    @GetMapping("/{subjectId}")
    public ResponseEntity<Subject> retrieve(@PathVariable Long subjectId) {
        return ResponseEntity.ok(repository.findById(subjectId).get());
    }


}
