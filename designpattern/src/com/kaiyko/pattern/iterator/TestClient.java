package com.kaiyko.pattern.iterator;

public class TestClient {
    public static void main(String[] args) {
        //  创建聚合对象
        StudentAggregate aggregate = new StudentAggregateImpl();
        //  添加元素
        aggregate.addStudent(new Student("张三", "001"));
        aggregate.addStudent(new Student("李四", "002"));
        aggregate.addStudent(new Student("王五", "003"));
        aggregate.addStudent(new Student("陈六", "004"));

        //  遍历聚合对象
        //  获取迭代器对象
        StudentIterator iterator = aggregate.getStudentIterator();
        //  遍历
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
