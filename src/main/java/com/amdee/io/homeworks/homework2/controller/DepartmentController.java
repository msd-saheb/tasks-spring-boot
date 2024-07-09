package com.amdee.io.homeworks.homework2.controller;

import com.amdee.io.homeworks.homework2.model.dto.DepartmentDto;
import com.amdee.io.homeworks.homework2.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.coyote.Response;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAllDepartments() {
        List<DepartmentDto> departmentDto = departmentService.getAllDeparments();
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody @Valid DepartmentDto departmentDto) {
        DepartmentDto savedDepartment = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable(name = "departmentId") Long departmentId) {
        DepartmentDto departmentDto = departmentService.getDeparmentById(departmentId);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }

    @PutMapping("/{departmentId}")
    public ResponseEntity<DepartmentDto> updateDepartment(@PathVariable(name = "departmentId") Long departmentId,@Valid  @RequestBody
    DepartmentDto departmentDto) {
        DepartmentDto updatedDeparmentDto = departmentService.updateDeparmentById(departmentId, departmentDto);
        return new ResponseEntity<>(updatedDeparmentDto, HttpStatus.OK);
    }

    @DeleteMapping("/{departmentId}")
    public ResponseEntity<Boolean> deleteDepartmentById(@PathVariable(name = "departmentId") Long departmentId) {
        return new ResponseEntity<>(departmentService.deleteDeparmentById(departmentId),HttpStatus.NO_CONTENT);
    }
}
