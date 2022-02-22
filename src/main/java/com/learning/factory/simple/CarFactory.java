package com.learning.factory.simple;

// 简单工厂
public class CarFactory {
    public static Car createCar(String carName) {
        if (carName.equals("honda")) {
            return new Honda();
        }else if (carName.equals("tesla")) {
            return new Tesla();
        }else {
            return null;
        }
    }
}
