package com.learning.factory.abs;

// 华为手机
public class HuaweiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("welcome to Huawei");
    }

    @Override
    public void shutdown() {
        System.out.println("goodbye Huawei");
    }

    @Override
    public void callup() {
        System.out.println("using Huawei to call");
    }

    @Override
    public void sendMsg() {
        System.out.println("using Huawei to send msg");
    }
}
