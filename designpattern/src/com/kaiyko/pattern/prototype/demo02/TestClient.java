package com.kaiyko.pattern.prototype.demo02;

public class TestClient {
    public static void main(String[] args) throws CloneNotSupportedException {

        //  创建原型对象
        Citation citation = new Citation();
//        citation.setName("张三");
        //  克隆奖状对象
        Citation cloneCitation = citation.clone();
        citation.setName("张三");
//        cloneCitation.setName("李四");

        citation.show();
        cloneCitation.show();
    }
}
