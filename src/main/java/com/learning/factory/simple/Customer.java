package com.learning.factory.simple;

public class Customer {

    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("honda");
        car1.propagate();
        Car car2 = CarFactory.createCar("tesla");
        car2.propagate();
    }
}
