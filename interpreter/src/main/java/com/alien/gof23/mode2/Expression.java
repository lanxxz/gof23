package com.alien.gof23.mode2;

import java.util.Map;

/**
 * program: gof23
 * description: 抽象的表达式类
 *
 * @author: alien
 * @since: 2019/09/14 19:08
 */
public abstract class Expression {

    /**
     * method name: interpreter <br/>
     * description: 解析公式和数值
     * @param var: var的 key值是公式中的参数， value值是具体的数字
     * @return: int
     * @since: 2019-09-14
     */
    public abstract int interpreter(Map<String, Integer> var);
}
