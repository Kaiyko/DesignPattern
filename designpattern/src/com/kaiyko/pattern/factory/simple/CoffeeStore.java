package com.kaiyko.pattern.factory.simple;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        //  定义工厂
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //  生产咖啡
        Coffee coffee = factory.createCoffee("american");
        //  加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
