package com.alien.gof23.mode2;

/**
 * 使用 枚举重新实现mode1包中的 Hand 类
 *
 * @author alien
 * @since 2019-07-25 23:32
 */
public enum Hand {
    // 表示石头的值
    GUU(0) {
        @Override
        public String toString() {
            return "石头";
        }
    },
    // 表示剪刀的值
    CHO(1){
        @Override
        public String toString() {
            return "剪刀";
        }
    },
    // 表示布的值
    PAA(2){
        @Override
        public String toString() {
            return "布";
        }
    };

    // 猜拳中出的手势的值
    private int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;
    }

    // 根据手势的值获取其对应的实例
    public static Hand getHand(int handValue) {
        switch (handValue) {
            case 0:
                return GUU;
            case 1:
                return  CHO;
            case 2:
                return  PAA;
            default:
                throw new NullPointerException("Unkonwn Hand:" + handValue);
        }
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

    // 如果 this 胜利了 h 返回 true
    public boolean  isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // 如果 this 输给了 h 则返回 true
    public boolean isWeekerThan(Hand h) {
        return fight(h) == -1;
    }

}
