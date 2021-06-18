package com.kaiyko.pattern.singleton.demo4;

/**
 * 懒汉式 — synchronized（线程安全）
 */
public class Singleton {

    //  私有构造方法
    private Singleton() { }

    //  声明Singleton类型的变量instance
    private static Singleton instance;

    //  对外提供访问方式，添加synchronized关键字确保线程安全
    public static synchronized Singleton getInstance() {
        //  如果从未被创建则实例化一个
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
