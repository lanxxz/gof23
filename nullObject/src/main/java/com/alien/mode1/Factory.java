package com.alien.mode1;

/**
 * program: gof23
 * description: 工厂类
 *
 * @author: alien
 * @since: 2019/12/08 20:14
 */
public class Factory {

    public static DependencyBase get(Nullable dependencyBase) {
        if (dependencyBase == null) {
            return new NullObject();
        } else {
            return new Dependency();
        }
    }
}
