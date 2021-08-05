package com.techelevator.farm;

public class Cow extends FarmAnimal implements Sellable {

	public Cow() {
		super("Cow", "moo!");
	}
	ou

	@Override
	public int getPrice() {
		return 20;
	}


	@Override
	public int calculateShipping(int distanceInMiles) {
		return  distanceInMiles;
	}
}
}