package com.kaiyko.pattern.memento.black;

/**
 * 蓓昂炉对象管理对象
 */
public class RoleStateCaretaker {

    //  声明Memento变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}