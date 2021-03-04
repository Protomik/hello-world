package com.company;

public class HelloWorldApp {

    static int globalId = 0;
    public static int getNewId() {
        return ++globalId;
    }

    public static void main(String[] args) {
        String countryName = "Arstotzka";
        World playerOne = new World(countryName, getNewId());
        countryName = "Obristan";
        World playerTwo = new World(countryName, getNewId());
        Weapon weapon1 = new Weapon(playerOne.getId());
        Weapon weapon2 = new Weapon(playerTwo.getId());

        playerOne.showStats();
        playerTwo.showStats();
        weapon1.showStats();
        weapon2.showStats();
    }
}
