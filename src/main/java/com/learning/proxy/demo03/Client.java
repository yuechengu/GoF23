package com.learning.proxy.demo03;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色处理器
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置被代理的角色
        pih.setRent(host);
        // 获得代理角色
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
