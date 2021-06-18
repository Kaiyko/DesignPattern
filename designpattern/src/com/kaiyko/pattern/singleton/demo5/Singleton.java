package com.kaiyko.pattern.singleton.demo5;

/**
 * 懒汉式 — 双重检查锁（线程安全）
 */
public class Singleton {

    //  私有构造方法
    private Singleton() { }

    //  声明Singleton类型的变量instance
    private static volatile Singleton instance;

    //  对外提供访问方式，添加synchronized关键字确保线程安全
    public static Singleton getInstance() {
        //  如果从未被创建则实例化一个
        if (instance == null) {
            // 对象锁
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
