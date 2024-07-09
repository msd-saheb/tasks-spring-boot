package com.amdee.io.homeworks.homework2.repository;

import com.amdee.io.homeworks.homework2.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
