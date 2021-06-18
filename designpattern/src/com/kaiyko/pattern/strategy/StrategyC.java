package com.kaiyko.pattern.strategy;

/**
 * 具体策略类，封装算法
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("第二件五折");
    }
}
