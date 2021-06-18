package com.kaiyko.pattern.factory.abstractFactory;

public class TestClient {
    public static void main(String[] args) {

        //  创建意大利风味的甜品工厂对象
        ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory1 = new AmericanDessertFactory();
        //  生产拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
