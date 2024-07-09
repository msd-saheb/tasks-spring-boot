package com.amdee.io.homeworks.homework2.validators;

import com.amdee.io.homeworks.homework2.annoations.DepartmentBudgetValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DepartmentBudgetValidator implements ConstraintValidator<DepartmentBudgetValidation, Integer> {

    @Override
    public boolean isValid(Integer number, ConstraintValidatorContext constraintValidatorContext) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
