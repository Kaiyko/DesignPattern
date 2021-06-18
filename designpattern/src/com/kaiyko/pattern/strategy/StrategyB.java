package com.kaiyko.pattern.strategy;

/**
 * 具体策略类，封装算法
 */
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
