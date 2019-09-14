package com.alien.gof23.mode2;

import java.util.Map;
import java.util.Stack;

/**
 * program: gof23
 * description: 解析器封装类
 *
 * @author: alien
 * @since: 2019/09/14 19:19
 */
public class Calculator {
    /**
     * description: 定义表达式
     * @since: 2019-09-14
     */
    private Expression expression;

    public Calculator(String expStr) {
        // 定义一个栈，存放运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为数组
        char[] chars = expStr.toCharArray();
        // 运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }

}
