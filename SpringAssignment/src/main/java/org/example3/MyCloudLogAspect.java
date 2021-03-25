package org.example3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
@Order(1)
public class MyCloudLogAspect {
    @Before("execution(* getName(..))")
    public void BeforeSetName(){
        System.out.println("Inside and Before "+this.getClass().getName());

    }

    @After("execution(* getName(..))")
    public void AfterSetName(){
        System.out.println("Inside and After "+this.getClass().getName());
    }
}
