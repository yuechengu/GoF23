package com.learning.prototype.demo01;

import java.util.Date;

/*
* 1）继承Cloneable接口
* 2）重写clone()
* */
public class Sheep implements Cloneable{

    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Sheep() {
    }

    public Sheep(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
