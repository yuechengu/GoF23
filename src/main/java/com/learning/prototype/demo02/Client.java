package com.learning.prototype.demo02;

import java.util.Date;

// Spring Bean --单例模式or原型模式
// 工厂模式+原型模式 --用clone替代new对象
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();
        // sheep1
        Sheep sheep1 = new Sheep("多利", date);
        System.out.println("sheep1=>"+sheep1+"\n"+"sheep1=>hash:"+sheep1.hashCode());

        // sheep1 -> sheep2 --深克隆
        Sheep sheep2 = (Sheep) sheep1.clone();
        System.out.println("sheep2=>"+sheep2+"\n"+"sheep2=>hash:"+sheep2.hashCode());

        System.out.println("=======================================================");
        sheep2.setName("多利2号");
        System.out.println("sheep2=>"+sheep2+"\n"+"sheep2=>hash:"+sheep2.hashCode());

        System.out.println("=======================================================");
        date.setTime(1234);
        System.out.println("sheep1=>"+sheep1+"\n"+"sheep1=>hash:"+sheep1.hashCode());
        System.out.println("sheep2=>"+sheep2+"\n"+"sheep2=>hash:"+sheep2.hashCode());

    }
}
