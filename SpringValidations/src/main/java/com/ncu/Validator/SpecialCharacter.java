package com.ncu.Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = SpecialCharacterConstraintValidator.class)
@Target({ FIELD, ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RUNTIME)
public @interface SpecialCharacter {
    String message() default "Password must contain atleast one special character";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
