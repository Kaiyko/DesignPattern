package com.kaiyko.pattern.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {

    //  声明目标对象
    private TrainStation station = new TrainStation();

    //  获取代理对象的方法
    public SellTickets getProxyObject() {
        //  返回代理对象
        return  (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("jdk代售点收取小费");
                    System.out.println("invoke方法");
                    return method.invoke(station, args);
                }
        );
    }
}
