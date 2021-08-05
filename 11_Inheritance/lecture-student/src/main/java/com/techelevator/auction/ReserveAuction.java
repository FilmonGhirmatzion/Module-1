package com.techelevator.auction;

public class ReserveAuction extends Auction {

        private int reservePrice;

        public ReserveAuction(String itemForSale, int reservePrice){
            super(itemForSale);
            this.reservePrice =reservePrice;
        }
@Override

   public boolean placeBid(Bid offeredBid){
            boolean isCurrentWinningBid =false;
            if(offeredBid.getBidAmount()>= reservePrice){
                isCurrentWinningBid = super.placeBid(offeredBid);
       /*
       if an overdide wants to use the fnctionality of the orginize
       function it is overrideing it can do so suing the super
        */

    }
    return  isCurrentWinningBid;
        }
}