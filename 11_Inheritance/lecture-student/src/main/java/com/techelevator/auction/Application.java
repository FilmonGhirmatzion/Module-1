package com.techelevator.auction;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        System.out.println(new Bid("Josh", 1));
        System.out.println(new Bid("Fonz", 23));
        System.out.println(new Bid("Jenny", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        BuyoutAuction buyoutAuction =new BuyoutAuction("Book", 20);
        buyoutAuction.placeBid(new Bid("name", 22));

        ReserveAuction reserveAuction = new ReserveAuction("pen", 5);
        reserveAuction.placeBid(new Bid("losig", 2));
        reserveAuction.placeBid(new Bid ("Wining", 10));

        /*
        Polyr
         */
    }
}
