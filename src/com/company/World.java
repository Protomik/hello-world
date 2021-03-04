package com.company;

public class World {
    /* Public methods */

    public World(String name, int newId) {
        countryName = name;
        id = newId;

    }

    void setPopulation(int newValue) { population = newValue; }

    void setId(int newId) { id = newId; }

    int getPopulation() {
        return population;
    }

    int getId() { return id; }

    void showStats() {
        System.out.println("ID: " + id);
        System.out.println("Stats of " + countryName + ":");
        System.out.println("Population is " + population + " million" + "\n");
    }

    /* Private properties */

    private int population = (int) (Math.random() * 100 + 100);
    private String countryName = "";
    private int id = 0;
}
