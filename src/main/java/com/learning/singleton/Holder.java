package com.learning.singleton;

// 静态内部类
public class Holder {

    // 上来先私有化构造器
    private Holder() {}

    public static Holder getInstance() {
        return InnerClass.holder;
    }

    public static class InnerClass {
        private static final Holder holder = new Holder();
    }
}
