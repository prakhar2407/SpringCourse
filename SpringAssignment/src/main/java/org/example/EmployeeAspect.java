package org.example;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class EmployeeAspect {

    @Before("execution(* getName())")
    public void beforeGetName(){
        System.out.println("This is before getName method--->");
    }

    @After("execution(* setName(..))")
    public void afterSetName(){
        System.out.println("This is after setName method--->");
    }

    @Around("execution(* calculateSalary(..))")
    public void aroundCalculateSalary(){
        System.out.println("Around notation for calculate salary");
    }

}
