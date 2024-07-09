package com.amdee.io.homeworks.homework2.advice;

import com.amdee.io.homeworks.homework2.advice.DepartmentApiResponse;
import com.amdee.io.homeworks.homework2.exception.DepartmentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<DepartmentApiResponse> handleDepartmentNotFoundException(DepartmentNotFoundException exception){
          DepartmentApiError departmentApiError = new DepartmentApiError(
                  HttpStatus.NOT_FOUND,
                  exception.getMessage(),
                  null
          );
          return new ResponseEntity<>(new DepartmentApiResponse(departmentApiError), departmentApiError.getStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<DepartmentApiResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        List<String> subErrors = exception.getBindingResult().getAllErrors()
                .stream()
                .map(error -> error.getDefaultMessage())
                .collect(Collectors.toList());

        DepartmentApiError departmentApiError = new DepartmentApiError(
                HttpStatus.BAD_REQUEST,
                "Input validation failed",
                subErrors
        );
        return new ResponseEntity<>(new DepartmentApiResponse(departmentApiError), departmentApiError.getStatus());
    }
}
