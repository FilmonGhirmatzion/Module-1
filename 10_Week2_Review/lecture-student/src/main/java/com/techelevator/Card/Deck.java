package com.techelevator.Card;



import java.util.ArrayList;
import java.util.List;
/*
Deck
        properties: card, countOfCards, isShuffled
        methods: deal(), shuffle(), cut()
 */
public class Deck {
    private List<Card > cards = new ArrayList<>();
    private boolean isShuffled = false;


    public  Deck(String suits, String[] ranks){
        for (String suit : suits){
            for (String rank :ranks){
                Card currentCard = new Card(suit, rank);
                cards.add(currentCard);
            }
        }
    }

    public  Card deal(){
        if (cards.size() !=0){
            return cards.remove(0);
        }else {
            return null;
        }
    }
    private void flipAllCards(){
        for(Card card :cards){
            card.flip();
        }
    }

    @Override
    public String toString(){
        flipAllCards();
        String deckAsString=  "Deck" + cards;
        flipAllCards();
        return deckAsString;
    }

}
