package com.techelevator;

public class HotelReservation {
<<<<<<< HEAD
    private String name;
    private double numberOfNights;


}


    public HotelReservation(String name, double numberOfNights, double requiresCleaning, String usedMinibar) {
        this.name = name;
        this.numberOfNights = numberOfNights;


    }

    public double getName() {
        minarAdd.add(estimateTotal)
        if ( usedMinibar +12.99 : == estimateTotal){
            return getName();
        }

    }

    public double getNumberOfNights() {
        if (requiresCleaning + 34.99 : == estimateTotal){
            return getNumberOfNights();

    }

    public double requiresCleaningl() {
             if (requiresCleaning == requiresCleaning * 2){
                 return requiresCleaning ;
             }

      }


=======

    private String name;
    private int numberOfNights;


    public HotelReservation(String name, int numberOfNights) {
        this.name = name;
        this.numberOfNights = numberOfNights;
    }

    public double calculateActualTotal(boolean requiresCleaning, boolean usedMinibar) {

        double actualTotal = getEstimatedTotal();

        if (usedMinibar) {
            actualTotal += 12.99;
        }
        if (requiresCleaning) {
            actualTotal += 34.99;
            if (usedMinibar) {
                actualTotal += 34.99;
            }
        }
        return actualTotal;
    }

    public double getEstimatedTotal() {
        return numberOfNights * 59.99;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "HotelReservation{" +
                "name='" + name + '\'' +
                ", numberOfNights=" + numberOfNights +
                ", estimateTotal=" + estimateTotal +
                ", requiresCleaning='" + requiresCleaning + '\'' +
                ", usedMinibar='" + usedMinibar + '\'' +
                '}';
=======
        return "RESERVATION - " + this.name + " - " + getEstimatedTotal();
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
    }
}
