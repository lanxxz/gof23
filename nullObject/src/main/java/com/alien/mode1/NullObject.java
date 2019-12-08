package com.alien.mode1;

/**
 * program: gof23
 * description: 空对象
 *
 * @author: alien
 * @since: 2019/12/08 20:13
 */
public class NullObject implements DependencyBase {
    @Override
    public void operation() {
        // do nothing
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
