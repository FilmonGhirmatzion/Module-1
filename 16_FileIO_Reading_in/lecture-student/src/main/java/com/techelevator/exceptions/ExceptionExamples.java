package com.techelevator.exceptions;

import java.util.Locale;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int x = 0;
        int y = 0;


        try {

            x = nums[2];
            x = x + 10;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Array is out of bound ");
        } finally {
            y = 100;
        }


        System.out.println(x);
        System.out.println(y);



        String str = "abc";

        try {
            str.toUpperCase();
           Integer.parseInt(str);
        }catch (NullPointerException e){
            System.out.println("String was null ");
        } catch (NumberFormatException e){
            System.out.println(" string is not a nmber");
        }





        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            String userInput = input.nextLine();
            int number = 0;
            try {
                number = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
            System.out.println("you entered " + number);

        }
    }
}
