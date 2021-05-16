package com.ncu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println("inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("inside of doMyCleanupStuff()");
    }

    // define a setter method
	/*
	@Autowired
	public void setFortuneService(com.ncu.FortuneService theFortuneService) {
		System.out.println(">> com.ncu.TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}
	*/

	/*
	@Autowired
	public com.ncu.TennisCoach(com.ncu.FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
