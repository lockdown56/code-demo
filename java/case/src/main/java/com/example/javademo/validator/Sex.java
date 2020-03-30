package com.example.javademo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SexValidator.class)
@Documented
public @interface Sex {
    String message() default "{sex.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
