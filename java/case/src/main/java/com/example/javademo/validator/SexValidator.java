package com.example.javademo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class SexValidator implements ConstraintValidator<Sex, String> {
    private String[] sexes = {"1", "2"};

    @Override
    public boolean isValid(String sex, ConstraintValidatorContext constraintValidatorContext) {
        constraintValidatorContext.disableDefaultConstraintViolation();
        constraintValidatorContext.buildConstraintViolationWithTemplate("不存在的性别").addConstraintViolation();
        return Arrays.asList(sexes).contains(sex);
    }
}
