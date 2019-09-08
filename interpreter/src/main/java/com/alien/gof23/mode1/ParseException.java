package com.alien.gof23.mode1;

/**
 * program: gof23
 * description: 表示语法解析发生异常的类
 *
 * @author: alien
 * @since: 2019/09/08 22:44
 */
public class ParseException extends Exception {
    public ParseException(String msg) {
        super(msg);
    }
}
