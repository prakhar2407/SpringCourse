package com.ncu.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	
	@After("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println( " ------  AddAcountAdvice method  Prakar Bansal  !!! ------  \n ");
	}
	
	
//	@Before("execution('')")
//	public void beforeLogging() {
//		
//	}
	
}
