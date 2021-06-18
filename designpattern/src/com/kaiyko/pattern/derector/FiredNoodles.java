package com.kaiyko.pattern.derector;

/**
 * 炒面(具体构件角色)
 */
public class FiredNoodles extends FastFood {

    public FiredNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
