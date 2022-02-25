package com.learning.builder.demo01;

public class Test {
    public static void main(String[] args) {
        // 包工头
        Director director = new Director();
        // 包工头指挥具体工人
        Product product = director.build(new Worker(new Product()));
        System.out.println(product.toString());

    }
}
