package com.ncu.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacterConstraintValidator implements ConstraintValidator<SpecialCharacter, String> {
    @Override
    public void initialize(SpecialCharacter constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result=false;
        String inputString = value;
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(inputString);
        boolean isStringContainsSpecialCharacter = matcher.find();
        if(isStringContainsSpecialCharacter)
            result = true;
        else
            result = false;

        return result;
    }
}
