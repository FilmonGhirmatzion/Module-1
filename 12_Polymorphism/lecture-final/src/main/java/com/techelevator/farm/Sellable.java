package com.techelevator.farm;

public interface Sellable {

    int getPrice();
    String getName();
    int calculateShipping(int distanceInMiles);
}
