package com.alien.gof23.mode2;

import java.util.Map;

/**
 * program: gof23
 * description: 减法解析器
 *
 * @author: alien
 * @since: 2019/09/14 19:17
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
