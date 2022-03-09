package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component // -> this is the bean id | if we don't specify bean id, class name with lower case first letter will be taken by spring
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }


}
