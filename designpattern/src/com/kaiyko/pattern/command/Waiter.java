package com.kaiyko.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 */
public class Waiter {

    //  持有多个命令对象
    private List<Command> commandList = new ArrayList<>();

    //  添加新命令
    public void setCommand(Command command) {
        commandList.add(command);
    }

    //  发起命令功能
    public void orderUp() {
        System.out.println("美女服务员：大厨，新订单来了！");
        for (Command command : commandList) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
