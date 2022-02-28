package com.learning.proxy.demo01;

public class Proxy implements Rent{
    private Host host;
    public Proxy() {}
    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        contact();
        fee();
    }

    public void seeHouse() {
        System.out.println("中介的附加操作 --看房");
    }

    public void fee() {
        System.out.println("中介的附加操作 --收中介费");
    }

    public void contact() {
        System.out.println("中介的附加操作 --签合同");
    }
}
