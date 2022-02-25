package com.learning.factory.abs;

// 小米手机
public class XiaomiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("welcome to Xiaomi");
    }

    @Override
    public void shutdown() {
        System.out.println("goodbye Xiaomi");
    }

    @Override
    public void callup() {
        System.out.println("using Xiaomi to call");
    }

    @Override
    public void sendMsg() {
        System.out.println("using Xiaomi to send msg");
    }
}
