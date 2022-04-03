package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
// @Scope("prototype")
// -> this is the bean id | if we don't specify bean id, class name with lower case first letter will be taken by spring
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService") // we have to specify because multiple implementations
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff");
    }

    /*
    // constructor injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    /*
    // define a setter method - setter injection
    @Autowired
    public void setFortuneService(FortuneService fService) {
        System.out.println(">> inside setFortuneService method");
        fortuneService = fService;
    }
    */

    /*
    // method injection
    @Autowired
    public void doSomeCrazyStuff(FortuneService fService) {
        System.out.println(">> inside doSomeCrazyStuff method");
        fortuneService = fService;
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
