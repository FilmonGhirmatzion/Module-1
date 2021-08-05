package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {



		Singable[] farmAnimals = new Singable[] { new Cow(), new Chicken() , new Sheep(), new Tractor(), new Duck() };

		for (Singable animal : farmAnimals) {

			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		List<Sellable> itemsForSale= new ArrayList<sellable>();
		itemsForSale.add(new Chicken());
		itemsForSale.add(new Cow());
		itemsForSale.add(new Sheep());


		Chicken chicken = new Chicken();
		chicken.
		FarmAnimal ChikenAsFarmAnimal = chicken;
		Singable chichecknSingable = chicken;
		Singable chickenAsSellable = chicken;




//		System.out.println("Items for sale: ");
//		for (FarmAnimal animal: farmAnimals){
//			System.out.println(animal.getName()+ ": $ " + animal.getPrice());
//		}
	}
}