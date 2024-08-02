package com.amdee.io.homeworks.homework3.respositories;

import com.amdee.io.homeworks.homework3.entities.Professor;
import com.amdee.io.homeworks.homework3.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
