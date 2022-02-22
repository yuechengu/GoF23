package com.learning.factory.method;

public class Customer {

    public static void main(String[] args) {

        new HondaFactory().createCar().propagate();
        new TeslaFactory().createCar().propagate();

    }
}
