package com.amdee.io.homeworks.homework3.respositories;

import com.amdee.io.homeworks.homework3.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
