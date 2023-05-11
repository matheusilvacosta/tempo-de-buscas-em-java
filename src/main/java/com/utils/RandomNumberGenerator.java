package com.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumberGenerator {

    private final ArrayList<Long> numbers;
    private final Long quantityOfNumbers;
    private Long chosenNumber;
    private Long chosenRoot;

    public RandomNumberGenerator(long quantityOfNumbers) {
        this.numbers = new ArrayList<>();
        this.quantityOfNumbers = quantityOfNumbers;
        generateRandomNumbers();
        drawnNumber();
        drawnRoot();
    }

    private void generateRandomNumbers() {
        for (long i = 1; i <= quantityOfNumbers; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
    }

    public ArrayList<Long> getNumbers() {
        return numbers;
    }
    
    private void drawnNumber(){
        Random random = new Random();
        chosenNumber = random.nextLong(quantityOfNumbers) + 1;
    }
    
    private void drawnRoot(){
        Random random = new Random();
        chosenRoot = random.nextLong(quantityOfNumbers) + 1;
    }
    
    public Long getChosenNumber(){
        return chosenNumber;
    }
    
    public Long getChosenRoot(){
        return chosenRoot;
    }

}
