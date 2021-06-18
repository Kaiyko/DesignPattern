package com.kaiyko.pattern.adapter.objectadapter;

/**
 * 具体的SD卡
 */
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        return "SDCard read msg : Hello world SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
