package com.alien.gof23.mode2;

import java.util.Map;

/**
 * program: gof23
 * description: 加法解析器
 *
 * @author: alien
 * @since: 2019/09/14 19:16
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
