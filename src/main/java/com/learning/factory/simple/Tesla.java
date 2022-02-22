package com.learning.factory.simple;

public class Tesla implements Car{
    @Override
    public void propagate() {
        System.out.println("Tesla is created!");
    }
}
