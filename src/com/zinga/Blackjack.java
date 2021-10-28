package com.zinga;

public class Blackjack {
    public static void main(String[] args) {
        System.out.println("Welcome to blackjack");

        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();

        System.out.println(playingDeck);



    }
}
