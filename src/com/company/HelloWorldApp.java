package com.company;

public class HelloWorldApp {
    public static void main(String[] args) {
        World wrld1 = new World();
        wrld1.showWidth();
        wrld1.showHeight();
        wrld1.showPopulation();

        wrld1.setPopulation(1000);
        wrld1.setHeight(100);
        wrld1.setWidth(100);
        wrld1.setPopulation(1400);

        wrld1.showWidth();
        wrld1.showHeight();
        wrld1.showPopulation();
    }
}
