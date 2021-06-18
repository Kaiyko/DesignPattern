package com.kaiyko.pattern.state.after;

/**
 * 电梯停止状态类
 */
public class StoppingState extends LifeState {
    @Override
    public void open() {
        super.context.setLifeState(Context.OPENING_STATE);
        super.context.getLifeState().open();
    }

    @Override
    public void close() {
        super.context.setLifeState(Context.CLOSING_STATE);
        super.context.getLifeState().close();
    }

    @Override
    public void run() {
        super.context.setLifeState(Context.RUNNING_STATE);
        super.context.getLifeState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
