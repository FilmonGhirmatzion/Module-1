package com.techelevator.farm;

public interface Sellable {

    int getPrice();
    String getname();
    int calculateShipping(int distanceInMiles);

}
