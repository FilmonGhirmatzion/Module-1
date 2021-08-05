package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please inter the length in meter: ");
		String intLen = input.nextLine();
		double lengthT = Integer.parseInt(intLen);
		double lengthToFoot =lengthT * 3.2808399;


		System.out.println("The amount of "+lengthT +"m" +" in feet is: " +lengthToFoot );

		System.out.println("please inter the length in feet: ");
		String inFeet =input.nextLine();
		double lengthFeet = Double.parseDouble(inFeet);
		double lengthToMeter = lengthFeet * 0.3048;

		System.out.println("The amount of " + lengthFeet + "f"+ " in meter is: " + lengthToMeter );

				// m = f * 0.3048

	}

}
