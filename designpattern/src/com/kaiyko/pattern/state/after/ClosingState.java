package com.kaiyko.pattern.state.after;

/**
 * 电梯关闭状态类
 */
public class ClosingState extends LifeState {
    @Override
    public void open() {
        super.context.setLifeState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭。。。");
    }

    @Override
    public void run() {
        super.context.setLifeState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.STOPPING_STATE);
        super.context.getLifeState().stop();
    }
}
