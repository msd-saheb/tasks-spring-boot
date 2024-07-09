package com.amdee.io.homeworks.homework2.service;

import com.amdee.io.homeworks.homework2.exception.DepartmentNotFoundException;
import com.amdee.io.homeworks.homework2.model.dto.DepartmentDto;
import com.amdee.io.homeworks.homework2.model.entity.Department;
import com.amdee.io.homeworks.homework2.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    private final ModelMapper mapper;

    public DepartmentDto getDeparmentById(Long departmentId) {
        return departmentRepository.findById(departmentId)
                .map(department -> mapper.map(department, DepartmentDto.class))
                .orElseThrow(()-> new DepartmentNotFoundException("Department not found for id : "+ departmentId));
    }

    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department departmentEntity = mapper.map(departmentDto, Department.class);
        departmentEntity.setCreatedAt(LocalDateTime.now());
        Department department = departmentRepository.save(departmentEntity);
        return mapper.map(department, DepartmentDto.class);
    }

    public DepartmentDto updateDeparmentById(Long departmentId, DepartmentDto departmentDto) {
        if (existById(departmentId)) {
            Department exitingDepartment = mapper.map(departmentDto, Department.class);
            exitingDepartment.setId(departmentId);
            return mapper.map(departmentRepository.save(exitingDepartment), DepartmentDto.class);
        }
        throw new DepartmentNotFoundException("Department not found for id :"+departmentId);
    }

    public List<DepartmentDto> getAllDeparments() {
        return departmentRepository.findAll()
                .stream().map(department -> mapper.map(department, DepartmentDto.class))
                .toList();

    }

    public boolean deleteDeparmentById(Long departmentId) {
        if (existById(departmentId)) {
            departmentRepository.deleteById(departmentId);
            return true;
        } else {
            throw new DepartmentNotFoundException("Department not found for id :"+departmentId);
        }
    }

    private boolean existById(Long departmentId) {
        return departmentRepository.existsById(departmentId);
    }
}
