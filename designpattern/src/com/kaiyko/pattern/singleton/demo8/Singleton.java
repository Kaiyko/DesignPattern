package com.kaiyko.pattern.singleton.demo8;

import java.io.Serializable;

/**
 * 懒汉式 — 静态内部类方式
 * 处理序列化造成的破坏单例
 */
public class Singleton implements Serializable {

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

    //  当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
