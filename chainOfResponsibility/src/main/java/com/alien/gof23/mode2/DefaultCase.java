package com.alien.gof23.mode2;

/**
 * TODO
 *
 * @author alien
 * @since 2019-08-03 15:23
 */
public class DefaultCase implements BaseCase {
    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        System.out.println("input 为" + input + "不符合");
    }
}
