package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass.class);
        Employee employee = (Employee) ac.getBean("employee");
        employee.setName("Prakhar Bansal");
        System.out.println(employee.getName());
        employee.calculateSalary(28);
    }
}
