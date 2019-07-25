package com.alien.gof23.mode1;

/**
 * 表示猜拳游戏中的"手势"的类
 *
 * @author alien
 * @since 2019-07-25 21:20
 */
public class Hand {
    // 表示石头的值
    public static final int HANDVALUE_GUU = 0;
    // 表示剪刀的值
    public static final int HANDVALUE_CHO = 1;
    // 表示布的值
    public static final int HANDVALUE_PAA = 2;

    // 表示猜拳中三种手势的实例
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    // 表示猜拳中手势所对应的字符串
    private static final String[] name = {
            "石头", "剪刀", "布"
    };

    // 猜拳中出的手势的值
    private int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;
    }

    // 根据手势的值获取其对应的实例
    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    // 如果 this 胜利了 h 返回 true
    public boolean  isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // 如果 this 输给了 h 则返回 true
    public boolean isWeekerThan(Hand h) {
        return fight(h) == -1;
    }

    // 计分 胜1 负-1 平0
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue +1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }

}
