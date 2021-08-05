package com.techelevator.example;

import java.util.Scanner;

import java.util.Scanner;

public class CatPackingCalculator {

      /*
      1, take Inpute
      2, calculate date
      3, give out pu
       */
      public static void main(String[] args) {

          double avgVolumOfHouseCat =0.083;
          double estimatePackkingOpenityOfCat= 0.5;

          Scanner  input = new Scanner(System.in);
          // 1, ask the user the dimension of the container.
          System.out.print("What is the length of the container in the feet: ");
          String userLenghOfContiener= input.nextLine();
          double lengthOfContiener = Double.parseDouble(userLenghOfContiener);

          System.out.print("what is the width of the container: ");
          double widthOfContainer=input.nextDouble();
          input.nextLine();


          System.out.print("What is the height of the container in feet: ");
          String userInput = input.nextLine();
          double heightOfContainer= Double.parseDouble(userInput);


          //2 . calculate h0w many cant will in the a container with dimension

          double containerVolume = lengthOfContiener *widthOfContainer * heightOfContainer;
          double catByVolume= containerVolume/avgVolumOfHouseCat;
          double packedCats = catByVolume * estimatePackkingOpenityOfCat;

          //3, output the result to the user
         // System.out.println(packedCats);
          System.out.printf("%-15s %-15s %-15s %-25s %n",  "Height", "Width", "length", "Cats in Box");
          System.out.println("--------------------------------------------------------");
          System.out.printf(" %-14s %-14s %-14s %-6.0f %n", heightOfContainer,widthOfContainer,lengthOfContiener, packedCats);
          /*
          Height   Width   Length   Cats  in Box
          ----------------------------------------------
           10        12     15      1000
           */

    }
}
