package com.kaiyko.pattern.bridge;

/**
 * 扩展抽象化角色（windows操作系统）
 */
public class Windows extends OperationSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
