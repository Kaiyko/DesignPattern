package com.kaiyko.pattern.bridge;

/**
 * 抽象的操作系统类（抽象化角色）
 */
public abstract class OperationSystem {

    //  声明videFile变量
    protected VideoFile videoFile;

    public OperationSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String filename);
}
