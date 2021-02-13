package com.ncu.ByType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext contextByType = new ClassPathXmlApplicationContext("SpringByType.xml");
        Employee emp = contextByType.getBean("employeeBean",Employee.class);
        System.out.println(emp);
    }
}
