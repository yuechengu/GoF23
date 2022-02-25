package com.learning.adaptor;

// 客户端类 --ex:电脑想接网线，但插不上网线
public class Client {

    //电脑需要接转接头才能上网
    public void net(NetToUsb adaptor) {
        // 上网的具体实现
        adaptor.handleRequest();
    }

    public static void main(String[] args) {
        // 电脑+网线 2种适配器
        Client computer = new Client();
        Adaptee cable = new Adaptee();
        Adaptor adaptor = new Adaptor();
        computer.net(adaptor);

        System.out.println("==============================================");
        Adaptor2 adaptor2 = new Adaptor2(cable);// ※真正意义上的的适配器
        computer.net(adaptor2);
    }
}
