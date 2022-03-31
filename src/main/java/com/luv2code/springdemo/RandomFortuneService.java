package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
      "Test 1",
      "Test 2",
      "Test 3"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {

        // pick random string from the array
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
