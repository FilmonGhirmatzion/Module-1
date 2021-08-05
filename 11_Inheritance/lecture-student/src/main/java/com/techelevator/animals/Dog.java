package com.techelevator.animals;


/*
Extends keywords defines this class superclass
 */
public class Dog extends Animal {

    /*
    if superClass has a constractorn then the supercalss
    constractor msus call it usint super.
     */
    public Dog(){
        super("Dog");  // calls the construction of the subclass

    }
    /*
    can override functionality inheristd from the supercalss in the sub class
    with sub class own version fo that functionality.

    int the overrride the sub class may call the originall suppercalss version of method ising super.metho();
     */

    @Override
    public String makeSound(){
        // calls the original animal makeSound() using siper keywords

        return super.makeSound() + "Bark";

    }


}
