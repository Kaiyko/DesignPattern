package com.kaiyko.pattern.state.after;

/**
 * 电梯运行状态类
 */
public class RunningState extends LifeState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
