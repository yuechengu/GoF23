package com.learning.adaptor;

// 适配器 --需要连接usb和网线
// 1)继承 --类适配器，单继承有局限性，只能适配单个网线
// ※适配器继承网线，适配器便不再是适配器
public class Adaptor extends Adaptee implements NetToUsb{
    @Override
    public void handleRequest() {
        super.request();// 把从父类继承来的方法，填到接口的Override方法中
    }
}
