package com.learning.builder.demo01;

// 抽象的建造者 --可以理解为蓝图
public abstract class Builder {

    abstract void buildA(); // 建造A步骤
    abstract void buildB(); // 建造B步骤
    abstract void buildC(); // 建造C步骤
    abstract void buildD(); // 建造D步骤

    // 得到产品
    abstract Product getProduct();
}
