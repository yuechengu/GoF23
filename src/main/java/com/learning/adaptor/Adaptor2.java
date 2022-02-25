package com.learning.adaptor;

// 适配器 --需要连接usb和网线
// 2)组合 --对象适配器
public class Adaptor2 implements NetToUsb {

    private Adaptee adaptee;

    public Adaptor2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();// 把从构造器传参来的类中的方法，填到接口的Override方法中
    }
}
