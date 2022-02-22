package com.learning.single;

import java.lang.reflect.Constructor;

// 懒汉式单例
public class LazyMan {

    // 上来先私有化构造器
    private LazyMan() {
        synchronized (LazyMan.class) {
            if (lazyMan!=null) {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
        System.out.println(Thread.currentThread().getName() + "--ok");
    }

    private volatile static LazyMan lazyMan;

    // 双重检测锁模式的懒汉式单例 --DCL懒汉式
    public static LazyMan getInstance() {
        if (lazyMan==null) {
            synchronized (LazyMan.class) {
                if (lazyMan==null) {
                    lazyMan = new LazyMan();// new一个对象不是一个原子性操作，会受指令重排的影响，导致空指针
                    /*
                    * 1.分配内存空间
                    * 2.执行构造方法，初始化对象
                    * 3.把这个对象指向分配到内存空间
                    *
                    * */
                }
            }
        }

        return lazyMan;
    }

    // ※反射
    public static void main(String[] args) throws Exception {
        LazyMan instance = LazyMan.getInstance();
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        LazyMan instance2 = declaredConstructor.newInstance();

        System.out.println(instance);
        System.out.println(instance2);
    }

    // 多线程并发
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                LazyMan.getInstance();
//            }).start();
//        }
//    }
}
