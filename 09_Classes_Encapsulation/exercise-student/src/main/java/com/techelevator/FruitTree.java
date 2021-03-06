package com.techelevator;

public class FruitTree {

    /*
Instance variable
 */

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;

    }
    public boolean pickFruit(int numberOfPiecesToRemove){
        if (piecesOfFruitLeft >= numberOfPiecesToRemove){
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        }
        return false;
    }
    public String getTypeOfFruit(){
        return typeOfFruit;
    }
     public int getPiecesOfFruitLeft(){
        return piecesOfFruitLeft;
     }
}
