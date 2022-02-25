package com.learning.factory.abs;

public class HuaweiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("welcome to Huawei");
    }

    @Override
    public void shutdown() {
        System.out.println("goodbye Huawei");
    }

    @Override
    public void openWifi() {
        System.out.println("using Huawei to open wifi");
    }

    @Override
    public void openSetting() {
        System.out.println("using Huawei to open setting");
    }
}
