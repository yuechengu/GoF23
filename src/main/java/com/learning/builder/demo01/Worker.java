package com.learning.builder.demo01;

// 具体的建造者是工人
public class Worker extends Builder{

    private Product product;

    public Worker(Product product) {
        this.product = product;
    }

    @Override
    void buildA() {
        product.setA("部件A");
        System.out.println("部件A建造完成");
    }

    @Override
    void buildB() {
        product.setB("部件B");
        System.out.println("部件B建造完成");
    }

    @Override
    void buildC() {
        product.setC("部件C");
        System.out.println("部件C建造完成");
    }

    @Override
    void buildD() {
        product.setD("部件D");
        System.out.println("部件D建造完成");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
