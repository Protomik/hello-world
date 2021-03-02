package com.company;

public class World {
    /* Public methods */

    void setWidth(int newValue) {
        width = newValue;
    }

    void setHeight(int newValue) {
        height = newValue;
    }

    void setPopulation(int newValue) {
        if (height > 0 && width > 0)
            population = newValue;
        else
            System.out.println("There is nothing to populate!");
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    int getPopulation() {
        return population;
    }

    void showWidth() {
        System.out.println("Width is: " + width);
    }

    void showHeight() {
        System.out.println("Height is: " + height);
    }

    void showPopulation() {
        if (population > 0)
            System.out.println("Hello World! Population is: " + population);
        else
            System.out.println("Population is: " + 0);
    }

    /* Private properties */

    private int width = 0;
    private int height = 0;
    private int population = 0;
}
