package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {
	
		System.out.println("************************************");
		System.out.println("****** CREATING OBJECT ******");
		System.out.println("************************************");

		String stringObject = new String("Hello World");
		LegoPerson personOne =new LegoPerson("carpenter", "blue", true);
		LegoPerson personTwo = new LegoPerson("programer", "red", false);

		String clothingColor = "orange";
		LegoPerson personThree = new LegoPerson("wears orange clothing" , clothingColor, false);

		int x = 10;
        double[] numbers= {1.25, 2, 55.6};
        boolean trueOrFalse = false;

        double[] numbers2 = numbers;

        numbers[1]=10;

        String name = "John Fulton";
        String name2= name.toUpperCase();


        LegoPerson nullPerson=  null;
        String nulllStr= null;
        nulllStr="test";
        double zero =0;



		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();


		String hello1= new String("hello");
		String hello2= new String("hello");
		String hello3= hello1;

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		//String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** STRING MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		String bootCamp= "Tech Elevator";

		System.out.println(bootCamp.length());
		System.out.println(bootCamp.charAt(5));

		for (int i= 0; i< bootCamp.length(); i++){
			System.out.println(bootCamp.charAt(i));
		}
         // .substring ( starting Index (inclusive), ending(exclusive))
		System.out.println(bootCamp.substring(8,11));
		// it returnes all after character 8
		System.out.println(bootCamp.substring(8));


		// returns true or false is a another string is part of the string
		if( bootCamp.contains("Elev")){

			System.out.println("contains Elev");
		}else {
			System.out.println("Does not contain Elev");
		}
         // indext of the
		System.out.println(bootCamp.indexOf("Elev"));
		// -1 if the string doesn't exist
		System.out.println(bootCamp.indexOf("doesn'tExist"));

		String bootcampWithReplace= bootCamp.replace("Elve", "---");


		String[]spliString = bootCamp.split("");
		String[] spliOnE = bootCamp.split("e");

		String c =String.valueOf('c');

		String countDown = String.join("-->" , "Five", "Three", "Two", "One");
		System.out.println(countDown);

		//
		char[] awesome= {'A', 'W', 'e', 'O'};
		String awsomeString =new String(awesome);
		System.out.println(awsomeString);




		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		

	}
}
