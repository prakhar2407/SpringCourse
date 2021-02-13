package com.ncu.ByName;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextByName = new ClassPathXmlApplicationContext("SpringByName.xml");
        Employee emp = contextByName.getBean("employeeBean", Employee.class);
        System.out.println(emp);
    }

}
