package com.alien.gof23.mode2;

/**
 * TODO
 *
 * @author alien
 * @since 2019-08-03 15:22
 */
public class TwoCase implements BaseCase {
    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        if ("2".equals(input)) {
            System.out.println(getClass().getName());
            return;
        }
        baseCase.doSomeThing(input, baseCase);
    }
}
