package com.kaiyko.pattern.builder.demo01;

public class TestClient {
    public static void main(String[] args) {

        //  创建指挥者对象
        Director director = new Director(new MobileBuilder());

        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
