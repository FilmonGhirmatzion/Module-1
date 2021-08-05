package com.techelevator.animals;

import com.techelevator.calculator.ScientificCalculator;

public class Animal  {
    private String name;

    public Animal(){

    }

    public Animal(String name) {
        this.name= name;
    }


    public  String  makeSound(){
        return  "The " +name + "says";

    }

    public String getName() {
        return this.name;
    }
}
