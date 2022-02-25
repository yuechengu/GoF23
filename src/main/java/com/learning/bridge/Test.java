package com.learning.bridge;

public class Test {
    public static void main(String[] args) {
        // Apple Laptop
        Computer computer = new Laptop(new Apple());
        computer.info();
        System.out.println("=========================");
        // Lenovo Desktop
        Computer computer2 = new Desktop(new Lenovo());
        computer2.info();
    }
}
