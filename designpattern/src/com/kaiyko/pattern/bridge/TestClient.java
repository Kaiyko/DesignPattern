package com.kaiyko.pattern.bridge;

/**
 * 测试类
 */
public class TestClient {
    public static void main(String[] args) {
        //  创建操作系统
        OperationSystem system = new Mac(new AviFile());
        //  使用操作系统播放视频文件
        system.play("战狼3");
    }
}
