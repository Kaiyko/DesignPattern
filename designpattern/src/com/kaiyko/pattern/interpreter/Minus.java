package com.kaiyko.pattern.interpreter;

/**
 * 减法表达式类
 */
public class Minus extends AbstractExpression {

    //  -号左边的表达式
    private AbstractExpression left;

    //  -号右边的表达式
    private AbstractExpression right;

    @Override
    public int interpret(Context context) {
        //  将左边表达式的结果和右边表达式的结果进行相减
        return left.interpret(context) - right.interpret(context);
    }

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}