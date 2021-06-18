package com.kaiyko.pattern.factory.method;

public class TestClient {
    public static void main(String[] args) {
        //  创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        //  创建对象
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);

        //  点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
