package org.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass2.class);
        X x = (X) ac.getBean("x");
        x.logic();
    }
}
