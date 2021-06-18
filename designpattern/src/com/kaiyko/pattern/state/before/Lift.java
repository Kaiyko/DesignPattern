package com.kaiyko.pattern.state.before;

/**
 * 电梯类（ILift的子实现类）
 */
public class Lift implements ILift {

    //  声明一个变量记录当前电梯的状态
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯打开了...");
                break;
            case RUNNING_STATE:
            case OPENING_STATE:
            default:break;
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("电梯关门了...");
                break;
            case CLOSING_STATE:
            case RUNNING_STATE:
            case STOPPING_STATE:
            default:break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯开始运行...");
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
            default:break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case CLOSING_STATE:
            case RUNNING_STATE:
                System.out.println("电梯停止了...");
            case OPENING_STATE:
            case STOPPING_STATE:
            default:break;
        }
    }
}
