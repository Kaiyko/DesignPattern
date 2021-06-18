package com.kaiyko.pattern.template;

/**
 * 抽象类
 */
public abstract class AbstractClass {

    //  模板方法定义
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    //  倒油是一样的，直接实现
    public void pourOil() {
        System.out.println("倒油");
    }

    //  热油是一样的，直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    //  倒蔬菜是不一样的，看做什么菜
    public abstract void pourVegetable();

    //  倒调味料是不一样的
    public abstract void pourSauce();

    //  翻炒是一样的，直接实现
    public void fry() {
        System.out.println("翻炒");
    }
}
