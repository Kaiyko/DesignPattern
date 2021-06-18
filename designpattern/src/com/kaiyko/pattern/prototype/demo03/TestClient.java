package com.kaiyko.pattern.prototype.demo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClient {
    public static void main(String[] args) throws Exception {

        //  创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        //  创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/path"));
        //  写对象
        oos.writeObject(citation);
        //  释放资源
        oos.close();

        //  创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/path"));
        //  读取对象
        Citation cloneCitation = (Citation) ois.readObject();
        //  释放资源
        ois.close();

        citation.show();
        cloneCitation.show();
    }
}
