package com.alien.gof23.reflect;

/**
 * 飞行能力
 *
 * @author alien
 * @since 2019-08-04 20:24
 */
public class FlyFeature implements Feature {
    @Override
    public void load() {
        System.out.println("增加一双翅膀...");
    }
}
