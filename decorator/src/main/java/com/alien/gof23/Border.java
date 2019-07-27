package com.alien.gof23;

/**
 * 用于显示装饰边框的抽象类
 *
 * @author alien
 * @since 2019-07-27 23:29
 */
public abstract class Border extends Display {
    // 表示被装饰物
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
