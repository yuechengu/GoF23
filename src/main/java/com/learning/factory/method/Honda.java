package com.learning.factory.method;

public class Honda implements Car {
    @Override
    public void propagate() {
        System.out.println("Honda is created!");
    }
}
