package com.alien.gof23.mode2;

import java.util.Map;

/**
 * program: gof23
 * description: 变量解析器
 *
 * @author: alien
 * @since: 2019/09/14 19:11
 */
public class VarExpression extends Expression {

    private String key;
    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
