package com.learning.builder.demo01;

// 工程如何构建，由指挥者决定
public class Director {

    // 指挥工人，按照指挥者想要的顺序建造
    public Product build(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }
}
