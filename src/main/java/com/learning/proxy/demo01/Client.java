package com.learning.proxy.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        // 代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
