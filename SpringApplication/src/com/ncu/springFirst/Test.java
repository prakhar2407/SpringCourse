package com.ncu.springFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// load the spring configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// retrieve bean from spring container
		Iworker iworker = (Iworker) context.getBean("lwork");
		ManageWorker manageWorker = new ManageWorker(iworker);
		manageWorker.manageWorker();
	}

}
