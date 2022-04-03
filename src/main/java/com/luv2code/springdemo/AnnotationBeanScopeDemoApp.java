package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        // check if they are the same (are the same area of memory?)
        boolean result = (coach == coach2);

        // print out the result
        System.out.println("Pointing to the same object: " + result);

        System.out.println("Memory location for coach: " + coach);

        System.out.println("Memory location for coach2: " + coach2);

        context.close();
    }
}
