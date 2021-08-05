package com.techelevator.vehicle;

import java.util.Locale;

public class Bus {

    private final static int TOTAL_SEATS = 40;

    /*
    Member variables to hold the state. should always be private.
     */
    private String routName;
    private int passengers;
    private int gallonsOfGas = 50;      // sets the starting calue to 50 when the object
    private boolean isDoorOpen = false; // sets the starting value to false when the



// Constractors
    public Bus() {

    }
    public Bus (String routName) {
        this.routName = routName;
        //setRoutName(routName);

    }



    public boolean board(){
       if (this.isDoorOpen && getRemainingSeats() >=1){
           this.passengers +=1;
           return true;
       }
       return false;
    }

    public boolean board(int peopleBoardding){
        if (this.isDoorOpen && getRemainingSeats() >= peopleBoardding){
            this.passengers += peopleBoardding;
            return true;
        }
        return false;

    }

    private String cleanupRoutName(String routName){
        String name = routName.replaceAll(" ", "-");
        return .routName = name.toUpperCase();
    }


    public int getRemainingSeats(){

        return TOTAL_SEATS - this.passengers;


    }

    public void openDoor() {
        this.isDoorOpen= true;
    }
    public void closeDoor(){
        this.isDoorOpen = false;
    }

    public void addGas(int gallonsToAdd){
        this.gallonsOfGas +=gallonsToAdd;
    }



    // Getter and Setters
    public String getRoutName(){
        return this.routName;
    }
    public void setRoutName(String routName){
        String name = routName.replaceAll(" ", "-");
        this.routName = name.toUpperCase();
    }
    public int getGallonsOfGas(){

        return this.gallonsOfGas;
    }

    public boolean isDoorOpen(){
        return this.isDoorOpen;
    }

}







//    public int geeRemainingSeats(){
//
//        return totalSeats - this.passengers;
//    }
//
//    /*
//    can also SET value using simple methods that encapsulate the
//    function in a way that is easier to use and understand.
//     */
//
//
//
//    public void  openDoor(){
//        this.isDoorOpen= true;
//    }
//    public void closeDoor(){
//        this.isDoorOpen=false;
//    }
//    public void addGas(int gallonsToAdd){
//         this.gallonsOfGas+= gallonsToAdd;
//    }
//
// /*
// Getters and setters - provides public access to private member variable
//
//  */
//
//    public String getRoutName() {
//    return this.routName;
//    }
//    public void setRoutName(String routName){
//        String name = routName.replaceAll(" ", "-");
//        this.routName= name.toUpperCase();
//    }
//
//    public int getGallonsOfGas(){
//        return this.gallonsOfGas;
//    }
//
//    public boolean isDoorOpen() {
//        return this.isDoorOpen;
//    }
//
//
//}
