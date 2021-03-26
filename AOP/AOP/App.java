package com.ncu.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
	
		AccountDao accountDaoobj = context.getBean("accountdao",AccountDao.class);
	       
		accountDaoobj.addAccount();
		
	       System.out.println("\n call it again!!! ");
	
	       accountDaoobj.addAccount();
	       
	       context.close();
	       
	}
	
	
}
