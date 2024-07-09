package com.amdee.io.homeworks.homework2.annoations;

import com.amdee.io.homeworks.homework2.validators.PasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {PasswordValidator.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface PasswordValidation {

    String message() default "password is not valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
