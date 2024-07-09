package com.amdee.io.homeworks.homework2.model.dto;

import com.amdee.io.homeworks.homework2.annoations.DepartmentBudgetValidation;
import com.amdee.io.homeworks.homework2.annoations.PasswordValidation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Long id;

    @NotBlank(message = "Department title should not be blank")
    private String title;

    @JsonProperty("isActive")
    @AssertTrue(message = "Department should be active")
    private boolean isActive;

    @Past
    private LocalDateTime createdAt;

    @DepartmentBudgetValidation
    private Integer numberOfEmployees;

    @PasswordValidation
    private String password;
}
