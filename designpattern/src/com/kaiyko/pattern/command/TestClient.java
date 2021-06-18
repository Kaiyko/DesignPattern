package com.kaiyko.pattern.command;

public class TestClient {
    public static void main(String[] args) {
        //  创建第一个订单对象
        Order orderA = new Order();
        orderA.setDiningTable(1);
        orderA.setFood("西红柿鸡蛋面", 1);
        orderA.setFood("可乐", 2);

        //  创建第二个订单对象
        Order orderB = new Order();
        orderB.setDiningTable(2);
        orderB.setFood("土豆丝肉片", 1);
        orderB.setFood("维他奶", 1);

        //  创建厨师对象
        SeniorChef receiver = new SeniorChef();
        //  创建命令对象
        OrderCommand commandA = new OrderCommand(receiver, orderA);
        OrderCommand commandB = new OrderCommand(receiver, orderB);

        Waiter invoker = new Waiter();
        invoker.setCommand(commandA);
        invoker.setCommand(commandB);

        //  发起命令
        invoker.orderUp();
    }
}
