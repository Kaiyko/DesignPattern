package com.kaiyko.pattern.state.after;

public class TestClient {
    public static void main(String[] args) {
        //  创建环境角色对象
        Context context = new Context();
        //  设置当前电梯状态
        context.setLifeState(new ClosingState());
        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
