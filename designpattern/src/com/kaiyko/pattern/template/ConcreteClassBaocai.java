package com.kaiyko.pattern.template;

/**
 * 炒包菜
 */
public class ConcreteClassBaocai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
