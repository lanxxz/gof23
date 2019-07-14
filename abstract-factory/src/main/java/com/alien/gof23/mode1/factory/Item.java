package com.alien.gof23.mode1.factory;

/**
 * 抽象的零件<br/>
 * {@link Item} 和 {@link Tray} 的父类
 *
 * @author Alien
 * @since 2019/7/14 21:53
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
