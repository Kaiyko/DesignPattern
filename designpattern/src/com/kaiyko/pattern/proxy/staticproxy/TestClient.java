package com.kaiyko.pattern.proxy.staticproxy;

/**
 * 测试类
 */
public class TestClient {
    public static void main(String[] args) {
        //  创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //  调用方法进行买票
        proxyPoint.sell();
    }
}
