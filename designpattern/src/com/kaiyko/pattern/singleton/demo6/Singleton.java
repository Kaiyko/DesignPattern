package com.kaiyko.pattern.singleton.demo6;

/**
 * 懒汉式 — 静态内部类方式
 */
public class Singleton {

    //  私有构造方法
    private Singleton() { }

    //  静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //  对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
