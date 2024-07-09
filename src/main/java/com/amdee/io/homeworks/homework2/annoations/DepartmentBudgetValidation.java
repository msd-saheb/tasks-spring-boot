package com.amdee.io.homeworks.homework2.annoations;

import com.amdee.io.homeworks.homework2.validators.DepartmentBudgetValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {DepartmentBudgetValidator.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface DepartmentBudgetValidation {

    String message() default "should be prime number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
