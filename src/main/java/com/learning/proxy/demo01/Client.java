package com.learning.proxy.demo01;

public class Client {
    public static void main(String[] args) {
        // 房东要出租
        Host host = new Host();
        // 代理角色，一般除了代理操作，还有自己的附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
