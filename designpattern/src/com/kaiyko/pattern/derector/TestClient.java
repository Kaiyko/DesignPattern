package com.kaiyko.pattern.derector;

public class TestClient {
    public static void main(String[] args) {
        //  点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " "+ food.cost() + "元");

        System.out.println("====================");
        food = new Egg(food);
        System.out.println(food.getDesc() + " "+ food.cost() + "元");

        System.out.println("====================");
        food = new Egg(food);
        System.out.println(food.getDesc() + " "+ food.cost() + "元");

        System.out.println("====================");
        food = new Bacon(food);
        System.out.println(food.getDesc() + " "+ food.cost() + "元");

    }
}
