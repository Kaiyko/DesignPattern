package com.kaiyko.pattern.adapter.objectadapter;

/**
 * 目标接口
 */
public interface SDCard {
    //  从SD卡中读取数据
    String readSD();
    //  往SD卡中写入数据
    void writeSD(String msg);
}
