package com.learning.factory.abs;

// 路由器产品接口
public interface RouterProduct {

    void start();
    void shutdown();
    void openWifi();
    void openSetting();
}
