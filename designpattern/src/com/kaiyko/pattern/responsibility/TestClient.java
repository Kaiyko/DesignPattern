package com.kaiyko.pattern.responsibility;

public class TestClient {
    public static void main(String[] args) {
        //  创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小明", 5, "身体不适");

        //  创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //  设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //  小明提交申请
        groupLeader.submit(leave);
    }
}
