package com.company;

public class HelloWorldApp {
    public static void main(String[] args) {
        String countryName = "Arstotzka";
        World playerOne = new World(countryName);
        countryName = "Obristan";
        World playerTwo = new World(countryName);

        playerOne.showStats();
        playerTwo.showStats();
    }
}
