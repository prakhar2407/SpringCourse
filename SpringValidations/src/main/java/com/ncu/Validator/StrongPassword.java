package com.ncu.Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
@NotNull(message = "Cannot be null")
@Size(min=8,message = "minimun 8 characters are required")
@Documented
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target({ FIELD, ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RUNTIME)
public @interface StrongPassword {

    String message() default "Password must contain first letter capital";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
