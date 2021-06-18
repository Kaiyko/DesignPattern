package com.kaiyko.pattern.prototype.demo02;

public class Citation implements Cloneable {

    //  三好学生上的姓名
    private String name;

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学，获得三好学生");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
