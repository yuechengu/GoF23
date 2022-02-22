package com.learning.singleton;


// 饿汉式单例
public class HungryMan {

    // 上来先私有化构造器
    private HungryMan() {}

    private final static HungryMan hungryMan = new HungryMan();

    public static HungryMan getInstance() {
        return hungryMan;
    }
}
