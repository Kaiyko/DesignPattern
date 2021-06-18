package com.kaiyko.pattern.adapter.classadapter;

public class Computer {

    //  从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card can't null");
        }
        return sdCard.readSD();
    }
}
