package com.ncu.ByConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringByConstructor.xml");
        Employee emp = context.getBean("employeeBean",Employee.class);
        System.out.println(emp);
    }
}
