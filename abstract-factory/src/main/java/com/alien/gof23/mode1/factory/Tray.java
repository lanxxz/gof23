package com.alien.gof23.mode1.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的零件<br/>
 * 表示的是一个含有多个 link 和 tray 类的容器
 *
 * @author Alien
 * @since 2019/7/14 21:58
 */
public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
