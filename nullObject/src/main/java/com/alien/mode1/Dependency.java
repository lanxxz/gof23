package com.alien.mode1;

/**
 * program: gof23
 * description: 业务实现
 *
 * @author: alien
 * @since: 2019/12/08 20:12
 */
public class Dependency implements DependencyBase {
    @Override
    public void operation() {
        System.out.println("Test!");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
