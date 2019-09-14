package com.alien.gof23.mode2;

/**
 * program: gof23
 * description: 抽象运算符号解析器
 *
 * @author: alien
 * @since: 2019/09/14 19:13
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
