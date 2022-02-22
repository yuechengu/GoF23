package com.learning.factory.simple;

public class Honda implements Car{
    @Override
    public void propagate() {
        System.out.println("Honda is created!");
    }
}
