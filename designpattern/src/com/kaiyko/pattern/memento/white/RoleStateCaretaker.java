package com.kaiyko.pattern.memento.white;

/**
 * 蓓昂炉对象管理对象
 */
public class RoleStateCaretaker {

    //  声明RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
