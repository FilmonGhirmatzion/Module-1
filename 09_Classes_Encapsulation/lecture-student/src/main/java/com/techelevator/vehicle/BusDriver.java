package com.techelevator.vehicle;

import com.techelevator.vehicle.Bus;

public class BusDriver {

    public static void main(String[] args) {


       Bus busOne = new Bus();

       busOne.setRoutName("Third to Fifth");
        System.out.println(busOne.getRoutName());
        System.out.println(busOne.getRemainingSeats());
        busOne.openDoor();
        busOne.board();
        System.out.println(busOne.getRemainingSeats());

        busOne.openDoor();
        busOne.board(10);
        busOne.closeDoor();

        Bus BusTwo = new Bus(" High to Third");



    }
}
