package com.kaiyko.pattern.bridge;

/**
 * Mac操作系统（扩展抽象化角色）
 */
public class Mac extends OperationSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
