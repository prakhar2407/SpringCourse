package org.example3;

import org.example.ConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass3.class);
        Employee employee = (Employee) ac.getBean("employee");
        employee.setName("Prakhar Bansal");
        System.out.println(employee.getName());
    }
}
