package com.kaiyko.pattern.state.before;

public class TestClient {
    public static void main(String[] args) {
        //  创建电梯对象
        Lift lift = new Lift();

        //  设置当前电梯的状态
        lift.setState(ILift.RUNNING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
