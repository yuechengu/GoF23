package com.learning.bridge;

// ※一个维度(品牌)通过构造器传递对象，一个维度(产品)通过对象继承
public abstract class Computer {
    protected Brand brand;// 如果设置为private，只有目前这个电脑能访问
    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void info() {
        brand.info();
    };
}

class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Desktop");
    }
}

class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Laptop");
    }
}