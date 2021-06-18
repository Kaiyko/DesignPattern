package com.kaiyko.pattern.prototype.demo03;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {

    //  三好学生
    private Student student;

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(student.getName() + "同学，获得三好学生");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
