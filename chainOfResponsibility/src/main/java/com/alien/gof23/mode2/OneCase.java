package com.alien.gof23.mode2;

/**
 * 实现 case
 *
 * @author alien
 * @since 2019-08-03 15:00
 */
public class OneCase implements BaseCase {
    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        if ("1".equals(input)) {
            // do some thing
            System.out.println(getClass().getName());
            return;
        }
        baseCase.doSomeThing(input, baseCase);
    }
}
