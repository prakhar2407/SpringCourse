package com.ncu.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<StrongPassword, String> {
    String codePrefix;

    @Override
    public void initialize(StrongPassword constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result=false;
        char c = value.charAt(0);
        if(value!=null) {
            if (Character.isUpperCase(c)){
                result = true;
            }
        }
        else {
            result=false;
        }

        return result;
    }
}
