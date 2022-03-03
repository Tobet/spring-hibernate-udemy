package com.luv2code.springdemo;

public class FootballCoach implements Coach {

    private final FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Score a goal!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
