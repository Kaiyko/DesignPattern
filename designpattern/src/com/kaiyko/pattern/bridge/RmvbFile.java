package com.kaiyko.pattern.bridge;

/**
 * rmvb视频文件（具体的实现化角色）
 */
public class RmvbFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("rmvb视频文件 ： " + filename);
    }
}
