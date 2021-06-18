package com.kaiyko.pattern.singleton.demo2;

/**
 * 饿汉式 — 静态代码块
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance;

    //	静态代码块，在类加载的时候就会进行实例化
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
