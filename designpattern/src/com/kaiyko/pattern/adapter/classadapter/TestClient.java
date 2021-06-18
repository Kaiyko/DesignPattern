package com.kaiyko.pattern.adapter.classadapter;

public class TestClient {
    public static void main(String[] args) {
        //  创建计算机对象
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("====================");
        //  使用该电脑读取TF卡中的数据
        //  定义适配器类
        String adapterMsg = computer.readSD(new SDAdapterTF());
        System.out.println(adapterMsg);
    }

}
