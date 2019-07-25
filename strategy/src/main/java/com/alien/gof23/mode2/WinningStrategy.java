package com.alien.gof23.mode2;

import java.util.Random;

/**
 * 表示 如果赢了这局猜拳，那么下一局也出同样的手势 的策略类
 *
 * @author alien
 * @since 2019-07-25 22:02
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }


    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
