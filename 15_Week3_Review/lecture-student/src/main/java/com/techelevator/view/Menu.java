package com.techelevator.view;

import java.util.Scanner;

public class Menu {

    private static final Scanner in = new Scanner(System.in);

    public void showWelcome() {
        System.out.println("Welcome to the Java Blue Store");
    }

    public void showGoodbye() {
        System.out.println("Thank you for shopping the Java Blue store!");
        System.out.println("Goodbye!");
    }

    public String getChoiceFromMainMenu() {
        String choice = null;
        while (choice == null) {
            System.out.println("S) Show Items");
            System.out.println("Q) Quit");

             choice = in.nextLine();

            if (choice.equalsIgnoreCase("S") ||
                    choice.equalsIgnoreCase("Q") ) {
                break;
            } else {
                System.out.println("Invalid selection!");
                choice = null;
            }
        }
        return choice;
    }

    public String getChoiceFromItems() {

        showItems();
        String choice = null;

        while(choice == null) {
            System.out.println("A)dd Item to Cart");
            System.out.println("B)ack to main menu");

            choice = in.nextLine();

            if (choice.equalsIgnoreCase("A") ||
                    choice.equalsIgnoreCase("B") ) {
                break;
            } else {
                System.out.println("Invalid selection!");
                choice = null;
            }
        }

        return choice;

    }

    private void showItems() {
        System.out.println("Available Items:");
    }

}
