package com.kaiyko.pattern.memento.black;

public class TestClient {
    public static void main(String[] args) {
        System.out.println("-----大战boss前-----");
        //  创建游戏角色对象
        GameRole gameRole = new GameRole();
        //  初始化状态
        gameRole.initState();
        gameRole.stateDisplay();

        //  将游戏角色内部状态进行备份
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("-----大战boss后-----");
        //  损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("-----恢复之前状态-----");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
