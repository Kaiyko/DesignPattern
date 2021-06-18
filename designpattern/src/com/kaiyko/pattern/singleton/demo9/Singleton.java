package com.kaiyko.pattern.singleton.demo9;

/**
 * 懒汉式 — 静态内部类方式
 * 解决反射破坏单例模式
 */
public class Singleton {

    private static boolean flag = false;

    //  私有构造方法
    private Singleton() {
        //  确保线程安全
        synchronized (Singleton.class) {
            //  从反射的原理入手，反射会调用无参构造方法完成实例化对象
            if (flag) {
                throw new RuntimeException("该对象已实例化，请不要使用反射再次实例化该对象");
            }
            flag = true;
        }
    }

    //  静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //  对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
