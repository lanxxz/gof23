package com.alien.gof23.mode2;

/**
 * 定义所有 case 逻辑处理的接口
 *
 * @author alien
 * @since 2019-08-03 14:52
 */
public interface BaseCase {
    /**
     * 所有 case 逻辑的处理方法
     *
     */
    void doSomeThing(String input, BaseCase baseCase);
}
