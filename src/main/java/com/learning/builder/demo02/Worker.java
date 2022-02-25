package com.learning.builder.demo02;

public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        product.setA(msg);
        return this;
    }

    @Override
    Builder buildB(String msg) {
        product.setB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setC(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        product.setD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
