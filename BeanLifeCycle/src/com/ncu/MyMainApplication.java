package com.ncu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("We are in the Main Class");
        Coach tCoach = (Coach) context.getBean("tennisCoach");
        System.out.println(tCoach.getDailyWorkout());
        ((ClassPathXmlApplicationContext)context).close();
    }
}
