package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("please inter a number: ");

		String fibInput= input.nextLine();
		int userFibInput = Integer.parseInt(fibInput);

		int fibOne = 0, fibTwo= 1;
		System.out.println(fibOne + "");

		for (int i =0; i<= userFibInput; i++){
			System.out.println(fibTwo + "");

			int nextFiboNum = fibOne + fibTwo;
			fibOne = fibTwo;
			fibTwo = nextFiboNum;

			if(fibTwo > userFibInput){
				break;
			}
		}







	}

}
