package com.learning.builder.demo02;

public class Test {
    public static void main(String[] args) {
        // 服务员默认上菜
        Worker worker = new Worker();
        Product product = worker.getProduct();
        System.out.println(product.toString());

        // 链式编程
        Product product1 = worker.buildA("sandwich").getProduct();
        System.out.println(product1.toString());
    }
}
