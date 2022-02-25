package com.learning.factory.abs;

public class Client {

    public static void main(String[] args) {

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        PhoneProduct phone = xiaomiFactory.phoneProduct();
        phone.start();
        phone.callup();
        phone.sendMsg();
        phone.shutdown();

        HuaweiFactory huaweiFactory = new HuaweiFactory();
        RouterProduct router = huaweiFactory.routerProduct();
        router.start();
        router.openSetting();
        router.openWifi();
        router.shutdown();

    }
}
