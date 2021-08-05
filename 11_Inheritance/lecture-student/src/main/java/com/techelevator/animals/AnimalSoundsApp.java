package com.techelevator.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundsApp {

    public static void main(String[] args) {

        Animal animal =new Animal("name");

        Dog dog = new Dog();

        System.out.println(dog.getName());
        System.out.println(dog.makeSound());

        Cat cat =new Cat();

        System.out.println(cat.getName());
        System.out.println(cat.makeSound());


        Fido fido = new Fido();
        System.out.println(fido.getName());
        System.out.println(fido.makeSound());
         /*
        upcasting (widening) is when a subclass is cast to a
        superClass. onece cast, it will only have access to the
         functionaliy available from the super class
         */
        Animal dogAsAnimal = (Animal) dog;
        System.out.println(dogAsAnimal.getName());

        /*
        Casting Cat as object allows onlyc access to the methods that are
        part of objecct, however, the object in memory is stll a cat
         */

          Object catAsObject =cat;
          Object StringAsObject = new String("test");


          /*
          Downcasting (narrowing)  is castin from superclass to subclass.
          mus be explicity cas using();
           */

          Animal catThatWasAnObject = (Animal) catAsObject;
          /*
          since String cannot be the data type Animal this will
          couse a ClassCastExeption

          /*
          since String cannot be the data type animal this wil cause a Class
           */

          Animal thisIsNotAnANimal = (Animal) StringAsObject;

           List<Animal> animals = new ArrayList<animal>();
           animal.add(dog);
           animal.add(cat);
           animal.add(fido);
        System.out.println("polymorphic anmal sound ");

        for (Animal currentAnimal: animals){
            System.out.println(currentAnimal.makeSound());
        }


    }

    public Void isAnimalACat(Animal animal) {
        //variable instance dataType
        //Instanceof returns true if the object being
        // references by the variable can be cas as the given data type
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
        }
    }
}
