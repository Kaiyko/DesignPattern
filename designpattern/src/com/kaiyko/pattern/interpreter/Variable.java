package com.kaiyko.pattern.interpreter;

/**
 * 变量类
 */
public class Variable extends AbstractExpression {

    //  声明存储变量名的成员变量
    private String name;

    @Override
    public int interpret(Context context) {
        //  直接返回变量的值
        return context.getValue(this);
    }

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
