package com.learning.factory.abs;

public class XiaomiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("welcome to Xiaomi");
    }

    @Override
    public void shutdown() {
        System.out.println("goodbye Xiaomi");
    }

    @Override
    public void openWifi() {
        System.out.println("using Xiaomi to open wifi");
    }

    @Override
    public void openSetting() {
        System.out.println("using Xiaomi to open setting");
    }
}
