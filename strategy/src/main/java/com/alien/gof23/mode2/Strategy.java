package com.alien.gof23.mode2;

/**
 * 表示猜拳游戏中的策略类
 *
 * @author alien
 * @since 2019-07-25 21:59
 */
public interface Strategy {
    public Hand nextHand();

    public void study(boolean win);
}
