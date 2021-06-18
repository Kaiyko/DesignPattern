package com.kaiyko.pattern.proxy.jdkproxy;

/**
 * 火车站类
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
