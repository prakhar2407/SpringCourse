package com.ncu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = (A) context.getBean("a_Class");
        B b = (B) context.getBean("b2_Class");
        System.out.println(b.getCObject().name);
        System.out.println(a.getBObject().getCObject().name);
    }



}
