package com.amdee.io.homeworks.homework3.respositories;

import com.amdee.io.homeworks.homework3.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
