package com.kaiyko.pattern.flyweight;

public class TestClient {
    public static void main(String[] args) {
        //  获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        //  获取L图形对象
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("红色");

        //  获取O图形对象
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("蓝色");
        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("粉色");

        System.out.println("box3 == box4 ? res = " + (box3 == box4));
    }
}
