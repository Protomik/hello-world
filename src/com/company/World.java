package com.company;

public class World {
    /* Public methods */

    public World(String name) {
        countryName = name;
    }

    void setWidth(int newValue) {
        width = newValue;
    }

    void setHeight(int newValue) {
        height = newValue;
    }

    void setPopulation(int newValue) { population = newValue; }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    int getPopulation() {
        return population;
    }

    void showStats() {
        System.out.println("Stats of " + countryName + ":");
        System.out.println("Height is " + height);
        System.out.println("Width is " + width);
        System.out.println("Population is " + population + " million" + "\n");
    }

    /* Private properties */

    private int width = (int) (Math.random() * 50 + 50);
    private int height = (int) (Math.random() * 50 + 50);
    private int population = (int) (Math.random() * 100 + 100);
    private String countryName = "";
}
