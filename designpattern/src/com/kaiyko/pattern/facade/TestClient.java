package com.kaiyko.pattern.facade;

/**
 * 测试类
 */
public class TestClient {
    public static void main(String[] args) {
        //  创建智能音箱对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        System.out.println("====================");
        facade.say("关闭家电");
    }
}
