package com.zinga;

import java.util.ArrayList;

public class Deck {

    //instance vars
    private ArrayList<Card> cards;

    //Consturct
    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck(){
        //generate cards
        for (Suit cardSuit:Suit.values()) {
            for (Value cardValue:Value.values()) {
                //add a new card to the deck
                this.cards.add(new Card(cardSuit,cardValue));
            }

        }
    }

    public String toString(){
        String cardListOutput = "";
        int i = 0;
        for (Card aCard:cards) {
            cardListOutput += " \n" + i +"-" + aCard;
            i++;
        }

        return  cardListOutput;

    }

    static class DeckTest {

    }
}
