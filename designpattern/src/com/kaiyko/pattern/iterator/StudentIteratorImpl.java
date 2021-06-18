package com.kaiyko.pattern.iterator;

import java.util.List;

/**
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> studentList;
    //  用来记录遍历时的位置
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public Student next() {
        //  从集合中获取指定位置的元素
        return studentList.get(position++);
    }

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }
}
