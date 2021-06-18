package com.kaiyko.pattern.prototype.demo01;

public class TestClient {
    public static void main(String[] args) throws CloneNotSupportedException {

        //  创建一个原型类对象
        RealizeType realizeType = new RealizeType();

        //  调用RealizeType类中的clone方法进行对象的克隆
        RealizeType clone = realizeType.clone();

        System.out.println("是否为同一对象? res = " + (realizeType == clone));
    }
}
