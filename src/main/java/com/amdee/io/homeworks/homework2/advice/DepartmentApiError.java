package com.amdee.io.homeworks.homework2.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
public class DepartmentApiError {

    private HttpStatus status;
    private String message;
    private List<String> subErrors;
}
