package com.kaiyko.pattern.proxy.staticproxy;

/**
 * 代理售票点类
 */
public class ProxyPoint implements SellTickets {
    private TrainStation station = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点收取一点服务费用");
        station.sell();
    }
}
