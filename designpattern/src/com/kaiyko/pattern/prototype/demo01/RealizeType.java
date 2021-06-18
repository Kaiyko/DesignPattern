package com.kaiyko.pattern.prototype.demo01;

public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("构造方法运行");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (RealizeType) super.clone();
    }
}
