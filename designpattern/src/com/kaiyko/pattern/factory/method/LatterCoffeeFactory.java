package com.kaiyko.pattern.factory.method;

public class LatterCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }
}
