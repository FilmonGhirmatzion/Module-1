package com.techelevator.farm;

public class MusicBox implements Singable, Sellable{
    @Override
    public int getPrice() {
        return 22;
    }

    @Override
    public String getname() {
        return 5;
    }

    @Override
    public int calculateShipping(int distanceInMiles) {
        return 0;
    }

    @Override
    public String getSound() {
        return "lalalalalal";
    }

    @Override
    public String getName() {
        return null;
    }
}
