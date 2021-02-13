package com.ncu;

public class TennisCoach implements Coach {
    TennisCoach(){
        System.out.println("=================================");
        System.out.println("Inside Tennis Coach Constructor");
        System.out.println("=================================");
    }
    private void initMethod() {
        System.out.println("Inside INIT Method");
    }

    private void destroyMethod() {
        System.out.println("Inside DESTROY Method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise Tennis for 2 hrs";
    }
}
