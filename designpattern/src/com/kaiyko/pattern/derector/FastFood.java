package com.kaiyko.pattern.derector;

/**
 * 快餐类(抽象构件角色)
 */
public abstract class FastFood {

    //  价格
    private float price;

    //  描述
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();

    public FastFood() { };

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
