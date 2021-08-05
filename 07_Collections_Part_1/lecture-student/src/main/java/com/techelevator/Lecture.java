package com.techelevator;

import java.util.*;


public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");


		List<String> instructors = new ArrayList<String>();

		instructors.add("jon");
		instructors.add("steve");
		instructors.add("Matt");




		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for int i=0; i< instructors.size(); i++);
		System.out.println(instructors.get(i));

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		instructors.add("John");



		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		instructors.add(3" Rachelle");



		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		instructors.remove(5);



		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean isSteveInList = instructors.contains("Steves");


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfRachelle = instructors.indexOf()

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] instructorAsListAgain =instructors.toArray(new String[instructors.size()]);

		// can al socnver
		List<String> instructorAsLisAgain = Arrays.asList()

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(instructors);


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(instructors);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for (String name : instructors){
			System.out.println(name);
		}

		double[] numbers = {1,2,3,4,92.3};
		for (double num : numbers){
			System.out.println(num *2);
		}

		System.out.println("####################");
		System.out.println("  Premetie wa");
		System.out.println("####################");

		List<Integer> numbersList = new List<Integer>();

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		Queue<String> task = new LinkedList<>();
		task.offer("clea dishes");
		task.offer("sweep floor");


		while ((!task.isEmpty())){



		}

		Stack<Integer> numbersStack= new Stack<Integer>();
		numbersStack.push(10);





	}
}
