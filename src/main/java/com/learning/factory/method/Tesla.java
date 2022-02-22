package com.learning.factory.method;

public class Tesla implements Car {
    @Override
    public void propagate() {
        System.out.println("Tesla is created!");
    }
}
