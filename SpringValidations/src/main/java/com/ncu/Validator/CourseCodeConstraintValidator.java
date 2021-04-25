package com.ncu.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    String[] codePrefix;
    public void initialize(CourseCode constraint) {
        codePrefix = constraint.value();
    }

    public boolean isValid(String obj, ConstraintValidatorContext context) {



        boolean result=false;
        if(obj!=null) {
            for(String tempPrefix : codePrefix) {
                result=obj.startsWith(tempPrefix);
                if(result) {
                    break;
                }
            }
        }
        else {
            result=true;
        }

        return result;
    }

}
