package com.techelevator;

import java.util.Scanner;

public class TempConvert {
	/*
	Step 1: get the user Input
	step 2 calculate something
	step 3 give feedback to the use
	*/

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please inter temperature: ");
		String interTem = input.nextLine();

		double temp = Double.parseDouble(interTem);
		System.out.println("is the temperature in C or F: ");
		String isTheTempCorF = input.nextLine();
		double filTem = 0;
		//System.out.println(isTheTempCorF);
		if (isTheTempCorF.equals("c")) {
			filTem = temp * 1.8 + 32;

			System.out.println(temp + "C is " + filTem+ "F ");

		}

			if (isTheTempCorF.equals("F")) {
				filTem = (temp - 32) / 1.8;
				System.out.println(temp + "F is " + filTem + "C");
			}
		}






//		double interedTemprature = Double.parseDouble(tempAm);
//
//		double temperatureInC = interedTemprature * 1.8 +32;
//		System.out.println("The temperature in fahrenheit: "+ temperatureInC  );


				//Tf = Tc * 1.8 + 32

      /*
      1. Create a scanner for system in
      2, Asj tht user the temp
      3, get the user in put of the temp
      4 convert the temp to  a number type
      5, ask the user if the temperature they entered i the C to F;
      6, If the user answers C then convert the temperature to F
      7, IF teh user  answers F convert the temperature to C
      8 display the orginal temp and teh converted
       */
	}


